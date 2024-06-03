package a1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class hyrrokkin {
    
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
		
		n.findElementByXPath("//input[@name='password']").sendKeys("W@dws@54s256");
		Thread.sleep(2000);
		
		n.findElementByXPath("//input[@id='remember']").click();
		Thread.sleep(2000);
		//click on the login button
		n.findElementByXPath("//button[@class='btn btn-primary']").click();
		Thread.sleep(2000);
//		
//		n.findElementByXPath("//input[@class='form-control search-control']").sendKeys("kavi");
//		Thread.sleep(1000);
//		
//       
//		
//		n.findElement(By.xpath("//input[@class='form-control search-control")).clear();
		

		
		
		//dashboard
		
//		n.findElementByXPath("//div[@class='menu-title']").click();
//		Thread.sleep(2000);
		
		//manage jobs
//		n.findElementByXPath("//a[@href='https://hyrrokkin.net/myaccount/project-times']").click();
//		Thread.sleep(2000);
		
		//select value & search the value 
//		n.findElementByXPath("/html/body/div[1]/div[3]/div/div[2]/div/form/div/div[1]/div/div/p/span").click();
//		Thread.sleep(1000);
		
		
		
//		n.findElementByXPath("//option[@value='248']").click();
//		Thread.sleep(1000);
		
		//click on the search option
//		n.findElementByXPath("//button[@type='submit']").click();
//		Thread.sleep(2000);
		
//		n.findElementByXPath("//option[@value='246']").click();
//		Thread.sleep(2000);
//		
//		n.findElementByXPath("//button[@type='submit']").click();
//		Thread.sleep(2000);
		
		//click on the reset button 
//		n.findElementByXPath("//a[@class='btn btn-danger btn-sm']").click();
//		Thread.sleep(3000);
		
		//list element count
//		 WebElement drop = n.findElement(By.xpath("//select[@name='project_id']"));
//	    
//		 Select dropdown = new Select(drop);
//		 
//		 List<WebElement> options = dropdown.getOptions();
//		 
//		 System.out.println("Number of options in the dropdown: " + options.size());
//		 
//		 for (WebElement option : options) {
//	            System.out.println(option.getText());
//	        }
		 
		 
		  
		//work reports
		
//		n.findElementByXPath("//a[@href='https://hyrrokkin.net/myaccount/project-times/work-report']").click();
//		Thread.sleep(2000);
		
		//datepicker
		
	//click the from date picker
//		n.findElementByXPath("//input[@name='from_date']").click();
//		Thread.sleep(2000);
		
		//current date select option 
	//	n.findElementByXPath("//a[contains(text(),'21')]").click();
		//click on the month
//		for(int i=0;i<3;i++) {
//			n.findElementByXPath("//span[contains(text(),'Next')]").click();
//			Thread.sleep(2000);
//		}
		//click on the date 
//		n.findElementByXPath("//a[@data-date='7']").click();
//		Thread.sleep(2000);
		
		//click on due date 
//		n.findElementByXPath("//input[@name='to_date']").click();
//		Thread.sleep(2000);
		
		//current date select option 
//		n.findElementByXPath("//a[contains(text(),'21')]").click();
		
		//click on the month
//				for(int i=0;i<4;i++) {
//					n.findElementByXPath("//span[contains(text(),'Next')]").click();
//					Thread.sleep(2000);
//				}
				//click on the date 
//				n.findElementByXPath("//a[@data-date='20']").click();
//				Thread.sleep(2000);
				
		//click on the project name 
//				n.findElementByXPath("//span[contains(text(),'All')]").click();
//				Thread.sleep(2000);
//				
//				
//				n.findElementByXPath("//option[@value='242']").click();
//				Thread.sleep(2000);
				
				//click on search option 
//				n.findElementByXPath("//button[@type='submit']").click();
//				Thread.sleep(2000);
//				
				//click on the reset button 
//				n.findElementByXPath("//a[@class='btn btn-danger btn-sm']").click();
//				Thread.sleep(3000);
				
				
//		
//		n.navigate().back();
//		
//		Thread.sleep(2000);
//		
//		n.navigate().forward();
		
		
		//site mangement
//		n.findElementByXPath("//a[@href='https://hyrrokkin.net/myaccount/sitemanagement']").click();
//		Thread.sleep(2000);
		
//	    click on the project name 
		
//		n.findElementByXPath("/html/body/div[1]/div[3]/div/div[2]/div/form/div/div[1]/div/div/p/span").click();
//		Thread.sleep(2000);
//		
//		n.findElementByXPath("//option[@value='197']").click();
//		Thread.sleep(2000);
		
		//click on the customer name 
//		n.findElementByXPath("/html/body/div[1]/div[3]/div/div[2]/div/form/div/div[2]/div/div/p/span").click();
//		Thread.sleep(2000);
//		
//		n.findElementByXPath("//option[@value='65']").click();
//		Thread.sleep(2000);
		
		//click on search option 
//		n.findElementByXPath("//button[@type='submit']").click();
//		Thread.sleep(2000);
		
		//click on the reset button 
//		n.findElementByXPath("//a[@class='btn btn-danger btn-sm']").click();
//		Thread.sleep(3000);
		
		
		n.quit();
		
		
	}
	
}
