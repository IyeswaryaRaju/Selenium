package com.autoBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.autoBot.pages.CreateLeadPage;
import com.autoBot.pages.HomePage;
import com.autoBot.pages.LoginPage;
import com.autoBot.pages.MyHomePage;
import com.autoBot.pages.MyLeadsPage;
import com.autoBot.testng.api.base.Annotations;

public class TC002_CreateLead extends Annotations {
	
	@BeforeTest
	public void setData() {
		testcaseName = "TC002_CreateLead";
		testcaseDec = "Create a Lead";
		author = "Iyeswarya";
		category = "smoke";
		excelFileName = "TC002";
	} 

	@Test(dataProvider="fetchData") 
	public void createlead(String compname, String firstname, String lastname) {
		new LoginPage()
		.enterUserName("DemoSalesManager")
		.enterPassWord("crmsfa") 
		.clickLogin();
		new HomePage()
		.clickCRM();
		new MyHomePage()
		.ClickLeads();
		new MyLeadsPage()
		.clickCreateLead();
		new CreateLeadPage()
		.enterCompanyName(compname)
		.enterFirstName(firstname)
		.enterLastName(lastname)
		.clickCreateLead();
		}

}
