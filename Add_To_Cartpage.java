package POM_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.UtilityMethods;

public class Add_To_Cartpage extends UtilityMethods 
{
		WebDriver driver;
		public Add_To_Cartpage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
			this.driver=driver;
		}
			
			//To click on Explore products in Add to cart Page********************
			@FindBy(xpath="//button[@class='base-button default-btn mt-4']")
			WebElement EXplore_poduct;
			public void EXplore_poduct_Button() 
			{
				clickElement(EXplore_poduct);
			}
			
			//To send Email  in Check out********************
			@FindBy(xpath="//input[@id=email]")
			WebElement Email_checkout;
			public void Email_checkout(String a) 
			{
				enter_value(Email_checkout,a);
			}
			

			//To send Phone no  in Check out********************
			@FindBy(xpath="//input[@type='tel']")
			WebElement Phone_no;
			public void Phone_checkout(String a) 
			{
				enter_value(Phone_no,a);
			}
			

			//To click Flag  in Check out********************
			@FindBy(xpath="(//div[@class='iti-flag in'])[1]")
			WebElement Flag;
			public void Flag_checkout() 
			{
				clickElement(Flag);
			}
			
			

			//To select country  dropdown of Check out********************
			@FindBy(xpath="(//span[@class='country-name'])[4]")
			WebElement SelectFlag;
			public void SelectFlag_checkout() 
			{
				clickElement(SelectFlag);
			}
			

			//To   Click on update check box in Check out********************
			@FindBy(xpath="//input[@id='subscribe']")
			WebElement Update;
			public void Update_checkout() 
			{
				clickElement(Update);
			}
			
			//To   Click on Gst check box in Check out********************
			@FindBy(xpath="//input[@name='show_gst']")
			WebElement Gst;
			public void Gst_checkout() 
			{
				clickElement(Gst);
			}
			
			//To send name  in Check out********************
			@FindBy(xpath="//input[@id='name']")
			WebElement Name_checkout;
			public void Name_checkout(String a) 
			{
				enter_value(Name_checkout,a);
			}
			
			//To send Address 1  in Check out********************
			@FindBy(xpath="//input[@id='street_address']")
			WebElement Address1_checkout;
			public void Address1_checkout(String a) 
			{
				enter_value(Address1_checkout,a);
			}
			
			//To   send  Address 2 in Check out********************
			@FindBy(xpath="//input[@name='street_address2']")
			WebElement Address2_checkout;
			public void Address2_checkout(String a) 
			{
				enter_value(Address2_checkout,a);
			}
			
			//To   click on country dropdown in Check out********************
			@FindBy(xpath="//select[@id='country']")
			WebElement Country ;
			public void Country_checkout() 
			{
				clickElement(Country);
			}
			

			//To   Select a country  in Check out********************
			@FindBy(xpath="//option[@value='21']")
			WebElement Select_Country ;
			public void Select_Country_checkout() 
			{
				clickElement(Select_Country);
			}
			

			//To   click on state dropdown  in Check out********************
			@FindBy(xpath="//select[@id='state']")
			WebElement state ;
			public void state_checkout() 
			{
				clickElement(state);
			}
			

			//To   click on state dropdown  in Check out********************
			@FindBy(xpath="//option[@value='4023']")
			WebElement Select_state ;
			public void Select_state_checkout() 
			{
				clickElement(Select_state);
			}
			

			//To   send city name   in Check out********************
			@FindBy(xpath="//input[@id='city']")
			WebElement city ;
			public void city_checkout(String a) 
			{
				enter_value(city,a);
			}
			
			
			//To   send zip code   in Check out********************
			@FindBy(xpath="//input[@id='zipcode']")
			WebElement Zip_Code ;
			public void Zip_Code_checkout(String a) 
			{
				enter_value(Zip_Code,a);
			}
			
			//To click on edit    in Check out********************
			@FindBy(xpath="//span[@class='mr-4 cursor-pointer rounded-lg py-2 px-4 shadow-xl']")
			WebElement Edit;
			public void Edit_checkout() 
			{
				clickElement(Edit);
			}
			
			//To click on Remove    in Check out********************
			@FindBy(xpath="//span[@class='cursor-pointer rounded-lg py-2 px-4 shadow-xl']")
			WebElement Remove;
			public void Remove_checkout() 
			{
				clickElement(Remove);
			}
			
			//To send coupon   in Check out********************
			@FindBy(xpath="//input[@name='coupon']")
			WebElement coupon;
			public void coupon_checkout(String a) 
			{
				enter_value(coupon,a);
			}
			
			//To click on Apply coupan button   in Check out********************
			@FindBy(xpath="//button[@class='base-button my-0 w-full']")
			WebElement Applycoupon;
			public void Applycoupon_checkout() 
			{
				clickElement(Applycoupon);
			}
			
			
			//To click on Payment button   in Check out********************
			@FindBy(xpath="(//button[@class='base-button w-full'])[2]")
			WebElement Payment;
			public void Payment_checkout() 
			{
				clickElement(Payment);
			}
			
}
			
			
			
			
			
			
			
			
			
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		    
			
			
			
			
			
						
			
			
			
			
			
			

