package com.grishiya.alya_avito.models.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class CreateOrUpdateAdDto {
    private String title;
    private String price;
    private String description;
}
