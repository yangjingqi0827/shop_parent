package com.yzit.project.shop.service.impl;

import com.yzit.project.shop.dao.SysBrandMapper;
import com.yzit.project.shop.entity.SysBrand;
import com.yzit.project.shop.service.ISysBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: yangjingqi
 * Date: 2020/1/3
 * Time: 16:18
 */
@Service
public class BrandServiceImpl implements ISysBrandService{

    @Autowired
    private SysBrandMapper sysBrandMapper;


    @Override
    public List<SysBrand> findBrands() {
        return sysBrandMapper.selectByExample(null);
    }
}
