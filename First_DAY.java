package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_DAY {

	public static void main(String[] args) {

		//first set the property in which browser are we going to use
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		//define the variable to run the driver here variable name is driver it self and is running 
		//on chrome browse
		WebDriver driver = new ChromeDriver();
		
		//maximizing the window using driver.manage().window().maximize();
		driver.manage().window().maximize();
		
		// entering the URL or website domain name driver.get(URL); since url will be string so needed to 
		// enter it in double quote
		driver.get("https://bishalkarki.com");
		
		//driver.quit and driver.close closes the browser or quit the browser
		//there is a difference between these two
		driver.quit();

	}

}
