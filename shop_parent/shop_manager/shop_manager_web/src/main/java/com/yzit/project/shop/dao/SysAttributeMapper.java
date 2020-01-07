package com.yzit.project.shop.dao;

import com.yzit.project.shop.entity.SysAttribute;
import com.yzit.project.shop.entity.SysAttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAttributeMapper {
    int countByExample(SysAttributeExample example);

    int deleteByExample(SysAttributeExample example);

    int deleteByPrimaryKey(Integer attributeId);

    int insert(SysAttribute record);

    int insertSelective(SysAttribute record);

    List<SysAttribute> selectByExample(SysAttributeExample example);

    SysAttribute selectByPrimaryKey(Integer attributeId);

    int updateByExampleSelective(@Param("record") SysAttribute record, @Param("example") SysAttributeExample example);

    int updateByExample(@Param("record") SysAttribute record, @Param("example") SysAttributeExample example);

    int updateByPrimaryKeySelective(SysAttribute record);

    int updateByPrimaryKey(SysAttribute record);
}