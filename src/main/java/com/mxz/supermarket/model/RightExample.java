package com.mxz.supermarket.model;

import java.util.ArrayList;
import java.util.List;

public class RightExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table right
     *
     * @mbggenerated Mon Jan 06 20:18:09 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table right
     *
     * @mbggenerated Mon Jan 06 20:18:09 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table right
     *
     * @mbggenerated Mon Jan 06 20:18:09 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table right
     *
     * @mbggenerated Mon Jan 06 20:18:09 CST 2020
     */
    public RightExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table right
     *
     * @mbggenerated Mon Jan 06 20:18:09 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table right
     *
     * @mbggenerated Mon Jan 06 20:18:09 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table right
     *
     * @mbggenerated Mon Jan 06 20:18:09 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table right
     *
     * @mbggenerated Mon Jan 06 20:18:09 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table right
     *
     * @mbggenerated Mon Jan 06 20:18:09 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table right
     *
     * @mbggenerated Mon Jan 06 20:18:09 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table right
     *
     * @mbggenerated Mon Jan 06 20:18:09 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table right
     *
     * @mbggenerated Mon Jan 06 20:18:09 CST 2020
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
     * This method corresponds to the database table right
     *
     * @mbggenerated Mon Jan 06 20:18:09 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table right
     *
     * @mbggenerated Mon Jan 06 20:18:09 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table right
     *
     * @mbggenerated Mon Jan 06 20:18:09 CST 2020
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

        public Criteria andRightIdIsNull() {
            addCriterion("right_id is null");
            return (Criteria) this;
        }

        public Criteria andRightIdIsNotNull() {
            addCriterion("right_id is not null");
            return (Criteria) this;
        }

        public Criteria andRightIdEqualTo(Integer value) {
            addCriterion("right_id =", value, "rightId");
            return (Criteria) this;
        }

        public Criteria andRightIdNotEqualTo(Integer value) {
            addCriterion("right_id <>", value, "rightId");
            return (Criteria) this;
        }

        public Criteria andRightIdGreaterThan(Integer value) {
            addCriterion("right_id >", value, "rightId");
            return (Criteria) this;
        }

        public Criteria andRightIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("right_id >=", value, "rightId");
            return (Criteria) this;
        }

        public Criteria andRightIdLessThan(Integer value) {
            addCriterion("right_id <", value, "rightId");
            return (Criteria) this;
        }

        public Criteria andRightIdLessThanOrEqualTo(Integer value) {
            addCriterion("right_id <=", value, "rightId");
            return (Criteria) this;
        }

        public Criteria andRightIdIn(List<Integer> values) {
            addCriterion("right_id in", values, "rightId");
            return (Criteria) this;
        }

        public Criteria andRightIdNotIn(List<Integer> values) {
            addCriterion("right_id not in", values, "rightId");
            return (Criteria) this;
        }

        public Criteria andRightIdBetween(Integer value1, Integer value2) {
            addCriterion("right_id between", value1, value2, "rightId");
            return (Criteria) this;
        }

        public Criteria andRightIdNotBetween(Integer value1, Integer value2) {
            addCriterion("right_id not between", value1, value2, "rightId");
            return (Criteria) this;
        }

        public Criteria andRightNameIsNull() {
            addCriterion("right_name is null");
            return (Criteria) this;
        }

        public Criteria andRightNameIsNotNull() {
            addCriterion("right_name is not null");
            return (Criteria) this;
        }

        public Criteria andRightNameEqualTo(String value) {
            addCriterion("right_name =", value, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameNotEqualTo(String value) {
            addCriterion("right_name <>", value, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameGreaterThan(String value) {
            addCriterion("right_name >", value, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameGreaterThanOrEqualTo(String value) {
            addCriterion("right_name >=", value, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameLessThan(String value) {
            addCriterion("right_name <", value, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameLessThanOrEqualTo(String value) {
            addCriterion("right_name <=", value, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameLike(String value) {
            addCriterion("right_name like", value, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameNotLike(String value) {
            addCriterion("right_name not like", value, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameIn(List<String> values) {
            addCriterion("right_name in", values, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameNotIn(List<String> values) {
            addCriterion("right_name not in", values, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameBetween(String value1, String value2) {
            addCriterion("right_name between", value1, value2, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameNotBetween(String value1, String value2) {
            addCriterion("right_name not between", value1, value2, "rightName");
            return (Criteria) this;
        }

        public Criteria andIsenabledIsNull() {
            addCriterion("isEnabled is null");
            return (Criteria) this;
        }

        public Criteria andIsenabledIsNotNull() {
            addCriterion("isEnabled is not null");
            return (Criteria) this;
        }

        public Criteria andIsenabledEqualTo(Integer value) {
            addCriterion("isEnabled =", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledNotEqualTo(Integer value) {
            addCriterion("isEnabled <>", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledGreaterThan(Integer value) {
            addCriterion("isEnabled >", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledGreaterThanOrEqualTo(Integer value) {
            addCriterion("isEnabled >=", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledLessThan(Integer value) {
            addCriterion("isEnabled <", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledLessThanOrEqualTo(Integer value) {
            addCriterion("isEnabled <=", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledIn(List<Integer> values) {
            addCriterion("isEnabled in", values, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledNotIn(List<Integer> values) {
            addCriterion("isEnabled not in", values, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledBetween(Integer value1, Integer value2) {
            addCriterion("isEnabled between", value1, value2, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledNotBetween(Integer value1, Integer value2) {
            addCriterion("isEnabled not between", value1, value2, "isenabled");
            return (Criteria) this;
        }

        public Criteria andRightDescIsNull() {
            addCriterion("right_desc is null");
            return (Criteria) this;
        }

        public Criteria andRightDescIsNotNull() {
            addCriterion("right_desc is not null");
            return (Criteria) this;
        }

        public Criteria andRightDescEqualTo(Integer value) {
            addCriterion("right_desc =", value, "rightDesc");
            return (Criteria) this;
        }

        public Criteria andRightDescNotEqualTo(Integer value) {
            addCriterion("right_desc <>", value, "rightDesc");
            return (Criteria) this;
        }

        public Criteria andRightDescGreaterThan(Integer value) {
            addCriterion("right_desc >", value, "rightDesc");
            return (Criteria) this;
        }

        public Criteria andRightDescGreaterThanOrEqualTo(Integer value) {
            addCriterion("right_desc >=", value, "rightDesc");
            return (Criteria) this;
        }

        public Criteria andRightDescLessThan(Integer value) {
            addCriterion("right_desc <", value, "rightDesc");
            return (Criteria) this;
        }

        public Criteria andRightDescLessThanOrEqualTo(Integer value) {
            addCriterion("right_desc <=", value, "rightDesc");
            return (Criteria) this;
        }

        public Criteria andRightDescIn(List<Integer> values) {
            addCriterion("right_desc in", values, "rightDesc");
            return (Criteria) this;
        }

        public Criteria andRightDescNotIn(List<Integer> values) {
            addCriterion("right_desc not in", values, "rightDesc");
            return (Criteria) this;
        }

        public Criteria andRightDescBetween(Integer value1, Integer value2) {
            addCriterion("right_desc between", value1, value2, "rightDesc");
            return (Criteria) this;
        }

        public Criteria andRightDescNotBetween(Integer value1, Integer value2) {
            addCriterion("right_desc not between", value1, value2, "rightDesc");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table right
     *
     * @mbggenerated do_not_delete_during_merge Mon Jan 06 20:18:09 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table right
     *
     * @mbggenerated Mon Jan 06 20:18:09 CST 2020
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