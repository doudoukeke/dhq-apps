package com.xnt.dhq.model;

import java.util.ArrayList;
import java.util.List;

public class DhqDeviceTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DhqDeviceTypeExample() {
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

        public Criteria andFirstCategoryIsNull() {
            addCriterion("first_category is null");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryIsNotNull() {
            addCriterion("first_category is not null");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryEqualTo(String value) {
            addCriterion("first_category =", value, "firstCategory");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryNotEqualTo(String value) {
            addCriterion("first_category <>", value, "firstCategory");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryGreaterThan(String value) {
            addCriterion("first_category >", value, "firstCategory");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("first_category >=", value, "firstCategory");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryLessThan(String value) {
            addCriterion("first_category <", value, "firstCategory");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryLessThanOrEqualTo(String value) {
            addCriterion("first_category <=", value, "firstCategory");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryLike(String value) {
            addCriterion("first_category like", value, "firstCategory");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryNotLike(String value) {
            addCriterion("first_category not like", value, "firstCategory");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryIn(List<String> values) {
            addCriterion("first_category in", values, "firstCategory");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryNotIn(List<String> values) {
            addCriterion("first_category not in", values, "firstCategory");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryBetween(String value1, String value2) {
            addCriterion("first_category between", value1, value2, "firstCategory");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryNotBetween(String value1, String value2) {
            addCriterion("first_category not between", value1, value2, "firstCategory");
            return (Criteria) this;
        }

        public Criteria andSecondCategoryIsNull() {
            addCriterion("second_category is null");
            return (Criteria) this;
        }

        public Criteria andSecondCategoryIsNotNull() {
            addCriterion("second_category is not null");
            return (Criteria) this;
        }

        public Criteria andSecondCategoryEqualTo(String value) {
            addCriterion("second_category =", value, "secondCategory");
            return (Criteria) this;
        }

        public Criteria andSecondCategoryNotEqualTo(String value) {
            addCriterion("second_category <>", value, "secondCategory");
            return (Criteria) this;
        }

        public Criteria andSecondCategoryGreaterThan(String value) {
            addCriterion("second_category >", value, "secondCategory");
            return (Criteria) this;
        }

        public Criteria andSecondCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("second_category >=", value, "secondCategory");
            return (Criteria) this;
        }

        public Criteria andSecondCategoryLessThan(String value) {
            addCriterion("second_category <", value, "secondCategory");
            return (Criteria) this;
        }

        public Criteria andSecondCategoryLessThanOrEqualTo(String value) {
            addCriterion("second_category <=", value, "secondCategory");
            return (Criteria) this;
        }

        public Criteria andSecondCategoryLike(String value) {
            addCriterion("second_category like", value, "secondCategory");
            return (Criteria) this;
        }

        public Criteria andSecondCategoryNotLike(String value) {
            addCriterion("second_category not like", value, "secondCategory");
            return (Criteria) this;
        }

        public Criteria andSecondCategoryIn(List<String> values) {
            addCriterion("second_category in", values, "secondCategory");
            return (Criteria) this;
        }

        public Criteria andSecondCategoryNotIn(List<String> values) {
            addCriterion("second_category not in", values, "secondCategory");
            return (Criteria) this;
        }

        public Criteria andSecondCategoryBetween(String value1, String value2) {
            addCriterion("second_category between", value1, value2, "secondCategory");
            return (Criteria) this;
        }

        public Criteria andSecondCategoryNotBetween(String value1, String value2) {
            addCriterion("second_category not between", value1, value2, "secondCategory");
            return (Criteria) this;
        }

        public Criteria andThirdCategoryIsNull() {
            addCriterion("third_category is null");
            return (Criteria) this;
        }

        public Criteria andThirdCategoryIsNotNull() {
            addCriterion("third_category is not null");
            return (Criteria) this;
        }

        public Criteria andThirdCategoryEqualTo(String value) {
            addCriterion("third_category =", value, "thirdCategory");
            return (Criteria) this;
        }

        public Criteria andThirdCategoryNotEqualTo(String value) {
            addCriterion("third_category <>", value, "thirdCategory");
            return (Criteria) this;
        }

        public Criteria andThirdCategoryGreaterThan(String value) {
            addCriterion("third_category >", value, "thirdCategory");
            return (Criteria) this;
        }

        public Criteria andThirdCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("third_category >=", value, "thirdCategory");
            return (Criteria) this;
        }

        public Criteria andThirdCategoryLessThan(String value) {
            addCriterion("third_category <", value, "thirdCategory");
            return (Criteria) this;
        }

        public Criteria andThirdCategoryLessThanOrEqualTo(String value) {
            addCriterion("third_category <=", value, "thirdCategory");
            return (Criteria) this;
        }

        public Criteria andThirdCategoryLike(String value) {
            addCriterion("third_category like", value, "thirdCategory");
            return (Criteria) this;
        }

        public Criteria andThirdCategoryNotLike(String value) {
            addCriterion("third_category not like", value, "thirdCategory");
            return (Criteria) this;
        }

        public Criteria andThirdCategoryIn(List<String> values) {
            addCriterion("third_category in", values, "thirdCategory");
            return (Criteria) this;
        }

        public Criteria andThirdCategoryNotIn(List<String> values) {
            addCriterion("third_category not in", values, "thirdCategory");
            return (Criteria) this;
        }

        public Criteria andThirdCategoryBetween(String value1, String value2) {
            addCriterion("third_category between", value1, value2, "thirdCategory");
            return (Criteria) this;
        }

        public Criteria andThirdCategoryNotBetween(String value1, String value2) {
            addCriterion("third_category not between", value1, value2, "thirdCategory");
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