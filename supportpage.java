package POM_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.UtilityMethods;

public class supportpage extends UtilityMethods{
	public supportpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
//	SUPPORT CLICK
	@FindBy(xpath = "//a[text()='Support']")
	WebElement support;
	
	public void supportclick() {
		clickElement(support);
	}
	
//	SUPPORT YOURNAME TEXTFILED
	@FindBy(id ="name")
	WebElement supportname;
	
	public void supportyourname(String a) {
		enter_value(supportname,a);
	}
	
//	SUPPORT SELECT FLAG
	@FindBy(xpath = "//div[@class=\"selected-flag\"]")
	WebElement supportflag;
	
	public void supportFlag(){
		clickElement(supportflag);
	}

//	SUPPORT YOUR PHONE NUMBER
	@FindBy(xpath = "//input[@placeholder=\"081234 56789\"]")
	WebElement supportphone;
	
	public void supportphonenumber(String a) {
		enter_value(supportphone,a);
	}
	
//	SUPPORT EMAIL ADDRESS
	@FindBy(id = "email")
	WebElement supportemail;
	
	public void supportemailaddress(String a) {
		enter_value(supportemail,a);
	}
	
//	SUPPORT MESSAGE TEXTFIELD
	@FindBy(id = "message")
	WebElement supportmessage;
	
	public void supportmessagetextfiled(String a) {
		enter_value(supportmessage,a);
	}
	
//	SUPPORT SUBMIT BUTTON
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement supportsubmit;
	
	public void supportsubmitbutton() {
		clickElement(supportsubmit);
	}
}
