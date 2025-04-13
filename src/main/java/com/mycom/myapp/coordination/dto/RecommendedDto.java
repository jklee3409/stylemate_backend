package com.mycom.myapp.coordination.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RecommendedDto {
    private long recommendedId;
    private long userId;
    private long scheduleId;
    private String aiPrompt;
    private String aiResponse;
    private String feedback;
    private Date created_at;
}
