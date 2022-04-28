package Functionality;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import POM_Repository.supportpage;
import generic.Base_Class;

import generic.ReadExcel;


public class support extends Base_Class {
	
	@Test
	public void supports() throws InterruptedException  {
		ReadExcel excel = new ReadExcel();
		String yourname = excel.readStringDataFromExcel("Supportdetails", 0, 0);
		String email = excel.readStringDataFromExcel("Supportdetails", 1, 0);
		String message = excel.readStringDataFromExcel("Supportdetails", 2, 0);
		String number = excel.readStringDataFromExcel("Supportdetails", 3, 0);
		String expectedResult = excel.readStringDataFromExcel("Supportdetails", 4, 0);
		String expectedResult1 = excel.readStringDataFromExcel("Supportdetails", 5, 0);


		
		supportpage support = new supportpage(driver);
		Assert.assertEquals(driver.getTitle(),expectedResult,"support page is not displayed successfully");
		Reporter.log("support page is displayed successfully",true);
		
		
		support.supportclick();
		Assert.assertEquals(driver.getTitle(),expectedResult1,"support page is not displayed successfully");
		Reporter.log("support page is displayed successfully",true);
		
		
		support.supportyourname(yourname);
		Assert.assertEquals(driver.getTitle(),expectedResult1,"support page is not displayed successfully");
		Reporter.log("support page is displayed successfully",true);
		
		
		support.supportphonenumber(number);
		Assert.assertEquals(driver.getTitle(),expectedResult1,"support page is not displayed successfully");
		Reporter.log("support page is displayed successfully",true);
		
		
		support.supportemailaddress(email);
		Assert.assertEquals(driver.getTitle(),expectedResult1,"support page is not displayed successfully");
		Reporter.log("support page is displayed successfully",true);
		
		
		support.supportmessagetextfiled(message);
		Assert.assertEquals(driver.getTitle(),expectedResult1,"support page is not displayed successfully");
		Reporter.log("support page is displayed successfully",true);
		
		
		support.supportsubmitbutton();
		Assert.assertEquals(driver.getTitle(),expectedResult1,"support page is not displayed successfully");
		Reporter.log("support page is displayed successfully",true);
		
		
	}

}
