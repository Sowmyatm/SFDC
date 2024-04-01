package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplementingOOPSConcepts {

	public static void main(String[] args) {
		
	//here chromedriver is an object that is implementing from webdriver(parent) interface, 
	//driver is ref name.	
		
		System.getProperty("webdriver.chrome.driver", "C:\\Users\\kppra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		
		driver.close();
		//driver.close closes the current window, driver.quit closes all browser windows 
		//and ends the webdriver session
	}

}
