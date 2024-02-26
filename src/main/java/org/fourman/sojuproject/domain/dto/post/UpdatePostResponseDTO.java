package org.fourman.sojuproject.domain.dto.post;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UpdatePostResponseDTO {

    private Long postId;

    private String uNickname;

    private Long fId;

    private Long kId;

    private Long cId;

    private String pTitle;

    private String pContent;

    private Long pViews;

    private LocalDateTime pDate;

}
