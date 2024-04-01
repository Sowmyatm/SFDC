package Selenium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {
	private static String SecondTab = null;
	private static final String Firsttab = null;
	static WebDriver driver;
	

	public static String main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.salesforce.com/");//parent window
		
		
		
		String FirsttabId=driver.getWindowHandle();
		
		driver.manage().window().maximize();
		
		
//		driver.manage().window().maximize();
//		//Thread.sleep(3000);
//		driver.findElement(By.name("username")).sendKeys("nov22.sowmyatm@gmail.com");
//		//Thread.sleep(3000);
//		driver.findElement(By.id("password")).sendKeys("Sowmyatm@123");
//		//driver.findElement(By.cssSelector("#Login")).click();
//		driver.findElement(By.xpath("//*[@id='login_div']button")).click();
//		//Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=''user_div']/div[1]/a[1]")).click();
//		//dropdown handling
//		//Select s =new Select(driver.findElement(By.id("city")));
//		//s.selectByIndex(0);
//		//mousehover
//		WebElement interactions=driver.findElement(By.xpath("(//button[@class='dropbtn'])[2]"));
//		Actions action=new Actions(driver);
//		action.moveToElement(interactions).build().perform();
		
		
		
		//window handles
		Set<String>WindowsID=driver.getWindowHandles();
		Iterator<String>itr=WindowsID.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			SecondTab=itr.next();
		}
//		driver.switchTo().window(SecondTab);
//		driver.findElement(By.xpath("//*[@id='editors-body']")).click();
//		driver.close();
		//driver.switchTo().window(FirstTab);
		//return SecondTab;
		
		
		
		//for many windows
		
		Set<String>handles =driver.getWindowHandles();
		List<String>hList=new ArrayList<String>(handles);
		if(SecondTab("Facebook",hList))
		{
			System.out.println(driver.getCurrentUrl()+ " : " +driver.getTitle());
		}
	}
//		
		 static void Firsttab(String FirsttabId)
		{
			driver.switchTo().window(Firsttab);
		}
		 
		 public static boolean SecondTab(String windowTitle,List<String> hList)
		 {
			 for(String e:hList)
			 {
				 String title = driver.switchTo().window(e).getTitle();
				 if(title.contains(windowTitle))
				 {
					 System.out.println("Found right window");
					 return true;
				 }
		 }
			 return false;
//	}
	

}
}
