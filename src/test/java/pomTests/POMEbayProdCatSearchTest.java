package pomTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomPages.BrowserFactory;
import pomPages.ClsEbay;

public class POMEbayProdCatSearchTest 
{	
  @Test
  public void catSearch() 
  {
	  	WebDriver driver=BrowserFactory.startBrowser("Chrome", "http://ebay.com");

		ClsEbay obj=new ClsEbay(driver);
		obj.fnCatSearch("Cameras & Photo", "Sony");

		Reporter.log("Ebay Product Search  in a category Test is Successful..",true);
  }
}
