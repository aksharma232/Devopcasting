package Devopcasting_testcases;

import java.util.Arrays;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Devopcasting_baseclass 
{

	public WebDriver d;
	
	public void Lauchbrowser() 
	{
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver(options);
		
		d.get("https://devopcasting.com/");
		
		d.manage().window().maximize();
		
		
		
		//d.switchTo().alert().accept();
	}
}
