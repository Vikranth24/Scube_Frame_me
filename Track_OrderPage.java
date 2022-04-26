package POM_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.UtilityMethods;

public class Track_OrderPage extends UtilityMethods {
	public Track_OrderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
//	TRACK ORDER CLICK
	@FindBy(xpath = "//a[text()='Track Order']")
	WebElement trackorder;
	
	public void trackorderclick() {
		clickElement(trackorder);
	}
	
//	ORDER ID
	@FindBy(id = "search")
	WebElement orderclick;
	
	public void orderid(String a) {
		enter_value(orderclick,a);
	}
	
//	CHECK NOW CLICK
	@FindBy(xpath = "//button[text()='Check now']")
	WebElement check;
	
	public void checknow() {
		clickElement(check);
	}

}




