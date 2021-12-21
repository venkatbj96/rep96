package myDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowser
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().version("96").setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://ebay.com");
	}

}
