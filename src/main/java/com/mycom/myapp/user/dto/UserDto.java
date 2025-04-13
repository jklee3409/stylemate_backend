package com.mycom.myapp.user.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private long userId;
    private String kakaoId;
    private String nickname;
    private String gender;
    private int height;
    private int weight;
    private Date createdAt;
}
