package com.scc.onlinedogshow.template;

import java.util.Map;

public class BreedObject {

	private int id;
	private String fciNumber;
	private Map<String, Object> name;
	private Map<String, Object> color;
	private Map<String, Object> variety;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFciNumber() {
		return fciNumber;
	}
	public void setFciNumber(String fciNumber) {
		this.fciNumber = fciNumber;
	}
	public Map<String, Object> getName() {
		return name;
	}
	public void setName(Map<String, Object> name) {
		this.name = name;
	}
	public Map<String, Object> getColor() {
		return color;
	}
	public void setColor(Map<String, Object> color) {
		this.color = color;
	}
	public Map<String, Object> getVariety() {
		return variety;
	}
	public void setVariety(Map<String, Object> variety) {
		this.variety = variety;
	}
	
}
