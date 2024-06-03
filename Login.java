package kilnz;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	
ChromeDriver n ;
   
	@BeforeTest
	public void loginpage()
   {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Pictures\\chromedriver-win64\\chromedriver.exe");
		
		n= new ChromeDriver();
		
		n.get("https://kilnz.com/");
		System.out.println("visiting web site");
		
		n.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		n.manage().window().maximize();
	}
	
	@AfterTest
	public void Loginpage () throws InterruptedException {
		n.findElementByXPath("//button[@class='btn btn-outline']").click();
		Thread.sleep(2000);
		
		n.findElementByXPath("//input[@id='email']").sendKeys("kaviyarasu2916@gmail.com");
		Thread.sleep(2000);
		
		n.findElementByXPath("//input[@id='password']").sendKeys("Password@123");
		Thread.sleep(2000);
		
		n.findElementByXPath("//input[@name='remember']").click();
		Thread.sleep(2000);
		
		n.findElementByXPath("//button[@class='btn-theme btn-block login_submit']").click();
		Thread.sleep(2000);
		
		n.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(2000);
		
		n.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(2000);
	
	
		//Homepage1 
		
		
		n.findElementByXPath("/html/body/div[5]/section/div/div/div[7]/div/a/img").click();
		Thread.sleep(2000);
		
		
		
		// Asappage 
			
		n.findElementByXPath("//a[@id='pickup-asap']").click();
		Thread.sleep(2000);
		
		n.findElementByXPath("//div[@data-id='133']").click();
		Thread.sleep(2000);
		
		n.findElementByXPath("//*[@id=\"myModalFuturePickup\"]/div/div/form/div[1]/div/div/div[6]/div/div/div[1]/p").click();
		
		Thread.sleep(2000);
		
		n.findElementByXPath("//button[@class='btn btn-theme-sm mx-3 pickup-load submit-pickup']").click();
		
		
		
		
		// Orderpage 
		n.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		
		n.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(2000);
		
		n.findElementByXPath("//button[@data-food='375']").click();
		
		Thread.sleep(2000);
		
//		WebElement i = n.findElementByXPath("//button[contains(text(), '+')]");
//		for (int i1 = 0; i1 < 5; i1++) {
//			 System.out.println(i1);
//		}
		
		
//		radio button
		n.findElementByXPath("//input[@class='form-check-input variant_required']").click();
		
		Thread.sleep(2000);
		
//		n.executeScript("window.scrollBy(0,1000)");
//		Thread.sleep(2000);
//		
//		n.executeScript("window.scrollBy(0,-1000)");
//		Thread.sleep(2000);
		
		//add on 
		n.findElementByXPath("//*[@id=\"addtocartForm\"]/div[1]/div[2]/div/div/div[2]/div/input").clear();
		Thread.sleep(2000);
		n.findElementByXPath("//*[@id=\"addtocartForm\"]/div[1]/div[2]/div/div/div[2]/div/input").sendKeys("3");
		
		Thread.sleep(2000);
		//qty increase
		n.findElementByName("menuqty").clear();
		
		
		Thread.sleep(2000);
		
		n.findElementByName("menuqty").sendKeys("2");
		
		Thread.sleep(2000);
		
		n.findElement(By.xpath("//button[contains(text(), 'Add to Cart')]")).click();
		
		Thread.sleep(2000);
		
		n.findElementByXPath("//p[contains(text(), 'Discount Coupon')]").click();
		
		Thread.sleep(2000);
		
		n.findElementByXPath("//*[@id=\"coupon-new\"]/div/div/form/div/div/div[2]/div[1]/div[1]/strong").click();
		
		Thread.sleep(2000);
		
		n.findElementByXPath("//select[@id='tipsapply']").click();
		

		Thread.sleep(2000);
		
		n.findElementByXPath("//option[@value='10']").click();
		
		Thread.sleep(2000);
		
//		n.findElementByXPath("//a[@class='collapsed']").click();
//		
//		Thread.sleep(2000);
		
		n.findElementByXPath("//button[contains(text(), 'Checkout')]").click();
		
		
		
		// cartpage 
		Thread.sleep(2000);
		
		//edit page 
		n.findElementByXPath("//*[@id=\"list1\"]/div/div[2]/a[2]").click();
		
		Thread.sleep(2000);
		
		//update button
		
		n.findElementByXPath("//button[@data-id='2']").click();
		
		Thread.sleep(2000);
		
		n.findElementByName("next").click();
		
		
		
		// billingpage 
		 
		Thread.sleep(2000);
		
		n.findElementByXPath("//a[contains(text(), '+ Add New')]").click();
		
		Thread.sleep(2000);
		
		n.findElementByXPath("//select[@name='location_type']").click();
		
		Thread.sleep(2000);
		
		n.findElementByXPath("//option[@value='Home']").click();
		
		Thread.sleep(2000);
		
		n.findElementByName("address1").sendKeys("palani");
		
		Thread.sleep(2000);
		
		n.findElementByXPath("//select[@name='country']").click();
		
		Thread.sleep(2000);
		
		n.findElementByXPath("//*[@id=\"addressModal\"]/div/div/div[2]/div/div/div[4]/div/select/option[2]").click();
		
		Thread.sleep(2000);
		
		
		n.findElementByXPath("//select[@name='state']").click();
		
		Thread.sleep(2000);
		
		n.findElementByXPath("//option[@value='Alaska']").click();
		
		Thread.sleep(2000);
		
		n.findElementByName("city").sendKeys("kumarapalayam");
		
		Thread.sleep(2000);
		
		n.findElementByName("pincode").sendKeys("87678");
		
		Thread.sleep(2000);
		
		
		
		n.findElementByXPath("//*[@id=\"addressModal\"]/div/div/div[3]/button").click();
		
	//	n.findElementByXPath("//button[@class='btn btn-theme-sm mx-3 add-address']").click();
		
		
		Thread.sleep(2000);
		
	
//        n.findElementByXPath("//a[@data-id='75']").click();
////		
//		Thread.sleep(2000);
//		
//		n.findElementByXPath("//button[@class='btn btn-theme-sm mx-3 add-address']").click();
//		
//		Thread.sleep(2000);
		
	//	n.findElementByName("next").click();
		
		n.findElementByXPath("//*[@id=\"cart_home\"]/div/form/fieldset[2]/input[1]").click();
		
		
		
		
		
		Thread.sleep(2000);
		
		n.findElementByXPath("//*[@id=\"cuscard63\"]/div/div/div/span[2]/a").click();
		
		
		
		//payment page
		
		Thread.sleep(2000);
		
		n.findElementByXPath("//button[@class='action-button submit_place']").click();
		
		
		Thread.sleep(4000);
		
		n.quit();
		
		
		
		
	}	
	

}
