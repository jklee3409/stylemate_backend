package com.mycom.myapp.clothes.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserClothesDto {

    private long clothesId;
    private long userId;
    private String clothesName;
    private ClothesCategory category;
    private String color;
    private ClothesSeason season;
    private String imageUrl;
    private Date createdAt;
}
