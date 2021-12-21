package pomPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ClsEbay 
{
	public WebDriver wd;
	
	public ClsEbay(WebDriver d)
	{
		wd=d;
	}
	
	By txtSearch=By.id("gh-ac");
	By btnSearch=By.id("gh-btn");
	By ddCat=By.id("gh-cat");
	
	public void fnSearch(String prodName)
	{
		wd.findElement(txtSearch).sendKeys(prodName);
		wd.findElement(btnSearch).click();
	}
	
	public void fnCatSearch(String cat,String pName)
	{
		WebElement dd=wd.findElement(ddCat);
		Select s=new Select(dd);
		s.selectByVisibleText(cat);
		
		fnSearch(pName);
	}
}
