package com.example.demo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Item implements Serializable{

	private static final long serialVersionUID = 1L;

	private String name;
	private String url;

	public Item(){
	}
	public Item(String name, String url){
		this.name = name;
		this.url = url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}