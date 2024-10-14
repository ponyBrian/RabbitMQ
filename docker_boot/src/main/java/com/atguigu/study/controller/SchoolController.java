package com.atguigu.study.controller;

import com.atguigu.study.entities.School;
import com.atguigu.study.service.SchoolService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @auther zzyy
 * @create 2024-07-25 17:07
 */
@RestController
public class SchoolController
{
    @Resource
    private SchoolService schoolService;

    @GetMapping(value = "/school/list")
    public List<School> findAllTbSchool() {
        return schoolService.list();
    }
}


