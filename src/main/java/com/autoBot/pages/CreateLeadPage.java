package com.autoBot.pages;

import org.openqa.selenium.WebElement;

import com.autoBot.testng.api.base.Annotations;

public class CreateLeadPage extends Annotations {
		
		public CreateLeadPage enterCompanyName(String data) {
			WebElement elecompanyname = locateElement("Id","createLeadForm_companyName");
			clearAndType(elecompanyname,data);
			return this;
			
		}
		
		public CreateLeadPage enterFirstName(String data) {
			WebElement elefirstname = locateElement("Id","createLeadForm_firstName");
			clearAndType(elefirstname,data);
			return this;
			
		}
		
		public CreateLeadPage enterLastName(String data) {
			WebElement elelastname = locateElement("Id","createLeadForm_lastName");
			clearAndType(elelastname,data);
			return this;
			
		}
		public ViewLeadPage clickCreateLead() {
			WebElement eleClickCreateLead = locateElement("Class","smallSubmit");
			click(eleClickCreateLead);
			return new ViewLeadPage();
			
		}
		

	}


