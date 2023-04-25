package Booking.Arcus.Com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class tttttt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\M Thirupathaiah\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		
		
		

	}

}
