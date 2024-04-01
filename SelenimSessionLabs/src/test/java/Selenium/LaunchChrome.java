package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChrome {

	public static void main(String[] args) {
//     1.To launch firefox
//		System.setProperty("webdriver.gecko.driver", "path where gecko is downloaded");
//		
//		WebDriver driver1 = new FirefoxDriver();
//		driver1.get("https://www.google.com");
//		driver1.close();
		
		//2.launch chrome
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\kppra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//can use webdrivermanager to setup chrome instead of system.setproperty
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//ChromeDriver class is implementing all the methods available in WebDriver interface
		//we are creating an instance of the WebDriver interface and casting it to ChromeDriver Class. All the browser drivers 
		//like FirefoxDriver, ChromeDriver, InternetExplorerDriver, PhantomJSDriver, SafariDriver etc can implement the WebDriver interface
		
		//ChromeDriver driver = new ChromeDriver();
		//here chrome driver class implements the methods of chromedriver interface
		//The ChromeDriver instance will be only able to invoke and act on the methods 
		//implemented by ChromeDriver and supported by google-chrome only.
		
		driver.get("http://www.google.com");
		
		
		String expected_title= driver.getTitle();
		System.out.println(expected_title);
		
		String actual_title="Google";
		
		//validation
		if(expected_title.equals(actual_title))
		{
			System.out.println("correct title");
		}
		else
		{
			System.out.println("Incorrect title");
		}
		driver.close();

	}

}
