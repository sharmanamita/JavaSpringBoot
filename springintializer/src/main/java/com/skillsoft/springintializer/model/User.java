package com.skillsoft.springintializer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
	
	private String name; 
	private String blog; 
	private String type; 
	private String url; 
	
	public String getName() {
		return name;
	}
	
	public void setName(String value) {
		name = value;
	}
	
	public String getBlog() {
		return blog;
	}
	
	public void setBlog(String value) {
		blog = value;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String value) {
		type = value;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String value) {
		url = value;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getName() + " "+ getBlog() + " "+ getType() + " "+getUrl();
	}

}
