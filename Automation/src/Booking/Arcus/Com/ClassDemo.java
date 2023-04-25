package Booking.Arcus.Com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClassDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\M Thirupathaiah\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("ap_email")).sendKeys("thirupathaiah136@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("ap_password")).sendKeys("Chinna@136");
		Thread.sleep(2000);
		
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(2000);
		
		
		
		
		

	}

}
