package com.mycom.myapp.schedule.dto;

import java.time.LocalDate;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleDto {

    private long scheduleId;
    private long userId;
    private String scheduleName;
    private ScheduleCategory category;
    private LocalDate schedule_at;
    private Date created_at;
}
