package com.mycom.myapp.clothes.dao;

import com.mycom.myapp.clothes.dto.UserClothesDto;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserClothesDao {

    List<UserClothesDto> listUserClothes(long userId);

    UserClothesDto detailUserClothes(long clothesId);

    int insertClothes(UserClothesDto userClothesDto);

    int updateClothes(UserClothesDto userClothesDto);

    int deleteClothes(long clothesId);
}
