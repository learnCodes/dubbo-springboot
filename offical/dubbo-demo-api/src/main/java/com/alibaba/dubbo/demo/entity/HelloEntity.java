package com.alibaba.dubbo.demo.entity;

import java.io.Serializable;

public class HelloEntity implements Serializable{
	private static final long serialVersionUID = 1L;
    private int port;
    private String message;
    private String ip;
	/**
	 * @return the port
	 */
	public int getPort() {
		return port;
	}
	/**
	 * @return the ip
	 */
	public String getIp() {
		return ip;
	}
	/**
	 * @param ip the ip to set
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @param port the port to set
	 */
	public void setPort(int port) {
		this.port = port;
	}
}