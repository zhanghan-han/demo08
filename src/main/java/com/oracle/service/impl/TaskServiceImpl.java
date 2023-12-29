package com.oracle.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.oracle.compent.PageResult;
import com.oracle.mapper.TaskMapper;
import com.oracle.pojo.Task;
import com.oracle.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskMapper taskMapper;

    @Override
    public List<Task> findList() {
        List<Task> tasks = taskMapper.selectByExample(null);
        return tasks;
    }

    @Override
    public PageResult findPages(Integer pageNo, Integer pageSize) {
        //1、在查询数据库之前，在插件中封装页码
        PageHelper.startPage(pageNo,pageSize);
        //2、执行查询
        Page<Task> taskPage = (Page<Task>)taskMapper.selectByExample(null);
        return new PageResult(taskPage.getTotal(),taskPage.getResult());
    }
}



