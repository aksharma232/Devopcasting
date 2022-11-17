package Devopcasting_testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Devopcasting_Pages.Devopcasting_MainPage;

public class Devopcasting_Docker_Test extends Devopcasting_baseclass {

	@Test
	public void Opendocker() throws InterruptedException {
		Lauchbrowser();

		Devopcasting_MainPage devop_main_page = PageFactory.initElements(d, Devopcasting_MainPage.class);

		Thread.sleep(2000);

		devop_main_page.Accept_Cookies();

		devop_main_page.Githublink();
		
		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) d;

		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		Thread.sleep(5000);
		
		js.executeScript("window.scrollBy(0,500)");
		
		js.executeScript("window.scrollBy(0,100)");

		d.navigate().back();

		devop_main_page.Dockerlink();
		
		Thread.sleep(5000);

		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		Thread.sleep(5000);
		
		js.executeScript("window.scrollBy(0,500)");

		js.executeScript("window.scrollBy(0,100)");

		d.close();

	}

}
