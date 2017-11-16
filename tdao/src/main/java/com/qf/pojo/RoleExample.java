package com.qf.pojo;

import java.util.ArrayList;
import java.util.List;

public class RoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoleExample() {
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

        public Criteria andRoidIsNull() {
            addCriterion("roId is null");
            return (Criteria) this;
        }

        public Criteria andRoidIsNotNull() {
            addCriterion("roId is not null");
            return (Criteria) this;
        }

        public Criteria andRoidEqualTo(Integer value) {
            addCriterion("roId =", value, "roid");
            return (Criteria) this;
        }

        public Criteria andRoidNotEqualTo(Integer value) {
            addCriterion("roId <>", value, "roid");
            return (Criteria) this;
        }

        public Criteria andRoidGreaterThan(Integer value) {
            addCriterion("roId >", value, "roid");
            return (Criteria) this;
        }

        public Criteria andRoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("roId >=", value, "roid");
            return (Criteria) this;
        }

        public Criteria andRoidLessThan(Integer value) {
            addCriterion("roId <", value, "roid");
            return (Criteria) this;
        }

        public Criteria andRoidLessThanOrEqualTo(Integer value) {
            addCriterion("roId <=", value, "roid");
            return (Criteria) this;
        }

        public Criteria andRoidIn(List<Integer> values) {
            addCriterion("roId in", values, "roid");
            return (Criteria) this;
        }

        public Criteria andRoidNotIn(List<Integer> values) {
            addCriterion("roId not in", values, "roid");
            return (Criteria) this;
        }

        public Criteria andRoidBetween(Integer value1, Integer value2) {
            addCriterion("roId between", value1, value2, "roid");
            return (Criteria) this;
        }

        public Criteria andRoidNotBetween(Integer value1, Integer value2) {
            addCriterion("roId not between", value1, value2, "roid");
            return (Criteria) this;
        }

        public Criteria andRonameIsNull() {
            addCriterion("roName is null");
            return (Criteria) this;
        }

        public Criteria andRonameIsNotNull() {
            addCriterion("roName is not null");
            return (Criteria) this;
        }

        public Criteria andRonameEqualTo(String value) {
            addCriterion("roName =", value, "roname");
            return (Criteria) this;
        }

        public Criteria andRonameNotEqualTo(String value) {
            addCriterion("roName <>", value, "roname");
            return (Criteria) this;
        }

        public Criteria andRonameGreaterThan(String value) {
            addCriterion("roName >", value, "roname");
            return (Criteria) this;
        }

        public Criteria andRonameGreaterThanOrEqualTo(String value) {
            addCriterion("roName >=", value, "roname");
            return (Criteria) this;
        }

        public Criteria andRonameLessThan(String value) {
            addCriterion("roName <", value, "roname");
            return (Criteria) this;
        }

        public Criteria andRonameLessThanOrEqualTo(String value) {
            addCriterion("roName <=", value, "roname");
            return (Criteria) this;
        }

        public Criteria andRonameLike(String value) {
            addCriterion("roName like", value, "roname");
            return (Criteria) this;
        }

        public Criteria andRonameNotLike(String value) {
            addCriterion("roName not like", value, "roname");
            return (Criteria) this;
        }

        public Criteria andRonameIn(List<String> values) {
            addCriterion("roName in", values, "roname");
            return (Criteria) this;
        }

        public Criteria andRonameNotIn(List<String> values) {
            addCriterion("roName not in", values, "roname");
            return (Criteria) this;
        }

        public Criteria andRonameBetween(String value1, String value2) {
            addCriterion("roName between", value1, value2, "roname");
            return (Criteria) this;
        }

        public Criteria andRonameNotBetween(String value1, String value2) {
            addCriterion("roName not between", value1, value2, "roname");
            return (Criteria) this;
        }

        public Criteria andRonumberIsNull() {
            addCriterion("roNumber is null");
            return (Criteria) this;
        }

        public Criteria andRonumberIsNotNull() {
            addCriterion("roNumber is not null");
            return (Criteria) this;
        }

        public Criteria andRonumberEqualTo(Integer value) {
            addCriterion("roNumber =", value, "ronumber");
            return (Criteria) this;
        }

        public Criteria andRonumberNotEqualTo(Integer value) {
            addCriterion("roNumber <>", value, "ronumber");
            return (Criteria) this;
        }

        public Criteria andRonumberGreaterThan(Integer value) {
            addCriterion("roNumber >", value, "ronumber");
            return (Criteria) this;
        }

        public Criteria andRonumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("roNumber >=", value, "ronumber");
            return (Criteria) this;
        }

        public Criteria andRonumberLessThan(Integer value) {
            addCriterion("roNumber <", value, "ronumber");
            return (Criteria) this;
        }

        public Criteria andRonumberLessThanOrEqualTo(Integer value) {
            addCriterion("roNumber <=", value, "ronumber");
            return (Criteria) this;
        }

        public Criteria andRonumberIn(List<Integer> values) {
            addCriterion("roNumber in", values, "ronumber");
            return (Criteria) this;
        }

        public Criteria andRonumberNotIn(List<Integer> values) {
            addCriterion("roNumber not in", values, "ronumber");
            return (Criteria) this;
        }

        public Criteria andRonumberBetween(Integer value1, Integer value2) {
            addCriterion("roNumber between", value1, value2, "ronumber");
            return (Criteria) this;
        }

        public Criteria andRonumberNotBetween(Integer value1, Integer value2) {
            addCriterion("roNumber not between", value1, value2, "ronumber");
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