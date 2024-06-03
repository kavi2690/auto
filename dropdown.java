package a1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dropdown {
	
	
	@BeforeTest
	
	public void drop() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Pictures\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver n ;  n= new ChromeDriver();
		
		n.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
        
		System.out.println("visiting web site");
		
		n.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		n.manage().window().maximize();
		
	

		
		WebElement drop=n.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
		
		Select k = new Select(drop);
		k.selectByIndex(5);
		
		n.quit();
		
	}
	
}
