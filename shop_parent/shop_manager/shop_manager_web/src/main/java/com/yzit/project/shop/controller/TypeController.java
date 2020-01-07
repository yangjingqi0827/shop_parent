package com.yzit.project.shop.controller;

import com.yzit.project.shop.entity.SysType;
import com.yzit.project.shop.service.ISysTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * User: yangjingqi
 * Date: 2020/1/2
 * Time: 23:17
 */
@RestController
@RequestMapping("type")
public class TypeController {

    @Autowired
    private ISysTypeService sysTypeService;

    @GetMapping
    public List<SysType> treeList(){
        System.out.println("asdsa");
        return sysTypeService.findAll();
    }

}
