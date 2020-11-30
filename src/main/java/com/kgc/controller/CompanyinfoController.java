package com.kgc.controller;

import com.kgc.mapper.CompanyinfoMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class CompanyinfoController {
    @Resource
    CompanyinfoMapper companyinfoMapper;

    @RequestMapping("index.do")
    public String index(){
        return "index";
    }
}
