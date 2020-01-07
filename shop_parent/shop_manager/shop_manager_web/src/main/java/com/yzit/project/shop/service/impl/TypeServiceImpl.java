package com.yzit.project.shop.service.impl;

import com.yzit.project.shop.dao.SysTypeMapper;
import com.yzit.project.shop.entity.SysType;
import com.yzit.project.shop.service.ISysTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: yangjingqi
 * Date: 2020/1/2
 * Time: 23:18
 */
@Service
public class TypeServiceImpl implements ISysTypeService{

    @Autowired
    private SysTypeMapper sysTypeMapper;


    @Override
    public List<SysType> findAll() {
        return sysTypeMapper.findAll();
    }
}
