package com.tz.order.domain;

/**
 * @author tanjianjun
 * @create 2018-12-26 14:35
 */
public class Area {
    private Integer id;
    private String name;
    private String color;
    private Integer left;
    private Integer top;
    private Integer width;
    private Integer height;
    private Integer activitiId;


    public Area(String name, String color, Integer left, Integer top, Integer width, Integer height) {
        this.name = name;
        this.color = color;
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getTop() {
        return top;
    }

    public void setTop(Integer top) {
        this.top = top;
    }

    public Integer getLeft() {
        return left;
    }

    public void setLeft(Integer left) {
        this.left = left;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivitiId() {
        return activitiId;
    }

    public void setActivitiId(Integer activitiId) {
        this.activitiId = activitiId;
    }
}
