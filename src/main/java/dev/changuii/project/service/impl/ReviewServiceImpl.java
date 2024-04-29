package dev.changuii.project.service.impl;

import dev.changuii.project.dao.GarbageBinDAO;
import dev.changuii.project.dao.ReviewDAO;
import dev.changuii.project.dao.ToiletDAO;
import dev.changuii.project.dto.ReviewDTO;
import dev.changuii.project.dto.response.ResponseReviewDTO;
import dev.changuii.project.entity.GarbageBinEntity;
import dev.changuii.project.entity.ReviewEntity;
import dev.changuii.project.entity.ToiletEntity;
import dev.changuii.project.exception.InvalidPasswordException;
import dev.changuii.project.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {
    private final ReviewDAO reviewDAO;
    private final GarbageBinDAO garbageBinDAO;
    private final ToiletDAO toiletDAO;

    public ReviewServiceImpl(
            @Autowired ReviewDAO reviewDAO,
            @Autowired GarbageBinDAO garbageBinDAO,
            @Autowired ToiletDAO toiletDAO
    ){
        this.reviewDAO = reviewDAO;
        this.garbageBinDAO = garbageBinDAO;
        this.toiletDAO = toiletDAO;
    }


    @Override
    public List<ResponseReviewDTO> readAllReviewByToiletORGarbageBin(boolean type, Long id) {
        GarbageBinEntity garbageBin = type ? this.garbageBinDAO.readByIdGarbageBin(id) : null;
        ToiletEntity toilet = !type ? this.toiletDAO.readByIdToilet(id) : null;

        return ReviewEntity.toResponseDTOList(type ?
                        this.reviewDAO.readAllReviewByGarbageBin(garbageBin) :
                        this.reviewDAO.readAllReviewByToilet(toilet));
    }

    @Override
    public List<ResponseReviewDTO> readSummaryByToiletORGarbageBin(boolean type, Long id) {
        GarbageBinEntity garbageBin = type ? this.garbageBinDAO.readByIdGarbageBin(id) : null;
        ToiletEntity toilet = !type ? this.toiletDAO.readByIdToilet(id) : null;

        return ReviewEntity.toResponseDTOList(type ?
                this.reviewDAO.readAllReviewByGarbageBin(garbageBin) :
                this.reviewDAO.readAllReviewByToilet(toilet));
    }

    @Override
    public ResponseReviewDTO createReview(ReviewDTO reviewDTO) {
        GarbageBinEntity garbageBin = null;
        ToiletEntity toilet = null;
        if(reviewDTO.isType()){
            garbageBin = this.garbageBinDAO.readByIdGarbageBin(reviewDTO.getGarbageBinId());
        }else{
            toilet = this.toiletDAO.readByIdToilet(reviewDTO.getToiletId());
        }
        return ReviewEntity
                .toResponseDTO(this.reviewDAO.createReivew(ReviewDTO
                .toEntity(reviewDTO).setType(toilet, garbageBin)));
    }

    @Override
    public ResponseReviewDTO readReview(long id) {
        return ReviewEntity
                .toResponseDTO(this.reviewDAO.readByIdReview(id));
    }

    @Override
    public ResponseReviewDTO updateReview(long id, ReviewDTO reviewDTO) {
        // 기존 entity -> update -> 다시 save -> to REsponseDTO -> return
        return ReviewEntity.toResponseDTO(
                this.reviewDAO.createReivew(
                        this.reviewDAO.readByIdReview(id).updateReview(reviewDTO)));
    }



    @Override
    public void deleteReview(long id, String password) {
        ReviewEntity reviewEntity = reviewDAO.readByIdReview(id);

        if(!reviewEntity.getPassword().equals(password))
            throw new InvalidPasswordException();

        this.reviewDAO.deleteReview(id);
    }
}
