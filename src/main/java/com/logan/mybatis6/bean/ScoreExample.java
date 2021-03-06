package com.logan.mybatis6.bean;

import java.util.ArrayList;
import java.util.List;

public class ScoreExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table score
     *
     * @mbg.generated Thu Mar 26 10:35:56 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table score
     *
     * @mbg.generated Thu Mar 26 10:35:56 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table score
     *
     * @mbg.generated Thu Mar 26 10:35:56 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbg.generated Thu Mar 26 10:35:56 CST 2020
     */
    public ScoreExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbg.generated Thu Mar 26 10:35:56 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbg.generated Thu Mar 26 10:35:56 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbg.generated Thu Mar 26 10:35:56 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbg.generated Thu Mar 26 10:35:56 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbg.generated Thu Mar 26 10:35:56 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbg.generated Thu Mar 26 10:35:56 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbg.generated Thu Mar 26 10:35:56 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbg.generated Thu Mar 26 10:35:56 CST 2020
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
     * This method corresponds to the database table score
     *
     * @mbg.generated Thu Mar 26 10:35:56 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbg.generated Thu Mar 26 10:35:56 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table score
     *
     * @mbg.generated Thu Mar 26 10:35:56 CST 2020
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

        public Criteria andSIdIsNull() {
            addCriterion("s_id is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("s_id is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(String value) {
            addCriterion("s_id =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(String value) {
            addCriterion("s_id <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(String value) {
            addCriterion("s_id >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(String value) {
            addCriterion("s_id >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(String value) {
            addCriterion("s_id <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(String value) {
            addCriterion("s_id <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLike(String value) {
            addCriterion("s_id like", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotLike(String value) {
            addCriterion("s_id not like", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<String> values) {
            addCriterion("s_id in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<String> values) {
            addCriterion("s_id not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(String value1, String value2) {
            addCriterion("s_id between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(String value1, String value2) {
            addCriterion("s_id not between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(String value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(String value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(String value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(String value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(String value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLike(String value) {
            addCriterion("c_id like", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotLike(String value) {
            addCriterion("c_id not like", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<String> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<String> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(String value1, String value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(String value1, String value2) {
            addCriterion("c_id not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andSScoreIsNull() {
            addCriterion("s_score is null");
            return (Criteria) this;
        }

        public Criteria andSScoreIsNotNull() {
            addCriterion("s_score is not null");
            return (Criteria) this;
        }

        public Criteria andSScoreEqualTo(Integer value) {
            addCriterion("s_score =", value, "sScore");
            return (Criteria) this;
        }

        public Criteria andSScoreNotEqualTo(Integer value) {
            addCriterion("s_score <>", value, "sScore");
            return (Criteria) this;
        }

        public Criteria andSScoreGreaterThan(Integer value) {
            addCriterion("s_score >", value, "sScore");
            return (Criteria) this;
        }

        public Criteria andSScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_score >=", value, "sScore");
            return (Criteria) this;
        }

        public Criteria andSScoreLessThan(Integer value) {
            addCriterion("s_score <", value, "sScore");
            return (Criteria) this;
        }

        public Criteria andSScoreLessThanOrEqualTo(Integer value) {
            addCriterion("s_score <=", value, "sScore");
            return (Criteria) this;
        }

        public Criteria andSScoreIn(List<Integer> values) {
            addCriterion("s_score in", values, "sScore");
            return (Criteria) this;
        }

        public Criteria andSScoreNotIn(List<Integer> values) {
            addCriterion("s_score not in", values, "sScore");
            return (Criteria) this;
        }

        public Criteria andSScoreBetween(Integer value1, Integer value2) {
            addCriterion("s_score between", value1, value2, "sScore");
            return (Criteria) this;
        }

        public Criteria andSScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("s_score not between", value1, value2, "sScore");
            return (Criteria) this;
        }

        public Criteria andSDIdIsNull() {
            addCriterion("s_d_id is null");
            return (Criteria) this;
        }

        public Criteria andSDIdIsNotNull() {
            addCriterion("s_d_id is not null");
            return (Criteria) this;
        }

        public Criteria andSDIdEqualTo(Integer value) {
            addCriterion("s_d_id =", value, "sDId");
            return (Criteria) this;
        }

        public Criteria andSDIdNotEqualTo(Integer value) {
            addCriterion("s_d_id <>", value, "sDId");
            return (Criteria) this;
        }

        public Criteria andSDIdGreaterThan(Integer value) {
            addCriterion("s_d_id >", value, "sDId");
            return (Criteria) this;
        }

        public Criteria andSDIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_d_id >=", value, "sDId");
            return (Criteria) this;
        }

        public Criteria andSDIdLessThan(Integer value) {
            addCriterion("s_d_id <", value, "sDId");
            return (Criteria) this;
        }

        public Criteria andSDIdLessThanOrEqualTo(Integer value) {
            addCriterion("s_d_id <=", value, "sDId");
            return (Criteria) this;
        }

        public Criteria andSDIdIn(List<Integer> values) {
            addCriterion("s_d_id in", values, "sDId");
            return (Criteria) this;
        }

        public Criteria andSDIdNotIn(List<Integer> values) {
            addCriterion("s_d_id not in", values, "sDId");
            return (Criteria) this;
        }

        public Criteria andSDIdBetween(Integer value1, Integer value2) {
            addCriterion("s_d_id between", value1, value2, "sDId");
            return (Criteria) this;
        }

        public Criteria andSDIdNotBetween(Integer value1, Integer value2) {
            addCriterion("s_d_id not between", value1, value2, "sDId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table score
     *
     * @mbg.generated do_not_delete_during_merge Thu Mar 26 10:35:56 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table score
     *
     * @mbg.generated Thu Mar 26 10:35:56 CST 2020
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