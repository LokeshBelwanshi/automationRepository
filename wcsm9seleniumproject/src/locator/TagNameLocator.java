package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {
	
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("file:///C:/Users/LOKESH/Desktop/WebElement/SimpleLogin.html");
		 Thread.sleep(2000);
		 //identify usernameTB and pass input as "admin"
		 driver.findElement(By.tagName("input")).sendKeys("admin");
		 Thread.sleep(2000);
		//identify passwordTB and pass input as "manager"
		 driver.findElement(By.tagName("input")).sendKeys("manager");
	}

}
