package com.tz.order.domain;

/**
 * @author tanjianjun
 * @create 2018-12-26 15:26
 */
public class Line {
    private Integer id;
    private String type;
    private String from;
    private String to;
    private String name;
    private Boolean marked;
    private Integer activitiId;

    public Line(String type, String from, String to, String name, Boolean marked) {
        this.type = type;
        this.from = from;
        this.to = to;
        this.name = name;
        this.marked = marked;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getMarked() {
        return marked;
    }

    public void setMarked(Boolean marked) {
        this.marked = marked;
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
