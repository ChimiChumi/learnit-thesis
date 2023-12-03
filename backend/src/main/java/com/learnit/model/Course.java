package com.learnit.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Course name is required")
    private String name;

    @NotNull(message = "Course description is required")
    private String description;

    @NotNull(message = "Course price is required")
    private int price;

    @NotNull(message = "Course objectives are required")
    private String objectives;

    @NotNull(message = "Course video path is required")
    private String mediaPath;

}