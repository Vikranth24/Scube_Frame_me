package POM_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.UtilityMethods;

public class Support extends UtilityMethods{
	public Support(WebDriver driver) {
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
	
	public void supportyourname() {
		clickElement(supportname);
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
	
	public void supportphonenumber() {
		clickElement(supportphone);
	}
	
//	SUPPORT EMAIL ADDRESS
	@FindBy(id = "email")
	WebElement supportemail;
	
	public void supportemailaddress() {
		clickElement(supportemail);
	}
	
//	SUPPORT MESSAGE TEXTFIELD
	@FindBy(id = "message")
	WebElement supportmessage;
	
	public void supportmessagetextfiled() {
		clickElement(supportmessage);
	}
	
//	SUPPORT SUBMIT BUTTON
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement supportsubmit;
	
	public void supportsubmitbutton() {
		clickElement(supportsubmit);
	}
}
