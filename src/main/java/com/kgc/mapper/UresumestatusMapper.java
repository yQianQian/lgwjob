package com.kgc.mapper;

import com.kgc.pojo.Uresumestatus;
import com.kgc.pojo.UresumestatusExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UresumestatusMapper {
    int countByExample(UresumestatusExample example);

    int deleteByExample(UresumestatusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Uresumestatus record);

    int insertSelective(Uresumestatus record);

    List<Uresumestatus> selectByExample(UresumestatusExample example);

    Uresumestatus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Uresumestatus record, @Param("example") UresumestatusExample example);

    int updateByExample(@Param("record") Uresumestatus record, @Param("example") UresumestatusExample example);

    int updateByPrimaryKeySelective(Uresumestatus record);

    int updateByPrimaryKey(Uresumestatus record);
}