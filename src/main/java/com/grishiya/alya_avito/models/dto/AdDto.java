package com.grishiya.alya_avito.models.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class AdDto {
    private int author;
    private String image;
    private int pk;
    private int price;
    private int title;
}
