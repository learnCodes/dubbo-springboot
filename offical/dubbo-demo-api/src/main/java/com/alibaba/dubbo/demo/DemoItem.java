package com.alibaba.dubbo.demo;

import java.io.Serializable;

public class DemoItem implements Serializable{
	private static final long serialVersionUID = -5947981585610509012L;
	private String mobile;
	private String address;
	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	public DemoItem(String mobile,String address){
		this.mobile = mobile;
		this.address = address;
	}
}