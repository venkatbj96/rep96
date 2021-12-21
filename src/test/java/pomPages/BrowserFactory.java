package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory 
{
	public static WebDriver wd;
	
	public static WebDriver startBrowser(String bName,String url)
	{
		if(bName.equalsIgnoreCase("Chrome"))
		{
			 WebDriverManager.chromedriver().version("95").setup();
				wd=new ChromeDriver();		
		}
		else if(bName.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().version("65").setup();
			wd=new FirefoxDriver();		
		}
		wd.manage().window().maximize();
		wd.get(url);
		return wd;
	}
	
}
