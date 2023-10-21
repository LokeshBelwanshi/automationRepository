package assignment2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IrctcXpath {
	public static void main(String[] args) throws InterruptedException  {
	
		ChromeOptions co=new ChromeOptions();
		co.addArguments("-disable-notifications");
		
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.switchTo().activeElement().sendKeys("pune");
		Thread.sleep(2000);
	

	}

}
