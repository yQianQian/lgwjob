package com.kgc.mapper;

import com.kgc.pojo.Companyinfo;
import com.kgc.pojo.CompanyinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CompanyinfoMapper {
    int countByExample(CompanyinfoExample example);

    int deleteByExample(CompanyinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Companyinfo record);

    int insertSelective(Companyinfo record);

    List<Companyinfo> selectByExample(CompanyinfoExample example);

    Companyinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Companyinfo record, @Param("example") CompanyinfoExample example);

    int updateByExample(@Param("record") Companyinfo record, @Param("example") CompanyinfoExample example);

    int updateByPrimaryKeySelective(Companyinfo record);

    int updateByPrimaryKey(Companyinfo record);
}