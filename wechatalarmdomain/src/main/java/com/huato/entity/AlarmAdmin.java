package com.huato.entity;

import java.io.Serializable;

/**
* @Description：报警管理类
* @Author： dengyu
* @Create in： 2018/5/3,17:00
*/
public class AlarmAdmin implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer aid;

    private String touser;

    private Integer wid;

    private String name;

    private String phone;

    private String templateId;

    private Integer threshold;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid( Integer aid ) {
        this.aid = aid;
    }

    public String getTouser() {
        return touser;
    }

    public void setTouser( String touser ) {
        this.touser = touser;
    }

    public Integer getWid() {
        return wid;
    }

    public void setWid( Integer wid ) {
        this.wid = wid;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone( String phone ) {
        this.phone = phone;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId( String templateId ) {
        this.templateId = templateId;
    }

    public Integer getThreshold() {
        return threshold;
    }

    public void setThreshold( Integer threshold ) {
        this.threshold = threshold;
    }
}