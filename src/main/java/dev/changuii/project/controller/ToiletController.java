package dev.changuii.project.controller;


import dev.changuii.project.dao.ToiletDAO;
import dev.changuii.project.dto.GarbageBinDTO;
import dev.changuii.project.dto.ReviewDTO;
import dev.changuii.project.dto.ToiletDTO;
import dev.changuii.project.service.GarbageBinService;
import dev.changuii.project.service.ToiletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/toilet")
public class ToiletController {

    private final ToiletService toiletService;
    private final GarbageBinService garbageBinService;

    public ToiletController(
            @Autowired ToiletService toiletService,
            @Autowired GarbageBinService garbageBinService
    ){
        this.toiletService = toiletService;
        this.garbageBinService = garbageBinService;
    }

    @GetMapping("/range")
    public ResponseEntity<Map<String, Object>> readAllByBoxRange(
            @RequestParam("x1") Double x1,
            @RequestParam("x2") Double x2,
            @RequestParam("y1") Double y1,
            @RequestParam("y2") Double y2
    ){
        List<GarbageBinDTO> garbageBinDTOS = garbageBinService.readAllByBoxRange(x1, x2, y1, y2);
        List<ToiletDTO> toiletDTOS = toiletService.readAllByBoxRange(x1, x2, y1, y2);
        //ToiletDTO toiletDTO = toiletService.findNearestToilet()

        Map<String, Object> responseData = new HashMap<>();
        responseData.put("toilet", toiletDTOS);
        responseData.put("garbageBin", garbageBinDTOS);

        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<List<ReviewDTO>> readReview(@PathVariable Long id){
        return null;
    }
}
