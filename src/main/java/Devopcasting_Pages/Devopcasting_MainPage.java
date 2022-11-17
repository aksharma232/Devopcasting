package Devopcasting_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Devopcasting_MainPage 
{

	@FindBy (how = How.XPATH, using="//a[contains(text(),'Git – Distributed Version Control System')]")
	WebElement Githublink;
	
	@FindBy (how = How.XPATH, using= "//button[@data-cky-tag='accept-button']")
	WebElement Acceptcookies;
	
	@FindBy (how = How.XPATH, using= "//a[normalize-space()='How to Secure Docker Daemon']")
	WebElement Dockerlink;
	
	@FindBy (how = How.XPATH, using= "a[title='Home'][tabindex='-1']")
	WebElement Homebutton;
	 
	public WebElement Homebutton()
	{
		return Homebutton();
	}
	
	public void Accept_Cookies()
	{
		Acceptcookies.click();
	}
	public void Dockerlink()
	{
		Dockerlink.click();
	}
	
	public void Githublink()
	{
		Githublink.click();
	}

	
}
