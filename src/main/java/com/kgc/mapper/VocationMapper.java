package com.kgc.mapper;

import com.kgc.pojo.Vocation;
import com.kgc.pojo.VocationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VocationMapper {
    int countByExample(VocationExample example);

    int deleteByExample(VocationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Vocation record);

    int insertSelective(Vocation record);

    List<Vocation> selectByExample(VocationExample example);

    Vocation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Vocation record, @Param("example") VocationExample example);

    int updateByExample(@Param("record") Vocation record, @Param("example") VocationExample example);

    int updateByPrimaryKeySelective(Vocation record);

    int updateByPrimaryKey(Vocation record);
}