package Booking.Arcus.Com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyTrip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.drive",
"C:\\Users\\M Thirupathaiah\\OneDrive\\Desktop\\Thiru\\Automation files\\chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.makemytrip.com/railways/");
		Thread.sleep(5000);
		System.out.println("WEBSITE PAGE WILL BE OPENED");
		
		driver.findElement(By.xpath("//div[@class=\"loginCardNew makeFlex hrtlCenter cursorPointer appendBottom10\"]")).click();
		Thread.sleep(5000);
		System.out.println("LOGIN PAGE OPENED");
		
		driver.findElement(By.id("username")).sendKeys("6302557118");
		Thread.sleep(4000);
		System.out.println("NUMBER SEND SUCCESSFUL");
		
		driver.findElement(By.xpath("//button[@type=\'capText font16']")).click();
		
		

		

	}

}
