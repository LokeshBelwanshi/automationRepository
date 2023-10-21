package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fireflink {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://app.fireflink.com/");
		Thread.sleep(2000);
		//identify usernameTB by using id
		driver.findElement(By.id("mui-1")).sendKeys("admin");
		Thread.sleep(2000);
		//identify passswordTB by using id
		driver.findElement(By.id("mui-2")).sendKeys("manager");
	}
}
