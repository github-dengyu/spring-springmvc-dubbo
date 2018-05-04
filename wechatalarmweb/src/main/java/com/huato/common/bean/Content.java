package com.huato.common.bean;
/**
* @Description：IP区域地址类
* @Author： dengyu
* @Create in： 2018/5/3,16:41
*/
public class Content {
	
	private AddressDetail addressDetail;

	private String address;

	private Point point;

	public AddressDetail getAddressDetail() {
		return addressDetail;
	}

	public void setAddressDetail( AddressDetail addressDetail ) {
		this.addressDetail = addressDetail;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress( String address ) {
		this.address = address;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint( Point point ) {
		this.point = point;
	}
}
