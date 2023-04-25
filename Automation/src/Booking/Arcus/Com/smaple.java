package Booking.Arcus.Com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class smaple {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\M Thirupathaiah\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("\"//input[@class=\\\"_2IX_2- VJZDxU\\\"]\"")).sendKeys("7893701376");
		Thread.sleep(2000);

	}

}
