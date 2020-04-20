package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	private List<Widget> widgetList = new ArrayList<Widget>();
	private List<Item> ItemList = new ArrayList<Item>();

	DemoController(){
		ItemList.add(new Item("ミニアプリ1", "https://widget-demo-miniprogram.web.app"));
		ItemList.add(new Item("ミニアプリ2", "https://widget-demo-miniprogram.web.app"));
		ItemList.add(new Item("ミニアプリ3", "https://widget-demo-miniprogram.web.app"));
		widgetList.add(new Widget(ItemList));
	}

	@RequestMapping(value = "/")
	public Widget widget (){
		return this.widgetList.get(0);
	}
}