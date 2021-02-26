package TESTng.TESTng;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import amazon.pages.Homepage;

public class AmazonProducts {
	
	public static WebDriver driver;
	SoftAssert soft = new SoftAssert();
	
	
	@BeforeSuite
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	


	@Test
	public void openProduct() throws InterruptedException {
		//enter keyword in search box and enter
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 11",Keys.ENTER);

		//click on the brand filter
		driver.findElement(By.xpath("//span[text()='Apple']")).click();

		
		//click on iphone product
		driver.findElement(By.xpath("//span[text()='Apple iPhone 11 Pro Max (64GB, Gold) [Locked] + Carrier Subscription']")).click();
	
		//get the page
		String productName = driver.findElement(By.xpath("//h1//span")).getText();
		
		if(productName.contains("Samsung iPhone 11 Pro Max (64GB, Gold) [Locked]")) {
			System.out.println("We have opened page successfully");
		}else {
			System.out.println("Page not opened.");
		}
		
		
		Thread.sleep(3000);
		
		driver.close();
		
	

	}
	
	
}
