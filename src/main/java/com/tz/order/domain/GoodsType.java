package com.tz.order.domain;
/**
 * @author tanjianjun
 * @create 2018-11-15 16:28
 */
public class GoodsType {
    private Integer id;

    private String name;

    private Integer sellerId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }
}