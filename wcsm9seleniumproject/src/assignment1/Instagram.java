package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.instagram.com/");
			Thread.sleep(2000);
			
			//identify usernameTextbox and pass input
			driver.findElement(By.xpath("//input[contains(@name,'u')]")).sendKeys("12345");
			
			//identify passwordTextbox and pass input
			driver.findElement(By.xpath("//input[contains(@name,'p')]")).sendKeys("manager");
			
			//identify login button 
			driver.findElement(By.xpath("//button[contains(@class,'acap')]")).click();
			Thread.sleep(2000);
			driver.quit();
					
	}
}

