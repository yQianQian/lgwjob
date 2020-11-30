package com.kgc.mapper;

import com.kgc.pojo.Send;
import com.kgc.pojo.SendExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SendMapper {
    int countByExample(SendExample example);

    int deleteByExample(SendExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Send record);

    int insertSelective(Send record);

    List<Send> selectByExample(SendExample example);

    Send selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Send record, @Param("example") SendExample example);

    int updateByExample(@Param("record") Send record, @Param("example") SendExample example);

    int updateByPrimaryKeySelective(Send record);

    int updateByPrimaryKey(Send record);
}