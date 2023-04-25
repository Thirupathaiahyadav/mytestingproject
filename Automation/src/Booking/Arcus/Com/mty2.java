package Booking.Arcus.Com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class mty2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("weddriver.chrome.driver",
				"C:\\Users\\M Thirupathaiah\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("--remote-allow-origins=*");
		 
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		

	}

}
