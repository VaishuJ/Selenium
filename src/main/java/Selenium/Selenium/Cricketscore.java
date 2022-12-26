package Selenium.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cricketscore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/india-a-in-bangladesh-2022-23-1345446/bangladesh-a-vs-india-a-2nd-unofficial-test-1345449/full-scorecard");
       List< WebElement> playerList=driver.findElements(By.xpath( "//table[@class='ds-w-full ds-table ds-table-md ds-table-auto  ci-scorecard-table'][1]"));
	    System.out.println(playerList.size());
	    
	    for(int i=0;i<playerList.size();i++)
	    {
	    	String PlayerName=playerList.get(i).getText();
	    	System.out.println(PlayerName);
	    }
	}
	

}
