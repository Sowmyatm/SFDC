package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {

	public static void main(String[] args) {
		
	//thread.sleep--hardwait thread.sleep(10000); -if the ele is loaded within 2 sec it will wait till 8 more sec to comlete the tas
	//the remaining 8 sec are wasted
									
	//dynamic waits- if the time out is given 10000sec, and if the ele is found in 2 sec the scricpt will go go net step and it will not wait furthermore
	//if the ele is not found in given 10 sec, then the script fails//elenotfoudexception
	//dynamic wait waits till the ele appears but there will be max time for timeout 
									
	//implicit wait--waits for pageload,synchronous elements,declared only once for all the elements
	//explicit wait-waits for certain conditions for an ajax(asynchronous java and XML elements)elemnts
	//fluent wait--same as explicit wait, polling period
		
		//boolean methods--isDisplayed(), isEnabled(), isSelected();
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//implicit
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//explicit can be declared in the beginning of pgm and can called later whenever needed
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		driver.get("http://login.salesforce.com");
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("nov22.sowmyatm@gmail.com");
		//Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("Sowmyatm@123");
//		driver.findElement(By.cssSelector("#Login")).click();
		
		//WebDriverWait wait = new WebDriverWait(driver,30);//declred in the beginning
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("xyz"))));
		
		
	}

}
