package com.kgc.mapper;

import com.kgc.pojo.Resumes;
import com.kgc.pojo.ResumesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ResumesMapper {
    int countByExample(ResumesExample example);

    int deleteByExample(ResumesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Resumes record);

    int insertSelective(Resumes record);

    List<Resumes> selectByExample(ResumesExample example);

    Resumes selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Resumes record, @Param("example") ResumesExample example);

    int updateByExample(@Param("record") Resumes record, @Param("example") ResumesExample example);

    int updateByPrimaryKeySelective(Resumes record);

    int updateByPrimaryKey(Resumes record);
}