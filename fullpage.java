package a1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fullpage {
	
	
ChromeDriver n ;
	
	@BeforeTest
	public void website() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Pictures\\chromedriver-win64\\chromedriver.exe");
		
		n= new ChromeDriver();
		
		n.get("https://hyrrokkin.net/myaccount/");
		System.out.println("visiting web site");
		
		n.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		n.manage().window().maximize();
	}
	@AfterTest
	public void loginpage() throws InterruptedException {
		n.findElementByXPath("//input[@name='email']").sendKeys("kaviyarasu@hyrrokkin.net");
		Thread.sleep(2000);
		
//		n.findElementByXPath("//input[@name='email']").clear();
//		
//		Thread.sleep(6000);
		
		n.findElementByXPath("//input[@name='password']").sendKeys("Kavi@1234");
		Thread.sleep(2000);
		
		n.findElementByXPath("//input[@id='remember']").click();
		Thread.sleep(2000);
		
		//click on the login button
		
		n.findElementByXPath("//button[@class='btn btn-primary']").click();
		Thread.sleep(2000);
		
		//click on the profile
		n.findElement(By.xpath("//a[@class='d-flex align-items-center nav-link dropdown-toggle dropdown-toggle-nocaret']")).click();
		Thread.sleep(2000);
		
		n.findElement(By.xpath("//a[@class='dropdown-item']")).click();
		Thread.sleep(2000);
		
		//full name remove and enter the name 
		n.findElement(By.xpath("//input[@name='name']")).clear();
		Thread.sleep(2000);
		n.findElement(By.xpath("//input[@name='name']")).sendKeys("kavi");
		
		//contact number enter
		n.findElementByXPath("//input[@name='phone_no']").sendKeys("7788665544");
		Thread.sleep(2000);
		
		//address 1
		n.findElementByXPath("//input[@name='address1']").sendKeys("cbe");
		Thread.sleep(1000);
		
		//address 2
		n.findElementByXPath("//input[@name='address2']").sendKeys("cbe");
		Thread.sleep(1000);
		
		//state
		n.findElementByXPath("//input[@name='state']").sendKeys("Tamil Nadu");
		Thread.sleep(1000);
		
		//district
		n.findElementByXPath("//input[@name='district']").sendKeys("Coimbatore");
		Thread.sleep(1000);
		
		//pincode
		n.findElementByXPath("//input[@name='pincode']").sendKeys("641007");
		Thread.sleep(1000);
		
		n.navigate().back();
		Thread.sleep(2000);
		//click the profile
		n.findElement(By.xpath("//a[@class='d-flex align-items-center nav-link dropdown-toggle dropdown-toggle-nocaret']")).click();
		Thread.sleep(2000);
		
//		n.findElementByXPath("//button[@class='btn btn-primary']").click();
//		Thread.sleep(1000);
		
//		n.findElementByLinkText("Update").click();
		
		//Change Password 
		
		n.findElementByXPath("/html/body/div[1]/header/div/nav/div[4]/ul/li[2]/a/span").click();
		
//		n.findElementByXPath("//a[@class='btn btn-primary mt-4']").click();
//		Thread.sleep(2000);
		
//		//current password
		n.findElementByXPath("//input[@name='current_password']").sendKeys("Kavi@1234");
		Thread.sleep(2000);
//		
//		//new password 
		n.findElementByXPath("//input[@name='password']").sendKeys("Kavi@123");
		Thread.sleep(2000);
//		
		//confirm password 
		n.findElementByXPath("//input[@name='password_confirmation']").sendKeys("Kavi@123");
		Thread.sleep(2000);
		
		n.findElementByXPath("//button[@class='btn btn-success px-4']").click();
		Thread.sleep(2000);
		
		
		
		n.navigate().back();
		
	
	}
}
