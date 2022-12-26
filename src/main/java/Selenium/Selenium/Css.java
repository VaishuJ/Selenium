package Selenium.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orschelnfarmhome.com/customer/account/login/");
		driver.findElement(By.cssSelector("#email")).sendKeys("vaishali");
		//driver.findElement(By.cssSelector(".input-text")).sendKeys("Welcome");
		driver.findElement(By.cssSelector("@class^='input'")).click();
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript(null, args);

	}

}
