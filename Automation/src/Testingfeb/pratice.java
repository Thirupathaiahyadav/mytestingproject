package Testingfeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pratice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\M Thirupathaiah\\Downloads\\geckodriver_win32\\geckodriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);

	}

}
