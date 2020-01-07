package com.yzit.project.shop.dao;

import com.yzit.project.shop.entity.SysBrand;
import com.yzit.project.shop.entity.SysBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysBrandMapper {
    int countByExample(SysBrandExample example);

    int deleteByExample(SysBrandExample example);

    int deleteByPrimaryKey(Integer brandId);

    int insert(SysBrand record);

    int insertSelective(SysBrand record);

    List<SysBrand> selectByExample(SysBrandExample example);

    SysBrand selectByPrimaryKey(Integer brandId);

    int updateByExampleSelective(@Param("record") SysBrand record, @Param("example") SysBrandExample example);

    int updateByExample(@Param("record") SysBrand record, @Param("example") SysBrandExample example);

    int updateByPrimaryKeySelective(SysBrand record);

    int updateByPrimaryKey(SysBrand record);
}