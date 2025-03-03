package com.grishiya.alya_avito.models.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@EqualsAndHashCode
@RequiredArgsConstructor
@Setter
@Getter
public class CreateOrUpdateDto {
    private String text;
}
