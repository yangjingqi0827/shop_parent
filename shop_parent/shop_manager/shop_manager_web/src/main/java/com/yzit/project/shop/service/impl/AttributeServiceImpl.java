package com.yzit.project.shop.service.impl;

import com.yzit.project.shop.dao.SysAttributeMapper;
import com.yzit.project.shop.entity.SysAttribute;
import com.yzit.project.shop.service.IAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: yangjingqi
 * Date: 2020/1/2
 * Time: 16:42
 */
@Service
public class AttributeServiceImpl implements IAttributeService {

    @Autowired
    private SysAttributeMapper attributeMapper;

    @Override
    public List<SysAttribute> findAll() {
        return attributeMapper.selectByExample(null);
    }

    @Override
    public SysAttribute findById(int id) {
        return attributeMapper.selectByPrimaryKey(id);
    }
}
