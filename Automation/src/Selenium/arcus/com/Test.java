package Selenium.arcus.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver,chrome.driver",
				"C:\\Users\\M Thirupathaiah\\OneDrive\\Desktop\\Thiru\\Automation files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);

	}

}
