package com.grishiya.alya_avito.models.dto;

import lombok.*;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class CommentsDto {
    private int count;
    private List<CommentDto> results;
}
