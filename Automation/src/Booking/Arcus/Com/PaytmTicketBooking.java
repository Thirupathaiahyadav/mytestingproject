package Booking.Arcus.Com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaytmTicketBooking {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\M Thirupathaiah\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://paytm.com/train-tickets");
		Thread.sleep(3000);
		System.out.println("successfully home page open");
		
		
		driver.findElement(By.xpath("//input[@class=\"fl-input\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"fl-input\"]")).sendKeys("Secunderabad");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@class=\"fl-input\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"fl-input\"]")).sendKeys("Mumbai");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//input[@class=\"fl-input _3VPG\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"fl-input _3VPG\"]")).sendKeys("20 Dec 2022");
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
	}

}
