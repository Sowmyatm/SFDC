package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumConcepts {

	public static String main(String[] args) throws InterruptedException, IOException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\kppra\\Downloads\\chromedriver_win32 (2).chromedriver.exe");
	//instead of system.setproperty we can use webdriver.manager.setup
	//WebDriverManager.chromedriver().setup();

	WebDriver driver=new ChromeDriver();
	//ChromeDriver class is implementing all the methods available in WebDriver interface
	//we are creating an instance of the WebDriver interface and casting it to ChromeDriver Class. All the browser drivers 
	//like FirefoxDriver, ChromeDriver, InternetExplorerDriver, PhantomJSDriver, SafariDriver etc can implement the WebDriver interface
	
	//ChromeDriver driver = new ChromeDriver();
	//here chrome driver class implements the methods of chromedriver interface
	//The ChromeDriver instance will be only able to invoke and act on the methods 
	//implemented by ChromeDriver and supported by google-chrome only.
	
	driver.get("https://login.salesforce.com");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.close();
	
	TakesScreenshot screenshot = (TakesScreenshot) driver;
	File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
	String dstPath = System.getProperty("user.dir")+"\\src\\test\\java\\screenshots\\";
	File dstFile = new File(dstPath);
	FileUtils.copyFile(sourceFile,dstFile);
	//(sourceFile, "C:\\Users\\user\\eclipse-workspace\\Seleniumfacts\\Screenshots");
	return dstPath;
	//return null;
	
		

	}

	

}
