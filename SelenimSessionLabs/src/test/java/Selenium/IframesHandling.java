package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframesHandling {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\kppra\\Downloads\\chromedriver_win32 (2).chromedriver.exe");
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//				WebDriverWait wait = new WebDriverWait(driver,30);
				
				driver.get("https://login.salesforce.com");
				
				driver.manage().window().maximize();
				
				driver.findElement(By.name("username")).sendKeys("nov22.sowmyatm@gmail.com");
				
				driver.findElement(By.id("password")).sendKeys("Sowmyatm@1234");
				driver.findElement(By.cssSelector("#Login")).click();
				
				driver.findElement(By.id("userNav")).click();
				
				WebElement interactions=driver.findElement(By.xpath("//a[@title='My Profile']"));
				Actions action=new Actions(driver);
				action.moveToElement(interactions).build().perform();
				interactions.click();
				
				driver.switchTo().frame("//iframe[@id='contactInfoContentId']");
				
	}

}
