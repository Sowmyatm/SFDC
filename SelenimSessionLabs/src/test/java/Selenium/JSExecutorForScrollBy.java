package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSExecutorForScrollBy {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		driver.get("http://login.salesforce.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("nov22.sowmyatm@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("Sowmyatm@1234");
		driver.findElement(By.cssSelector("#Login")).click();
		
		//JSexecutor for click operation
		
		WebElement button=driver.findElement(By.id("userNav"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver; //create object and typecast
		js.executeScript("argument[0].click();", button); //click
		
		//JSexecutor instead of sendkeys
		
		js.executeScript("argument[0].value='sowmya';",button);
		
		//JSexectutor to scroll
		//js.executeScript("window.scrollBy(0,700);");
		
		//if we want to scroll long webpage then use for loop or until a specific element
		
//		for(int i=0;i<5;i++)
//		{
//			js.executeScript("window.scrollBy(0,700);");
//			if(driver.findElement(By.id("")).isDisplayed())
//			{
//				break;
//			}
//		}
		
		//to generate alert
//		js.executeScript("alert('Welcome to Salesforce');");
//		driver.switchTo().alert().accept();
		
	}

}
