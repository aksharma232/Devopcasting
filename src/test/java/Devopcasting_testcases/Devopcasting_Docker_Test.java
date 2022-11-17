package Devopcasting_testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Devopcasting_Pages.Devopcasting_MainPage;

public class Devopcasting_Docker_Test extends Devopcasting_baseclass 
{

	@Test
	public void Opendocker() throws InterruptedException
	{
		Lauchbrowser();
		
		Devopcasting_MainPage devop_main_page = PageFactory.initElements(d, Devopcasting_MainPage.class);
		
		
		Thread.sleep(2000);
		devop_main_page.Accept_Cookies();
		
		
		
		List<WebElement> allLinks = d.findElements(By.tagName("a"));
		
		
		System.out.println(allLinks.size());
		
		for(WebElement link:allLinks)
		{
			for(int retry =0;retry < 5; retry ++)
			{	
				try
				{
					d.navigate().refresh();
					System.out.println(link.getText() + " - " + link.getAttribute("href"));
			
			 d.get(link.getAttribute("href"));
				}
				catch(StaleElementReferenceException ex)
				{
					System.out.println(ex.toString());
				}
			}
			 Thread.sleep(2000);
			
			 d.navigate().back();
			 
			 //Thread.sleep(2000);
			
			//d.findElement(By.xpath("a[title='Home'][tabindex='-1']")).click();
		}
		
		
		/*
		
		
		devop_main_page.Dockerlink();
		
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		
		Thread.sleep(2000);
		
		*/
		d.close();
		
	}
}
