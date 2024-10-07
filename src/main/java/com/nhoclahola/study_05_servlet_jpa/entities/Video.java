package com.nhoclahola.study_05_servlet_jpa.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "videos")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Video implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="VideoId")
    private String videoId;
    @Column(name="Active")
    private int active;
    @Column(name="Description", length = 500, nullable = true)
    private String description;
    @Column(name="Poster", length = 500, nullable = true)
    private String poster;
    @Column(name="Title", length = 500, nullable = true)
    private String title;
    @Column(name="Views")
    private int views;

    //bi-directional many-to-one association to Category
    @ManyToOne
    @JoinColumn(name="CategoryId")
    private Category category;
}
