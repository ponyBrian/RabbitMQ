package com.atguigu.study.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.study.entities.School;
import com.atguigu.study.service.SchoolService;
import com.atguigu.study.mapper.SchoolMapper;
import org.springframework.stereotype.Service;

/**
* @author mylit
* @description 针对表【tb_school】的数据库操作Service实现
* @createDate 2024-10-14 09:49:34
*/
@Service
public class SchoolServiceImpl extends ServiceImpl<SchoolMapper, School>
    implements SchoolService{

}




