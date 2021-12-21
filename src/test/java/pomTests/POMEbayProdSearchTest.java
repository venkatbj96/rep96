package pomTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomPages.BrowserFactory;
import pomPages.ClsEbay;

public class POMEbayProdSearchTest
{
  @Test
  public void prodSearch() 
	{
		WebDriver driver=BrowserFactory.startBrowser("Chrome", "http://ebay.com");

		ClsEbay obj=new ClsEbay(driver);
		obj.fnSearch("Sony");

		Reporter.log("Ebay Product Search Test is Successful..",true);
	}
}
