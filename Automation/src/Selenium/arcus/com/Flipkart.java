package Selenium.arcus.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome driver",
				"C:\\Users\\M Thirupathaiah\\OneDrive\\Desktop\\Thiru\\Automation files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("7893701376");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Chinna@136");
		Thread.sleep(2000);
		
		
		
		

	}

}
