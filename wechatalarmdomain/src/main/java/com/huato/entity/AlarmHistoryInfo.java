package com.huato.entity;

import java.io.Serializable;
import java.util.Date;

/**
* @Description：报警历史记录类
* @Author： dengyu
* @Create in： 2018/5/3,17:03
*/
public class AlarmHistoryInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer hid;

    private String touser;

    private String templateId;

    private String url;

    private String miniprogramAppid;

    private String miniprogramPagepath;

    private String firstValue;

    private String firstColor;

    private String keyword1Value;

    private String keyword1Color;

    private String keyword2Value;

    private String keyword2Color;

    private String keyword3Value;

    private String keyword3Color;

    private String remarkValue;

    private String remarkColor;

    private Date sendtime;

    private Integer wid;

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public String getTouser() {
        return touser;
    }

    public void setTouser(String touser) {
        this.touser = touser;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMiniprogramAppid() {
        return miniprogramAppid;
    }

    public void setMiniprogramAppid(String miniprogramAppid) {
        this.miniprogramAppid = miniprogramAppid;
    }

    public String getMiniprogramPagepath() {
        return miniprogramPagepath;
    }

    public void setMiniprogramPagepath(String miniprogramPagepath) {
        this.miniprogramPagepath = miniprogramPagepath;
    }

    public String getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(String firstValue) {
        this.firstValue = firstValue;
    }

    public String getFirstColor() {
        return firstColor;
    }

    public void setFirstColor(String firstColor) {
        this.firstColor = firstColor;
    }

    public String getKeyword1Value() {
        return keyword1Value;
    }

    public void setKeyword1Value(String keyword1Value) {
        this.keyword1Value = keyword1Value;
    }

    public String getKeyword1Color() {
        return keyword1Color;
    }

    public void setKeyword1Color(String keyword1Color) {
        this.keyword1Color = keyword1Color;
    }

    public String getKeyword2Value() {
        return keyword2Value;
    }

    public void setKeyword2Value(String keyword2Value) {
        this.keyword2Value = keyword2Value;
    }

    public String getKeyword2Color() {
        return keyword2Color;
    }

    public void setKeyword2Color(String keyword2Color) {
        this.keyword2Color = keyword2Color;
    }

    public String getKeyword3Value() {
        return keyword3Value;
    }

    public void setKeyword3Value(String keyword3Value) {
        this.keyword3Value = keyword3Value;
    }

    public String getKeyword3Color() {
        return keyword3Color;
    }

    public void setKeyword3Color(String keyword3Color) {
        this.keyword3Color = keyword3Color;
    }

    public String getRemarkValue() {
        return remarkValue;
    }

    public void setRemarkValue(String remarkValue) {
        this.remarkValue = remarkValue;
    }

    public String getRemarkColor() {
        return remarkColor;
    }

    public void setRemarkColor(String remarkColor) {
        this.remarkColor = remarkColor;
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }
}