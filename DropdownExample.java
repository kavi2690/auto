package a2;


	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	import java.util.List;

	public class DropdownExample {
	    public static void main(String[] args) {
	        // Set the path to the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "");

	        // Initialize WebDriver
	        WebDriver driver = new ChromeDriver();

	        // Open the webpage that contains the dropdown
	        driver.get("https://www.leafground.com/select.xhtml");

	        // Locate the dropdown by its ID or other appropriate selector
	        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));
	        
	        // Create a Select object
	        Select dropdown = new Select(dropdownElement);
	        
	        // Get all options in the dropdown
	        List<WebElement> options = dropdown.getOptions();
	        
	        // Print the text of each option
	        for (WebElement option : options) {
	            System.out.println(option.getText());
	        }
	        
	        // Close the browser
	        driver.quit();
	    }
	}


