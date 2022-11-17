package Devopcasting_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Devopcasting_MainPage 
{

	@FindBy (how = How.XPATH, using="//a[text()='How to Secure Docker Daemon']")
	WebElement Dockerlink;
	
	@FindBy (how = How.XPATH, using= "//button[@data-cky-tag='accept-button']")
	WebElement Acceptcookies;
	
	public void Accept_Cookies()
	{
		Acceptcookies.click();
	}
	public void Dockerlink()
	{
		Dockerlink.click();
	}
	
	//@FindBy(how = How.ID, using=" element-id")
	//private WebElement element-name;
	
}
