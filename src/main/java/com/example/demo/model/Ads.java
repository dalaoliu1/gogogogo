package com.example.demo.model;

public class Ads {
	private int adId;
	private String name;
	private String contect;
	public int getAdId() {
		return adId;
	}
	public void setAdId(int adId) {
		this.adId = adId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContect() {
		return contect;
	}
	public void setContect(String contect) {
		this.contect = contect;
	}
	@Override
	public String toString() {
		return "Ads [adId=" + adId + ", name=" + name + ", contect=" + contect + ", getAdId()=" + getAdId()
				+ ", getName()=" + getName() + ", getContect()=" + getContect() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}