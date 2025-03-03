package com.grishiya.alya_avito.models.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@EqualsAndHashCode
public class AdsDto {
    private int count;
    private List<AdDto> results;
}
