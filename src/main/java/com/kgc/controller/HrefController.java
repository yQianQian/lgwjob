package com.kgc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HrefController {

    @RequestMapping("index.do")
    public String index(){
        return "index";
    }

    @RequestMapping("companylist.do")
    public String companylist(){
        return "companylist";
    }

    @RequestMapping("jianli.do")
    public String jianli(){
        return "jianli";
    }

    @RequestMapping("create.do")
    public String create(){
        return "create";
    }

    @RequestMapping("login.do")
    public String login(){
        return "login";
    }

    @RequestMapping("register.do")
    public String register(){
        return "register";
    }

    @RequestMapping("subscribe.do")
    public String subscribe(){
        return "subscribe";
    }

    @RequestMapping("list.do")
    public String list(){
        return "list";
    }

    @RequestMapping("myhome.do")
    public String myhome(){
        return "myhome";
    }

    @RequestMapping("positions.do")
    public String positions(){
        return "jianli";
    }

    @RequestMapping("accountBind.do")
    public String accountBind(){
        return "accountBind";
    }

    @RequestMapping("updatePwd.do")
    public String updatePwd(){
        return "updatePwd";
    }

    @RequestMapping("bindStep1.do")
    public String bindStep1(){
        return "bindStep1";
    }

    @RequestMapping("bindStep2.do")
    public String bindStep2(){
        return "bindStep2";
    }

    @RequestMapping("bindStep3.do")
    public String bindStep3(){
        return "bindStep3";
    }

    @RequestMapping("canInterviewResumes.do")
    public String canInterviewResumes(){
        return "canInterviewResumes";
    }

    @RequestMapping("delivery.do")
    public String delivery(){
        return "delivery";
    }

    @RequestMapping("haveNoticeResumes.do")
    public String haveNoticeResumes(){
        return "haveNoticeResumes";
    }

    @RequestMapping("autoFilterResumes.do")
    public String autoFilterResumes(){
        return "autoFilterResumes";
    }

    @RequestMapping("resumeView.do")
    public String resumeView(){
        return "resumeView";
    }

    @RequestMapping("haveRefuseResumes.do")
    public String haveRefuseResumes(){
        return "haveRefuseResumes";
    }

    @RequestMapping("reset.do")
    public String reset(){
        return "reset";
    }

    @RequestMapping("collections.do")
    public String collections(){
        return "collections";
    }

    @RequestMapping("myresume.do")
    public String myresume(){
        return "myresume";
    }

    @RequestMapping("mList.do")
    public String mList(){
        return "mList";
    }

    @RequestMapping("preview.do")
    public String preview(){
        return "preview";
    }

    @RequestMapping("basic.do")
    public String basic(){
        return "basic";
    }

    @RequestMapping("about.do")
    public String about(){
        return "about";
    }

    @RequestMapping("toudi.do")
    public String toudi(){
        return "toudi";
    }

    @RequestMapping("auth.do")
    public String auth(){
        return "auth";
    }

    @RequestMapping("unHandleResumes.do")
    public String unHandleResumes(){
        return "unHandleResumes";
    }

    @RequestMapping("founder.do")
    public String founder(){
        return "founder";
    }




}
