package pomTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EbayProdSearchTest
{
	@Test
	public void prodSearch() 
	{
		WebDriverManager.chromedriver().version("95").setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://ebay.com");

		driver.findElement(By.id("gh-ac")).sendKeys("Sony");
		driver.findElement(By.id("gh-btn")).click();

		Reporter.log("Ebay Product Search Test is Successful..",true);
	}
}
