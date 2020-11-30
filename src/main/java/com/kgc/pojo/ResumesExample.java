package com.kgc.pojo;

import java.util.ArrayList;
import java.util.List;

public class ResumesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResumesExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("realname is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realname is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realname =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realname <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realname >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realname >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("realname <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realname <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("realname like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("realname not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realname in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realname not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realname between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realname not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andUserpictureIsNull() {
            addCriterion("userpicture is null");
            return (Criteria) this;
        }

        public Criteria andUserpictureIsNotNull() {
            addCriterion("userpicture is not null");
            return (Criteria) this;
        }

        public Criteria andUserpictureEqualTo(String value) {
            addCriterion("userpicture =", value, "userpicture");
            return (Criteria) this;
        }

        public Criteria andUserpictureNotEqualTo(String value) {
            addCriterion("userpicture <>", value, "userpicture");
            return (Criteria) this;
        }

        public Criteria andUserpictureGreaterThan(String value) {
            addCriterion("userpicture >", value, "userpicture");
            return (Criteria) this;
        }

        public Criteria andUserpictureGreaterThanOrEqualTo(String value) {
            addCriterion("userpicture >=", value, "userpicture");
            return (Criteria) this;
        }

        public Criteria andUserpictureLessThan(String value) {
            addCriterion("userpicture <", value, "userpicture");
            return (Criteria) this;
        }

        public Criteria andUserpictureLessThanOrEqualTo(String value) {
            addCriterion("userpicture <=", value, "userpicture");
            return (Criteria) this;
        }

        public Criteria andUserpictureLike(String value) {
            addCriterion("userpicture like", value, "userpicture");
            return (Criteria) this;
        }

        public Criteria andUserpictureNotLike(String value) {
            addCriterion("userpicture not like", value, "userpicture");
            return (Criteria) this;
        }

        public Criteria andUserpictureIn(List<String> values) {
            addCriterion("userpicture in", values, "userpicture");
            return (Criteria) this;
        }

        public Criteria andUserpictureNotIn(List<String> values) {
            addCriterion("userpicture not in", values, "userpicture");
            return (Criteria) this;
        }

        public Criteria andUserpictureBetween(String value1, String value2) {
            addCriterion("userpicture between", value1, value2, "userpicture");
            return (Criteria) this;
        }

        public Criteria andUserpictureNotBetween(String value1, String value2) {
            addCriterion("userpicture not between", value1, value2, "userpicture");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Integer value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Integer value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Integer value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Integer value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Integer value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Integer> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Integer> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Integer value1, Integer value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andWorkstatusIsNull() {
            addCriterion("workstatus is null");
            return (Criteria) this;
        }

        public Criteria andWorkstatusIsNotNull() {
            addCriterion("workstatus is not null");
            return (Criteria) this;
        }

        public Criteria andWorkstatusEqualTo(Integer value) {
            addCriterion("workstatus =", value, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusNotEqualTo(Integer value) {
            addCriterion("workstatus <>", value, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusGreaterThan(Integer value) {
            addCriterion("workstatus >", value, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("workstatus >=", value, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusLessThan(Integer value) {
            addCriterion("workstatus <", value, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusLessThanOrEqualTo(Integer value) {
            addCriterion("workstatus <=", value, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusIn(List<Integer> values) {
            addCriterion("workstatus in", values, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusNotIn(List<Integer> values) {
            addCriterion("workstatus not in", values, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusBetween(Integer value1, Integer value2) {
            addCriterion("workstatus between", value1, value2, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("workstatus not between", value1, value2, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkyearIsNull() {
            addCriterion("workyear is null");
            return (Criteria) this;
        }

        public Criteria andWorkyearIsNotNull() {
            addCriterion("workyear is not null");
            return (Criteria) this;
        }

        public Criteria andWorkyearEqualTo(Integer value) {
            addCriterion("workyear =", value, "workyear");
            return (Criteria) this;
        }

        public Criteria andWorkyearNotEqualTo(Integer value) {
            addCriterion("workyear <>", value, "workyear");
            return (Criteria) this;
        }

        public Criteria andWorkyearGreaterThan(Integer value) {
            addCriterion("workyear >", value, "workyear");
            return (Criteria) this;
        }

        public Criteria andWorkyearGreaterThanOrEqualTo(Integer value) {
            addCriterion("workyear >=", value, "workyear");
            return (Criteria) this;
        }

        public Criteria andWorkyearLessThan(Integer value) {
            addCriterion("workyear <", value, "workyear");
            return (Criteria) this;
        }

        public Criteria andWorkyearLessThanOrEqualTo(Integer value) {
            addCriterion("workyear <=", value, "workyear");
            return (Criteria) this;
        }

        public Criteria andWorkyearIn(List<Integer> values) {
            addCriterion("workyear in", values, "workyear");
            return (Criteria) this;
        }

        public Criteria andWorkyearNotIn(List<Integer> values) {
            addCriterion("workyear not in", values, "workyear");
            return (Criteria) this;
        }

        public Criteria andWorkyearBetween(Integer value1, Integer value2) {
            addCriterion("workyear between", value1, value2, "workyear");
            return (Criteria) this;
        }

        public Criteria andWorkyearNotBetween(Integer value1, Integer value2) {
            addCriterion("workyear not between", value1, value2, "workyear");
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

        public Criteria andRtelephoneIsNull() {
            addCriterion("rtelephone is null");
            return (Criteria) this;
        }

        public Criteria andRtelephoneIsNotNull() {
            addCriterion("rtelephone is not null");
            return (Criteria) this;
        }

        public Criteria andRtelephoneEqualTo(String value) {
            addCriterion("rtelephone =", value, "rtelephone");
            return (Criteria) this;
        }

        public Criteria andRtelephoneNotEqualTo(String value) {
            addCriterion("rtelephone <>", value, "rtelephone");
            return (Criteria) this;
        }

        public Criteria andRtelephoneGreaterThan(String value) {
            addCriterion("rtelephone >", value, "rtelephone");
            return (Criteria) this;
        }

        public Criteria andRtelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("rtelephone >=", value, "rtelephone");
            return (Criteria) this;
        }

        public Criteria andRtelephoneLessThan(String value) {
            addCriterion("rtelephone <", value, "rtelephone");
            return (Criteria) this;
        }

        public Criteria andRtelephoneLessThanOrEqualTo(String value) {
            addCriterion("rtelephone <=", value, "rtelephone");
            return (Criteria) this;
        }

        public Criteria andRtelephoneLike(String value) {
            addCriterion("rtelephone like", value, "rtelephone");
            return (Criteria) this;
        }

        public Criteria andRtelephoneNotLike(String value) {
            addCriterion("rtelephone not like", value, "rtelephone");
            return (Criteria) this;
        }

        public Criteria andRtelephoneIn(List<String> values) {
            addCriterion("rtelephone in", values, "rtelephone");
            return (Criteria) this;
        }

        public Criteria andRtelephoneNotIn(List<String> values) {
            addCriterion("rtelephone not in", values, "rtelephone");
            return (Criteria) this;
        }

        public Criteria andRtelephoneBetween(String value1, String value2) {
            addCriterion("rtelephone between", value1, value2, "rtelephone");
            return (Criteria) this;
        }

        public Criteria andRtelephoneNotBetween(String value1, String value2) {
            addCriterion("rtelephone not between", value1, value2, "rtelephone");
            return (Criteria) this;
        }

        public Criteria andRemailIsNull() {
            addCriterion("remail is null");
            return (Criteria) this;
        }

        public Criteria andRemailIsNotNull() {
            addCriterion("remail is not null");
            return (Criteria) this;
        }

        public Criteria andRemailEqualTo(String value) {
            addCriterion("remail =", value, "remail");
            return (Criteria) this;
        }

        public Criteria andRemailNotEqualTo(String value) {
            addCriterion("remail <>", value, "remail");
            return (Criteria) this;
        }

        public Criteria andRemailGreaterThan(String value) {
            addCriterion("remail >", value, "remail");
            return (Criteria) this;
        }

        public Criteria andRemailGreaterThanOrEqualTo(String value) {
            addCriterion("remail >=", value, "remail");
            return (Criteria) this;
        }

        public Criteria andRemailLessThan(String value) {
            addCriterion("remail <", value, "remail");
            return (Criteria) this;
        }

        public Criteria andRemailLessThanOrEqualTo(String value) {
            addCriterion("remail <=", value, "remail");
            return (Criteria) this;
        }

        public Criteria andRemailLike(String value) {
            addCriterion("remail like", value, "remail");
            return (Criteria) this;
        }

        public Criteria andRemailNotLike(String value) {
            addCriterion("remail not like", value, "remail");
            return (Criteria) this;
        }

        public Criteria andRemailIn(List<String> values) {
            addCriterion("remail in", values, "remail");
            return (Criteria) this;
        }

        public Criteria andRemailNotIn(List<String> values) {
            addCriterion("remail not in", values, "remail");
            return (Criteria) this;
        }

        public Criteria andRemailBetween(String value1, String value2) {
            addCriterion("remail between", value1, value2, "remail");
            return (Criteria) this;
        }

        public Criteria andRemailNotBetween(String value1, String value2) {
            addCriterion("remail not between", value1, value2, "remail");
            return (Criteria) this;
        }

        public Criteria andWantcityIsNull() {
            addCriterion("wantcity is null");
            return (Criteria) this;
        }

        public Criteria andWantcityIsNotNull() {
            addCriterion("wantcity is not null");
            return (Criteria) this;
        }

        public Criteria andWantcityEqualTo(String value) {
            addCriterion("wantcity =", value, "wantcity");
            return (Criteria) this;
        }

        public Criteria andWantcityNotEqualTo(String value) {
            addCriterion("wantcity <>", value, "wantcity");
            return (Criteria) this;
        }

        public Criteria andWantcityGreaterThan(String value) {
            addCriterion("wantcity >", value, "wantcity");
            return (Criteria) this;
        }

        public Criteria andWantcityGreaterThanOrEqualTo(String value) {
            addCriterion("wantcity >=", value, "wantcity");
            return (Criteria) this;
        }

        public Criteria andWantcityLessThan(String value) {
            addCriterion("wantcity <", value, "wantcity");
            return (Criteria) this;
        }

        public Criteria andWantcityLessThanOrEqualTo(String value) {
            addCriterion("wantcity <=", value, "wantcity");
            return (Criteria) this;
        }

        public Criteria andWantcityLike(String value) {
            addCriterion("wantcity like", value, "wantcity");
            return (Criteria) this;
        }

        public Criteria andWantcityNotLike(String value) {
            addCriterion("wantcity not like", value, "wantcity");
            return (Criteria) this;
        }

        public Criteria andWantcityIn(List<String> values) {
            addCriterion("wantcity in", values, "wantcity");
            return (Criteria) this;
        }

        public Criteria andWantcityNotIn(List<String> values) {
            addCriterion("wantcity not in", values, "wantcity");
            return (Criteria) this;
        }

        public Criteria andWantcityBetween(String value1, String value2) {
            addCriterion("wantcity between", value1, value2, "wantcity");
            return (Criteria) this;
        }

        public Criteria andWantcityNotBetween(String value1, String value2) {
            addCriterion("wantcity not between", value1, value2, "wantcity");
            return (Criteria) this;
        }

        public Criteria andWantmoneyIsNull() {
            addCriterion("wantmoney is null");
            return (Criteria) this;
        }

        public Criteria andWantmoneyIsNotNull() {
            addCriterion("wantmoney is not null");
            return (Criteria) this;
        }

        public Criteria andWantmoneyEqualTo(Integer value) {
            addCriterion("wantmoney =", value, "wantmoney");
            return (Criteria) this;
        }

        public Criteria andWantmoneyNotEqualTo(Integer value) {
            addCriterion("wantmoney <>", value, "wantmoney");
            return (Criteria) this;
        }

        public Criteria andWantmoneyGreaterThan(Integer value) {
            addCriterion("wantmoney >", value, "wantmoney");
            return (Criteria) this;
        }

        public Criteria andWantmoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("wantmoney >=", value, "wantmoney");
            return (Criteria) this;
        }

        public Criteria andWantmoneyLessThan(Integer value) {
            addCriterion("wantmoney <", value, "wantmoney");
            return (Criteria) this;
        }

        public Criteria andWantmoneyLessThanOrEqualTo(Integer value) {
            addCriterion("wantmoney <=", value, "wantmoney");
            return (Criteria) this;
        }

        public Criteria andWantmoneyIn(List<Integer> values) {
            addCriterion("wantmoney in", values, "wantmoney");
            return (Criteria) this;
        }

        public Criteria andWantmoneyNotIn(List<Integer> values) {
            addCriterion("wantmoney not in", values, "wantmoney");
            return (Criteria) this;
        }

        public Criteria andWantmoneyBetween(Integer value1, Integer value2) {
            addCriterion("wantmoney between", value1, value2, "wantmoney");
            return (Criteria) this;
        }

        public Criteria andWantmoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("wantmoney not between", value1, value2, "wantmoney");
            return (Criteria) this;
        }

        public Criteria andUjobtypeIsNull() {
            addCriterion("ujobtype is null");
            return (Criteria) this;
        }

        public Criteria andUjobtypeIsNotNull() {
            addCriterion("ujobtype is not null");
            return (Criteria) this;
        }

        public Criteria andUjobtypeEqualTo(Integer value) {
            addCriterion("ujobtype =", value, "ujobtype");
            return (Criteria) this;
        }

        public Criteria andUjobtypeNotEqualTo(Integer value) {
            addCriterion("ujobtype <>", value, "ujobtype");
            return (Criteria) this;
        }

        public Criteria andUjobtypeGreaterThan(Integer value) {
            addCriterion("ujobtype >", value, "ujobtype");
            return (Criteria) this;
        }

        public Criteria andUjobtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ujobtype >=", value, "ujobtype");
            return (Criteria) this;
        }

        public Criteria andUjobtypeLessThan(Integer value) {
            addCriterion("ujobtype <", value, "ujobtype");
            return (Criteria) this;
        }

        public Criteria andUjobtypeLessThanOrEqualTo(Integer value) {
            addCriterion("ujobtype <=", value, "ujobtype");
            return (Criteria) this;
        }

        public Criteria andUjobtypeIn(List<Integer> values) {
            addCriterion("ujobtype in", values, "ujobtype");
            return (Criteria) this;
        }

        public Criteria andUjobtypeNotIn(List<Integer> values) {
            addCriterion("ujobtype not in", values, "ujobtype");
            return (Criteria) this;
        }

        public Criteria andUjobtypeBetween(Integer value1, Integer value2) {
            addCriterion("ujobtype between", value1, value2, "ujobtype");
            return (Criteria) this;
        }

        public Criteria andUjobtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ujobtype not between", value1, value2, "ujobtype");
            return (Criteria) this;
        }

        public Criteria andUjobwantIsNull() {
            addCriterion("ujobwant is null");
            return (Criteria) this;
        }

        public Criteria andUjobwantIsNotNull() {
            addCriterion("ujobwant is not null");
            return (Criteria) this;
        }

        public Criteria andUjobwantEqualTo(String value) {
            addCriterion("ujobwant =", value, "ujobwant");
            return (Criteria) this;
        }

        public Criteria andUjobwantNotEqualTo(String value) {
            addCriterion("ujobwant <>", value, "ujobwant");
            return (Criteria) this;
        }

        public Criteria andUjobwantGreaterThan(String value) {
            addCriterion("ujobwant >", value, "ujobwant");
            return (Criteria) this;
        }

        public Criteria andUjobwantGreaterThanOrEqualTo(String value) {
            addCriterion("ujobwant >=", value, "ujobwant");
            return (Criteria) this;
        }

        public Criteria andUjobwantLessThan(String value) {
            addCriterion("ujobwant <", value, "ujobwant");
            return (Criteria) this;
        }

        public Criteria andUjobwantLessThanOrEqualTo(String value) {
            addCriterion("ujobwant <=", value, "ujobwant");
            return (Criteria) this;
        }

        public Criteria andUjobwantLike(String value) {
            addCriterion("ujobwant like", value, "ujobwant");
            return (Criteria) this;
        }

        public Criteria andUjobwantNotLike(String value) {
            addCriterion("ujobwant not like", value, "ujobwant");
            return (Criteria) this;
        }

        public Criteria andUjobwantIn(List<String> values) {
            addCriterion("ujobwant in", values, "ujobwant");
            return (Criteria) this;
        }

        public Criteria andUjobwantNotIn(List<String> values) {
            addCriterion("ujobwant not in", values, "ujobwant");
            return (Criteria) this;
        }

        public Criteria andUjobwantBetween(String value1, String value2) {
            addCriterion("ujobwant between", value1, value2, "ujobwant");
            return (Criteria) this;
        }

        public Criteria andUjobwantNotBetween(String value1, String value2) {
            addCriterion("ujobwant not between", value1, value2, "ujobwant");
            return (Criteria) this;
        }

        public Criteria andWorkcompanyIsNull() {
            addCriterion("workcompany is null");
            return (Criteria) this;
        }

        public Criteria andWorkcompanyIsNotNull() {
            addCriterion("workcompany is not null");
            return (Criteria) this;
        }

        public Criteria andWorkcompanyEqualTo(String value) {
            addCriterion("workcompany =", value, "workcompany");
            return (Criteria) this;
        }

        public Criteria andWorkcompanyNotEqualTo(String value) {
            addCriterion("workcompany <>", value, "workcompany");
            return (Criteria) this;
        }

        public Criteria andWorkcompanyGreaterThan(String value) {
            addCriterion("workcompany >", value, "workcompany");
            return (Criteria) this;
        }

        public Criteria andWorkcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("workcompany >=", value, "workcompany");
            return (Criteria) this;
        }

        public Criteria andWorkcompanyLessThan(String value) {
            addCriterion("workcompany <", value, "workcompany");
            return (Criteria) this;
        }

        public Criteria andWorkcompanyLessThanOrEqualTo(String value) {
            addCriterion("workcompany <=", value, "workcompany");
            return (Criteria) this;
        }

        public Criteria andWorkcompanyLike(String value) {
            addCriterion("workcompany like", value, "workcompany");
            return (Criteria) this;
        }

        public Criteria andWorkcompanyNotLike(String value) {
            addCriterion("workcompany not like", value, "workcompany");
            return (Criteria) this;
        }

        public Criteria andWorkcompanyIn(List<String> values) {
            addCriterion("workcompany in", values, "workcompany");
            return (Criteria) this;
        }

        public Criteria andWorkcompanyNotIn(List<String> values) {
            addCriterion("workcompany not in", values, "workcompany");
            return (Criteria) this;
        }

        public Criteria andWorkcompanyBetween(String value1, String value2) {
            addCriterion("workcompany between", value1, value2, "workcompany");
            return (Criteria) this;
        }

        public Criteria andWorkcompanyNotBetween(String value1, String value2) {
            addCriterion("workcompany not between", value1, value2, "workcompany");
            return (Criteria) this;
        }

        public Criteria andWorkjobIsNull() {
            addCriterion("workjob is null");
            return (Criteria) this;
        }

        public Criteria andWorkjobIsNotNull() {
            addCriterion("workjob is not null");
            return (Criteria) this;
        }

        public Criteria andWorkjobEqualTo(String value) {
            addCriterion("workjob =", value, "workjob");
            return (Criteria) this;
        }

        public Criteria andWorkjobNotEqualTo(String value) {
            addCriterion("workjob <>", value, "workjob");
            return (Criteria) this;
        }

        public Criteria andWorkjobGreaterThan(String value) {
            addCriterion("workjob >", value, "workjob");
            return (Criteria) this;
        }

        public Criteria andWorkjobGreaterThanOrEqualTo(String value) {
            addCriterion("workjob >=", value, "workjob");
            return (Criteria) this;
        }

        public Criteria andWorkjobLessThan(String value) {
            addCriterion("workjob <", value, "workjob");
            return (Criteria) this;
        }

        public Criteria andWorkjobLessThanOrEqualTo(String value) {
            addCriterion("workjob <=", value, "workjob");
            return (Criteria) this;
        }

        public Criteria andWorkjobLike(String value) {
            addCriterion("workjob like", value, "workjob");
            return (Criteria) this;
        }

        public Criteria andWorkjobNotLike(String value) {
            addCriterion("workjob not like", value, "workjob");
            return (Criteria) this;
        }

        public Criteria andWorkjobIn(List<String> values) {
            addCriterion("workjob in", values, "workjob");
            return (Criteria) this;
        }

        public Criteria andWorkjobNotIn(List<String> values) {
            addCriterion("workjob not in", values, "workjob");
            return (Criteria) this;
        }

        public Criteria andWorkjobBetween(String value1, String value2) {
            addCriterion("workjob between", value1, value2, "workjob");
            return (Criteria) this;
        }

        public Criteria andWorkjobNotBetween(String value1, String value2) {
            addCriterion("workjob not between", value1, value2, "workjob");
            return (Criteria) this;
        }

        public Criteria andWorkbeginyearIsNull() {
            addCriterion("workbeginyear is null");
            return (Criteria) this;
        }

        public Criteria andWorkbeginyearIsNotNull() {
            addCriterion("workbeginyear is not null");
            return (Criteria) this;
        }

        public Criteria andWorkbeginyearEqualTo(Integer value) {
            addCriterion("workbeginyear =", value, "workbeginyear");
            return (Criteria) this;
        }

        public Criteria andWorkbeginyearNotEqualTo(Integer value) {
            addCriterion("workbeginyear <>", value, "workbeginyear");
            return (Criteria) this;
        }

        public Criteria andWorkbeginyearGreaterThan(Integer value) {
            addCriterion("workbeginyear >", value, "workbeginyear");
            return (Criteria) this;
        }

        public Criteria andWorkbeginyearGreaterThanOrEqualTo(Integer value) {
            addCriterion("workbeginyear >=", value, "workbeginyear");
            return (Criteria) this;
        }

        public Criteria andWorkbeginyearLessThan(Integer value) {
            addCriterion("workbeginyear <", value, "workbeginyear");
            return (Criteria) this;
        }

        public Criteria andWorkbeginyearLessThanOrEqualTo(Integer value) {
            addCriterion("workbeginyear <=", value, "workbeginyear");
            return (Criteria) this;
        }

        public Criteria andWorkbeginyearIn(List<Integer> values) {
            addCriterion("workbeginyear in", values, "workbeginyear");
            return (Criteria) this;
        }

        public Criteria andWorkbeginyearNotIn(List<Integer> values) {
            addCriterion("workbeginyear not in", values, "workbeginyear");
            return (Criteria) this;
        }

        public Criteria andWorkbeginyearBetween(Integer value1, Integer value2) {
            addCriterion("workbeginyear between", value1, value2, "workbeginyear");
            return (Criteria) this;
        }

        public Criteria andWorkbeginyearNotBetween(Integer value1, Integer value2) {
            addCriterion("workbeginyear not between", value1, value2, "workbeginyear");
            return (Criteria) this;
        }

        public Criteria andWorkbeginmonthIsNull() {
            addCriterion("workbeginmonth is null");
            return (Criteria) this;
        }

        public Criteria andWorkbeginmonthIsNotNull() {
            addCriterion("workbeginmonth is not null");
            return (Criteria) this;
        }

        public Criteria andWorkbeginmonthEqualTo(Integer value) {
            addCriterion("workbeginmonth =", value, "workbeginmonth");
            return (Criteria) this;
        }

        public Criteria andWorkbeginmonthNotEqualTo(Integer value) {
            addCriterion("workbeginmonth <>", value, "workbeginmonth");
            return (Criteria) this;
        }

        public Criteria andWorkbeginmonthGreaterThan(Integer value) {
            addCriterion("workbeginmonth >", value, "workbeginmonth");
            return (Criteria) this;
        }

        public Criteria andWorkbeginmonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("workbeginmonth >=", value, "workbeginmonth");
            return (Criteria) this;
        }

        public Criteria andWorkbeginmonthLessThan(Integer value) {
            addCriterion("workbeginmonth <", value, "workbeginmonth");
            return (Criteria) this;
        }

        public Criteria andWorkbeginmonthLessThanOrEqualTo(Integer value) {
            addCriterion("workbeginmonth <=", value, "workbeginmonth");
            return (Criteria) this;
        }

        public Criteria andWorkbeginmonthIn(List<Integer> values) {
            addCriterion("workbeginmonth in", values, "workbeginmonth");
            return (Criteria) this;
        }

        public Criteria andWorkbeginmonthNotIn(List<Integer> values) {
            addCriterion("workbeginmonth not in", values, "workbeginmonth");
            return (Criteria) this;
        }

        public Criteria andWorkbeginmonthBetween(Integer value1, Integer value2) {
            addCriterion("workbeginmonth between", value1, value2, "workbeginmonth");
            return (Criteria) this;
        }

        public Criteria andWorkbeginmonthNotBetween(Integer value1, Integer value2) {
            addCriterion("workbeginmonth not between", value1, value2, "workbeginmonth");
            return (Criteria) this;
        }

        public Criteria andWorkendyearIsNull() {
            addCriterion("workendyear is null");
            return (Criteria) this;
        }

        public Criteria andWorkendyearIsNotNull() {
            addCriterion("workendyear is not null");
            return (Criteria) this;
        }

        public Criteria andWorkendyearEqualTo(Integer value) {
            addCriterion("workendyear =", value, "workendyear");
            return (Criteria) this;
        }

        public Criteria andWorkendyearNotEqualTo(Integer value) {
            addCriterion("workendyear <>", value, "workendyear");
            return (Criteria) this;
        }

        public Criteria andWorkendyearGreaterThan(Integer value) {
            addCriterion("workendyear >", value, "workendyear");
            return (Criteria) this;
        }

        public Criteria andWorkendyearGreaterThanOrEqualTo(Integer value) {
            addCriterion("workendyear >=", value, "workendyear");
            return (Criteria) this;
        }

        public Criteria andWorkendyearLessThan(Integer value) {
            addCriterion("workendyear <", value, "workendyear");
            return (Criteria) this;
        }

        public Criteria andWorkendyearLessThanOrEqualTo(Integer value) {
            addCriterion("workendyear <=", value, "workendyear");
            return (Criteria) this;
        }

        public Criteria andWorkendyearIn(List<Integer> values) {
            addCriterion("workendyear in", values, "workendyear");
            return (Criteria) this;
        }

        public Criteria andWorkendyearNotIn(List<Integer> values) {
            addCriterion("workendyear not in", values, "workendyear");
            return (Criteria) this;
        }

        public Criteria andWorkendyearBetween(Integer value1, Integer value2) {
            addCriterion("workendyear between", value1, value2, "workendyear");
            return (Criteria) this;
        }

        public Criteria andWorkendyearNotBetween(Integer value1, Integer value2) {
            addCriterion("workendyear not between", value1, value2, "workendyear");
            return (Criteria) this;
        }

        public Criteria andWorkendmonthIsNull() {
            addCriterion("workendmonth is null");
            return (Criteria) this;
        }

        public Criteria andWorkendmonthIsNotNull() {
            addCriterion("workendmonth is not null");
            return (Criteria) this;
        }

        public Criteria andWorkendmonthEqualTo(Integer value) {
            addCriterion("workendmonth =", value, "workendmonth");
            return (Criteria) this;
        }

        public Criteria andWorkendmonthNotEqualTo(Integer value) {
            addCriterion("workendmonth <>", value, "workendmonth");
            return (Criteria) this;
        }

        public Criteria andWorkendmonthGreaterThan(Integer value) {
            addCriterion("workendmonth >", value, "workendmonth");
            return (Criteria) this;
        }

        public Criteria andWorkendmonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("workendmonth >=", value, "workendmonth");
            return (Criteria) this;
        }

        public Criteria andWorkendmonthLessThan(Integer value) {
            addCriterion("workendmonth <", value, "workendmonth");
            return (Criteria) this;
        }

        public Criteria andWorkendmonthLessThanOrEqualTo(Integer value) {
            addCriterion("workendmonth <=", value, "workendmonth");
            return (Criteria) this;
        }

        public Criteria andWorkendmonthIn(List<Integer> values) {
            addCriterion("workendmonth in", values, "workendmonth");
            return (Criteria) this;
        }

        public Criteria andWorkendmonthNotIn(List<Integer> values) {
            addCriterion("workendmonth not in", values, "workendmonth");
            return (Criteria) this;
        }

        public Criteria andWorkendmonthBetween(Integer value1, Integer value2) {
            addCriterion("workendmonth between", value1, value2, "workendmonth");
            return (Criteria) this;
        }

        public Criteria andWorkendmonthNotBetween(Integer value1, Integer value2) {
            addCriterion("workendmonth not between", value1, value2, "workendmonth");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNull() {
            addCriterion("projectname is null");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNotNull() {
            addCriterion("projectname is not null");
            return (Criteria) this;
        }

        public Criteria andProjectnameEqualTo(String value) {
            addCriterion("projectname =", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotEqualTo(String value) {
            addCriterion("projectname <>", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThan(String value) {
            addCriterion("projectname >", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("projectname >=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThan(String value) {
            addCriterion("projectname <", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThanOrEqualTo(String value) {
            addCriterion("projectname <=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLike(String value) {
            addCriterion("projectname like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotLike(String value) {
            addCriterion("projectname not like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameIn(List<String> values) {
            addCriterion("projectname in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotIn(List<String> values) {
            addCriterion("projectname not in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameBetween(String value1, String value2) {
            addCriterion("projectname between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotBetween(String value1, String value2) {
            addCriterion("projectname not between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectjobIsNull() {
            addCriterion("projectjob is null");
            return (Criteria) this;
        }

        public Criteria andProjectjobIsNotNull() {
            addCriterion("projectjob is not null");
            return (Criteria) this;
        }

        public Criteria andProjectjobEqualTo(String value) {
            addCriterion("projectjob =", value, "projectjob");
            return (Criteria) this;
        }

        public Criteria andProjectjobNotEqualTo(String value) {
            addCriterion("projectjob <>", value, "projectjob");
            return (Criteria) this;
        }

        public Criteria andProjectjobGreaterThan(String value) {
            addCriterion("projectjob >", value, "projectjob");
            return (Criteria) this;
        }

        public Criteria andProjectjobGreaterThanOrEqualTo(String value) {
            addCriterion("projectjob >=", value, "projectjob");
            return (Criteria) this;
        }

        public Criteria andProjectjobLessThan(String value) {
            addCriterion("projectjob <", value, "projectjob");
            return (Criteria) this;
        }

        public Criteria andProjectjobLessThanOrEqualTo(String value) {
            addCriterion("projectjob <=", value, "projectjob");
            return (Criteria) this;
        }

        public Criteria andProjectjobLike(String value) {
            addCriterion("projectjob like", value, "projectjob");
            return (Criteria) this;
        }

        public Criteria andProjectjobNotLike(String value) {
            addCriterion("projectjob not like", value, "projectjob");
            return (Criteria) this;
        }

        public Criteria andProjectjobIn(List<String> values) {
            addCriterion("projectjob in", values, "projectjob");
            return (Criteria) this;
        }

        public Criteria andProjectjobNotIn(List<String> values) {
            addCriterion("projectjob not in", values, "projectjob");
            return (Criteria) this;
        }

        public Criteria andProjectjobBetween(String value1, String value2) {
            addCriterion("projectjob between", value1, value2, "projectjob");
            return (Criteria) this;
        }

        public Criteria andProjectjobNotBetween(String value1, String value2) {
            addCriterion("projectjob not between", value1, value2, "projectjob");
            return (Criteria) this;
        }

        public Criteria andProjectbeginyearIsNull() {
            addCriterion("projectbeginyear is null");
            return (Criteria) this;
        }

        public Criteria andProjectbeginyearIsNotNull() {
            addCriterion("projectbeginyear is not null");
            return (Criteria) this;
        }

        public Criteria andProjectbeginyearEqualTo(Integer value) {
            addCriterion("projectbeginyear =", value, "projectbeginyear");
            return (Criteria) this;
        }

        public Criteria andProjectbeginyearNotEqualTo(Integer value) {
            addCriterion("projectbeginyear <>", value, "projectbeginyear");
            return (Criteria) this;
        }

        public Criteria andProjectbeginyearGreaterThan(Integer value) {
            addCriterion("projectbeginyear >", value, "projectbeginyear");
            return (Criteria) this;
        }

        public Criteria andProjectbeginyearGreaterThanOrEqualTo(Integer value) {
            addCriterion("projectbeginyear >=", value, "projectbeginyear");
            return (Criteria) this;
        }

        public Criteria andProjectbeginyearLessThan(Integer value) {
            addCriterion("projectbeginyear <", value, "projectbeginyear");
            return (Criteria) this;
        }

        public Criteria andProjectbeginyearLessThanOrEqualTo(Integer value) {
            addCriterion("projectbeginyear <=", value, "projectbeginyear");
            return (Criteria) this;
        }

        public Criteria andProjectbeginyearIn(List<Integer> values) {
            addCriterion("projectbeginyear in", values, "projectbeginyear");
            return (Criteria) this;
        }

        public Criteria andProjectbeginyearNotIn(List<Integer> values) {
            addCriterion("projectbeginyear not in", values, "projectbeginyear");
            return (Criteria) this;
        }

        public Criteria andProjectbeginyearBetween(Integer value1, Integer value2) {
            addCriterion("projectbeginyear between", value1, value2, "projectbeginyear");
            return (Criteria) this;
        }

        public Criteria andProjectbeginyearNotBetween(Integer value1, Integer value2) {
            addCriterion("projectbeginyear not between", value1, value2, "projectbeginyear");
            return (Criteria) this;
        }

        public Criteria andPrijectbeginmonthIsNull() {
            addCriterion("prijectbeginmonth is null");
            return (Criteria) this;
        }

        public Criteria andPrijectbeginmonthIsNotNull() {
            addCriterion("prijectbeginmonth is not null");
            return (Criteria) this;
        }

        public Criteria andPrijectbeginmonthEqualTo(Integer value) {
            addCriterion("prijectbeginmonth =", value, "prijectbeginmonth");
            return (Criteria) this;
        }

        public Criteria andPrijectbeginmonthNotEqualTo(Integer value) {
            addCriterion("prijectbeginmonth <>", value, "prijectbeginmonth");
            return (Criteria) this;
        }

        public Criteria andPrijectbeginmonthGreaterThan(Integer value) {
            addCriterion("prijectbeginmonth >", value, "prijectbeginmonth");
            return (Criteria) this;
        }

        public Criteria andPrijectbeginmonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("prijectbeginmonth >=", value, "prijectbeginmonth");
            return (Criteria) this;
        }

        public Criteria andPrijectbeginmonthLessThan(Integer value) {
            addCriterion("prijectbeginmonth <", value, "prijectbeginmonth");
            return (Criteria) this;
        }

        public Criteria andPrijectbeginmonthLessThanOrEqualTo(Integer value) {
            addCriterion("prijectbeginmonth <=", value, "prijectbeginmonth");
            return (Criteria) this;
        }

        public Criteria andPrijectbeginmonthIn(List<Integer> values) {
            addCriterion("prijectbeginmonth in", values, "prijectbeginmonth");
            return (Criteria) this;
        }

        public Criteria andPrijectbeginmonthNotIn(List<Integer> values) {
            addCriterion("prijectbeginmonth not in", values, "prijectbeginmonth");
            return (Criteria) this;
        }

        public Criteria andPrijectbeginmonthBetween(Integer value1, Integer value2) {
            addCriterion("prijectbeginmonth between", value1, value2, "prijectbeginmonth");
            return (Criteria) this;
        }

        public Criteria andPrijectbeginmonthNotBetween(Integer value1, Integer value2) {
            addCriterion("prijectbeginmonth not between", value1, value2, "prijectbeginmonth");
            return (Criteria) this;
        }

        public Criteria andProjectendyearIsNull() {
            addCriterion("projectendyear is null");
            return (Criteria) this;
        }

        public Criteria andProjectendyearIsNotNull() {
            addCriterion("projectendyear is not null");
            return (Criteria) this;
        }

        public Criteria andProjectendyearEqualTo(Integer value) {
            addCriterion("projectendyear =", value, "projectendyear");
            return (Criteria) this;
        }

        public Criteria andProjectendyearNotEqualTo(Integer value) {
            addCriterion("projectendyear <>", value, "projectendyear");
            return (Criteria) this;
        }

        public Criteria andProjectendyearGreaterThan(Integer value) {
            addCriterion("projectendyear >", value, "projectendyear");
            return (Criteria) this;
        }

        public Criteria andProjectendyearGreaterThanOrEqualTo(Integer value) {
            addCriterion("projectendyear >=", value, "projectendyear");
            return (Criteria) this;
        }

        public Criteria andProjectendyearLessThan(Integer value) {
            addCriterion("projectendyear <", value, "projectendyear");
            return (Criteria) this;
        }

        public Criteria andProjectendyearLessThanOrEqualTo(Integer value) {
            addCriterion("projectendyear <=", value, "projectendyear");
            return (Criteria) this;
        }

        public Criteria andProjectendyearIn(List<Integer> values) {
            addCriterion("projectendyear in", values, "projectendyear");
            return (Criteria) this;
        }

        public Criteria andProjectendyearNotIn(List<Integer> values) {
            addCriterion("projectendyear not in", values, "projectendyear");
            return (Criteria) this;
        }

        public Criteria andProjectendyearBetween(Integer value1, Integer value2) {
            addCriterion("projectendyear between", value1, value2, "projectendyear");
            return (Criteria) this;
        }

        public Criteria andProjectendyearNotBetween(Integer value1, Integer value2) {
            addCriterion("projectendyear not between", value1, value2, "projectendyear");
            return (Criteria) this;
        }

        public Criteria andProjectendmonthIsNull() {
            addCriterion("projectendmonth is null");
            return (Criteria) this;
        }

        public Criteria andProjectendmonthIsNotNull() {
            addCriterion("projectendmonth is not null");
            return (Criteria) this;
        }

        public Criteria andProjectendmonthEqualTo(Integer value) {
            addCriterion("projectendmonth =", value, "projectendmonth");
            return (Criteria) this;
        }

        public Criteria andProjectendmonthNotEqualTo(Integer value) {
            addCriterion("projectendmonth <>", value, "projectendmonth");
            return (Criteria) this;
        }

        public Criteria andProjectendmonthGreaterThan(Integer value) {
            addCriterion("projectendmonth >", value, "projectendmonth");
            return (Criteria) this;
        }

        public Criteria andProjectendmonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("projectendmonth >=", value, "projectendmonth");
            return (Criteria) this;
        }

        public Criteria andProjectendmonthLessThan(Integer value) {
            addCriterion("projectendmonth <", value, "projectendmonth");
            return (Criteria) this;
        }

        public Criteria andProjectendmonthLessThanOrEqualTo(Integer value) {
            addCriterion("projectendmonth <=", value, "projectendmonth");
            return (Criteria) this;
        }

        public Criteria andProjectendmonthIn(List<Integer> values) {
            addCriterion("projectendmonth in", values, "projectendmonth");
            return (Criteria) this;
        }

        public Criteria andProjectendmonthNotIn(List<Integer> values) {
            addCriterion("projectendmonth not in", values, "projectendmonth");
            return (Criteria) this;
        }

        public Criteria andProjectendmonthBetween(Integer value1, Integer value2) {
            addCriterion("projectendmonth between", value1, value2, "projectendmonth");
            return (Criteria) this;
        }

        public Criteria andProjectendmonthNotBetween(Integer value1, Integer value2) {
            addCriterion("projectendmonth not between", value1, value2, "projectendmonth");
            return (Criteria) this;
        }

        public Criteria andProjectdescribeIsNull() {
            addCriterion("projectdescribe is null");
            return (Criteria) this;
        }

        public Criteria andProjectdescribeIsNotNull() {
            addCriterion("projectdescribe is not null");
            return (Criteria) this;
        }

        public Criteria andProjectdescribeEqualTo(String value) {
            addCriterion("projectdescribe =", value, "projectdescribe");
            return (Criteria) this;
        }

        public Criteria andProjectdescribeNotEqualTo(String value) {
            addCriterion("projectdescribe <>", value, "projectdescribe");
            return (Criteria) this;
        }

        public Criteria andProjectdescribeGreaterThan(String value) {
            addCriterion("projectdescribe >", value, "projectdescribe");
            return (Criteria) this;
        }

        public Criteria andProjectdescribeGreaterThanOrEqualTo(String value) {
            addCriterion("projectdescribe >=", value, "projectdescribe");
            return (Criteria) this;
        }

        public Criteria andProjectdescribeLessThan(String value) {
            addCriterion("projectdescribe <", value, "projectdescribe");
            return (Criteria) this;
        }

        public Criteria andProjectdescribeLessThanOrEqualTo(String value) {
            addCriterion("projectdescribe <=", value, "projectdescribe");
            return (Criteria) this;
        }

        public Criteria andProjectdescribeLike(String value) {
            addCriterion("projectdescribe like", value, "projectdescribe");
            return (Criteria) this;
        }

        public Criteria andProjectdescribeNotLike(String value) {
            addCriterion("projectdescribe not like", value, "projectdescribe");
            return (Criteria) this;
        }

        public Criteria andProjectdescribeIn(List<String> values) {
            addCriterion("projectdescribe in", values, "projectdescribe");
            return (Criteria) this;
        }

        public Criteria andProjectdescribeNotIn(List<String> values) {
            addCriterion("projectdescribe not in", values, "projectdescribe");
            return (Criteria) this;
        }

        public Criteria andProjectdescribeBetween(String value1, String value2) {
            addCriterion("projectdescribe between", value1, value2, "projectdescribe");
            return (Criteria) this;
        }

        public Criteria andProjectdescribeNotBetween(String value1, String value2) {
            addCriterion("projectdescribe not between", value1, value2, "projectdescribe");
            return (Criteria) this;
        }

        public Criteria andSchoolnameIsNull() {
            addCriterion("schoolname is null");
            return (Criteria) this;
        }

        public Criteria andSchoolnameIsNotNull() {
            addCriterion("schoolname is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolnameEqualTo(String value) {
            addCriterion("schoolname =", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotEqualTo(String value) {
            addCriterion("schoolname <>", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameGreaterThan(String value) {
            addCriterion("schoolname >", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameGreaterThanOrEqualTo(String value) {
            addCriterion("schoolname >=", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameLessThan(String value) {
            addCriterion("schoolname <", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameLessThanOrEqualTo(String value) {
            addCriterion("schoolname <=", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameLike(String value) {
            addCriterion("schoolname like", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotLike(String value) {
            addCriterion("schoolname not like", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameIn(List<String> values) {
            addCriterion("schoolname in", values, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotIn(List<String> values) {
            addCriterion("schoolname not in", values, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameBetween(String value1, String value2) {
            addCriterion("schoolname between", value1, value2, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotBetween(String value1, String value2) {
            addCriterion("schoolname not between", value1, value2, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolmajorIsNull() {
            addCriterion("schoolmajor is null");
            return (Criteria) this;
        }

        public Criteria andSchoolmajorIsNotNull() {
            addCriterion("schoolmajor is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolmajorEqualTo(String value) {
            addCriterion("schoolmajor =", value, "schoolmajor");
            return (Criteria) this;
        }

        public Criteria andSchoolmajorNotEqualTo(String value) {
            addCriterion("schoolmajor <>", value, "schoolmajor");
            return (Criteria) this;
        }

        public Criteria andSchoolmajorGreaterThan(String value) {
            addCriterion("schoolmajor >", value, "schoolmajor");
            return (Criteria) this;
        }

        public Criteria andSchoolmajorGreaterThanOrEqualTo(String value) {
            addCriterion("schoolmajor >=", value, "schoolmajor");
            return (Criteria) this;
        }

        public Criteria andSchoolmajorLessThan(String value) {
            addCriterion("schoolmajor <", value, "schoolmajor");
            return (Criteria) this;
        }

        public Criteria andSchoolmajorLessThanOrEqualTo(String value) {
            addCriterion("schoolmajor <=", value, "schoolmajor");
            return (Criteria) this;
        }

        public Criteria andSchoolmajorLike(String value) {
            addCriterion("schoolmajor like", value, "schoolmajor");
            return (Criteria) this;
        }

        public Criteria andSchoolmajorNotLike(String value) {
            addCriterion("schoolmajor not like", value, "schoolmajor");
            return (Criteria) this;
        }

        public Criteria andSchoolmajorIn(List<String> values) {
            addCriterion("schoolmajor in", values, "schoolmajor");
            return (Criteria) this;
        }

        public Criteria andSchoolmajorNotIn(List<String> values) {
            addCriterion("schoolmajor not in", values, "schoolmajor");
            return (Criteria) this;
        }

        public Criteria andSchoolmajorBetween(String value1, String value2) {
            addCriterion("schoolmajor between", value1, value2, "schoolmajor");
            return (Criteria) this;
        }

        public Criteria andSchoolmajorNotBetween(String value1, String value2) {
            addCriterion("schoolmajor not between", value1, value2, "schoolmajor");
            return (Criteria) this;
        }

        public Criteria andSchoolbeginyearIsNull() {
            addCriterion("schoolbeginyear is null");
            return (Criteria) this;
        }

        public Criteria andSchoolbeginyearIsNotNull() {
            addCriterion("schoolbeginyear is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolbeginyearEqualTo(Integer value) {
            addCriterion("schoolbeginyear =", value, "schoolbeginyear");
            return (Criteria) this;
        }

        public Criteria andSchoolbeginyearNotEqualTo(Integer value) {
            addCriterion("schoolbeginyear <>", value, "schoolbeginyear");
            return (Criteria) this;
        }

        public Criteria andSchoolbeginyearGreaterThan(Integer value) {
            addCriterion("schoolbeginyear >", value, "schoolbeginyear");
            return (Criteria) this;
        }

        public Criteria andSchoolbeginyearGreaterThanOrEqualTo(Integer value) {
            addCriterion("schoolbeginyear >=", value, "schoolbeginyear");
            return (Criteria) this;
        }

        public Criteria andSchoolbeginyearLessThan(Integer value) {
            addCriterion("schoolbeginyear <", value, "schoolbeginyear");
            return (Criteria) this;
        }

        public Criteria andSchoolbeginyearLessThanOrEqualTo(Integer value) {
            addCriterion("schoolbeginyear <=", value, "schoolbeginyear");
            return (Criteria) this;
        }

        public Criteria andSchoolbeginyearIn(List<Integer> values) {
            addCriterion("schoolbeginyear in", values, "schoolbeginyear");
            return (Criteria) this;
        }

        public Criteria andSchoolbeginyearNotIn(List<Integer> values) {
            addCriterion("schoolbeginyear not in", values, "schoolbeginyear");
            return (Criteria) this;
        }

        public Criteria andSchoolbeginyearBetween(Integer value1, Integer value2) {
            addCriterion("schoolbeginyear between", value1, value2, "schoolbeginyear");
            return (Criteria) this;
        }

        public Criteria andSchoolbeginyearNotBetween(Integer value1, Integer value2) {
            addCriterion("schoolbeginyear not between", value1, value2, "schoolbeginyear");
            return (Criteria) this;
        }

        public Criteria andSchoolendyearIsNull() {
            addCriterion("schoolendyear is null");
            return (Criteria) this;
        }

        public Criteria andSchoolendyearIsNotNull() {
            addCriterion("schoolendyear is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolendyearEqualTo(Integer value) {
            addCriterion("schoolendyear =", value, "schoolendyear");
            return (Criteria) this;
        }

        public Criteria andSchoolendyearNotEqualTo(Integer value) {
            addCriterion("schoolendyear <>", value, "schoolendyear");
            return (Criteria) this;
        }

        public Criteria andSchoolendyearGreaterThan(Integer value) {
            addCriterion("schoolendyear >", value, "schoolendyear");
            return (Criteria) this;
        }

        public Criteria andSchoolendyearGreaterThanOrEqualTo(Integer value) {
            addCriterion("schoolendyear >=", value, "schoolendyear");
            return (Criteria) this;
        }

        public Criteria andSchoolendyearLessThan(Integer value) {
            addCriterion("schoolendyear <", value, "schoolendyear");
            return (Criteria) this;
        }

        public Criteria andSchoolendyearLessThanOrEqualTo(Integer value) {
            addCriterion("schoolendyear <=", value, "schoolendyear");
            return (Criteria) this;
        }

        public Criteria andSchoolendyearIn(List<Integer> values) {
            addCriterion("schoolendyear in", values, "schoolendyear");
            return (Criteria) this;
        }

        public Criteria andSchoolendyearNotIn(List<Integer> values) {
            addCriterion("schoolendyear not in", values, "schoolendyear");
            return (Criteria) this;
        }

        public Criteria andSchoolendyearBetween(Integer value1, Integer value2) {
            addCriterion("schoolendyear between", value1, value2, "schoolendyear");
            return (Criteria) this;
        }

        public Criteria andSchoolendyearNotBetween(Integer value1, Integer value2) {
            addCriterion("schoolendyear not between", value1, value2, "schoolendyear");
            return (Criteria) this;
        }

        public Criteria andSelfdescribeIsNull() {
            addCriterion("selfdescribe is null");
            return (Criteria) this;
        }

        public Criteria andSelfdescribeIsNotNull() {
            addCriterion("selfdescribe is not null");
            return (Criteria) this;
        }

        public Criteria andSelfdescribeEqualTo(String value) {
            addCriterion("selfdescribe =", value, "selfdescribe");
            return (Criteria) this;
        }

        public Criteria andSelfdescribeNotEqualTo(String value) {
            addCriterion("selfdescribe <>", value, "selfdescribe");
            return (Criteria) this;
        }

        public Criteria andSelfdescribeGreaterThan(String value) {
            addCriterion("selfdescribe >", value, "selfdescribe");
            return (Criteria) this;
        }

        public Criteria andSelfdescribeGreaterThanOrEqualTo(String value) {
            addCriterion("selfdescribe >=", value, "selfdescribe");
            return (Criteria) this;
        }

        public Criteria andSelfdescribeLessThan(String value) {
            addCriterion("selfdescribe <", value, "selfdescribe");
            return (Criteria) this;
        }

        public Criteria andSelfdescribeLessThanOrEqualTo(String value) {
            addCriterion("selfdescribe <=", value, "selfdescribe");
            return (Criteria) this;
        }

        public Criteria andSelfdescribeLike(String value) {
            addCriterion("selfdescribe like", value, "selfdescribe");
            return (Criteria) this;
        }

        public Criteria andSelfdescribeNotLike(String value) {
            addCriterion("selfdescribe not like", value, "selfdescribe");
            return (Criteria) this;
        }

        public Criteria andSelfdescribeIn(List<String> values) {
            addCriterion("selfdescribe in", values, "selfdescribe");
            return (Criteria) this;
        }

        public Criteria andSelfdescribeNotIn(List<String> values) {
            addCriterion("selfdescribe not in", values, "selfdescribe");
            return (Criteria) this;
        }

        public Criteria andSelfdescribeBetween(String value1, String value2) {
            addCriterion("selfdescribe between", value1, value2, "selfdescribe");
            return (Criteria) this;
        }

        public Criteria andSelfdescribeNotBetween(String value1, String value2) {
            addCriterion("selfdescribe not between", value1, value2, "selfdescribe");
            return (Criteria) this;
        }

        public Criteria andProdutionhrefIsNull() {
            addCriterion("produtionhref is null");
            return (Criteria) this;
        }

        public Criteria andProdutionhrefIsNotNull() {
            addCriterion("produtionhref is not null");
            return (Criteria) this;
        }

        public Criteria andProdutionhrefEqualTo(String value) {
            addCriterion("produtionhref =", value, "produtionhref");
            return (Criteria) this;
        }

        public Criteria andProdutionhrefNotEqualTo(String value) {
            addCriterion("produtionhref <>", value, "produtionhref");
            return (Criteria) this;
        }

        public Criteria andProdutionhrefGreaterThan(String value) {
            addCriterion("produtionhref >", value, "produtionhref");
            return (Criteria) this;
        }

        public Criteria andProdutionhrefGreaterThanOrEqualTo(String value) {
            addCriterion("produtionhref >=", value, "produtionhref");
            return (Criteria) this;
        }

        public Criteria andProdutionhrefLessThan(String value) {
            addCriterion("produtionhref <", value, "produtionhref");
            return (Criteria) this;
        }

        public Criteria andProdutionhrefLessThanOrEqualTo(String value) {
            addCriterion("produtionhref <=", value, "produtionhref");
            return (Criteria) this;
        }

        public Criteria andProdutionhrefLike(String value) {
            addCriterion("produtionhref like", value, "produtionhref");
            return (Criteria) this;
        }

        public Criteria andProdutionhrefNotLike(String value) {
            addCriterion("produtionhref not like", value, "produtionhref");
            return (Criteria) this;
        }

        public Criteria andProdutionhrefIn(List<String> values) {
            addCriterion("produtionhref in", values, "produtionhref");
            return (Criteria) this;
        }

        public Criteria andProdutionhrefNotIn(List<String> values) {
            addCriterion("produtionhref not in", values, "produtionhref");
            return (Criteria) this;
        }

        public Criteria andProdutionhrefBetween(String value1, String value2) {
            addCriterion("produtionhref between", value1, value2, "produtionhref");
            return (Criteria) this;
        }

        public Criteria andProdutionhrefNotBetween(String value1, String value2) {
            addCriterion("produtionhref not between", value1, value2, "produtionhref");
            return (Criteria) this;
        }

        public Criteria andProdutioninfoIsNull() {
            addCriterion("produtioninfo is null");
            return (Criteria) this;
        }

        public Criteria andProdutioninfoIsNotNull() {
            addCriterion("produtioninfo is not null");
            return (Criteria) this;
        }

        public Criteria andProdutioninfoEqualTo(String value) {
            addCriterion("produtioninfo =", value, "produtioninfo");
            return (Criteria) this;
        }

        public Criteria andProdutioninfoNotEqualTo(String value) {
            addCriterion("produtioninfo <>", value, "produtioninfo");
            return (Criteria) this;
        }

        public Criteria andProdutioninfoGreaterThan(String value) {
            addCriterion("produtioninfo >", value, "produtioninfo");
            return (Criteria) this;
        }

        public Criteria andProdutioninfoGreaterThanOrEqualTo(String value) {
            addCriterion("produtioninfo >=", value, "produtioninfo");
            return (Criteria) this;
        }

        public Criteria andProdutioninfoLessThan(String value) {
            addCriterion("produtioninfo <", value, "produtioninfo");
            return (Criteria) this;
        }

        public Criteria andProdutioninfoLessThanOrEqualTo(String value) {
            addCriterion("produtioninfo <=", value, "produtioninfo");
            return (Criteria) this;
        }

        public Criteria andProdutioninfoLike(String value) {
            addCriterion("produtioninfo like", value, "produtioninfo");
            return (Criteria) this;
        }

        public Criteria andProdutioninfoNotLike(String value) {
            addCriterion("produtioninfo not like", value, "produtioninfo");
            return (Criteria) this;
        }

        public Criteria andProdutioninfoIn(List<String> values) {
            addCriterion("produtioninfo in", values, "produtioninfo");
            return (Criteria) this;
        }

        public Criteria andProdutioninfoNotIn(List<String> values) {
            addCriterion("produtioninfo not in", values, "produtioninfo");
            return (Criteria) this;
        }

        public Criteria andProdutioninfoBetween(String value1, String value2) {
            addCriterion("produtioninfo between", value1, value2, "produtioninfo");
            return (Criteria) this;
        }

        public Criteria andProdutioninfoNotBetween(String value1, String value2) {
            addCriterion("produtioninfo not between", value1, value2, "produtioninfo");
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