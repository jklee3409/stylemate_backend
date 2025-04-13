package com.mycom.myapp.style.dao;

import com.mycom.myapp.style.dto.StyleDto;
import com.mycom.myapp.style.dto.UserStyleDto;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StyleDao {

    List<StyleDto> listStyle();

    List<UserStyleDto> listUserStyle(long userId);

    int insertUserStyle(UserStyleDto userStyleDto);
}
