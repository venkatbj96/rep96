package myDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyTest 
{
	@Test
	public void Search()
	{
		WebDriverManager.chromedriver().version("95").setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://ebay.com");

		WebElement dd=driver.findElement(By.id("gh-cat"));
		Select s=new Select(dd);
		s.selectByVisibleText("Cameras & Photo");

		driver.findElement(By.id("gh-ac")).sendKeys("Sony");
		driver.findElement(By.id("gh-btn")).click();

		Reporter.log("Ebay Search Test is Successful..",true);
	}
}
