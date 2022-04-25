package POM_Repository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.UtilityMethods;

public class products extends UtilityMethods {
	
	public products(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
//	HOME ICON CLICK
	@FindBy(xpath = "((//*[local-name()='svg'])[4])")
	WebElement home;
	
	public void homeicon() {
		clickElement(home);
	}
	
//	VIDEO CLICK
	@FindBy(xpath = "//img[@class=\"mr-8 h-64 w-full cursor-pointer lg:w-64\"]")
	WebElement video;
	
	public void videoclick() {
		clickElement(video);
	}
	
//	VIDEO CLICK2
	@FindBy(xpath = "//img[@class=\"h-64 w-full cursor-pointer lg:w-64\"]")
	WebElement video2;
	
	public void videoclick2() {
		clickElement(video2);
	}
	
//	EXECUTIVE CARD CLICK
	@FindBy(xpath = "//li[text()='Executive Card']")
	WebElement executivecardclick;
	
	public void Executiveclick() {
		clickElement(executivecardclick);
	}
	
//	WHITE CARD CLICK
	@FindBy(xpath = "//li[text()='White Label Card']")
	WebElement whitelabelcardclick;
	
	public void whiteclick() {
		clickElement(whitelabelcardclick);
	}
	
//	PREMIMUM CARD CLICK
	@FindBy(xpath = "//li[text()='Premium Card']")
	WebElement premimumcardclick;
	
	public void premiumclick() {
		clickElement(premimumcardclick);
	}
	
//	ALL CLICK
	@FindBy(xpath = "(//li[text()='All'])[1]")
	WebElement allclick;
	
	public void Allclick() {
		clickElement(allclick);
	}
	
//	DOCTOR CLICK
	@FindBy(xpath = "//li[text()='Doctor']")
	WebElement doctorclick;
	
	public void Doctorclick() {
		clickElement(doctorclick);
	}
	
//	LAWYER CLICK
	@FindBy(xpath = "//li[text()='Lawyer']")
	WebElement lawyerclick;
	
	public void Lawyerclick() {
		clickElement(lawyerclick);
	}
	
//	ACCOUNTANT CLICK
	@FindBy(xpath = "//li[text()='Accountant']")
	WebElement accountantclick;
	
	public void Accountantclick() {
		clickElement(accountantclick);
	}
	
//	SOCIALMEDIA CLICK
	@FindBy(xpath = "//li[text()='Social Media']")
	WebElement socialclick;
	
	public void socialmediaclick() {
		clickElement(socialclick);
	}
	
//	OTHERS CLICK
	@FindBy(xpath = "//li[text()='Others']")
	WebElement othersclick;
	
	public void Othersclick() {
		clickElement(othersclick);
	}
	
//	ALLCLICK2
	@FindBy(xpath = "(//li[text()='All'])[2]")
	WebElement allclick2;
	
	public void Allclick2() {
		clickElement(allclick2);
	}
	
//	METALLIC CARD CLICK
	@FindBy(xpath = "//li[text()='Metallic Print']")
	WebElement metallicclick;
	
	public void metalliccardclick() {
		clickElement(metallicclick);
	}
	
//	EMBORSSED COLOR CLICK
	@FindBy(xpath = "//li[text()='Embossed Color Print']")
	WebElement emborssedclick;
	
	public void emborssedcardclick() {
		clickElement(emborssedclick);
	}
	
//	CA CARD 8 CLICK
	@FindBy(xpath = "//h3[text()='CA card 8']")
	WebElement cacardclick;
	
	public void CACARD8click() {
		clickElement(cacardclick);
	}
	
//	CA CARD 8 CLICK YOURNAME
	@FindBy(xpath = "//div[@class=\"mb-6\"]/..//input[@id=\"name\"]")
	WebElement cacardyourname;
	
	public void cacard8yourname() {
		clickElement(cacardyourname);
	}
	
//	CA CARD 8 CLICK FLAG ICON
	@FindBy(xpath = "//div[@class=\"mb-6\"]/..//div[@class=\"selected-flag\"]")
	WebElement cacardflagicon;
	
	public void cacard8flagicon() {
		clickElement(cacardflagicon);
	}
	
//	CA CARD 8 CLICK PHONE NUMBER
	@FindBy(xpath = "//div[@class=\"mb-6\"]/..//input[@placeholder=\"081234 56789\"]")
	WebElement cacardphonenumber;
	
	public void cacard8phonenumber() {
		clickElement(cacardphonenumber);
	}
	
//	CA CARD 8 YOUR DESIGNATION
	@FindBy(id ="designation")
	WebElement cacarddesignation;
	
	public void cacard8yourdesignation() {
		clickElement(cacarddesignation);
	}
	
//	CA CARD 8 YOUR EMAIL
	@FindBy(xpath = "//div[@class=\"mb-6\"]/..//input[@id=\"email\"]")
	WebElement cacardmail;
	
	public void cacard8youremail() {
		clickElement(cacardmail);
	}
	
//	CA CARD 8 ADD TO CART
	@FindBy(xpath = "//button[text()='Add to Cart']")
	WebElement cacardaddtocart;
	
	public void cacard8addtocart() {
		clickElement(cacardaddtocart);
	}
	
//	CA CARD 8 CLICKHERE LINK CLICK
	@FindBy(xpath = "//span[text()='Click here']")
	WebElement cacardclickhere;
	
	public void cacard8clickhere() {
		clickElement(cacardclickhere);
	}
	
//	CA CARD 8 INSIDE CLICKHERE LINK YOURNAME
	@FindBy(xpath = "//p[text()='Provide your information and our design team will contact you.']/..//input[@id=\"name\"]")
	WebElement clickhereyourname;
	
	public void cacard8clickhereyourname() {
		clickElement(clickhereyourname);
	}
	
//	CA CARD 8 INSIDE CLICKHERE LINK YOUREMAIL
	@FindBy(xpath = "//p[text()='Provide your information and our design team will contact you.']/..//input[@id=\"email\"]")
	WebElement clickhereyouremail;
	
	public void cacard8clickhereyouremail() {
		clickElement(clickhereyouremail);
	}
	
//	CA CARD 8 INSIDE CLICKHERE LINK FLAGICON
	@FindBy(xpath = "//p[text()='Provide your information and our design team will contact you.']/..//div[@class=\"selected-flag\"]")
	WebElement clickhereflagicon;
	
	public void cacard8clickhereflagicon() {
		clickElement( clickhereflagicon);
	}
	
//	CA CARD 8 INSIDE CLICKHERE LINK YOURNUMBER
	@FindBy(xpath = "//p[text()='Provide your information and our design team will contact you.']/..//input[@placeholder=\"081234 56789\"]")
	WebElement clickhereyournumber;
	
	public void cacard8clickhereyournumber() {
		clickElement(clickhereyournumber);
	}
	
//	CA CARD 8 INSIDE CLICKHERE LINK SUBMIT
	@FindBy(xpath = "//p[text()='Provide your information and our design team will contact you.']/..//button[text()='Submit']")
	WebElement clickheresubmit;
	
	public void cacard8clickheresubmit() {
		clickElement(clickheresubmit);
	}
	
//	CA CARD 8 INSIDE CLICKHERE LINK INTO ICON
	@FindBy(xpath = "((//*[local-name()='svg'])[7])")
	WebElement clickhereintoicon;
	
	public void cacard8clickhereintoicon() {
		clickElement(clickhereintoicon);
	}
	
//	EXECUTIVE C3 CARD CLICK
	@FindBy(xpath = "//h3[text()='Executive_C3']")
	WebElement executivec3click;
	
	public void Executivec3card() {
		clickElement(executivec3click);
	}
	
//	DOCTOR CARD 12 CLICK
	@FindBy(xpath = "//h3[text()='Doctor Card 12']")
	WebElement doctorcardclick;
	
	public void doctorcard12() {
		clickElement( doctorcardclick);
	}
	
//	LEARN MORE CLICK
	@FindBy(xpath = "//button[text()='Load more']")
	WebElement learnclick;
	
	public void learmore() {
		clickElement( learnclick );
	}
	
//	YOUR NAME TEXTFIELD
	@FindBy(id = "name")
	WebElement yourname;
	
	public void yournametextfield() {
		clickElement( yourname);
	}
	
//	YOUR EMAIL TEXTFIELD
	@FindBy(id = "email")
	WebElement youremail;
	
	public void youremailtextfield() {
		clickElement(youremail);
	}
	
//	YOUR PHONE NUMBER
	@FindBy(xpath = "//input[@placeholder=\"081234 56789\"]")
	WebElement yourphone;
	
	public void yourphonenumber() {
		clickElement(yourphone);
	}
	
//	SUBMIT
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submit;
	
	public void submitclick() {
		clickElement(submit);
	}
	

}
