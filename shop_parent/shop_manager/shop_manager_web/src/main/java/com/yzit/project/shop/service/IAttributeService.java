package com.yzit.project.shop.service;

import com.yzit.project.shop.entity.SysAttribute;

import java.util.List;

/**
 * User: yangjingqi
 * Date: 2020/1/2
 * Time: 16:41
 */
public interface IAttributeService {
    List<SysAttribute> findAll();

    SysAttribute findById(int id);
}
