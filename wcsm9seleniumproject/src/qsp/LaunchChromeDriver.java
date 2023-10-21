package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeDriver {

	public static void main(String[] args) throws InterruptedException {
		// To launch Chrome Driver(c);
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		System.out.println("Chrome is open");
		Thread.sleep(2000);
		driver.close();
		System.out.println("Chrome is close");

	}

}
