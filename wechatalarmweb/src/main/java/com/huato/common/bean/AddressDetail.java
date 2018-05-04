package com.huato.common.bean;

/**
* @Description：IP所在区域地址类
* @Author： dengyu
* @Create in： 2018/5/3,16:42
*/
public class AddressDetail {

	private String province;

	private String city;

	private String street;

	private String district;

	private String streetNumber;

	private int cityCode;

	public String getProvince() {
		return province;
	}

	public void setProvince( String province ) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity( String city ) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet( String street ) {
		this.street = street;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict( String district ) {
		this.district = district;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber( String streetNumber ) {
		this.streetNumber = streetNumber;
	}

	public int getCityCode() {
		return cityCode;
	}

	public void setCityCode( int cityCode ) {
		this.cityCode = cityCode;
	}
}
