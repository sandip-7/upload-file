package Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		//first set the property in which browser are we going to use
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		//define the variable to run the driver here variable name is driver it self and is running 
		//on chrome browse
		WebDriver driver = new ChromeDriver();
		
		//maximizing the window using driver.manage().window().maximize();
		driver.manage().window().maximize();
		
		// entering the URL or website domain name driver.get(URL); since url will be string so needed to 
		// enter it in double quote
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		
		
		WebElement nav_smp_alert, smp_button,nav_conf_alert, conf_button, nav_promp_alert, promp_button;
		
		//For simple alert	
		nav_smp_alert = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a"));
		nav_smp_alert.click();
		
		smp_button = driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
		smp_button.click();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		//For Confirmation alert
		nav_conf_alert = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		nav_conf_alert.click();
		
		conf_button = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
		conf_button.click();
		Thread.sleep(5000);
		alert.dismiss();
		
		//For prompt alert
		nav_promp_alert = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		nav_promp_alert.click();
		
		promp_button = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		promp_button.click();
		Thread.sleep(5000);
		alert.sendKeys("Class8am");
		alert.accept();
		
		
		


	}

}
