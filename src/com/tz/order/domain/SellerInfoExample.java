package com.tz.order.domain;

import java.util.ArrayList;
import java.util.List;

public class SellerInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SellerInfoExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDescIsNull() {
            addCriterion("desc is null");
            return (Criteria) this;
        }

        public Criteria andDescIsNotNull() {
            addCriterion("desc is not null");
            return (Criteria) this;
        }

        public Criteria andDescEqualTo(String value) {
            addCriterion("desc =", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotEqualTo(String value) {
            addCriterion("desc <>", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThan(String value) {
            addCriterion("desc >", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThanOrEqualTo(String value) {
            addCriterion("desc >=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThan(String value) {
            addCriterion("desc <", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThanOrEqualTo(String value) {
            addCriterion("desc <=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLike(String value) {
            addCriterion("desc like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotLike(String value) {
            addCriterion("desc not like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescIn(List<String> values) {
            addCriterion("desc in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotIn(List<String> values) {
            addCriterion("desc not in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescBetween(String value1, String value2) {
            addCriterion("desc between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotBetween(String value1, String value2) {
            addCriterion("desc not between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIsNull() {
            addCriterion("delivery_time is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIsNotNull() {
            addCriterion("delivery_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeEqualTo(String value) {
            addCriterion("delivery_time =", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotEqualTo(String value) {
            addCriterion("delivery_time <>", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeGreaterThan(String value) {
            addCriterion("delivery_time >", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_time >=", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLessThan(String value) {
            addCriterion("delivery_time <", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLessThanOrEqualTo(String value) {
            addCriterion("delivery_time <=", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLike(String value) {
            addCriterion("delivery_time like", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotLike(String value) {
            addCriterion("delivery_time not like", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIn(List<String> values) {
            addCriterion("delivery_time in", values, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotIn(List<String> values) {
            addCriterion("delivery_time not in", values, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeBetween(String value1, String value2) {
            addCriterion("delivery_time between", value1, value2, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotBetween(String value1, String value2) {
            addCriterion("delivery_time not between", value1, value2, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Double value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Double value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Double value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Double value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Double value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Double> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Double> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Double value1, Double value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Double value1, Double value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andServiceScoreIsNull() {
            addCriterion("service_score is null");
            return (Criteria) this;
        }

        public Criteria andServiceScoreIsNotNull() {
            addCriterion("service_score is not null");
            return (Criteria) this;
        }

        public Criteria andServiceScoreEqualTo(Double value) {
            addCriterion("service_score =", value, "serviceScore");
            return (Criteria) this;
        }

        public Criteria andServiceScoreNotEqualTo(Double value) {
            addCriterion("service_score <>", value, "serviceScore");
            return (Criteria) this;
        }

        public Criteria andServiceScoreGreaterThan(Double value) {
            addCriterion("service_score >", value, "serviceScore");
            return (Criteria) this;
        }

        public Criteria andServiceScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("service_score >=", value, "serviceScore");
            return (Criteria) this;
        }

        public Criteria andServiceScoreLessThan(Double value) {
            addCriterion("service_score <", value, "serviceScore");
            return (Criteria) this;
        }

        public Criteria andServiceScoreLessThanOrEqualTo(Double value) {
            addCriterion("service_score <=", value, "serviceScore");
            return (Criteria) this;
        }

        public Criteria andServiceScoreIn(List<Double> values) {
            addCriterion("service_score in", values, "serviceScore");
            return (Criteria) this;
        }

        public Criteria andServiceScoreNotIn(List<Double> values) {
            addCriterion("service_score not in", values, "serviceScore");
            return (Criteria) this;
        }

        public Criteria andServiceScoreBetween(Double value1, Double value2) {
            addCriterion("service_score between", value1, value2, "serviceScore");
            return (Criteria) this;
        }

        public Criteria andServiceScoreNotBetween(Double value1, Double value2) {
            addCriterion("service_score not between", value1, value2, "serviceScore");
            return (Criteria) this;
        }

        public Criteria andFoodScoreIsNull() {
            addCriterion("food_score is null");
            return (Criteria) this;
        }

        public Criteria andFoodScoreIsNotNull() {
            addCriterion("food_score is not null");
            return (Criteria) this;
        }

        public Criteria andFoodScoreEqualTo(Double value) {
            addCriterion("food_score =", value, "foodScore");
            return (Criteria) this;
        }

        public Criteria andFoodScoreNotEqualTo(Double value) {
            addCriterion("food_score <>", value, "foodScore");
            return (Criteria) this;
        }

        public Criteria andFoodScoreGreaterThan(Double value) {
            addCriterion("food_score >", value, "foodScore");
            return (Criteria) this;
        }

        public Criteria andFoodScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("food_score >=", value, "foodScore");
            return (Criteria) this;
        }

        public Criteria andFoodScoreLessThan(Double value) {
            addCriterion("food_score <", value, "foodScore");
            return (Criteria) this;
        }

        public Criteria andFoodScoreLessThanOrEqualTo(Double value) {
            addCriterion("food_score <=", value, "foodScore");
            return (Criteria) this;
        }

        public Criteria andFoodScoreIn(List<Double> values) {
            addCriterion("food_score in", values, "foodScore");
            return (Criteria) this;
        }

        public Criteria andFoodScoreNotIn(List<Double> values) {
            addCriterion("food_score not in", values, "foodScore");
            return (Criteria) this;
        }

        public Criteria andFoodScoreBetween(Double value1, Double value2) {
            addCriterion("food_score between", value1, value2, "foodScore");
            return (Criteria) this;
        }

        public Criteria andFoodScoreNotBetween(Double value1, Double value2) {
            addCriterion("food_score not between", value1, value2, "foodScore");
            return (Criteria) this;
        }

        public Criteria andRankRateIsNull() {
            addCriterion("rank_rate is null");
            return (Criteria) this;
        }

        public Criteria andRankRateIsNotNull() {
            addCriterion("rank_rate is not null");
            return (Criteria) this;
        }

        public Criteria andRankRateEqualTo(Double value) {
            addCriterion("rank_rate =", value, "rankRate");
            return (Criteria) this;
        }

        public Criteria andRankRateNotEqualTo(Double value) {
            addCriterion("rank_rate <>", value, "rankRate");
            return (Criteria) this;
        }

        public Criteria andRankRateGreaterThan(Double value) {
            addCriterion("rank_rate >", value, "rankRate");
            return (Criteria) this;
        }

        public Criteria andRankRateGreaterThanOrEqualTo(Double value) {
            addCriterion("rank_rate >=", value, "rankRate");
            return (Criteria) this;
        }

        public Criteria andRankRateLessThan(Double value) {
            addCriterion("rank_rate <", value, "rankRate");
            return (Criteria) this;
        }

        public Criteria andRankRateLessThanOrEqualTo(Double value) {
            addCriterion("rank_rate <=", value, "rankRate");
            return (Criteria) this;
        }

        public Criteria andRankRateIn(List<Double> values) {
            addCriterion("rank_rate in", values, "rankRate");
            return (Criteria) this;
        }

        public Criteria andRankRateNotIn(List<Double> values) {
            addCriterion("rank_rate not in", values, "rankRate");
            return (Criteria) this;
        }

        public Criteria andRankRateBetween(Double value1, Double value2) {
            addCriterion("rank_rate between", value1, value2, "rankRate");
            return (Criteria) this;
        }

        public Criteria andRankRateNotBetween(Double value1, Double value2) {
            addCriterion("rank_rate not between", value1, value2, "rankRate");
            return (Criteria) this;
        }

        public Criteria andMinPriceIsNull() {
            addCriterion("min_price is null");
            return (Criteria) this;
        }

        public Criteria andMinPriceIsNotNull() {
            addCriterion("min_price is not null");
            return (Criteria) this;
        }

        public Criteria andMinPriceEqualTo(Double value) {
            addCriterion("min_price =", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceNotEqualTo(Double value) {
            addCriterion("min_price <>", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceGreaterThan(Double value) {
            addCriterion("min_price >", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("min_price >=", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceLessThan(Double value) {
            addCriterion("min_price <", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceLessThanOrEqualTo(Double value) {
            addCriterion("min_price <=", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceIn(List<Double> values) {
            addCriterion("min_price in", values, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceNotIn(List<Double> values) {
            addCriterion("min_price not in", values, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceBetween(Double value1, Double value2) {
            addCriterion("min_price between", value1, value2, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceNotBetween(Double value1, Double value2) {
            addCriterion("min_price not between", value1, value2, "minPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceIsNull() {
            addCriterion("delivery_price is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceIsNotNull() {
            addCriterion("delivery_price is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceEqualTo(Double value) {
            addCriterion("delivery_price =", value, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceNotEqualTo(Double value) {
            addCriterion("delivery_price <>", value, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceGreaterThan(Double value) {
            addCriterion("delivery_price >", value, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("delivery_price >=", value, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceLessThan(Double value) {
            addCriterion("delivery_price <", value, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceLessThanOrEqualTo(Double value) {
            addCriterion("delivery_price <=", value, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceIn(List<Double> values) {
            addCriterion("delivery_price in", values, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceNotIn(List<Double> values) {
            addCriterion("delivery_price not in", values, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceBetween(Double value1, Double value2) {
            addCriterion("delivery_price between", value1, value2, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceNotBetween(Double value1, Double value2) {
            addCriterion("delivery_price not between", value1, value2, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andRatingCountIsNull() {
            addCriterion("rating_count is null");
            return (Criteria) this;
        }

        public Criteria andRatingCountIsNotNull() {
            addCriterion("rating_count is not null");
            return (Criteria) this;
        }

        public Criteria andRatingCountEqualTo(Integer value) {
            addCriterion("rating_count =", value, "ratingCount");
            return (Criteria) this;
        }

        public Criteria andRatingCountNotEqualTo(Integer value) {
            addCriterion("rating_count <>", value, "ratingCount");
            return (Criteria) this;
        }

        public Criteria andRatingCountGreaterThan(Integer value) {
            addCriterion("rating_count >", value, "ratingCount");
            return (Criteria) this;
        }

        public Criteria andRatingCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("rating_count >=", value, "ratingCount");
            return (Criteria) this;
        }

        public Criteria andRatingCountLessThan(Integer value) {
            addCriterion("rating_count <", value, "ratingCount");
            return (Criteria) this;
        }

        public Criteria andRatingCountLessThanOrEqualTo(Integer value) {
            addCriterion("rating_count <=", value, "ratingCount");
            return (Criteria) this;
        }

        public Criteria andRatingCountIn(List<Integer> values) {
            addCriterion("rating_count in", values, "ratingCount");
            return (Criteria) this;
        }

        public Criteria andRatingCountNotIn(List<Integer> values) {
            addCriterion("rating_count not in", values, "ratingCount");
            return (Criteria) this;
        }

        public Criteria andRatingCountBetween(Integer value1, Integer value2) {
            addCriterion("rating_count between", value1, value2, "ratingCount");
            return (Criteria) this;
        }

        public Criteria andRatingCountNotBetween(Integer value1, Integer value2) {
            addCriterion("rating_count not between", value1, value2, "ratingCount");
            return (Criteria) this;
        }

        public Criteria andSellCountIsNull() {
            addCriterion("sell_count is null");
            return (Criteria) this;
        }

        public Criteria andSellCountIsNotNull() {
            addCriterion("sell_count is not null");
            return (Criteria) this;
        }

        public Criteria andSellCountEqualTo(Integer value) {
            addCriterion("sell_count =", value, "sellCount");
            return (Criteria) this;
        }

        public Criteria andSellCountNotEqualTo(Integer value) {
            addCriterion("sell_count <>", value, "sellCount");
            return (Criteria) this;
        }

        public Criteria andSellCountGreaterThan(Integer value) {
            addCriterion("sell_count >", value, "sellCount");
            return (Criteria) this;
        }

        public Criteria andSellCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("sell_count >=", value, "sellCount");
            return (Criteria) this;
        }

        public Criteria andSellCountLessThan(Integer value) {
            addCriterion("sell_count <", value, "sellCount");
            return (Criteria) this;
        }

        public Criteria andSellCountLessThanOrEqualTo(Integer value) {
            addCriterion("sell_count <=", value, "sellCount");
            return (Criteria) this;
        }

        public Criteria andSellCountIn(List<Integer> values) {
            addCriterion("sell_count in", values, "sellCount");
            return (Criteria) this;
        }

        public Criteria andSellCountNotIn(List<Integer> values) {
            addCriterion("sell_count not in", values, "sellCount");
            return (Criteria) this;
        }

        public Criteria andSellCountBetween(Integer value1, Integer value2) {
            addCriterion("sell_count between", value1, value2, "sellCount");
            return (Criteria) this;
        }

        public Criteria andSellCountNotBetween(Integer value1, Integer value2) {
            addCriterion("sell_count not between", value1, value2, "sellCount");
            return (Criteria) this;
        }

        public Criteria andBulletinIsNull() {
            addCriterion("bulletin is null");
            return (Criteria) this;
        }

        public Criteria andBulletinIsNotNull() {
            addCriterion("bulletin is not null");
            return (Criteria) this;
        }

        public Criteria andBulletinEqualTo(String value) {
            addCriterion("bulletin =", value, "bulletin");
            return (Criteria) this;
        }

        public Criteria andBulletinNotEqualTo(String value) {
            addCriterion("bulletin <>", value, "bulletin");
            return (Criteria) this;
        }

        public Criteria andBulletinGreaterThan(String value) {
            addCriterion("bulletin >", value, "bulletin");
            return (Criteria) this;
        }

        public Criteria andBulletinGreaterThanOrEqualTo(String value) {
            addCriterion("bulletin >=", value, "bulletin");
            return (Criteria) this;
        }

        public Criteria andBulletinLessThan(String value) {
            addCriterion("bulletin <", value, "bulletin");
            return (Criteria) this;
        }

        public Criteria andBulletinLessThanOrEqualTo(String value) {
            addCriterion("bulletin <=", value, "bulletin");
            return (Criteria) this;
        }

        public Criteria andBulletinLike(String value) {
            addCriterion("bulletin like", value, "bulletin");
            return (Criteria) this;
        }

        public Criteria andBulletinNotLike(String value) {
            addCriterion("bulletin not like", value, "bulletin");
            return (Criteria) this;
        }

        public Criteria andBulletinIn(List<String> values) {
            addCriterion("bulletin in", values, "bulletin");
            return (Criteria) this;
        }

        public Criteria andBulletinNotIn(List<String> values) {
            addCriterion("bulletin not in", values, "bulletin");
            return (Criteria) this;
        }

        public Criteria andBulletinBetween(String value1, String value2) {
            addCriterion("bulletin between", value1, value2, "bulletin");
            return (Criteria) this;
        }

        public Criteria andBulletinNotBetween(String value1, String value2) {
            addCriterion("bulletin not between", value1, value2, "bulletin");
            return (Criteria) this;
        }

        public Criteria andSupportsIsNull() {
            addCriterion("supports is null");
            return (Criteria) this;
        }

        public Criteria andSupportsIsNotNull() {
            addCriterion("supports is not null");
            return (Criteria) this;
        }

        public Criteria andSupportsEqualTo(String value) {
            addCriterion("supports =", value, "supports");
            return (Criteria) this;
        }

        public Criteria andSupportsNotEqualTo(String value) {
            addCriterion("supports <>", value, "supports");
            return (Criteria) this;
        }

        public Criteria andSupportsGreaterThan(String value) {
            addCriterion("supports >", value, "supports");
            return (Criteria) this;
        }

        public Criteria andSupportsGreaterThanOrEqualTo(String value) {
            addCriterion("supports >=", value, "supports");
            return (Criteria) this;
        }

        public Criteria andSupportsLessThan(String value) {
            addCriterion("supports <", value, "supports");
            return (Criteria) this;
        }

        public Criteria andSupportsLessThanOrEqualTo(String value) {
            addCriterion("supports <=", value, "supports");
            return (Criteria) this;
        }

        public Criteria andSupportsLike(String value) {
            addCriterion("supports like", value, "supports");
            return (Criteria) this;
        }

        public Criteria andSupportsNotLike(String value) {
            addCriterion("supports not like", value, "supports");
            return (Criteria) this;
        }

        public Criteria andSupportsIn(List<String> values) {
            addCriterion("supports in", values, "supports");
            return (Criteria) this;
        }

        public Criteria andSupportsNotIn(List<String> values) {
            addCriterion("supports not in", values, "supports");
            return (Criteria) this;
        }

        public Criteria andSupportsBetween(String value1, String value2) {
            addCriterion("supports between", value1, value2, "supports");
            return (Criteria) this;
        }

        public Criteria andSupportsNotBetween(String value1, String value2) {
            addCriterion("supports not between", value1, value2, "supports");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNull() {
            addCriterion("avatar is null");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNotNull() {
            addCriterion("avatar is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarEqualTo(String value) {
            addCriterion("avatar =", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotEqualTo(String value) {
            addCriterion("avatar <>", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThan(String value) {
            addCriterion("avatar >", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("avatar >=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThan(String value) {
            addCriterion("avatar <", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThanOrEqualTo(String value) {
            addCriterion("avatar <=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLike(String value) {
            addCriterion("avatar like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotLike(String value) {
            addCriterion("avatar not like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarIn(List<String> values) {
            addCriterion("avatar in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotIn(List<String> values) {
            addCriterion("avatar not in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarBetween(String value1, String value2) {
            addCriterion("avatar between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotBetween(String value1, String value2) {
            addCriterion("avatar not between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andPicsIsNull() {
            addCriterion("pics is null");
            return (Criteria) this;
        }

        public Criteria andPicsIsNotNull() {
            addCriterion("pics is not null");
            return (Criteria) this;
        }

        public Criteria andPicsEqualTo(String value) {
            addCriterion("pics =", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsNotEqualTo(String value) {
            addCriterion("pics <>", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsGreaterThan(String value) {
            addCriterion("pics >", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsGreaterThanOrEqualTo(String value) {
            addCriterion("pics >=", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsLessThan(String value) {
            addCriterion("pics <", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsLessThanOrEqualTo(String value) {
            addCriterion("pics <=", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsLike(String value) {
            addCriterion("pics like", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsNotLike(String value) {
            addCriterion("pics not like", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsIn(List<String> values) {
            addCriterion("pics in", values, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsNotIn(List<String> values) {
            addCriterion("pics not in", values, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsBetween(String value1, String value2) {
            addCriterion("pics between", value1, value2, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsNotBetween(String value1, String value2) {
            addCriterion("pics not between", value1, value2, "pics");
            return (Criteria) this;
        }

        public Criteria andInfosIsNull() {
            addCriterion("infos is null");
            return (Criteria) this;
        }

        public Criteria andInfosIsNotNull() {
            addCriterion("infos is not null");
            return (Criteria) this;
        }

        public Criteria andInfosEqualTo(String value) {
            addCriterion("infos =", value, "infos");
            return (Criteria) this;
        }

        public Criteria andInfosNotEqualTo(String value) {
            addCriterion("infos <>", value, "infos");
            return (Criteria) this;
        }

        public Criteria andInfosGreaterThan(String value) {
            addCriterion("infos >", value, "infos");
            return (Criteria) this;
        }

        public Criteria andInfosGreaterThanOrEqualTo(String value) {
            addCriterion("infos >=", value, "infos");
            return (Criteria) this;
        }

        public Criteria andInfosLessThan(String value) {
            addCriterion("infos <", value, "infos");
            return (Criteria) this;
        }

        public Criteria andInfosLessThanOrEqualTo(String value) {
            addCriterion("infos <=", value, "infos");
            return (Criteria) this;
        }

        public Criteria andInfosLike(String value) {
            addCriterion("infos like", value, "infos");
            return (Criteria) this;
        }

        public Criteria andInfosNotLike(String value) {
            addCriterion("infos not like", value, "infos");
            return (Criteria) this;
        }

        public Criteria andInfosIn(List<String> values) {
            addCriterion("infos in", values, "infos");
            return (Criteria) this;
        }

        public Criteria andInfosNotIn(List<String> values) {
            addCriterion("infos not in", values, "infos");
            return (Criteria) this;
        }

        public Criteria andInfosBetween(String value1, String value2) {
            addCriterion("infos between", value1, value2, "infos");
            return (Criteria) this;
        }

        public Criteria andInfosNotBetween(String value1, String value2) {
            addCriterion("infos not between", value1, value2, "infos");
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