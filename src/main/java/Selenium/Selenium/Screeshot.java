package Selenium.Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
 
import io.github.bonigarcia.wdm.WebDriverManager;

public class Screeshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://app.hubspot.com/login?hubs_signup-url=www.hubspot.com/&hubs_signup-cta=homepage-nav-login");
	
	WebElement email=driver.findElement(By.id("username"));
	WebElement password=driver.findElement(By.id("password"));
    WebElement lgnbtn=driver.findElement(By.id("loginBtn"));
    
    Actions act=new Actions(driver);
    act.sendKeys(email, "vaishali").build().perform();
    act.sendKeys(password, "1234ert").build().perform();
    act.click(lgnbtn).build().perform();
  File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  File dest=new File(".\\screenshot\\hot.jpg");
  FileUtils.copyFile(src, dest);
    
	

	}

}
