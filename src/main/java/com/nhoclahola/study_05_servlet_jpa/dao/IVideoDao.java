package com.nhoclahola.study_05_servlet_jpa.dao;

import com.nhoclahola.study_05_servlet_jpa.entities.Video;

import java.util.List;

public interface IVideoDao
{
    void insert(Video video);

    void update(Video video);

    void delete(int videoId) throws Exception;

    Video findById(int videoId);

    List<Video> findAll();

    List<Video> findAll(int page, int pagesize);

    int count();
}
