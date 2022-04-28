package Functionality;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import POM_Repository.Track_OrderPage;
import generic.Base_Class;
import generic.ReadExcel;

public class Trackorder extends Base_Class{
	
	@Test
	public void trackorder() {
		ReadExcel excel = new ReadExcel();
		String orderid = excel.readStringDataFromExcel("Sheet 2", 1, 0);
		String expectedResult = excel.readStringDataFromExcel("Sheet 2", 2, 0);
		String expectedresult1 = excel.readStringDataFromExcel("Sheet 2", 0, 0);
		
		Track_OrderPage order = new Track_OrderPage(driver);
		Assert.assertEquals(driver.getTitle(),expectedResult,"trackorder page is not displayed successfully");
		Reporter.log("trackorder page is displayed successfully",true);
		
		
		order.trackorderclick();
		Assert.assertEquals(driver.getTitle(),expectedresult1,"trackorder page is not displayed successfully");
		Reporter.log("trackorder page is displayed successfully",true);
		
		
		order.orderid(orderid);
		Assert.assertEquals(driver.getTitle(),expectedresult1,"trackorder page is not displayed successfully");
		Reporter.log("trackorder page is displayed successfully",true);
		
		
		
		order.checknow();
		Assert.assertEquals(driver.getTitle(),expectedresult1,"trackorder page is not displayed successfully");
		Reporter.log("trackorder page is displayed successfully",true);
		
		
	}

}
