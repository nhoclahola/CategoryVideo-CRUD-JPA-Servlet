package com.nhoclahola.study_05_servlet_jpa.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "categories")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@NamedQuery(name = "Category.findAll", query = "SELECT c FROM Category c")
public class Category implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CategoryId")
    private int categoryId;

    @Column(name = "CategoryName", length = 50, nullable = false)
    @NotEmpty(message = "Null is not allowed!")
    private String categoryName;

    @Column(name = "Image", length = 50, nullable = true)
    private String image;

    @Column(name="Status")
    private int status;

    // bi-directional many-to-one association to Video
    // When remove a category which already has video, it will also remove video in database
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Video> videos;

    public Video addVideo(Video video)
    {
        getVideos().add(video);
        video.setCategory(this);
        return video;
    }

    public Video removeVideo(Video video)
    {
        getVideos().remove(video);
        video.setCategory(null);
        return video;
    }
}
