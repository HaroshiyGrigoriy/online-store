package com.grishiya.alya_avito.models.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@EqualsAndHashCode
@Getter
@RequiredArgsConstructor
public class LoginDto {
    private String username;
    private String password;
}
