package com.yzit.project.shop.controller;

import com.yzit.project.shop.entity.SysAttribute;
import com.yzit.project.shop.service.IAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * User: yangjingqi
 * Date: 2020/1/2
 * Time: 16:34
 */
@RestController
@RequestMapping("attribute")
public class AttributeController {

    @Autowired
    private IAttributeService attributeService;

    @GetMapping
    public List<SysAttribute> findAll(){
        return attributeService.findAll();
    }

    @PutMapping("/{id}")
    public SysAttribute edit(@PathVariable int id){

        SysAttribute sysAttribute = attributeService.findById(id);

        return sysAttribute;
    }

}
