package com.grishiya.alya_avito.models.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class CommentDto {
    private int author;
    private String authorImage;
    private String authorFirstName;
    private long createdA;
    private int pk;
    private String text;
}
