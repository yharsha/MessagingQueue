package com.rabbitmq.rabbitmqdemo;

import java.io.Serializable;

public class SimpleMessage implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String description;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public SimpleMessage() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	

}
