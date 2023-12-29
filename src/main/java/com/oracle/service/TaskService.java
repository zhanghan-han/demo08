package com.oracle.service;


import com.oracle.compent.PageResult;
import com.oracle.pojo.Task;

import java.util.List;

public interface TaskService {
    public List<Task> findList();
    public PageResult findPages(Integer pageNo, Integer pageSize);
}
