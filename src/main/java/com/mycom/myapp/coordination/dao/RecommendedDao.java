package com.mycom.myapp.coordination.dao;

import com.mycom.myapp.coordination.dto.RecommendedDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RecommendedDao {

    RecommendedDto detailRecommended(long recommendedId);

    int insertRecommended(RecommendedDto recommendedDto);

    int deleteRecommended(long recommendedId);
}
