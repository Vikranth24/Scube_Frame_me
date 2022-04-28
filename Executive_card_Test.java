package Functional_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import POM_Repository.Add_To_Cartpage;
import POM_Repository.Compatible_devices_page;
import POM_Repository.Homepage;
import POM_Repository.productspage;
import generic.Base_Class;
import generic.JavaScriptUtil;
import generic.ReadExcel;
import generic.UtilityMethods;

public class Executive_card_Test extends Base_Class {
	@Test
	public void Home_Functional() throws InterruptedException
	{
		System.out.println();
		System.out.println("Executive_card_Test =to check filter of  Executive_card is working proper ");
		System.out.println();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		WebDriverWait wait=new 	WebDriverWait(driver, 25);
		
		
		ReadExcel a=new ReadExcel();
		String des_name=a.readStringDataFromExcel("Sheet5", 0, 0);
		String des_email=a.readStringDataFromExcel("Sheet5", 0, 1);
		String des_no=a.readStringDataFromExcel("Sheet5", 0, 2);
		
		
		
		
		
		
		Homepage home=new Homepage(driver);
		UtilityMethods Util=new UtilityMethods();
		productspage pro=new productspage(driver);
		
		
		home.product_link();
		Thread.sleep(5000);
		
		pro. videoclick();
		Thread.sleep(30000);
		
		pro.video_CANCEL();
		Thread.sleep(5000);
		
		pro.videoclick2();
		Thread.sleep(30000);
		
		pro.video2_CANCEL();
		Thread.sleep(5000);
		
		
		for(int i=0;i<=4;i++)
		{
		   Util.scroll_down(driver);
		   Thread.sleep(5000);
		}
		
		for(int i=0;i<=2;i++)
		{
		   Util.scroll_up(driver);
		   Thread.sleep(5000);
		}
		
		pro.metalliccardclick();
		Thread.sleep(5000);
		
		for(int i=0;i<=2;i++)
		{
		   Util.scroll_down(driver);
		   Thread.sleep(5000);
		}
		
		for(int i=0;i<=2;i++)
		{
		   Util.scroll_up(driver);
		   Thread.sleep(5000);
		}
		
		pro.emborssedcardclick();
		 Thread.sleep(5000);
		 
			for(int i=0;i<=2;i++)
			{
			   Util.scroll_down(driver);
			   Thread.sleep(5000);
			}
			
			for(int i=0;i<=2;i++)
			{
			   Util.scroll_up(driver);
			   Thread.sleep(5000);
			}
		
		pro.Allclick2();
		Thread.sleep(5000);
		
		
		for(int i=0;i<=2;i++)
		{
		   Util.scroll_down(driver);
		   Thread.sleep(5000);
		}
		
		for(int i=0;i<=2;i++)
		{
		   Util.scroll_up(driver);
		   Thread.sleep(5000);
		}
		
		
		pro.Doctorclick();
		Thread.sleep(5000);
		
		for(int i=0;i<=1;i++)
		{
		   Util.scroll_down(driver);
		   Thread.sleep(5000);
		}
		
		for(int i=0;i<=1;i++)
		{
		   Util.scroll_up(driver);
		   Thread.sleep(5000);
		}
		
        pro.metalliccardclick();
        Thread.sleep(5000);
		
    	for(int i=0;i<=1;i++)
		{
		   Util.scroll_down(driver);
		   Thread.sleep(5000);
		}
    	
    	for(int i=0;i<=1;i++)
		{
		   Util.scroll_up(driver);
		   Thread.sleep(5000);
		}
    	
		pro.emborssedcardclick();
		Thread.sleep(5000);
		
		for(int i=0;i<=1;i++)
		{
		   Util.scroll_down(driver);
		   Thread.sleep(5000);
		}
		
		for(int i=0;i<=1;i++)
		{
		   Util.scroll_up(driver);
		   Thread.sleep(5000);
		}
		
		pro.Allclick2();
		Thread.sleep(5000);
		
		
		pro.Lawyerclick();
		Thread.sleep(5000);
		
		for(int i=0;i<=1;i++)
		{
		   Util.scroll_down(driver);
		   Thread.sleep(5000);
		}
		for(int i=0;i<=1;i++)
		{
		   Util.scroll_up(driver);
		   Thread.sleep(5000);
		}
		
		 pro.metalliccardclick();
		 Thread.sleep(5000);
			
			for(int i=0;i<=1;i++)
			{
			   Util.scroll_down(driver);
			   Thread.sleep(5000);
			}
			for(int i=0;i<=1;i++)
			{
			   Util.scroll_up(driver);
			   Thread.sleep(5000);
			}
			
			pro.emborssedcardclick();
			Thread.sleep(5000);
			
			for(int i=0;i<=1;i++)
			{
			   Util.scroll_down(driver);
			   Thread.sleep(5000);
			}
			
			for(int i=0;i<=1;i++)
			{
			   Util.scroll_up(driver);
			   Thread.sleep(5000);
			}
			
			pro.Allclick2();
			Thread.sleep(5000);
		
		pro.Accountantclick();
		Thread.sleep(5000);
		
		for(int i=0;i<=1;i++)
		{
		   Util.scroll_down(driver);
		   Thread.sleep(5000);
		}
		
		for(int i=0;i<=1;i++)
		{
		   Util.scroll_up(driver);
		   Thread.sleep(5000);
		}
		
		 pro.metalliccardclick();
		 Thread.sleep(5000);
			
			for(int i=0;i<=1;i++)
			{
			   Util.scroll_down(driver);
			   Thread.sleep(5000);
			}
			
			for(int i=0;i<=1;i++)
			{
			   Util.scroll_up(driver);
			   Thread.sleep(5000);
			}
			
			pro.emborssedcardclick();
			Thread.sleep(5000);
			
			for(int i=0;i<=1;i++)
			{
			   Util.scroll_down(driver);
			   Thread.sleep(5000);
			}
			
			for(int i=0;i<=1;i++)
			{
			   Util.scroll_up(driver);
			   Thread.sleep(5000);
			}
			
			pro.Allclick2();
			Thread.sleep(5000);
			
			pro.socialmediaclick();
			Thread.sleep(5000);
			
			for(int i=0;i<=2;i++)
			{
			   Util.scroll_down(driver);
			   Thread.sleep(5000);
			}
			
			 pro.metalliccardclick();
			 Thread.sleep(5000);
				
			 for(int i=0;i<=1;i++)
				{
				   Util.scroll_down(driver);
				   Thread.sleep(5000);
				}
			 
			 for(int i=0;i<=1;i++)
				{
				   Util.scroll_up(driver);
				   Thread.sleep(5000);
				}
				
				pro.emborssedcardclick();
				Thread.sleep(5000);
				
				for(int i=0;i<=1;i++)
				{
				   Util.scroll_down(driver);
				   Thread.sleep(5000);
				}
				
				for(int i=0;i<=1;i++)
				{
				   Util.scroll_up(driver);
				   Thread.sleep(5000);
				}
				
				pro.Allclick2();
				Thread.sleep(5000);
				
				pro.Othersclick();
				Thread.sleep(5000);
				
				
				Util.scroll_down(driver);
				Thread.sleep(5000);
				
				Util.scroll_up(driver);
				Thread.sleep(5000);
				
				
				 pro.metalliccardclick();
				 Thread.sleep(5000);
					
				 for(int i=0;i<=1;i++)
					{
					   Util.scroll_down(driver);
					   Thread.sleep(5000);
					}
				 
				 for(int i=0;i<=1;i++)
					{
					   Util.scroll_up(driver);
					   Thread.sleep(5000);
					}
					
					pro.emborssedcardclick();
					Thread.sleep(5000);
					
					for(int i=0;i<=1;i++)
					{
						   Util.scroll_down(driver);
						   Thread.sleep(5000);
						}
					
					for(int i=0;i<=1;i++)
					{
					   Util.scroll_up(driver);
					   Thread.sleep(5000);
					}
					
					pro.Allclick2();
					Thread.sleep(5000);
					
					pro.Allclick();
					Thread.sleep(5000);
					
					for(int i=0;i<=2;i++)
					{
					   Util.scroll_down(driver);
					   Thread.sleep(5000);
					}
					
					pro.loadmore();
					Thread.sleep(5000);
					
					for(int i=0;i<=2;i++)
					{
					   Util.scroll_down(driver);
					   Thread.sleep(5000);
					}
					
					pro.yournametextfield(des_name);
					Thread.sleep(5000);
					pro.youremailtextfield(des_email);
					Thread.sleep(5000);
					pro.yourphonenumber(des_no);
					Thread.sleep(5000);
					
					pro.submitclick();
					Thread.sleep(5000);	

}}
