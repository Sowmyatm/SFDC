package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	
	public static getBrowserType(String browserName, boolean headless)
	{
		String browser= browserName.toLowerCase();
		switch(browser) {
		
		case "chrome":
			
			WebDriver driver = new ChromeDriver();
			
			if(headless)
			{
				ChromeOptions co = new ChromeOptions();
				co.addArguments("--headless");
				driver=new ChromeDriver();
			}
			
			break;
			
			case "firefox":
			
			WebDriver driver1 = new FirefoxDriver();
			
			if(headless)
			{
				FirefoxOptions fo = new FirefoxOptions();
				fo.addArguments("--headless");
				driver1=new FirefoxDriver();
			}
			
			break;
			
			case "edge":
				
				WebDriver driver2 = new EdgeDriver();
				
				if(headless)
				{
					EdgeOptions eo = new EdgeOptions();
					eo.addArguments("--headless");
					driver1=new EdgeDriver();
				}
				
				break;
		
		default:
		break;
		
		}
	}

}
