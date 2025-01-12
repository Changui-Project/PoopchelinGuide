package dev.changuii.project.dto.response;

import dev.changuii.project.dto.GarbageBinDTO;
import dev.changuii.project.dto.ToiletDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Builder @Getter @NoArgsConstructor @AllArgsConstructor
public class ResponseReviewDTO {

    private Long id;
    private String nickname;
    private String password;
    private Double rate;
    private List<String> tag;
    private String content;
    private ToiletDTO toiletDTO;
    private GarbageBinDTO garbageBinDTO;
    private LocalDateTime writeDate;

}
