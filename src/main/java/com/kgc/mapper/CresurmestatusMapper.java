package com.kgc.mapper;

import com.kgc.pojo.Cresurmestatus;
import com.kgc.pojo.CresurmestatusExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CresurmestatusMapper {
    int countByExample(CresurmestatusExample example);

    int deleteByExample(CresurmestatusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Cresurmestatus record);

    int insertSelective(Cresurmestatus record);

    List<Cresurmestatus> selectByExample(CresurmestatusExample example);

    Cresurmestatus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Cresurmestatus record, @Param("example") CresurmestatusExample example);

    int updateByExample(@Param("record") Cresurmestatus record, @Param("example") CresurmestatusExample example);

    int updateByPrimaryKeySelective(Cresurmestatus record);

    int updateByPrimaryKey(Cresurmestatus record);
}