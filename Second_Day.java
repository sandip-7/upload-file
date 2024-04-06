package Automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Second_Day {

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
				driver.get("https://demoblaze.com");
				
				WebElement nav_Login, txtbox_usrname, txtbox_pswd, loginButton;
				
				nav_Login = driver.findElement(By.id("login2"));
				nav_Login.click();
				
				Thread.sleep(10000);
				
				txtbox_usrname = driver.findElement(By.id("loginusername"));
				txtbox_usrname.sendKeys("testmorning");
				
				txtbox_pswd = driver.findElement(By.id("loginpassword"));
				txtbox_pswd.sendKeys("test123");
				
				loginButton = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
				loginButton.click();
				
				Thread.sleep(5000);
				
				driver.close();
				

	}

}
