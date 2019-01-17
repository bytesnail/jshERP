package com.jsh.erp.datasource.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AccountItemExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jsh_accountitem
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jsh_accountitem
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jsh_accountitem
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_accountitem
     *
     * @mbggenerated
     */
    public AccountItemExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_accountitem
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_accountitem
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_accountitem
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_accountitem
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_accountitem
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_accountitem
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_accountitem
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_accountitem
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_accountitem
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_accountitem
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table jsh_accountitem
     *
     * @mbggenerated
     */
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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andHeaderidIsNull() {
            addCriterion("HeaderId is null");
            return (Criteria) this;
        }

        public Criteria andHeaderidIsNotNull() {
            addCriterion("HeaderId is not null");
            return (Criteria) this;
        }

        public Criteria andHeaderidEqualTo(Long value) {
            addCriterion("HeaderId =", value, "headerid");
            return (Criteria) this;
        }

        public Criteria andHeaderidNotEqualTo(Long value) {
            addCriterion("HeaderId <>", value, "headerid");
            return (Criteria) this;
        }

        public Criteria andHeaderidGreaterThan(Long value) {
            addCriterion("HeaderId >", value, "headerid");
            return (Criteria) this;
        }

        public Criteria andHeaderidGreaterThanOrEqualTo(Long value) {
            addCriterion("HeaderId >=", value, "headerid");
            return (Criteria) this;
        }

        public Criteria andHeaderidLessThan(Long value) {
            addCriterion("HeaderId <", value, "headerid");
            return (Criteria) this;
        }

        public Criteria andHeaderidLessThanOrEqualTo(Long value) {
            addCriterion("HeaderId <=", value, "headerid");
            return (Criteria) this;
        }

        public Criteria andHeaderidIn(List<Long> values) {
            addCriterion("HeaderId in", values, "headerid");
            return (Criteria) this;
        }

        public Criteria andHeaderidNotIn(List<Long> values) {
            addCriterion("HeaderId not in", values, "headerid");
            return (Criteria) this;
        }

        public Criteria andHeaderidBetween(Long value1, Long value2) {
            addCriterion("HeaderId between", value1, value2, "headerid");
            return (Criteria) this;
        }

        public Criteria andHeaderidNotBetween(Long value1, Long value2) {
            addCriterion("HeaderId not between", value1, value2, "headerid");
            return (Criteria) this;
        }

        public Criteria andAccountidIsNull() {
            addCriterion("AccountId is null");
            return (Criteria) this;
        }

        public Criteria andAccountidIsNotNull() {
            addCriterion("AccountId is not null");
            return (Criteria) this;
        }

        public Criteria andAccountidEqualTo(Long value) {
            addCriterion("AccountId =", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotEqualTo(Long value) {
            addCriterion("AccountId <>", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidGreaterThan(Long value) {
            addCriterion("AccountId >", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidGreaterThanOrEqualTo(Long value) {
            addCriterion("AccountId >=", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidLessThan(Long value) {
            addCriterion("AccountId <", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidLessThanOrEqualTo(Long value) {
            addCriterion("AccountId <=", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidIn(List<Long> values) {
            addCriterion("AccountId in", values, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotIn(List<Long> values) {
            addCriterion("AccountId not in", values, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidBetween(Long value1, Long value2) {
            addCriterion("AccountId between", value1, value2, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotBetween(Long value1, Long value2) {
            addCriterion("AccountId not between", value1, value2, "accountid");
            return (Criteria) this;
        }

        public Criteria andInoutitemidIsNull() {
            addCriterion("InOutItemId is null");
            return (Criteria) this;
        }

        public Criteria andInoutitemidIsNotNull() {
            addCriterion("InOutItemId is not null");
            return (Criteria) this;
        }

        public Criteria andInoutitemidEqualTo(Long value) {
            addCriterion("InOutItemId =", value, "inoutitemid");
            return (Criteria) this;
        }

        public Criteria andInoutitemidNotEqualTo(Long value) {
            addCriterion("InOutItemId <>", value, "inoutitemid");
            return (Criteria) this;
        }

        public Criteria andInoutitemidGreaterThan(Long value) {
            addCriterion("InOutItemId >", value, "inoutitemid");
            return (Criteria) this;
        }

        public Criteria andInoutitemidGreaterThanOrEqualTo(Long value) {
            addCriterion("InOutItemId >=", value, "inoutitemid");
            return (Criteria) this;
        }

        public Criteria andInoutitemidLessThan(Long value) {
            addCriterion("InOutItemId <", value, "inoutitemid");
            return (Criteria) this;
        }

        public Criteria andInoutitemidLessThanOrEqualTo(Long value) {
            addCriterion("InOutItemId <=", value, "inoutitemid");
            return (Criteria) this;
        }

        public Criteria andInoutitemidIn(List<Long> values) {
            addCriterion("InOutItemId in", values, "inoutitemid");
            return (Criteria) this;
        }

        public Criteria andInoutitemidNotIn(List<Long> values) {
            addCriterion("InOutItemId not in", values, "inoutitemid");
            return (Criteria) this;
        }

        public Criteria andInoutitemidBetween(Long value1, Long value2) {
            addCriterion("InOutItemId between", value1, value2, "inoutitemid");
            return (Criteria) this;
        }

        public Criteria andInoutitemidNotBetween(Long value1, Long value2) {
            addCriterion("InOutItemId not between", value1, value2, "inoutitemid");
            return (Criteria) this;
        }

        public Criteria andEachamountIsNull() {
            addCriterion("EachAmount is null");
            return (Criteria) this;
        }

        public Criteria andEachamountIsNotNull() {
            addCriterion("EachAmount is not null");
            return (Criteria) this;
        }

        public Criteria andEachamountEqualTo(BigDecimal value) {
            addCriterion("EachAmount =", value, "eachamount");
            return (Criteria) this;
        }

        public Criteria andEachamountNotEqualTo(BigDecimal value) {
            addCriterion("EachAmount <>", value, "eachamount");
            return (Criteria) this;
        }

        public Criteria andEachamountGreaterThan(BigDecimal value) {
            addCriterion("EachAmount >", value, "eachamount");
            return (Criteria) this;
        }

        public Criteria andEachamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EachAmount >=", value, "eachamount");
            return (Criteria) this;
        }

        public Criteria andEachamountLessThan(BigDecimal value) {
            addCriterion("EachAmount <", value, "eachamount");
            return (Criteria) this;
        }

        public Criteria andEachamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EachAmount <=", value, "eachamount");
            return (Criteria) this;
        }

        public Criteria andEachamountIn(List<BigDecimal> values) {
            addCriterion("EachAmount in", values, "eachamount");
            return (Criteria) this;
        }

        public Criteria andEachamountNotIn(List<BigDecimal> values) {
            addCriterion("EachAmount not in", values, "eachamount");
            return (Criteria) this;
        }

        public Criteria andEachamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EachAmount between", value1, value2, "eachamount");
            return (Criteria) this;
        }

        public Criteria andEachamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EachAmount not between", value1, value2, "eachamount");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("Remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("Remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("Remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("Remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("Remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("Remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("Remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("Remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("Remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("Remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("Remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("Remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("Remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table jsh_accountitem
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table jsh_accountitem
     *
     * @mbggenerated
     */
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