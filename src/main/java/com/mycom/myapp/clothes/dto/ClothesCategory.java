package com.mycom.myapp.clothes.dto;

import lombok.Getter;

@Getter
public enum ClothesCategory {
    // OUTER
    PADDING("아우터", "패딩"),
    COAT("아우터", "코트"),
    JACKET("아우터", "자켓"),
    CARDIGAN("아우터", "가디건"),


    // TOP
    T_SHIRT("상의", "티셔츠"),
    SHIRT("상의", "셔츠"),
    SWEATER("상의", "맨투맨"),
    KNIT("상의", "니트"),

    // BOTTOM
    JEANS("하의", "데님"),
    SLACKS("하의", "슬랙스"),
    COTTON_PANTS("하의", "면바지"),
    TRAINING_PANTS("하의", "트레이닝 팬츠"),
    SKIRT("하의", "스커트"),

    // SHOES
    SNEAKERS("신발", "운동화"),
    BOOTS("신발", "부츠"),
    SANDALS("신발", "샌들");


    private final String parent;
    private final String label;

    ClothesCategory(String parent, String label) {
        this.parent = parent;
        this.label = label;
    }
}
