package dev.changuii.project.service;

import dev.changuii.project.dto.ReviewDTO;
import dev.changuii.project.dto.ToiletDTO;

import java.util.List;

public interface ToiletService {

    public List<ToiletDTO> readAllByBoxRange(Double x1, Double x2, Double y1, Double y2);

    ToiletDTO findNearestToilet(Double x1, Double x2, Double y1, Double y2, Double x3, Double y3);
}
