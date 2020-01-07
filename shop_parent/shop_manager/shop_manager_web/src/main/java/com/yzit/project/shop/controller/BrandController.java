package com.yzit.project.shop.controller;

import com.yzit.project.shop.entity.SysBrand;
import com.yzit.project.shop.service.ISysBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * User: yangjingqi
 * Date: 2020/1/3
 * Time: 16:16
 */
@RestController
@RequestMapping("brand")
public class BrandController {

    @Autowired
    private ISysBrandService sysBrandService;

    @GetMapping
    public List<SysBrand> findBrands(){

        List<SysBrand> list = sysBrandService.findBrands();

        return list;
    }

}
