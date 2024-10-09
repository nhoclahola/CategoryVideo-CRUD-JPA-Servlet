package com.nhoclahola.study_05_servlet_jpa.dao;

import com.nhoclahola.study_05_servlet_jpa.entities.Video;

import java.util.List;

public interface IVideoDao
{
    void insert(Video video);

    void update(Video video);

    void delete(String videoId) throws Exception;

    Video findById(String videoId);

    List<Video> findByTitle(String title);

    List<Video> findAll();

    List<Video> findAll(int page, int pagesize);

    int count();
}
