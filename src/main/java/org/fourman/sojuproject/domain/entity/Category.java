package org.fourman.sojuproject.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Category {

    @Id
    @GeneratedValue
    private String liquor;

    @Id
    @GeneratedValue
    private String wine;

    @Id
    @GeneratedValue
    private String cockail;

    @Id
    @GeneratedValue
    private String sake;

    @Id
    @GeneratedValue
    private String korliq;

    @Id
    @GeneratedValue
    private String cham;
}
