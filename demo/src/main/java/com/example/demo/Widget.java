package com.example.demo;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Widget implements Serializable{

	private static final long serialVersionUID = 1L;

	private List<Item> widgets;

	public Widget(){
	}
	public Widget(List<Item> widgets){
		this.widgets = widgets;
	}

	public List<Item> getWidgets() {
		return widgets;
	}
	public void setWidgets(List<Item> widgets) {
		this.widgets = widgets;
	}
}