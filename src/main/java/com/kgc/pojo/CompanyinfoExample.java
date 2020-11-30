package com.kgc.pojo;

import java.util.ArrayList;
import java.util.List;

public class CompanyinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyinfoExample() {
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

        public Criteria andLogoIsNull() {
            addCriterion("logo is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("logo is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("logo =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("logo <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("logo >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("logo >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("logo <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("logo <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("logo like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("logo not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("logo in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("logo not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("logo between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("logo not between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andCompanydescribeIsNull() {
            addCriterion("companydescribe is null");
            return (Criteria) this;
        }

        public Criteria andCompanydescribeIsNotNull() {
            addCriterion("companydescribe is not null");
            return (Criteria) this;
        }

        public Criteria andCompanydescribeEqualTo(String value) {
            addCriterion("companydescribe =", value, "companydescribe");
            return (Criteria) this;
        }

        public Criteria andCompanydescribeNotEqualTo(String value) {
            addCriterion("companydescribe <>", value, "companydescribe");
            return (Criteria) this;
        }

        public Criteria andCompanydescribeGreaterThan(String value) {
            addCriterion("companydescribe >", value, "companydescribe");
            return (Criteria) this;
        }

        public Criteria andCompanydescribeGreaterThanOrEqualTo(String value) {
            addCriterion("companydescribe >=", value, "companydescribe");
            return (Criteria) this;
        }

        public Criteria andCompanydescribeLessThan(String value) {
            addCriterion("companydescribe <", value, "companydescribe");
            return (Criteria) this;
        }

        public Criteria andCompanydescribeLessThanOrEqualTo(String value) {
            addCriterion("companydescribe <=", value, "companydescribe");
            return (Criteria) this;
        }

        public Criteria andCompanydescribeLike(String value) {
            addCriterion("companydescribe like", value, "companydescribe");
            return (Criteria) this;
        }

        public Criteria andCompanydescribeNotLike(String value) {
            addCriterion("companydescribe not like", value, "companydescribe");
            return (Criteria) this;
        }

        public Criteria andCompanydescribeIn(List<String> values) {
            addCriterion("companydescribe in", values, "companydescribe");
            return (Criteria) this;
        }

        public Criteria andCompanydescribeNotIn(List<String> values) {
            addCriterion("companydescribe not in", values, "companydescribe");
            return (Criteria) this;
        }

        public Criteria andCompanydescribeBetween(String value1, String value2) {
            addCriterion("companydescribe between", value1, value2, "companydescribe");
            return (Criteria) this;
        }

        public Criteria andCompanydescribeNotBetween(String value1, String value2) {
            addCriterion("companydescribe not between", value1, value2, "companydescribe");
            return (Criteria) this;
        }

        public Criteria andWealIsNull() {
            addCriterion("weal is null");
            return (Criteria) this;
        }

        public Criteria andWealIsNotNull() {
            addCriterion("weal is not null");
            return (Criteria) this;
        }

        public Criteria andWealEqualTo(String value) {
            addCriterion("weal =", value, "weal");
            return (Criteria) this;
        }

        public Criteria andWealNotEqualTo(String value) {
            addCriterion("weal <>", value, "weal");
            return (Criteria) this;
        }

        public Criteria andWealGreaterThan(String value) {
            addCriterion("weal >", value, "weal");
            return (Criteria) this;
        }

        public Criteria andWealGreaterThanOrEqualTo(String value) {
            addCriterion("weal >=", value, "weal");
            return (Criteria) this;
        }

        public Criteria andWealLessThan(String value) {
            addCriterion("weal <", value, "weal");
            return (Criteria) this;
        }

        public Criteria andWealLessThanOrEqualTo(String value) {
            addCriterion("weal <=", value, "weal");
            return (Criteria) this;
        }

        public Criteria andWealLike(String value) {
            addCriterion("weal like", value, "weal");
            return (Criteria) this;
        }

        public Criteria andWealNotLike(String value) {
            addCriterion("weal not like", value, "weal");
            return (Criteria) this;
        }

        public Criteria andWealIn(List<String> values) {
            addCriterion("weal in", values, "weal");
            return (Criteria) this;
        }

        public Criteria andWealNotIn(List<String> values) {
            addCriterion("weal not in", values, "weal");
            return (Criteria) this;
        }

        public Criteria andWealBetween(String value1, String value2) {
            addCriterion("weal between", value1, value2, "weal");
            return (Criteria) this;
        }

        public Criteria andWealNotBetween(String value1, String value2) {
            addCriterion("weal not between", value1, value2, "weal");
            return (Criteria) this;
        }

        public Criteria andCompanytelephoneIsNull() {
            addCriterion("companytelephone is null");
            return (Criteria) this;
        }

        public Criteria andCompanytelephoneIsNotNull() {
            addCriterion("companytelephone is not null");
            return (Criteria) this;
        }

        public Criteria andCompanytelephoneEqualTo(String value) {
            addCriterion("companytelephone =", value, "companytelephone");
            return (Criteria) this;
        }

        public Criteria andCompanytelephoneNotEqualTo(String value) {
            addCriterion("companytelephone <>", value, "companytelephone");
            return (Criteria) this;
        }

        public Criteria andCompanytelephoneGreaterThan(String value) {
            addCriterion("companytelephone >", value, "companytelephone");
            return (Criteria) this;
        }

        public Criteria andCompanytelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("companytelephone >=", value, "companytelephone");
            return (Criteria) this;
        }

        public Criteria andCompanytelephoneLessThan(String value) {
            addCriterion("companytelephone <", value, "companytelephone");
            return (Criteria) this;
        }

        public Criteria andCompanytelephoneLessThanOrEqualTo(String value) {
            addCriterion("companytelephone <=", value, "companytelephone");
            return (Criteria) this;
        }

        public Criteria andCompanytelephoneLike(String value) {
            addCriterion("companytelephone like", value, "companytelephone");
            return (Criteria) this;
        }

        public Criteria andCompanytelephoneNotLike(String value) {
            addCriterion("companytelephone not like", value, "companytelephone");
            return (Criteria) this;
        }

        public Criteria andCompanytelephoneIn(List<String> values) {
            addCriterion("companytelephone in", values, "companytelephone");
            return (Criteria) this;
        }

        public Criteria andCompanytelephoneNotIn(List<String> values) {
            addCriterion("companytelephone not in", values, "companytelephone");
            return (Criteria) this;
        }

        public Criteria andCompanytelephoneBetween(String value1, String value2) {
            addCriterion("companytelephone between", value1, value2, "companytelephone");
            return (Criteria) this;
        }

        public Criteria andCompanytelephoneNotBetween(String value1, String value2) {
            addCriterion("companytelephone not between", value1, value2, "companytelephone");
            return (Criteria) this;
        }

        public Criteria andCompanyemailIsNull() {
            addCriterion("companyemail is null");
            return (Criteria) this;
        }

        public Criteria andCompanyemailIsNotNull() {
            addCriterion("companyemail is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyemailEqualTo(String value) {
            addCriterion("companyemail =", value, "companyemail");
            return (Criteria) this;
        }

        public Criteria andCompanyemailNotEqualTo(String value) {
            addCriterion("companyemail <>", value, "companyemail");
            return (Criteria) this;
        }

        public Criteria andCompanyemailGreaterThan(String value) {
            addCriterion("companyemail >", value, "companyemail");
            return (Criteria) this;
        }

        public Criteria andCompanyemailGreaterThanOrEqualTo(String value) {
            addCriterion("companyemail >=", value, "companyemail");
            return (Criteria) this;
        }

        public Criteria andCompanyemailLessThan(String value) {
            addCriterion("companyemail <", value, "companyemail");
            return (Criteria) this;
        }

        public Criteria andCompanyemailLessThanOrEqualTo(String value) {
            addCriterion("companyemail <=", value, "companyemail");
            return (Criteria) this;
        }

        public Criteria andCompanyemailLike(String value) {
            addCriterion("companyemail like", value, "companyemail");
            return (Criteria) this;
        }

        public Criteria andCompanyemailNotLike(String value) {
            addCriterion("companyemail not like", value, "companyemail");
            return (Criteria) this;
        }

        public Criteria andCompanyemailIn(List<String> values) {
            addCriterion("companyemail in", values, "companyemail");
            return (Criteria) this;
        }

        public Criteria andCompanyemailNotIn(List<String> values) {
            addCriterion("companyemail not in", values, "companyemail");
            return (Criteria) this;
        }

        public Criteria andCompanyemailBetween(String value1, String value2) {
            addCriterion("companyemail between", value1, value2, "companyemail");
            return (Criteria) this;
        }

        public Criteria andCompanyemailNotBetween(String value1, String value2) {
            addCriterion("companyemail not between", value1, value2, "companyemail");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNull() {
            addCriterion("companyname is null");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNotNull() {
            addCriterion("companyname is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynameEqualTo(String value) {
            addCriterion("companyname =", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotEqualTo(String value) {
            addCriterion("companyname <>", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThan(String value) {
            addCriterion("companyname >", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("companyname >=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThan(String value) {
            addCriterion("companyname <", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThanOrEqualTo(String value) {
            addCriterion("companyname <=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLike(String value) {
            addCriterion("companyname like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotLike(String value) {
            addCriterion("companyname not like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameIn(List<String> values) {
            addCriterion("companyname in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotIn(List<String> values) {
            addCriterion("companyname not in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameBetween(String value1, String value2) {
            addCriterion("companyname between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotBetween(String value1, String value2) {
            addCriterion("companyname not between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanycityIsNull() {
            addCriterion("companycity is null");
            return (Criteria) this;
        }

        public Criteria andCompanycityIsNotNull() {
            addCriterion("companycity is not null");
            return (Criteria) this;
        }

        public Criteria andCompanycityEqualTo(String value) {
            addCriterion("companycity =", value, "companycity");
            return (Criteria) this;
        }

        public Criteria andCompanycityNotEqualTo(String value) {
            addCriterion("companycity <>", value, "companycity");
            return (Criteria) this;
        }

        public Criteria andCompanycityGreaterThan(String value) {
            addCriterion("companycity >", value, "companycity");
            return (Criteria) this;
        }

        public Criteria andCompanycityGreaterThanOrEqualTo(String value) {
            addCriterion("companycity >=", value, "companycity");
            return (Criteria) this;
        }

        public Criteria andCompanycityLessThan(String value) {
            addCriterion("companycity <", value, "companycity");
            return (Criteria) this;
        }

        public Criteria andCompanycityLessThanOrEqualTo(String value) {
            addCriterion("companycity <=", value, "companycity");
            return (Criteria) this;
        }

        public Criteria andCompanycityLike(String value) {
            addCriterion("companycity like", value, "companycity");
            return (Criteria) this;
        }

        public Criteria andCompanycityNotLike(String value) {
            addCriterion("companycity not like", value, "companycity");
            return (Criteria) this;
        }

        public Criteria andCompanycityIn(List<String> values) {
            addCriterion("companycity in", values, "companycity");
            return (Criteria) this;
        }

        public Criteria andCompanycityNotIn(List<String> values) {
            addCriterion("companycity not in", values, "companycity");
            return (Criteria) this;
        }

        public Criteria andCompanycityBetween(String value1, String value2) {
            addCriterion("companycity between", value1, value2, "companycity");
            return (Criteria) this;
        }

        public Criteria andCompanycityNotBetween(String value1, String value2) {
            addCriterion("companycity not between", value1, value2, "companycity");
            return (Criteria) this;
        }

        public Criteria andCompanydomainIsNull() {
            addCriterion("companydomain is null");
            return (Criteria) this;
        }

        public Criteria andCompanydomainIsNotNull() {
            addCriterion("companydomain is not null");
            return (Criteria) this;
        }

        public Criteria andCompanydomainEqualTo(String value) {
            addCriterion("companydomain =", value, "companydomain");
            return (Criteria) this;
        }

        public Criteria andCompanydomainNotEqualTo(String value) {
            addCriterion("companydomain <>", value, "companydomain");
            return (Criteria) this;
        }

        public Criteria andCompanydomainGreaterThan(String value) {
            addCriterion("companydomain >", value, "companydomain");
            return (Criteria) this;
        }

        public Criteria andCompanydomainGreaterThanOrEqualTo(String value) {
            addCriterion("companydomain >=", value, "companydomain");
            return (Criteria) this;
        }

        public Criteria andCompanydomainLessThan(String value) {
            addCriterion("companydomain <", value, "companydomain");
            return (Criteria) this;
        }

        public Criteria andCompanydomainLessThanOrEqualTo(String value) {
            addCriterion("companydomain <=", value, "companydomain");
            return (Criteria) this;
        }

        public Criteria andCompanydomainLike(String value) {
            addCriterion("companydomain like", value, "companydomain");
            return (Criteria) this;
        }

        public Criteria andCompanydomainNotLike(String value) {
            addCriterion("companydomain not like", value, "companydomain");
            return (Criteria) this;
        }

        public Criteria andCompanydomainIn(List<String> values) {
            addCriterion("companydomain in", values, "companydomain");
            return (Criteria) this;
        }

        public Criteria andCompanydomainNotIn(List<String> values) {
            addCriterion("companydomain not in", values, "companydomain");
            return (Criteria) this;
        }

        public Criteria andCompanydomainBetween(String value1, String value2) {
            addCriterion("companydomain between", value1, value2, "companydomain");
            return (Criteria) this;
        }

        public Criteria andCompanydomainNotBetween(String value1, String value2) {
            addCriterion("companydomain not between", value1, value2, "companydomain");
            return (Criteria) this;
        }

        public Criteria andDevelopIsNull() {
            addCriterion("develop is null");
            return (Criteria) this;
        }

        public Criteria andDevelopIsNotNull() {
            addCriterion("develop is not null");
            return (Criteria) this;
        }

        public Criteria andDevelopEqualTo(Integer value) {
            addCriterion("develop =", value, "develop");
            return (Criteria) this;
        }

        public Criteria andDevelopNotEqualTo(Integer value) {
            addCriterion("develop <>", value, "develop");
            return (Criteria) this;
        }

        public Criteria andDevelopGreaterThan(Integer value) {
            addCriterion("develop >", value, "develop");
            return (Criteria) this;
        }

        public Criteria andDevelopGreaterThanOrEqualTo(Integer value) {
            addCriterion("develop >=", value, "develop");
            return (Criteria) this;
        }

        public Criteria andDevelopLessThan(Integer value) {
            addCriterion("develop <", value, "develop");
            return (Criteria) this;
        }

        public Criteria andDevelopLessThanOrEqualTo(Integer value) {
            addCriterion("develop <=", value, "develop");
            return (Criteria) this;
        }

        public Criteria andDevelopIn(List<Integer> values) {
            addCriterion("develop in", values, "develop");
            return (Criteria) this;
        }

        public Criteria andDevelopNotIn(List<Integer> values) {
            addCriterion("develop not in", values, "develop");
            return (Criteria) this;
        }

        public Criteria andDevelopBetween(Integer value1, Integer value2) {
            addCriterion("develop between", value1, value2, "develop");
            return (Criteria) this;
        }

        public Criteria andDevelopNotBetween(Integer value1, Integer value2) {
            addCriterion("develop not between", value1, value2, "develop");
            return (Criteria) this;
        }

        public Criteria andCompanyscaleIsNull() {
            addCriterion("companyscale is null");
            return (Criteria) this;
        }

        public Criteria andCompanyscaleIsNotNull() {
            addCriterion("companyscale is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyscaleEqualTo(Integer value) {
            addCriterion("companyscale =", value, "companyscale");
            return (Criteria) this;
        }

        public Criteria andCompanyscaleNotEqualTo(Integer value) {
            addCriterion("companyscale <>", value, "companyscale");
            return (Criteria) this;
        }

        public Criteria andCompanyscaleGreaterThan(Integer value) {
            addCriterion("companyscale >", value, "companyscale");
            return (Criteria) this;
        }

        public Criteria andCompanyscaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("companyscale >=", value, "companyscale");
            return (Criteria) this;
        }

        public Criteria andCompanyscaleLessThan(Integer value) {
            addCriterion("companyscale <", value, "companyscale");
            return (Criteria) this;
        }

        public Criteria andCompanyscaleLessThanOrEqualTo(Integer value) {
            addCriterion("companyscale <=", value, "companyscale");
            return (Criteria) this;
        }

        public Criteria andCompanyscaleIn(List<Integer> values) {
            addCriterion("companyscale in", values, "companyscale");
            return (Criteria) this;
        }

        public Criteria andCompanyscaleNotIn(List<Integer> values) {
            addCriterion("companyscale not in", values, "companyscale");
            return (Criteria) this;
        }

        public Criteria andCompanyscaleBetween(Integer value1, Integer value2) {
            addCriterion("companyscale between", value1, value2, "companyscale");
            return (Criteria) this;
        }

        public Criteria andCompanyscaleNotBetween(Integer value1, Integer value2) {
            addCriterion("companyscale not between", value1, value2, "companyscale");
            return (Criteria) this;
        }

        public Criteria andCompanywebIsNull() {
            addCriterion("companyweb is null");
            return (Criteria) this;
        }

        public Criteria andCompanywebIsNotNull() {
            addCriterion("companyweb is not null");
            return (Criteria) this;
        }

        public Criteria andCompanywebEqualTo(String value) {
            addCriterion("companyweb =", value, "companyweb");
            return (Criteria) this;
        }

        public Criteria andCompanywebNotEqualTo(String value) {
            addCriterion("companyweb <>", value, "companyweb");
            return (Criteria) this;
        }

        public Criteria andCompanywebGreaterThan(String value) {
            addCriterion("companyweb >", value, "companyweb");
            return (Criteria) this;
        }

        public Criteria andCompanywebGreaterThanOrEqualTo(String value) {
            addCriterion("companyweb >=", value, "companyweb");
            return (Criteria) this;
        }

        public Criteria andCompanywebLessThan(String value) {
            addCriterion("companyweb <", value, "companyweb");
            return (Criteria) this;
        }

        public Criteria andCompanywebLessThanOrEqualTo(String value) {
            addCriterion("companyweb <=", value, "companyweb");
            return (Criteria) this;
        }

        public Criteria andCompanywebLike(String value) {
            addCriterion("companyweb like", value, "companyweb");
            return (Criteria) this;
        }

        public Criteria andCompanywebNotLike(String value) {
            addCriterion("companyweb not like", value, "companyweb");
            return (Criteria) this;
        }

        public Criteria andCompanywebIn(List<String> values) {
            addCriterion("companyweb in", values, "companyweb");
            return (Criteria) this;
        }

        public Criteria andCompanywebNotIn(List<String> values) {
            addCriterion("companyweb not in", values, "companyweb");
            return (Criteria) this;
        }

        public Criteria andCompanywebBetween(String value1, String value2) {
            addCriterion("companyweb between", value1, value2, "companyweb");
            return (Criteria) this;
        }

        public Criteria andCompanywebNotBetween(String value1, String value2) {
            addCriterion("companyweb not between", value1, value2, "companyweb");
            return (Criteria) this;
        }

        public Criteria andPhasenowIsNull() {
            addCriterion("phasenow is null");
            return (Criteria) this;
        }

        public Criteria andPhasenowIsNotNull() {
            addCriterion("phasenow is not null");
            return (Criteria) this;
        }

        public Criteria andPhasenowEqualTo(Integer value) {
            addCriterion("phasenow =", value, "phasenow");
            return (Criteria) this;
        }

        public Criteria andPhasenowNotEqualTo(Integer value) {
            addCriterion("phasenow <>", value, "phasenow");
            return (Criteria) this;
        }

        public Criteria andPhasenowGreaterThan(Integer value) {
            addCriterion("phasenow >", value, "phasenow");
            return (Criteria) this;
        }

        public Criteria andPhasenowGreaterThanOrEqualTo(Integer value) {
            addCriterion("phasenow >=", value, "phasenow");
            return (Criteria) this;
        }

        public Criteria andPhasenowLessThan(Integer value) {
            addCriterion("phasenow <", value, "phasenow");
            return (Criteria) this;
        }

        public Criteria andPhasenowLessThanOrEqualTo(Integer value) {
            addCriterion("phasenow <=", value, "phasenow");
            return (Criteria) this;
        }

        public Criteria andPhasenowIn(List<Integer> values) {
            addCriterion("phasenow in", values, "phasenow");
            return (Criteria) this;
        }

        public Criteria andPhasenowNotIn(List<Integer> values) {
            addCriterion("phasenow not in", values, "phasenow");
            return (Criteria) this;
        }

        public Criteria andPhasenowBetween(Integer value1, Integer value2) {
            addCriterion("phasenow between", value1, value2, "phasenow");
            return (Criteria) this;
        }

        public Criteria andPhasenowNotBetween(Integer value1, Integer value2) {
            addCriterion("phasenow not between", value1, value2, "phasenow");
            return (Criteria) this;
        }

        public Criteria andPhaseagoIsNull() {
            addCriterion("phaseago is null");
            return (Criteria) this;
        }

        public Criteria andPhaseagoIsNotNull() {
            addCriterion("phaseago is not null");
            return (Criteria) this;
        }

        public Criteria andPhaseagoEqualTo(Integer value) {
            addCriterion("phaseago =", value, "phaseago");
            return (Criteria) this;
        }

        public Criteria andPhaseagoNotEqualTo(Integer value) {
            addCriterion("phaseago <>", value, "phaseago");
            return (Criteria) this;
        }

        public Criteria andPhaseagoGreaterThan(Integer value) {
            addCriterion("phaseago >", value, "phaseago");
            return (Criteria) this;
        }

        public Criteria andPhaseagoGreaterThanOrEqualTo(Integer value) {
            addCriterion("phaseago >=", value, "phaseago");
            return (Criteria) this;
        }

        public Criteria andPhaseagoLessThan(Integer value) {
            addCriterion("phaseago <", value, "phaseago");
            return (Criteria) this;
        }

        public Criteria andPhaseagoLessThanOrEqualTo(Integer value) {
            addCriterion("phaseago <=", value, "phaseago");
            return (Criteria) this;
        }

        public Criteria andPhaseagoIn(List<Integer> values) {
            addCriterion("phaseago in", values, "phaseago");
            return (Criteria) this;
        }

        public Criteria andPhaseagoNotIn(List<Integer> values) {
            addCriterion("phaseago not in", values, "phaseago");
            return (Criteria) this;
        }

        public Criteria andPhaseagoBetween(Integer value1, Integer value2) {
            addCriterion("phaseago between", value1, value2, "phaseago");
            return (Criteria) this;
        }

        public Criteria andPhaseagoNotBetween(Integer value1, Integer value2) {
            addCriterion("phaseago not between", value1, value2, "phaseago");
            return (Criteria) this;
        }

        public Criteria andInvestorIsNull() {
            addCriterion("investor is null");
            return (Criteria) this;
        }

        public Criteria andInvestorIsNotNull() {
            addCriterion("investor is not null");
            return (Criteria) this;
        }

        public Criteria andInvestorEqualTo(String value) {
            addCriterion("investor =", value, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorNotEqualTo(String value) {
            addCriterion("investor <>", value, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorGreaterThan(String value) {
            addCriterion("investor >", value, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorGreaterThanOrEqualTo(String value) {
            addCriterion("investor >=", value, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorLessThan(String value) {
            addCriterion("investor <", value, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorLessThanOrEqualTo(String value) {
            addCriterion("investor <=", value, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorLike(String value) {
            addCriterion("investor like", value, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorNotLike(String value) {
            addCriterion("investor not like", value, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorIn(List<String> values) {
            addCriterion("investor in", values, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorNotIn(List<String> values) {
            addCriterion("investor not in", values, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorBetween(String value1, String value2) {
            addCriterion("investor between", value1, value2, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorNotBetween(String value1, String value2) {
            addCriterion("investor not between", value1, value2, "investor");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNull() {
            addCriterion("productname is null");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNotNull() {
            addCriterion("productname is not null");
            return (Criteria) this;
        }

        public Criteria andProductnameEqualTo(String value) {
            addCriterion("productname =", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotEqualTo(String value) {
            addCriterion("productname <>", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThan(String value) {
            addCriterion("productname >", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThanOrEqualTo(String value) {
            addCriterion("productname >=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThan(String value) {
            addCriterion("productname <", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThanOrEqualTo(String value) {
            addCriterion("productname <=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLike(String value) {
            addCriterion("productname like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotLike(String value) {
            addCriterion("productname not like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameIn(List<String> values) {
            addCriterion("productname in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotIn(List<String> values) {
            addCriterion("productname not in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameBetween(String value1, String value2) {
            addCriterion("productname between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotBetween(String value1, String value2) {
            addCriterion("productname not between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProducturlIsNull() {
            addCriterion("producturl is null");
            return (Criteria) this;
        }

        public Criteria andProducturlIsNotNull() {
            addCriterion("producturl is not null");
            return (Criteria) this;
        }

        public Criteria andProducturlEqualTo(String value) {
            addCriterion("producturl =", value, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlNotEqualTo(String value) {
            addCriterion("producturl <>", value, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlGreaterThan(String value) {
            addCriterion("producturl >", value, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlGreaterThanOrEqualTo(String value) {
            addCriterion("producturl >=", value, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlLessThan(String value) {
            addCriterion("producturl <", value, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlLessThanOrEqualTo(String value) {
            addCriterion("producturl <=", value, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlLike(String value) {
            addCriterion("producturl like", value, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlNotLike(String value) {
            addCriterion("producturl not like", value, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlIn(List<String> values) {
            addCriterion("producturl in", values, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlNotIn(List<String> values) {
            addCriterion("producturl not in", values, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlBetween(String value1, String value2) {
            addCriterion("producturl between", value1, value2, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlNotBetween(String value1, String value2) {
            addCriterion("producturl not between", value1, value2, "producturl");
            return (Criteria) this;
        }

        public Criteria andProductinfoIsNull() {
            addCriterion("productinfo is null");
            return (Criteria) this;
        }

        public Criteria andProductinfoIsNotNull() {
            addCriterion("productinfo is not null");
            return (Criteria) this;
        }

        public Criteria andProductinfoEqualTo(String value) {
            addCriterion("productinfo =", value, "productinfo");
            return (Criteria) this;
        }

        public Criteria andProductinfoNotEqualTo(String value) {
            addCriterion("productinfo <>", value, "productinfo");
            return (Criteria) this;
        }

        public Criteria andProductinfoGreaterThan(String value) {
            addCriterion("productinfo >", value, "productinfo");
            return (Criteria) this;
        }

        public Criteria andProductinfoGreaterThanOrEqualTo(String value) {
            addCriterion("productinfo >=", value, "productinfo");
            return (Criteria) this;
        }

        public Criteria andProductinfoLessThan(String value) {
            addCriterion("productinfo <", value, "productinfo");
            return (Criteria) this;
        }

        public Criteria andProductinfoLessThanOrEqualTo(String value) {
            addCriterion("productinfo <=", value, "productinfo");
            return (Criteria) this;
        }

        public Criteria andProductinfoLike(String value) {
            addCriterion("productinfo like", value, "productinfo");
            return (Criteria) this;
        }

        public Criteria andProductinfoNotLike(String value) {
            addCriterion("productinfo not like", value, "productinfo");
            return (Criteria) this;
        }

        public Criteria andProductinfoIn(List<String> values) {
            addCriterion("productinfo in", values, "productinfo");
            return (Criteria) this;
        }

        public Criteria andProductinfoNotIn(List<String> values) {
            addCriterion("productinfo not in", values, "productinfo");
            return (Criteria) this;
        }

        public Criteria andProductinfoBetween(String value1, String value2) {
            addCriterion("productinfo between", value1, value2, "productinfo");
            return (Criteria) this;
        }

        public Criteria andProductinfoNotBetween(String value1, String value2) {
            addCriterion("productinfo not between", value1, value2, "productinfo");
            return (Criteria) this;
        }

        public Criteria andParternameIsNull() {
            addCriterion("partername is null");
            return (Criteria) this;
        }

        public Criteria andParternameIsNotNull() {
            addCriterion("partername is not null");
            return (Criteria) this;
        }

        public Criteria andParternameEqualTo(String value) {
            addCriterion("partername =", value, "partername");
            return (Criteria) this;
        }

        public Criteria andParternameNotEqualTo(String value) {
            addCriterion("partername <>", value, "partername");
            return (Criteria) this;
        }

        public Criteria andParternameGreaterThan(String value) {
            addCriterion("partername >", value, "partername");
            return (Criteria) this;
        }

        public Criteria andParternameGreaterThanOrEqualTo(String value) {
            addCriterion("partername >=", value, "partername");
            return (Criteria) this;
        }

        public Criteria andParternameLessThan(String value) {
            addCriterion("partername <", value, "partername");
            return (Criteria) this;
        }

        public Criteria andParternameLessThanOrEqualTo(String value) {
            addCriterion("partername <=", value, "partername");
            return (Criteria) this;
        }

        public Criteria andParternameLike(String value) {
            addCriterion("partername like", value, "partername");
            return (Criteria) this;
        }

        public Criteria andParternameNotLike(String value) {
            addCriterion("partername not like", value, "partername");
            return (Criteria) this;
        }

        public Criteria andParternameIn(List<String> values) {
            addCriterion("partername in", values, "partername");
            return (Criteria) this;
        }

        public Criteria andParternameNotIn(List<String> values) {
            addCriterion("partername not in", values, "partername");
            return (Criteria) this;
        }

        public Criteria andParternameBetween(String value1, String value2) {
            addCriterion("partername between", value1, value2, "partername");
            return (Criteria) this;
        }

        public Criteria andParternameNotBetween(String value1, String value2) {
            addCriterion("partername not between", value1, value2, "partername");
            return (Criteria) this;
        }

        public Criteria andParterphotoIsNull() {
            addCriterion("parterphoto is null");
            return (Criteria) this;
        }

        public Criteria andParterphotoIsNotNull() {
            addCriterion("parterphoto is not null");
            return (Criteria) this;
        }

        public Criteria andParterphotoEqualTo(String value) {
            addCriterion("parterphoto =", value, "parterphoto");
            return (Criteria) this;
        }

        public Criteria andParterphotoNotEqualTo(String value) {
            addCriterion("parterphoto <>", value, "parterphoto");
            return (Criteria) this;
        }

        public Criteria andParterphotoGreaterThan(String value) {
            addCriterion("parterphoto >", value, "parterphoto");
            return (Criteria) this;
        }

        public Criteria andParterphotoGreaterThanOrEqualTo(String value) {
            addCriterion("parterphoto >=", value, "parterphoto");
            return (Criteria) this;
        }

        public Criteria andParterphotoLessThan(String value) {
            addCriterion("parterphoto <", value, "parterphoto");
            return (Criteria) this;
        }

        public Criteria andParterphotoLessThanOrEqualTo(String value) {
            addCriterion("parterphoto <=", value, "parterphoto");
            return (Criteria) this;
        }

        public Criteria andParterphotoLike(String value) {
            addCriterion("parterphoto like", value, "parterphoto");
            return (Criteria) this;
        }

        public Criteria andParterphotoNotLike(String value) {
            addCriterion("parterphoto not like", value, "parterphoto");
            return (Criteria) this;
        }

        public Criteria andParterphotoIn(List<String> values) {
            addCriterion("parterphoto in", values, "parterphoto");
            return (Criteria) this;
        }

        public Criteria andParterphotoNotIn(List<String> values) {
            addCriterion("parterphoto not in", values, "parterphoto");
            return (Criteria) this;
        }

        public Criteria andParterphotoBetween(String value1, String value2) {
            addCriterion("parterphoto between", value1, value2, "parterphoto");
            return (Criteria) this;
        }

        public Criteria andParterphotoNotBetween(String value1, String value2) {
            addCriterion("parterphoto not between", value1, value2, "parterphoto");
            return (Criteria) this;
        }

        public Criteria andParterjobIsNull() {
            addCriterion("parterjob is null");
            return (Criteria) this;
        }

        public Criteria andParterjobIsNotNull() {
            addCriterion("parterjob is not null");
            return (Criteria) this;
        }

        public Criteria andParterjobEqualTo(String value) {
            addCriterion("parterjob =", value, "parterjob");
            return (Criteria) this;
        }

        public Criteria andParterjobNotEqualTo(String value) {
            addCriterion("parterjob <>", value, "parterjob");
            return (Criteria) this;
        }

        public Criteria andParterjobGreaterThan(String value) {
            addCriterion("parterjob >", value, "parterjob");
            return (Criteria) this;
        }

        public Criteria andParterjobGreaterThanOrEqualTo(String value) {
            addCriterion("parterjob >=", value, "parterjob");
            return (Criteria) this;
        }

        public Criteria andParterjobLessThan(String value) {
            addCriterion("parterjob <", value, "parterjob");
            return (Criteria) this;
        }

        public Criteria andParterjobLessThanOrEqualTo(String value) {
            addCriterion("parterjob <=", value, "parterjob");
            return (Criteria) this;
        }

        public Criteria andParterjobLike(String value) {
            addCriterion("parterjob like", value, "parterjob");
            return (Criteria) this;
        }

        public Criteria andParterjobNotLike(String value) {
            addCriterion("parterjob not like", value, "parterjob");
            return (Criteria) this;
        }

        public Criteria andParterjobIn(List<String> values) {
            addCriterion("parterjob in", values, "parterjob");
            return (Criteria) this;
        }

        public Criteria andParterjobNotIn(List<String> values) {
            addCriterion("parterjob not in", values, "parterjob");
            return (Criteria) this;
        }

        public Criteria andParterjobBetween(String value1, String value2) {
            addCriterion("parterjob between", value1, value2, "parterjob");
            return (Criteria) this;
        }

        public Criteria andParterjobNotBetween(String value1, String value2) {
            addCriterion("parterjob not between", value1, value2, "parterjob");
            return (Criteria) this;
        }

        public Criteria andParterweboIsNull() {
            addCriterion("parterwebo is null");
            return (Criteria) this;
        }

        public Criteria andParterweboIsNotNull() {
            addCriterion("parterwebo is not null");
            return (Criteria) this;
        }

        public Criteria andParterweboEqualTo(String value) {
            addCriterion("parterwebo =", value, "parterwebo");
            return (Criteria) this;
        }

        public Criteria andParterweboNotEqualTo(String value) {
            addCriterion("parterwebo <>", value, "parterwebo");
            return (Criteria) this;
        }

        public Criteria andParterweboGreaterThan(String value) {
            addCriterion("parterwebo >", value, "parterwebo");
            return (Criteria) this;
        }

        public Criteria andParterweboGreaterThanOrEqualTo(String value) {
            addCriterion("parterwebo >=", value, "parterwebo");
            return (Criteria) this;
        }

        public Criteria andParterweboLessThan(String value) {
            addCriterion("parterwebo <", value, "parterwebo");
            return (Criteria) this;
        }

        public Criteria andParterweboLessThanOrEqualTo(String value) {
            addCriterion("parterwebo <=", value, "parterwebo");
            return (Criteria) this;
        }

        public Criteria andParterweboLike(String value) {
            addCriterion("parterwebo like", value, "parterwebo");
            return (Criteria) this;
        }

        public Criteria andParterweboNotLike(String value) {
            addCriterion("parterwebo not like", value, "parterwebo");
            return (Criteria) this;
        }

        public Criteria andParterweboIn(List<String> values) {
            addCriterion("parterwebo in", values, "parterwebo");
            return (Criteria) this;
        }

        public Criteria andParterweboNotIn(List<String> values) {
            addCriterion("parterwebo not in", values, "parterwebo");
            return (Criteria) this;
        }

        public Criteria andParterweboBetween(String value1, String value2) {
            addCriterion("parterwebo between", value1, value2, "parterwebo");
            return (Criteria) this;
        }

        public Criteria andParterweboNotBetween(String value1, String value2) {
            addCriterion("parterwebo not between", value1, value2, "parterwebo");
            return (Criteria) this;
        }

        public Criteria andParterinfoIsNull() {
            addCriterion("parterinfo is null");
            return (Criteria) this;
        }

        public Criteria andParterinfoIsNotNull() {
            addCriterion("parterinfo is not null");
            return (Criteria) this;
        }

        public Criteria andParterinfoEqualTo(String value) {
            addCriterion("parterinfo =", value, "parterinfo");
            return (Criteria) this;
        }

        public Criteria andParterinfoNotEqualTo(String value) {
            addCriterion("parterinfo <>", value, "parterinfo");
            return (Criteria) this;
        }

        public Criteria andParterinfoGreaterThan(String value) {
            addCriterion("parterinfo >", value, "parterinfo");
            return (Criteria) this;
        }

        public Criteria andParterinfoGreaterThanOrEqualTo(String value) {
            addCriterion("parterinfo >=", value, "parterinfo");
            return (Criteria) this;
        }

        public Criteria andParterinfoLessThan(String value) {
            addCriterion("parterinfo <", value, "parterinfo");
            return (Criteria) this;
        }

        public Criteria andParterinfoLessThanOrEqualTo(String value) {
            addCriterion("parterinfo <=", value, "parterinfo");
            return (Criteria) this;
        }

        public Criteria andParterinfoLike(String value) {
            addCriterion("parterinfo like", value, "parterinfo");
            return (Criteria) this;
        }

        public Criteria andParterinfoNotLike(String value) {
            addCriterion("parterinfo not like", value, "parterinfo");
            return (Criteria) this;
        }

        public Criteria andParterinfoIn(List<String> values) {
            addCriterion("parterinfo in", values, "parterinfo");
            return (Criteria) this;
        }

        public Criteria andParterinfoNotIn(List<String> values) {
            addCriterion("parterinfo not in", values, "parterinfo");
            return (Criteria) this;
        }

        public Criteria andParterinfoBetween(String value1, String value2) {
            addCriterion("parterinfo between", value1, value2, "parterinfo");
            return (Criteria) this;
        }

        public Criteria andParterinfoNotBetween(String value1, String value2) {
            addCriterion("parterinfo not between", value1, value2, "parterinfo");
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