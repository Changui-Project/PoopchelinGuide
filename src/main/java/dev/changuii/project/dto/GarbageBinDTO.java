package dev.changuii.project.dto;

import dev.changuii.project.entity.GarbageBinEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Builder @Getter @NoArgsConstructor @AllArgsConstructor
public class GarbageBinDTO {

    private long id;
    private String address;
    private String detail;
    private String type;
    private double coordinateX;
    private double coordinateY;

    private List<ReviewDTO> reviews = new ArrayList<>();


    public static GarbageBinEntity toEntity(GarbageBinDTO garbageBinDTO){
        return GarbageBinEntity.builder()
                .address(garbageBinDTO.getAddress())
                .coordinateX(garbageBinDTO.getCoordinateX())
                .coordinateY(garbageBinDTO.getCoordinateY())
                .detail(garbageBinDTO.getDetail())
                .type(garbageBinDTO.getType()).build();

    }
}