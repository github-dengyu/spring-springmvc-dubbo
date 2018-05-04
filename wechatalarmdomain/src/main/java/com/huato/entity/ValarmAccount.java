package com.huato.entity;

import java.io.Serializable;

/**
* @Description：报警条数监控类
* @Author： dengyu
* @Create in： 2018/5/3,17:03
*/
public class ValarmAccount implements Serializable {
	private static final long serialVersionUID = 1L;
    /**
    * @Description：
    * @Param wid
    * @Create in： 2018/5/3,17:01
    * @Return
    */
	private Integer wid;
    /**
    * @Description：当天的报警总条数
    * @Param  wid
    * @Create in： 2018/5/3,17:01
    * @Return
    */
    private Integer totalalarm;

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public Integer getTotalalarm() {
        return totalalarm;
    }

    public void setTotalalarm(Integer totalalarm) {
        this.totalalarm = totalalarm;
    }
}