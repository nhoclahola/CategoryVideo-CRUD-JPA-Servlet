package com.nhoclahola.study_05_servlet_jpa.services.implement;

import com.nhoclahola.study_05_servlet_jpa.dao.ICategoryDao;
import com.nhoclahola.study_05_servlet_jpa.dao.implement.CategoryDao;
import com.nhoclahola.study_05_servlet_jpa.entities.Category;
import com.nhoclahola.study_05_servlet_jpa.services.ICategoryService;

import java.util.List;

public class CategoryServiceImpl implements ICategoryService
{
    ICategoryDao categoryDao = new CategoryDao();
    @Override
    public void insert(Category category)
    {
        categoryDao.insert(category);
    }

    @Override
    public void update(Category category)
    {
        categoryDao.insert(category);
    }

    @Override
    public void delete(int cateid) throws Exception
    {
        categoryDao.delete(cateid);
    }

    @Override
    public Category findById(int cateid)
    {
        return categoryDao.findById(cateid);
    }

    @Override
    public List<Category> findAll()
    {
        return categoryDao.findAll();
    }

    @Override
    public List<Category> findByCategoryname(String catname)
    {
        return categoryDao.findByCategoryname(catname);
    }

    @Override
    public List<Category> findAll(int page, int pagesize)
    {
        return categoryDao.findAll(page, pagesize);
    }

    @Override
    public int count()
    {
        return categoryDao.count();
    }
}
