package com.kgc.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JobExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JobExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andJobstatusIsNull() {
            addCriterion("jobstatus is null");
            return (Criteria) this;
        }

        public Criteria andJobstatusIsNotNull() {
            addCriterion("jobstatus is not null");
            return (Criteria) this;
        }

        public Criteria andJobstatusEqualTo(Integer value) {
            addCriterion("jobstatus =", value, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusNotEqualTo(Integer value) {
            addCriterion("jobstatus <>", value, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusGreaterThan(Integer value) {
            addCriterion("jobstatus >", value, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("jobstatus >=", value, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusLessThan(Integer value) {
            addCriterion("jobstatus <", value, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusLessThanOrEqualTo(Integer value) {
            addCriterion("jobstatus <=", value, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusIn(List<Integer> values) {
            addCriterion("jobstatus in", values, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusNotIn(List<Integer> values) {
            addCriterion("jobstatus not in", values, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusBetween(Integer value1, Integer value2) {
            addCriterion("jobstatus between", value1, value2, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("jobstatus not between", value1, value2, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andCjobtypeIsNull() {
            addCriterion("cjobtype is null");
            return (Criteria) this;
        }

        public Criteria andCjobtypeIsNotNull() {
            addCriterion("cjobtype is not null");
            return (Criteria) this;
        }

        public Criteria andCjobtypeEqualTo(String value) {
            addCriterion("cjobtype =", value, "cjobtype");
            return (Criteria) this;
        }

        public Criteria andCjobtypeNotEqualTo(String value) {
            addCriterion("cjobtype <>", value, "cjobtype");
            return (Criteria) this;
        }

        public Criteria andCjobtypeGreaterThan(String value) {
            addCriterion("cjobtype >", value, "cjobtype");
            return (Criteria) this;
        }

        public Criteria andCjobtypeGreaterThanOrEqualTo(String value) {
            addCriterion("cjobtype >=", value, "cjobtype");
            return (Criteria) this;
        }

        public Criteria andCjobtypeLessThan(String value) {
            addCriterion("cjobtype <", value, "cjobtype");
            return (Criteria) this;
        }

        public Criteria andCjobtypeLessThanOrEqualTo(String value) {
            addCriterion("cjobtype <=", value, "cjobtype");
            return (Criteria) this;
        }

        public Criteria andCjobtypeLike(String value) {
            addCriterion("cjobtype like", value, "cjobtype");
            return (Criteria) this;
        }

        public Criteria andCjobtypeNotLike(String value) {
            addCriterion("cjobtype not like", value, "cjobtype");
            return (Criteria) this;
        }

        public Criteria andCjobtypeIn(List<String> values) {
            addCriterion("cjobtype in", values, "cjobtype");
            return (Criteria) this;
        }

        public Criteria andCjobtypeNotIn(List<String> values) {
            addCriterion("cjobtype not in", values, "cjobtype");
            return (Criteria) this;
        }

        public Criteria andCjobtypeBetween(String value1, String value2) {
            addCriterion("cjobtype between", value1, value2, "cjobtype");
            return (Criteria) this;
        }

        public Criteria andCjobtypeNotBetween(String value1, String value2) {
            addCriterion("cjobtype not between", value1, value2, "cjobtype");
            return (Criteria) this;
        }

        public Criteria andCjobnameIsNull() {
            addCriterion("cjobname is null");
            return (Criteria) this;
        }

        public Criteria andCjobnameIsNotNull() {
            addCriterion("cjobname is not null");
            return (Criteria) this;
        }

        public Criteria andCjobnameEqualTo(String value) {
            addCriterion("cjobname =", value, "cjobname");
            return (Criteria) this;
        }

        public Criteria andCjobnameNotEqualTo(String value) {
            addCriterion("cjobname <>", value, "cjobname");
            return (Criteria) this;
        }

        public Criteria andCjobnameGreaterThan(String value) {
            addCriterion("cjobname >", value, "cjobname");
            return (Criteria) this;
        }

        public Criteria andCjobnameGreaterThanOrEqualTo(String value) {
            addCriterion("cjobname >=", value, "cjobname");
            return (Criteria) this;
        }

        public Criteria andCjobnameLessThan(String value) {
            addCriterion("cjobname <", value, "cjobname");
            return (Criteria) this;
        }

        public Criteria andCjobnameLessThanOrEqualTo(String value) {
            addCriterion("cjobname <=", value, "cjobname");
            return (Criteria) this;
        }

        public Criteria andCjobnameLike(String value) {
            addCriterion("cjobname like", value, "cjobname");
            return (Criteria) this;
        }

        public Criteria andCjobnameNotLike(String value) {
            addCriterion("cjobname not like", value, "cjobname");
            return (Criteria) this;
        }

        public Criteria andCjobnameIn(List<String> values) {
            addCriterion("cjobname in", values, "cjobname");
            return (Criteria) this;
        }

        public Criteria andCjobnameNotIn(List<String> values) {
            addCriterion("cjobname not in", values, "cjobname");
            return (Criteria) this;
        }

        public Criteria andCjobnameBetween(String value1, String value2) {
            addCriterion("cjobname between", value1, value2, "cjobname");
            return (Criteria) this;
        }

        public Criteria andCjobnameNotBetween(String value1, String value2) {
            addCriterion("cjobname not between", value1, value2, "cjobname");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andNatureIsNull() {
            addCriterion("nature is null");
            return (Criteria) this;
        }

        public Criteria andNatureIsNotNull() {
            addCriterion("nature is not null");
            return (Criteria) this;
        }

        public Criteria andNatureEqualTo(Integer value) {
            addCriterion("nature =", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotEqualTo(Integer value) {
            addCriterion("nature <>", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThan(Integer value) {
            addCriterion("nature >", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThanOrEqualTo(Integer value) {
            addCriterion("nature >=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThan(Integer value) {
            addCriterion("nature <", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThanOrEqualTo(Integer value) {
            addCriterion("nature <=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureIn(List<Integer> values) {
            addCriterion("nature in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotIn(List<Integer> values) {
            addCriterion("nature not in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureBetween(Integer value1, Integer value2) {
            addCriterion("nature between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotBetween(Integer value1, Integer value2) {
            addCriterion("nature not between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andMinmoneyIsNull() {
            addCriterion("minmoney is null");
            return (Criteria) this;
        }

        public Criteria andMinmoneyIsNotNull() {
            addCriterion("minmoney is not null");
            return (Criteria) this;
        }

        public Criteria andMinmoneyEqualTo(Integer value) {
            addCriterion("minmoney =", value, "minmoney");
            return (Criteria) this;
        }

        public Criteria andMinmoneyNotEqualTo(Integer value) {
            addCriterion("minmoney <>", value, "minmoney");
            return (Criteria) this;
        }

        public Criteria andMinmoneyGreaterThan(Integer value) {
            addCriterion("minmoney >", value, "minmoney");
            return (Criteria) this;
        }

        public Criteria andMinmoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("minmoney >=", value, "minmoney");
            return (Criteria) this;
        }

        public Criteria andMinmoneyLessThan(Integer value) {
            addCriterion("minmoney <", value, "minmoney");
            return (Criteria) this;
        }

        public Criteria andMinmoneyLessThanOrEqualTo(Integer value) {
            addCriterion("minmoney <=", value, "minmoney");
            return (Criteria) this;
        }

        public Criteria andMinmoneyIn(List<Integer> values) {
            addCriterion("minmoney in", values, "minmoney");
            return (Criteria) this;
        }

        public Criteria andMinmoneyNotIn(List<Integer> values) {
            addCriterion("minmoney not in", values, "minmoney");
            return (Criteria) this;
        }

        public Criteria andMinmoneyBetween(Integer value1, Integer value2) {
            addCriterion("minmoney between", value1, value2, "minmoney");
            return (Criteria) this;
        }

        public Criteria andMinmoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("minmoney not between", value1, value2, "minmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyIsNull() {
            addCriterion("maxmoney is null");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyIsNotNull() {
            addCriterion("maxmoney is not null");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyEqualTo(Integer value) {
            addCriterion("maxmoney =", value, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyNotEqualTo(Integer value) {
            addCriterion("maxmoney <>", value, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyGreaterThan(Integer value) {
            addCriterion("maxmoney >", value, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("maxmoney >=", value, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyLessThan(Integer value) {
            addCriterion("maxmoney <", value, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyLessThanOrEqualTo(Integer value) {
            addCriterion("maxmoney <=", value, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyIn(List<Integer> values) {
            addCriterion("maxmoney in", values, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyNotIn(List<Integer> values) {
            addCriterion("maxmoney not in", values, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyBetween(Integer value1, Integer value2) {
            addCriterion("maxmoney between", value1, value2, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("maxmoney not between", value1, value2, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andWorkcityIsNull() {
            addCriterion("workcity is null");
            return (Criteria) this;
        }

        public Criteria andWorkcityIsNotNull() {
            addCriterion("workcity is not null");
            return (Criteria) this;
        }

        public Criteria andWorkcityEqualTo(String value) {
            addCriterion("workcity =", value, "workcity");
            return (Criteria) this;
        }

        public Criteria andWorkcityNotEqualTo(String value) {
            addCriterion("workcity <>", value, "workcity");
            return (Criteria) this;
        }

        public Criteria andWorkcityGreaterThan(String value) {
            addCriterion("workcity >", value, "workcity");
            return (Criteria) this;
        }

        public Criteria andWorkcityGreaterThanOrEqualTo(String value) {
            addCriterion("workcity >=", value, "workcity");
            return (Criteria) this;
        }

        public Criteria andWorkcityLessThan(String value) {
            addCriterion("workcity <", value, "workcity");
            return (Criteria) this;
        }

        public Criteria andWorkcityLessThanOrEqualTo(String value) {
            addCriterion("workcity <=", value, "workcity");
            return (Criteria) this;
        }

        public Criteria andWorkcityLike(String value) {
            addCriterion("workcity like", value, "workcity");
            return (Criteria) this;
        }

        public Criteria andWorkcityNotLike(String value) {
            addCriterion("workcity not like", value, "workcity");
            return (Criteria) this;
        }

        public Criteria andWorkcityIn(List<String> values) {
            addCriterion("workcity in", values, "workcity");
            return (Criteria) this;
        }

        public Criteria andWorkcityNotIn(List<String> values) {
            addCriterion("workcity not in", values, "workcity");
            return (Criteria) this;
        }

        public Criteria andWorkcityBetween(String value1, String value2) {
            addCriterion("workcity between", value1, value2, "workcity");
            return (Criteria) this;
        }

        public Criteria andWorkcityNotBetween(String value1, String value2) {
            addCriterion("workcity not between", value1, value2, "workcity");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceIsNull() {
            addCriterion("workexperience is null");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceIsNotNull() {
            addCriterion("workexperience is not null");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceEqualTo(Integer value) {
            addCriterion("workexperience =", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceNotEqualTo(Integer value) {
            addCriterion("workexperience <>", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceGreaterThan(Integer value) {
            addCriterion("workexperience >", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceGreaterThanOrEqualTo(Integer value) {
            addCriterion("workexperience >=", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceLessThan(Integer value) {
            addCriterion("workexperience <", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceLessThanOrEqualTo(Integer value) {
            addCriterion("workexperience <=", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceIn(List<Integer> values) {
            addCriterion("workexperience in", values, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceNotIn(List<Integer> values) {
            addCriterion("workexperience not in", values, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceBetween(Integer value1, Integer value2) {
            addCriterion("workexperience between", value1, value2, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceNotBetween(Integer value1, Integer value2) {
            addCriterion("workexperience not between", value1, value2, "workexperience");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(Integer value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(Integer value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(Integer value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(Integer value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(Integer value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(Integer value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<Integer> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<Integer> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(Integer value1, Integer value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(Integer value1, Integer value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andCwealIsNull() {
            addCriterion("cweal is null");
            return (Criteria) this;
        }

        public Criteria andCwealIsNotNull() {
            addCriterion("cweal is not null");
            return (Criteria) this;
        }

        public Criteria andCwealEqualTo(String value) {
            addCriterion("cweal =", value, "cweal");
            return (Criteria) this;
        }

        public Criteria andCwealNotEqualTo(String value) {
            addCriterion("cweal <>", value, "cweal");
            return (Criteria) this;
        }

        public Criteria andCwealGreaterThan(String value) {
            addCriterion("cweal >", value, "cweal");
            return (Criteria) this;
        }

        public Criteria andCwealGreaterThanOrEqualTo(String value) {
            addCriterion("cweal >=", value, "cweal");
            return (Criteria) this;
        }

        public Criteria andCwealLessThan(String value) {
            addCriterion("cweal <", value, "cweal");
            return (Criteria) this;
        }

        public Criteria andCwealLessThanOrEqualTo(String value) {
            addCriterion("cweal <=", value, "cweal");
            return (Criteria) this;
        }

        public Criteria andCwealLike(String value) {
            addCriterion("cweal like", value, "cweal");
            return (Criteria) this;
        }

        public Criteria andCwealNotLike(String value) {
            addCriterion("cweal not like", value, "cweal");
            return (Criteria) this;
        }

        public Criteria andCwealIn(List<String> values) {
            addCriterion("cweal in", values, "cweal");
            return (Criteria) this;
        }

        public Criteria andCwealNotIn(List<String> values) {
            addCriterion("cweal not in", values, "cweal");
            return (Criteria) this;
        }

        public Criteria andCwealBetween(String value1, String value2) {
            addCriterion("cweal between", value1, value2, "cweal");
            return (Criteria) this;
        }

        public Criteria andCwealNotBetween(String value1, String value2) {
            addCriterion("cweal not between", value1, value2, "cweal");
            return (Criteria) this;
        }

        public Criteria andWorkdescribesIsNull() {
            addCriterion("workdescribes is null");
            return (Criteria) this;
        }

        public Criteria andWorkdescribesIsNotNull() {
            addCriterion("workdescribes is not null");
            return (Criteria) this;
        }

        public Criteria andWorkdescribesEqualTo(String value) {
            addCriterion("workdescribes =", value, "workdescribes");
            return (Criteria) this;
        }

        public Criteria andWorkdescribesNotEqualTo(String value) {
            addCriterion("workdescribes <>", value, "workdescribes");
            return (Criteria) this;
        }

        public Criteria andWorkdescribesGreaterThan(String value) {
            addCriterion("workdescribes >", value, "workdescribes");
            return (Criteria) this;
        }

        public Criteria andWorkdescribesGreaterThanOrEqualTo(String value) {
            addCriterion("workdescribes >=", value, "workdescribes");
            return (Criteria) this;
        }

        public Criteria andWorkdescribesLessThan(String value) {
            addCriterion("workdescribes <", value, "workdescribes");
            return (Criteria) this;
        }

        public Criteria andWorkdescribesLessThanOrEqualTo(String value) {
            addCriterion("workdescribes <=", value, "workdescribes");
            return (Criteria) this;
        }

        public Criteria andWorkdescribesLike(String value) {
            addCriterion("workdescribes like", value, "workdescribes");
            return (Criteria) this;
        }

        public Criteria andWorkdescribesNotLike(String value) {
            addCriterion("workdescribes not like", value, "workdescribes");
            return (Criteria) this;
        }

        public Criteria andWorkdescribesIn(List<String> values) {
            addCriterion("workdescribes in", values, "workdescribes");
            return (Criteria) this;
        }

        public Criteria andWorkdescribesNotIn(List<String> values) {
            addCriterion("workdescribes not in", values, "workdescribes");
            return (Criteria) this;
        }

        public Criteria andWorkdescribesBetween(String value1, String value2) {
            addCriterion("workdescribes between", value1, value2, "workdescribes");
            return (Criteria) this;
        }

        public Criteria andWorkdescribesNotBetween(String value1, String value2) {
            addCriterion("workdescribes not between", value1, value2, "workdescribes");
            return (Criteria) this;
        }

        public Criteria andWorkaddressIsNull() {
            addCriterion("workaddress is null");
            return (Criteria) this;
        }

        public Criteria andWorkaddressIsNotNull() {
            addCriterion("workaddress is not null");
            return (Criteria) this;
        }

        public Criteria andWorkaddressEqualTo(String value) {
            addCriterion("workaddress =", value, "workaddress");
            return (Criteria) this;
        }

        public Criteria andWorkaddressNotEqualTo(String value) {
            addCriterion("workaddress <>", value, "workaddress");
            return (Criteria) this;
        }

        public Criteria andWorkaddressGreaterThan(String value) {
            addCriterion("workaddress >", value, "workaddress");
            return (Criteria) this;
        }

        public Criteria andWorkaddressGreaterThanOrEqualTo(String value) {
            addCriterion("workaddress >=", value, "workaddress");
            return (Criteria) this;
        }

        public Criteria andWorkaddressLessThan(String value) {
            addCriterion("workaddress <", value, "workaddress");
            return (Criteria) this;
        }

        public Criteria andWorkaddressLessThanOrEqualTo(String value) {
            addCriterion("workaddress <=", value, "workaddress");
            return (Criteria) this;
        }

        public Criteria andWorkaddressLike(String value) {
            addCriterion("workaddress like", value, "workaddress");
            return (Criteria) this;
        }

        public Criteria andWorkaddressNotLike(String value) {
            addCriterion("workaddress not like", value, "workaddress");
            return (Criteria) this;
        }

        public Criteria andWorkaddressIn(List<String> values) {
            addCriterion("workaddress in", values, "workaddress");
            return (Criteria) this;
        }

        public Criteria andWorkaddressNotIn(List<String> values) {
            addCriterion("workaddress not in", values, "workaddress");
            return (Criteria) this;
        }

        public Criteria andWorkaddressBetween(String value1, String value2) {
            addCriterion("workaddress between", value1, value2, "workaddress");
            return (Criteria) this;
        }

        public Criteria andWorkaddressNotBetween(String value1, String value2) {
            addCriterion("workaddress not between", value1, value2, "workaddress");
            return (Criteria) this;
        }

        public Criteria andCemailIsNull() {
            addCriterion("cemail is null");
            return (Criteria) this;
        }

        public Criteria andCemailIsNotNull() {
            addCriterion("cemail is not null");
            return (Criteria) this;
        }

        public Criteria andCemailEqualTo(String value) {
            addCriterion("cemail =", value, "cemail");
            return (Criteria) this;
        }

        public Criteria andCemailNotEqualTo(String value) {
            addCriterion("cemail <>", value, "cemail");
            return (Criteria) this;
        }

        public Criteria andCemailGreaterThan(String value) {
            addCriterion("cemail >", value, "cemail");
            return (Criteria) this;
        }

        public Criteria andCemailGreaterThanOrEqualTo(String value) {
            addCriterion("cemail >=", value, "cemail");
            return (Criteria) this;
        }

        public Criteria andCemailLessThan(String value) {
            addCriterion("cemail <", value, "cemail");
            return (Criteria) this;
        }

        public Criteria andCemailLessThanOrEqualTo(String value) {
            addCriterion("cemail <=", value, "cemail");
            return (Criteria) this;
        }

        public Criteria andCemailLike(String value) {
            addCriterion("cemail like", value, "cemail");
            return (Criteria) this;
        }

        public Criteria andCemailNotLike(String value) {
            addCriterion("cemail not like", value, "cemail");
            return (Criteria) this;
        }

        public Criteria andCemailIn(List<String> values) {
            addCriterion("cemail in", values, "cemail");
            return (Criteria) this;
        }

        public Criteria andCemailNotIn(List<String> values) {
            addCriterion("cemail not in", values, "cemail");
            return (Criteria) this;
        }

        public Criteria andCemailBetween(String value1, String value2) {
            addCriterion("cemail between", value1, value2, "cemail");
            return (Criteria) this;
        }

        public Criteria andCemailNotBetween(String value1, String value2) {
            addCriterion("cemail not between", value1, value2, "cemail");
            return (Criteria) this;
        }

        public Criteria andWorktimeIsNull() {
            addCriterion("worktime is null");
            return (Criteria) this;
        }

        public Criteria andWorktimeIsNotNull() {
            addCriterion("worktime is not null");
            return (Criteria) this;
        }

        public Criteria andWorktimeEqualTo(Date value) {
            addCriterion("worktime =", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotEqualTo(Date value) {
            addCriterion("worktime <>", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeGreaterThan(Date value) {
            addCriterion("worktime >", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("worktime >=", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeLessThan(Date value) {
            addCriterion("worktime <", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeLessThanOrEqualTo(Date value) {
            addCriterion("worktime <=", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeIn(List<Date> values) {
            addCriterion("worktime in", values, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotIn(List<Date> values) {
            addCriterion("worktime not in", values, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeBetween(Date value1, Date value2) {
            addCriterion("worktime between", value1, value2, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotBetween(Date value1, Date value2) {
            addCriterion("worktime not between", value1, value2, "worktime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}