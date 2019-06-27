package com.tz.order.domain;

/**
 * @author tanjianjun
 * @create 2018-12-26 14:35
 */
public class Node {
    private Integer id;
    private String key;
    private String name;
    private String type;
    private Integer left;
    private Integer top;
    private Integer width;
    private Integer height;
    private Integer activitiId;


    public Node(String key,String name, String type, Integer left, Integer top, Integer width, Integer height) {
        this.key=key;
        this.name = name;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
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
