package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeOptions_HeadlessMode_Notifications {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("---disable notifications");
		
		//headless-without gui
		options.addArguments("---headless","---disable gpu","--window-size=1920,1080","--ignore certificate-errors");
		
		WebDriver driver=new ChromeDriver(options);
		
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.get("http://login.salesforce.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("nov22.sowmyatm@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("Sowmyatm@123");

	}

}
