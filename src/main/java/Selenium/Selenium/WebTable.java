package Selenium.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
	int rowcount=driver.findElements(By.xpath("//*[@id='customers']//tbody//tr")).size()-1;
	System.out.println(rowcount);
	String beforxpath="//*[@id='customers']//tbody//tr[";
	String afterxpath="]";
			//+ "//td[1]";
	
	
	
	for(int rownum=2;rownum<=rowcount+1;rownum++)
	{
		String actualxpath=beforxpath+rownum+afterxpath;
		String company=driver.findElement(By.xpath(actualxpath)).getText();
		System.out.println(company);
	}

	}

}
