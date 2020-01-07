package com.yzit.project.shop.dao;

import com.yzit.project.shop.entity.SysTypeBrand;
import com.yzit.project.shop.entity.SysTypeBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysTypeBrandMapper {
    int countByExample(SysTypeBrandExample example);

    int deleteByExample(SysTypeBrandExample example);

    int insert(SysTypeBrand record);

    int insertSelective(SysTypeBrand record);

    List<SysTypeBrand> selectByExample(SysTypeBrandExample example);

    int updateByExampleSelective(@Param("record") SysTypeBrand record, @Param("example") SysTypeBrandExample example);

    int updateByExample(@Param("record") SysTypeBrand record, @Param("example") SysTypeBrandExample example);
}