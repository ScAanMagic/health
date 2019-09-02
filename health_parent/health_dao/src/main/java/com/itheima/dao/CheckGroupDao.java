package com.itheima.dao;

import com.github.pagehelper.Page;
import com.itheima.pojo.CheckGroup;

import java.util.List;
import java.util.Map;

public interface CheckGroupDao {
    public void add(CheckGroup checkGroup);
    public void setCheckGroupAndCheckItem(Map<String, Integer> map);
    public Page<CheckGroup> pageQuery(String queryString);
    public CheckGroup findById(Integer id);
    public void edit(CheckGroup checkGroup);
    public void deleteAssociationByCheckGroupId(Integer id);
    public List<CheckGroup> findAll();
}
