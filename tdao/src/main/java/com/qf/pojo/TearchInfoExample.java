package com.qf.pojo;

import java.util.ArrayList;
import java.util.List;

public class TearchInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TearchInfoExample() {
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

        public Criteria andTearchidIsNull() {
            addCriterion("tearchId is null");
            return (Criteria) this;
        }

        public Criteria andTearchidIsNotNull() {
            addCriterion("tearchId is not null");
            return (Criteria) this;
        }

        public Criteria andTearchidEqualTo(Integer value) {
            addCriterion("tearchId =", value, "tearchid");
            return (Criteria) this;
        }

        public Criteria andTearchidNotEqualTo(Integer value) {
            addCriterion("tearchId <>", value, "tearchid");
            return (Criteria) this;
        }

        public Criteria andTearchidGreaterThan(Integer value) {
            addCriterion("tearchId >", value, "tearchid");
            return (Criteria) this;
        }

        public Criteria andTearchidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tearchId >=", value, "tearchid");
            return (Criteria) this;
        }

        public Criteria andTearchidLessThan(Integer value) {
            addCriterion("tearchId <", value, "tearchid");
            return (Criteria) this;
        }

        public Criteria andTearchidLessThanOrEqualTo(Integer value) {
            addCriterion("tearchId <=", value, "tearchid");
            return (Criteria) this;
        }

        public Criteria andTearchidIn(List<Integer> values) {
            addCriterion("tearchId in", values, "tearchid");
            return (Criteria) this;
        }

        public Criteria andTearchidNotIn(List<Integer> values) {
            addCriterion("tearchId not in", values, "tearchid");
            return (Criteria) this;
        }

        public Criteria andTearchidBetween(Integer value1, Integer value2) {
            addCriterion("tearchId between", value1, value2, "tearchid");
            return (Criteria) this;
        }

        public Criteria andTearchidNotBetween(Integer value1, Integer value2) {
            addCriterion("tearchId not between", value1, value2, "tearchid");
            return (Criteria) this;
        }

        public Criteria andTearchnameIsNull() {
            addCriterion("tearchName is null");
            return (Criteria) this;
        }

        public Criteria andTearchnameIsNotNull() {
            addCriterion("tearchName is not null");
            return (Criteria) this;
        }

        public Criteria andTearchnameEqualTo(String value) {
            addCriterion("tearchName =", value, "tearchname");
            return (Criteria) this;
        }

        public Criteria andTearchnameNotEqualTo(String value) {
            addCriterion("tearchName <>", value, "tearchname");
            return (Criteria) this;
        }

        public Criteria andTearchnameGreaterThan(String value) {
            addCriterion("tearchName >", value, "tearchname");
            return (Criteria) this;
        }

        public Criteria andTearchnameGreaterThanOrEqualTo(String value) {
            addCriterion("tearchName >=", value, "tearchname");
            return (Criteria) this;
        }

        public Criteria andTearchnameLessThan(String value) {
            addCriterion("tearchName <", value, "tearchname");
            return (Criteria) this;
        }

        public Criteria andTearchnameLessThanOrEqualTo(String value) {
            addCriterion("tearchName <=", value, "tearchname");
            return (Criteria) this;
        }

        public Criteria andTearchnameLike(String value) {
            addCriterion("tearchName like", value, "tearchname");
            return (Criteria) this;
        }

        public Criteria andTearchnameNotLike(String value) {
            addCriterion("tearchName not like", value, "tearchname");
            return (Criteria) this;
        }

        public Criteria andTearchnameIn(List<String> values) {
            addCriterion("tearchName in", values, "tearchname");
            return (Criteria) this;
        }

        public Criteria andTearchnameNotIn(List<String> values) {
            addCriterion("tearchName not in", values, "tearchname");
            return (Criteria) this;
        }

        public Criteria andTearchnameBetween(String value1, String value2) {
            addCriterion("tearchName between", value1, value2, "tearchname");
            return (Criteria) this;
        }

        public Criteria andTearchnameNotBetween(String value1, String value2) {
            addCriterion("tearchName not between", value1, value2, "tearchname");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNull() {
            addCriterion("subject is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNotNull() {
            addCriterion("subject is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectEqualTo(String value) {
            addCriterion("subject =", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotEqualTo(String value) {
            addCriterion("subject <>", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThan(String value) {
            addCriterion("subject >", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("subject >=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThan(String value) {
            addCriterion("subject <", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThanOrEqualTo(String value) {
            addCriterion("subject <=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLike(String value) {
            addCriterion("subject like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotLike(String value) {
            addCriterion("subject not like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectIn(List<String> values) {
            addCriterion("subject in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotIn(List<String> values) {
            addCriterion("subject not in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectBetween(String value1, String value2) {
            addCriterion("subject between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotBetween(String value1, String value2) {
            addCriterion("subject not between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andXbnameIsNull() {
            addCriterion("xbName is null");
            return (Criteria) this;
        }

        public Criteria andXbnameIsNotNull() {
            addCriterion("xbName is not null");
            return (Criteria) this;
        }

        public Criteria andXbnameEqualTo(String value) {
            addCriterion("xbName =", value, "xbname");
            return (Criteria) this;
        }

        public Criteria andXbnameNotEqualTo(String value) {
            addCriterion("xbName <>", value, "xbname");
            return (Criteria) this;
        }

        public Criteria andXbnameGreaterThan(String value) {
            addCriterion("xbName >", value, "xbname");
            return (Criteria) this;
        }

        public Criteria andXbnameGreaterThanOrEqualTo(String value) {
            addCriterion("xbName >=", value, "xbname");
            return (Criteria) this;
        }

        public Criteria andXbnameLessThan(String value) {
            addCriterion("xbName <", value, "xbname");
            return (Criteria) this;
        }

        public Criteria andXbnameLessThanOrEqualTo(String value) {
            addCriterion("xbName <=", value, "xbname");
            return (Criteria) this;
        }

        public Criteria andXbnameLike(String value) {
            addCriterion("xbName like", value, "xbname");
            return (Criteria) this;
        }

        public Criteria andXbnameNotLike(String value) {
            addCriterion("xbName not like", value, "xbname");
            return (Criteria) this;
        }

        public Criteria andXbnameIn(List<String> values) {
            addCriterion("xbName in", values, "xbname");
            return (Criteria) this;
        }

        public Criteria andXbnameNotIn(List<String> values) {
            addCriterion("xbName not in", values, "xbname");
            return (Criteria) this;
        }

        public Criteria andXbnameBetween(String value1, String value2) {
            addCriterion("xbName between", value1, value2, "xbname");
            return (Criteria) this;
        }

        public Criteria andXbnameNotBetween(String value1, String value2) {
            addCriterion("xbName not between", value1, value2, "xbname");
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