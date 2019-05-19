package com.autoBot.pages;

import org.openqa.selenium.WebElement;

import com.autoBot.testng.api.base.Annotations;

public class MyHomePage extends Annotations {

	public MyLeadsPage ClickLeads() {
		WebElement eleClickLeads = locateElement("link","Leads");
		click(eleClickLeads);
		
		return new MyLeadsPage();
		
		
	}
}
