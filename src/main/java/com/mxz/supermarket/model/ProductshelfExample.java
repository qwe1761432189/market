package com.mxz.supermarket.model;

import java.util.ArrayList;
import java.util.List;

public class ProductshelfExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table productshelf
     *
     * @mbggenerated Mon Jan 06 20:18:09 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table productshelf
     *
     * @mbggenerated Mon Jan 06 20:18:09 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table productshelf
     *
     * @mbggenerated Mon Jan 06 20:18:09 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productshelf
     *
     * @mbggenerated Mon Jan 06 20:18:09 CST 2020
     */
    public ProductshelfExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productshelf
     *
     * @mbggenerated Mon Jan 06 20:18:09 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productshelf
     *
     * @mbggenerated Mon Jan 06 20:18:09 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productshelf
     *
     * @mbggenerated Mon Jan 06 20:18:09 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productshelf
     *
     * @mbggenerated Mon Jan 06 20:18:09 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productshelf
     *
     * @mbggenerated Mon Jan 06 20:18:09 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productshelf
     *
     * @mbggenerated Mon Jan 06 20:18:09 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productshelf
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
     * This method corresponds to the database table productshelf
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
     * This method corresponds to the database table productshelf
     *
     * @mbggenerated Mon Jan 06 20:18:09 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productshelf
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
     * This class corresponds to the database table productshelf
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

        public Criteria andShelfIdIsNull() {
            addCriterion("shelf_id is null");
            return (Criteria) this;
        }

        public Criteria andShelfIdIsNotNull() {
            addCriterion("shelf_id is not null");
            return (Criteria) this;
        }

        public Criteria andShelfIdEqualTo(Integer value) {
            addCriterion("shelf_id =", value, "shelfId");
            return (Criteria) this;
        }

        public Criteria andShelfIdNotEqualTo(Integer value) {
            addCriterion("shelf_id <>", value, "shelfId");
            return (Criteria) this;
        }

        public Criteria andShelfIdGreaterThan(Integer value) {
            addCriterion("shelf_id >", value, "shelfId");
            return (Criteria) this;
        }

        public Criteria andShelfIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shelf_id >=", value, "shelfId");
            return (Criteria) this;
        }

        public Criteria andShelfIdLessThan(Integer value) {
            addCriterion("shelf_id <", value, "shelfId");
            return (Criteria) this;
        }

        public Criteria andShelfIdLessThanOrEqualTo(Integer value) {
            addCriterion("shelf_id <=", value, "shelfId");
            return (Criteria) this;
        }

        public Criteria andShelfIdIn(List<Integer> values) {
            addCriterion("shelf_id in", values, "shelfId");
            return (Criteria) this;
        }

        public Criteria andShelfIdNotIn(List<Integer> values) {
            addCriterion("shelf_id not in", values, "shelfId");
            return (Criteria) this;
        }

        public Criteria andShelfIdBetween(Integer value1, Integer value2) {
            addCriterion("shelf_id between", value1, value2, "shelfId");
            return (Criteria) this;
        }

        public Criteria andShelfIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shelf_id not between", value1, value2, "shelfId");
            return (Criteria) this;
        }

        public Criteria andShelfNameIsNull() {
            addCriterion("shelf_name is null");
            return (Criteria) this;
        }

        public Criteria andShelfNameIsNotNull() {
            addCriterion("shelf_name is not null");
            return (Criteria) this;
        }

        public Criteria andShelfNameEqualTo(String value) {
            addCriterion("shelf_name =", value, "shelfName");
            return (Criteria) this;
        }

        public Criteria andShelfNameNotEqualTo(String value) {
            addCriterion("shelf_name <>", value, "shelfName");
            return (Criteria) this;
        }

        public Criteria andShelfNameGreaterThan(String value) {
            addCriterion("shelf_name >", value, "shelfName");
            return (Criteria) this;
        }

        public Criteria andShelfNameGreaterThanOrEqualTo(String value) {
            addCriterion("shelf_name >=", value, "shelfName");
            return (Criteria) this;
        }

        public Criteria andShelfNameLessThan(String value) {
            addCriterion("shelf_name <", value, "shelfName");
            return (Criteria) this;
        }

        public Criteria andShelfNameLessThanOrEqualTo(String value) {
            addCriterion("shelf_name <=", value, "shelfName");
            return (Criteria) this;
        }

        public Criteria andShelfNameLike(String value) {
            addCriterion("shelf_name like", value, "shelfName");
            return (Criteria) this;
        }

        public Criteria andShelfNameNotLike(String value) {
            addCriterion("shelf_name not like", value, "shelfName");
            return (Criteria) this;
        }

        public Criteria andShelfNameIn(List<String> values) {
            addCriterion("shelf_name in", values, "shelfName");
            return (Criteria) this;
        }

        public Criteria andShelfNameNotIn(List<String> values) {
            addCriterion("shelf_name not in", values, "shelfName");
            return (Criteria) this;
        }

        public Criteria andShelfNameBetween(String value1, String value2) {
            addCriterion("shelf_name between", value1, value2, "shelfName");
            return (Criteria) this;
        }

        public Criteria andShelfNameNotBetween(String value1, String value2) {
            addCriterion("shelf_name not between", value1, value2, "shelfName");
            return (Criteria) this;
        }

        public Criteria andShelfPositionIsNull() {
            addCriterion("shelf_position is null");
            return (Criteria) this;
        }

        public Criteria andShelfPositionIsNotNull() {
            addCriterion("shelf_position is not null");
            return (Criteria) this;
        }

        public Criteria andShelfPositionEqualTo(String value) {
            addCriterion("shelf_position =", value, "shelfPosition");
            return (Criteria) this;
        }

        public Criteria andShelfPositionNotEqualTo(String value) {
            addCriterion("shelf_position <>", value, "shelfPosition");
            return (Criteria) this;
        }

        public Criteria andShelfPositionGreaterThan(String value) {
            addCriterion("shelf_position >", value, "shelfPosition");
            return (Criteria) this;
        }

        public Criteria andShelfPositionGreaterThanOrEqualTo(String value) {
            addCriterion("shelf_position >=", value, "shelfPosition");
            return (Criteria) this;
        }

        public Criteria andShelfPositionLessThan(String value) {
            addCriterion("shelf_position <", value, "shelfPosition");
            return (Criteria) this;
        }

        public Criteria andShelfPositionLessThanOrEqualTo(String value) {
            addCriterion("shelf_position <=", value, "shelfPosition");
            return (Criteria) this;
        }

        public Criteria andShelfPositionLike(String value) {
            addCriterion("shelf_position like", value, "shelfPosition");
            return (Criteria) this;
        }

        public Criteria andShelfPositionNotLike(String value) {
            addCriterion("shelf_position not like", value, "shelfPosition");
            return (Criteria) this;
        }

        public Criteria andShelfPositionIn(List<String> values) {
            addCriterion("shelf_position in", values, "shelfPosition");
            return (Criteria) this;
        }

        public Criteria andShelfPositionNotIn(List<String> values) {
            addCriterion("shelf_position not in", values, "shelfPosition");
            return (Criteria) this;
        }

        public Criteria andShelfPositionBetween(String value1, String value2) {
            addCriterion("shelf_position between", value1, value2, "shelfPosition");
            return (Criteria) this;
        }

        public Criteria andShelfPositionNotBetween(String value1, String value2) {
            addCriterion("shelf_position not between", value1, value2, "shelfPosition");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andShelfCountIsNull() {
            addCriterion("shelf_count is null");
            return (Criteria) this;
        }

        public Criteria andShelfCountIsNotNull() {
            addCriterion("shelf_count is not null");
            return (Criteria) this;
        }

        public Criteria andShelfCountEqualTo(Integer value) {
            addCriterion("shelf_count =", value, "shelfCount");
            return (Criteria) this;
        }

        public Criteria andShelfCountNotEqualTo(Integer value) {
            addCriterion("shelf_count <>", value, "shelfCount");
            return (Criteria) this;
        }

        public Criteria andShelfCountGreaterThan(Integer value) {
            addCriterion("shelf_count >", value, "shelfCount");
            return (Criteria) this;
        }

        public Criteria andShelfCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("shelf_count >=", value, "shelfCount");
            return (Criteria) this;
        }

        public Criteria andShelfCountLessThan(Integer value) {
            addCriterion("shelf_count <", value, "shelfCount");
            return (Criteria) this;
        }

        public Criteria andShelfCountLessThanOrEqualTo(Integer value) {
            addCriterion("shelf_count <=", value, "shelfCount");
            return (Criteria) this;
        }

        public Criteria andShelfCountIn(List<Integer> values) {
            addCriterion("shelf_count in", values, "shelfCount");
            return (Criteria) this;
        }

        public Criteria andShelfCountNotIn(List<Integer> values) {
            addCriterion("shelf_count not in", values, "shelfCount");
            return (Criteria) this;
        }

        public Criteria andShelfCountBetween(Integer value1, Integer value2) {
            addCriterion("shelf_count between", value1, value2, "shelfCount");
            return (Criteria) this;
        }

        public Criteria andShelfCountNotBetween(Integer value1, Integer value2) {
            addCriterion("shelf_count not between", value1, value2, "shelfCount");
            return (Criteria) this;
        }

        public Criteria andSalePriceIsNull() {
            addCriterion("sale_price is null");
            return (Criteria) this;
        }

        public Criteria andSalePriceIsNotNull() {
            addCriterion("sale_price is not null");
            return (Criteria) this;
        }

        public Criteria andSalePriceEqualTo(Integer value) {
            addCriterion("sale_price =", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotEqualTo(Integer value) {
            addCriterion("sale_price <>", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThan(Integer value) {
            addCriterion("sale_price >", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_price >=", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThan(Integer value) {
            addCriterion("sale_price <", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThanOrEqualTo(Integer value) {
            addCriterion("sale_price <=", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceIn(List<Integer> values) {
            addCriterion("sale_price in", values, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotIn(List<Integer> values) {
            addCriterion("sale_price not in", values, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceBetween(Integer value1, Integer value2) {
            addCriterion("sale_price between", value1, value2, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_price not between", value1, value2, "salePrice");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNull() {
            addCriterion("remark1 is null");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNotNull() {
            addCriterion("remark1 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark1EqualTo(String value) {
            addCriterion("remark1 =", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotEqualTo(String value) {
            addCriterion("remark1 <>", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThan(String value) {
            addCriterion("remark1 >", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThanOrEqualTo(String value) {
            addCriterion("remark1 >=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThan(String value) {
            addCriterion("remark1 <", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThanOrEqualTo(String value) {
            addCriterion("remark1 <=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Like(String value) {
            addCriterion("remark1 like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotLike(String value) {
            addCriterion("remark1 not like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1In(List<String> values) {
            addCriterion("remark1 in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotIn(List<String> values) {
            addCriterion("remark1 not in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Between(String value1, String value2) {
            addCriterion("remark1 between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotBetween(String value1, String value2) {
            addCriterion("remark1 not between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNull() {
            addCriterion("remark2 is null");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNotNull() {
            addCriterion("remark2 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark2EqualTo(String value) {
            addCriterion("remark2 =", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotEqualTo(String value) {
            addCriterion("remark2 <>", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThan(String value) {
            addCriterion("remark2 >", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThanOrEqualTo(String value) {
            addCriterion("remark2 >=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThan(String value) {
            addCriterion("remark2 <", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThanOrEqualTo(String value) {
            addCriterion("remark2 <=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Like(String value) {
            addCriterion("remark2 like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotLike(String value) {
            addCriterion("remark2 not like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2In(List<String> values) {
            addCriterion("remark2 in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotIn(List<String> values) {
            addCriterion("remark2 not in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Between(String value1, String value2) {
            addCriterion("remark2 between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotBetween(String value1, String value2) {
            addCriterion("remark2 not between", value1, value2, "remark2");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table productshelf
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
     * This class corresponds to the database table productshelf
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