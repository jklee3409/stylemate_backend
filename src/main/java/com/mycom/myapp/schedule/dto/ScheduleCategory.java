package com.mycom.myapp.schedule.dto;

import lombok.Getter;

@Getter
public enum ScheduleCategory {
    DATE("데이트"),
    MEETING("회의"),
    BLIND_DATE("소개팅"),
    PROMISE("약속"),
    TRIP("여행"),
    GO_TO_WORK("출근"),
    DAILY("일상");

    private final String label;

    ScheduleCategory(String label) {
        this.label = label;
    }
}
