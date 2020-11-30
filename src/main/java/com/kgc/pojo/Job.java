package com.kgc.pojo;

import java.util.Date;

public class Job {
    private Integer id;

    private Integer cid;

    private Integer jobstatus;

    private String cjobtype;

    private String cjobname;

    private String department;

    private Integer nature;

    private Integer minmoney;

    private Integer maxmoney;

    private String workcity;

    private Integer workexperience;

    private Integer education;

    private String cweal;

    private String workdescribes;

    private String workaddress;

    private String cemail;

    private Date worktime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getJobstatus() {
        return jobstatus;
    }

    public void setJobstatus(Integer jobstatus) {
        this.jobstatus = jobstatus;
    }

    public String getCjobtype() {
        return cjobtype;
    }

    public void setCjobtype(String cjobtype) {
        this.cjobtype = cjobtype == null ? null : cjobtype.trim();
    }

    public String getCjobname() {
        return cjobname;
    }

    public void setCjobname(String cjobname) {
        this.cjobname = cjobname == null ? null : cjobname.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public Integer getNature() {
        return nature;
    }

    public void setNature(Integer nature) {
        this.nature = nature;
    }

    public Integer getMinmoney() {
        return minmoney;
    }

    public void setMinmoney(Integer minmoney) {
        this.minmoney = minmoney;
    }

    public Integer getMaxmoney() {
        return maxmoney;
    }

    public void setMaxmoney(Integer maxmoney) {
        this.maxmoney = maxmoney;
    }

    public String getWorkcity() {
        return workcity;
    }

    public void setWorkcity(String workcity) {
        this.workcity = workcity == null ? null : workcity.trim();
    }

    public Integer getWorkexperience() {
        return workexperience;
    }

    public void setWorkexperience(Integer workexperience) {
        this.workexperience = workexperience;
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    public String getCweal() {
        return cweal;
    }

    public void setCweal(String cweal) {
        this.cweal = cweal == null ? null : cweal.trim();
    }

    public String getWorkdescribes() {
        return workdescribes;
    }

    public void setWorkdescribes(String workdescribes) {
        this.workdescribes = workdescribes == null ? null : workdescribes.trim();
    }

    public String getWorkaddress() {
        return workaddress;
    }

    public void setWorkaddress(String workaddress) {
        this.workaddress = workaddress == null ? null : workaddress.trim();
    }

    public String getCemail() {
        return cemail;
    }

    public void setCemail(String cemail) {
        this.cemail = cemail == null ? null : cemail.trim();
    }

    public Date getWorktime() {
        return worktime;
    }

    public void setWorktime(Date worktime) {
        this.worktime = worktime;
    }
}