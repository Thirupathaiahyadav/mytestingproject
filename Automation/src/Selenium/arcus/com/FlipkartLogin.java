package Selenium.arcus.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FlipkartLogin {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\M Thirupathaiah\\OneDrive\\Desktop\\Thiru\\Automation files\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		System.out.println("FLIPKART SITE OPENED");
		
		driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("7893701376");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Chinna@136");
		Thread.sleep(3000);
		System.out.println("Successfully login in flipkart account");
		
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//inp ut[@type=\"_396cs4  _3exPp9\"]")).sendKeys("mobiles");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type=\"xtXmba\"]")).sendKeys("Electronics");
		Thread.sleep(3000);
		

		

		
		
	   
		
	}

}
