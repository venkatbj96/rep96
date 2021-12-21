package ddfDemo;
import java.sql.*;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;

public class DDFWithDB 
{
	@Test(dataProvider = "ebayDBData")
	public void catSearch(String ddValue,String txtValue) 
	{
		WebDriverManager.chromedriver().version("95").setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://ebay.com");

		WebElement dd=driver.findElement(By.id("gh-cat"));
		Select s=new Select(dd);
		s.selectByVisibleText(ddValue);

		driver.findElement(By.id("gh-ac")).sendKeys(txtValue);
		driver.findElement(By.id("gh-btn")).click();

		Reporter.log("'" + txtValue + "' Product Search in '" + ddValue + "' Category Test is Successful..",true);
	}

	@DataProvider
	public Object[][] ebayDBData() throws Exception
	{
Object[][] myData=new Object[2][2];
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=ebay7am;integratedsecurity=true");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("Select * from ebayInput");
		
		int i=0;
		while(rs.next())
		{
			myData[i][0]=rs.getString(1);
			myData[i][1]=rs.getString(2);
			i=i+1;
		}
		
		return myData;
	}
}
