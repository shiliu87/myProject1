package com.qf.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AnnouncementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnnouncementExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAnnnoIsNull() {
            addCriterion("annNo is null");
            return (Criteria) this;
        }

        public Criteria andAnnnoIsNotNull() {
            addCriterion("annNo is not null");
            return (Criteria) this;
        }

        public Criteria andAnnnoEqualTo(Integer value) {
            addCriterion("annNo =", value, "annno");
            return (Criteria) this;
        }

        public Criteria andAnnnoNotEqualTo(Integer value) {
            addCriterion("annNo <>", value, "annno");
            return (Criteria) this;
        }

        public Criteria andAnnnoGreaterThan(Integer value) {
            addCriterion("annNo >", value, "annno");
            return (Criteria) this;
        }

        public Criteria andAnnnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("annNo >=", value, "annno");
            return (Criteria) this;
        }

        public Criteria andAnnnoLessThan(Integer value) {
            addCriterion("annNo <", value, "annno");
            return (Criteria) this;
        }

        public Criteria andAnnnoLessThanOrEqualTo(Integer value) {
            addCriterion("annNo <=", value, "annno");
            return (Criteria) this;
        }

        public Criteria andAnnnoIn(List<Integer> values) {
            addCriterion("annNo in", values, "annno");
            return (Criteria) this;
        }

        public Criteria andAnnnoNotIn(List<Integer> values) {
            addCriterion("annNo not in", values, "annno");
            return (Criteria) this;
        }

        public Criteria andAnnnoBetween(Integer value1, Integer value2) {
            addCriterion("annNo between", value1, value2, "annno");
            return (Criteria) this;
        }

        public Criteria andAnnnoNotBetween(Integer value1, Integer value2) {
            addCriterion("annNo not between", value1, value2, "annno");
            return (Criteria) this;
        }

        public Criteria andAnntimeIsNull() {
            addCriterion("annTime is null");
            return (Criteria) this;
        }

        public Criteria andAnntimeIsNotNull() {
            addCriterion("annTime is not null");
            return (Criteria) this;
        }

        public Criteria andAnntimeEqualTo(Date value) {
            addCriterion("annTime =", value, "anntime");
            return (Criteria) this;
        }

        public Criteria andAnntimeNotEqualTo(Date value) {
            addCriterion("annTime <>", value, "anntime");
            return (Criteria) this;
        }

        public Criteria andAnntimeGreaterThan(Date value) {
            addCriterion("annTime >", value, "anntime");
            return (Criteria) this;
        }

        public Criteria andAnntimeGreaterThanOrEqualTo(Date value) {
            addCriterion("annTime >=", value, "anntime");
            return (Criteria) this;
        }

        public Criteria andAnntimeLessThan(Date value) {
            addCriterion("annTime <", value, "anntime");
            return (Criteria) this;
        }

        public Criteria andAnntimeLessThanOrEqualTo(Date value) {
            addCriterion("annTime <=", value, "anntime");
            return (Criteria) this;
        }

        public Criteria andAnntimeIn(List<Date> values) {
            addCriterion("annTime in", values, "anntime");
            return (Criteria) this;
        }

        public Criteria andAnntimeNotIn(List<Date> values) {
            addCriterion("annTime not in", values, "anntime");
            return (Criteria) this;
        }

        public Criteria andAnntimeBetween(Date value1, Date value2) {
            addCriterion("annTime between", value1, value2, "anntime");
            return (Criteria) this;
        }

        public Criteria andAnntimeNotBetween(Date value1, Date value2) {
            addCriterion("annTime not between", value1, value2, "anntime");
            return (Criteria) this;
        }

        public Criteria andAnncontentIsNull() {
            addCriterion("annContent is null");
            return (Criteria) this;
        }

        public Criteria andAnncontentIsNotNull() {
            addCriterion("annContent is not null");
            return (Criteria) this;
        }

        public Criteria andAnncontentEqualTo(String value) {
            addCriterion("annContent =", value, "anncontent");
            return (Criteria) this;
        }

        public Criteria andAnncontentNotEqualTo(String value) {
            addCriterion("annContent <>", value, "anncontent");
            return (Criteria) this;
        }

        public Criteria andAnncontentGreaterThan(String value) {
            addCriterion("annContent >", value, "anncontent");
            return (Criteria) this;
        }

        public Criteria andAnncontentGreaterThanOrEqualTo(String value) {
            addCriterion("annContent >=", value, "anncontent");
            return (Criteria) this;
        }

        public Criteria andAnncontentLessThan(String value) {
            addCriterion("annContent <", value, "anncontent");
            return (Criteria) this;
        }

        public Criteria andAnncontentLessThanOrEqualTo(String value) {
            addCriterion("annContent <=", value, "anncontent");
            return (Criteria) this;
        }

        public Criteria andAnncontentLike(String value) {
            addCriterion("annContent like", value, "anncontent");
            return (Criteria) this;
        }

        public Criteria andAnncontentNotLike(String value) {
            addCriterion("annContent not like", value, "anncontent");
            return (Criteria) this;
        }

        public Criteria andAnncontentIn(List<String> values) {
            addCriterion("annContent in", values, "anncontent");
            return (Criteria) this;
        }

        public Criteria andAnncontentNotIn(List<String> values) {
            addCriterion("annContent not in", values, "anncontent");
            return (Criteria) this;
        }

        public Criteria andAnncontentBetween(String value1, String value2) {
            addCriterion("annContent between", value1, value2, "anncontent");
            return (Criteria) this;
        }

        public Criteria andAnncontentNotBetween(String value1, String value2) {
            addCriterion("annContent not between", value1, value2, "anncontent");
            return (Criteria) this;
        }

        public Criteria andAnnmanIsNull() {
            addCriterion("annMan is null");
            return (Criteria) this;
        }

        public Criteria andAnnmanIsNotNull() {
            addCriterion("annMan is not null");
            return (Criteria) this;
        }

        public Criteria andAnnmanEqualTo(String value) {
            addCriterion("annMan =", value, "annman");
            return (Criteria) this;
        }

        public Criteria andAnnmanNotEqualTo(String value) {
            addCriterion("annMan <>", value, "annman");
            return (Criteria) this;
        }

        public Criteria andAnnmanGreaterThan(String value) {
            addCriterion("annMan >", value, "annman");
            return (Criteria) this;
        }

        public Criteria andAnnmanGreaterThanOrEqualTo(String value) {
            addCriterion("annMan >=", value, "annman");
            return (Criteria) this;
        }

        public Criteria andAnnmanLessThan(String value) {
            addCriterion("annMan <", value, "annman");
            return (Criteria) this;
        }

        public Criteria andAnnmanLessThanOrEqualTo(String value) {
            addCriterion("annMan <=", value, "annman");
            return (Criteria) this;
        }

        public Criteria andAnnmanLike(String value) {
            addCriterion("annMan like", value, "annman");
            return (Criteria) this;
        }

        public Criteria andAnnmanNotLike(String value) {
            addCriterion("annMan not like", value, "annman");
            return (Criteria) this;
        }

        public Criteria andAnnmanIn(List<String> values) {
            addCriterion("annMan in", values, "annman");
            return (Criteria) this;
        }

        public Criteria andAnnmanNotIn(List<String> values) {
            addCriterion("annMan not in", values, "annman");
            return (Criteria) this;
        }

        public Criteria andAnnmanBetween(String value1, String value2) {
            addCriterion("annMan between", value1, value2, "annman");
            return (Criteria) this;
        }

        public Criteria andAnnmanNotBetween(String value1, String value2) {
            addCriterion("annMan not between", value1, value2, "annman");
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