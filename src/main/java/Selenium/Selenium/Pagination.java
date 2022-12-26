package Selenium.Selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pagination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orschelnfarmhome.com/automotive/grease-oil.html");
	List<WebElement> list=driver.findElements(By.xpath("//a[contains(@href,'https://www.orschelnfarmhome.com/automotive/grease-oil.html?')]"));
	System.out.println(list.size());
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	int i=1;
	while(true)
	{
		if(driver.findElements(By.linkText( "Castol® GTX® 5W30 Full Synthetic Motor Oil - 1Qt")).size()==1)
           {
			driver.findElement(By.linkText( "Castrol® GTX® 5W30 Full Synthetic Motor Oil - 1Qt")).click();
			break;
	       }
		else
		{
			try {
				list.get(i).click();
			}
			catch(Exception e)
			{
				System.out.println("Pages are over");
				System.out.println(e);
				break;
			}
			list=driver.findElements(By.xpath("//a[contains(@href,'https://www.orschelnfarmhome.com/automotive/grease-oil.html?')]"));
		}
		i++;
	}
	
	
	}

	}


