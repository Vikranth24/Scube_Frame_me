package POM_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.UtilityMethods;


public class Compatible_devices_page extends UtilityMethods {
	WebDriver driver;
	public Compatible_devices_page(WebDriver driver){
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
		
		//To send name of devices in Compatible devices Page********************
		@FindBy(xpath="//input[@name='search']")
		WebElement Compatibledevicessearch;
		public void  Compatibledevicessearch_link(String a) 
		{
			enter_value(Compatibledevicessearch,a);
		}
		
		//To go back home page from  Compatible devices Page********************
		@FindBy(xpath="((//*[local-name()='svg'])[4])")
		WebElement BackCompatibledevices;
		public void  BackCompatibledevices_link() 
		{
			clickElement(BackCompatibledevices);
		}
		
						
		
		
		
	}
	


