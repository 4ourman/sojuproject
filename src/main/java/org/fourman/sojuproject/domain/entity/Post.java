package org.fourman.sojuproject.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Post {

    @Id
    @GeneratedValue
    private Long postId;

    private String uNickname;

    private Long fId;

    private String category;

    private Long cId;  // 댓글

    private String pTitle;

    private String pContent;

    private Long pViews;

    private LocalDateTime pDate;

}
