package com.mycom.myapp.schedule.dao;

import com.mycom.myapp.schedule.dto.ScheduleDto;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ScheduleDao {
    List<ScheduleDto> monthSchedule(Map<String, Object> param);

    ScheduleDto detailSchedule(long scheduleId, long userId);

    int insertSchedule(ScheduleDto scheduleDto);

    int updateSchedule(ScheduleDto scheduleDto);

    int deleteSchedule(long scheduleId);
}
