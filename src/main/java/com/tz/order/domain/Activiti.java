package com.tz.order.domain;

import java.sql.Timestamp;

/**
 * @author tanjianjun
 * @create 2018-12-26 20:44
 */
public class Activiti {
    private Integer id;
    private String title;
    private String content;
    private Timestamp createTime;
    private Timestamp updateTime;

    public Activiti(Integer id, String title, String content, Timestamp createTime, Timestamp updateTime) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Activiti(String title, String content) {
        this.title = title;
        this.content=content;
    }
    public Activiti() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
