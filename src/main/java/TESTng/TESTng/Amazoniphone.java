package TESTng.TESTng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazoniphone {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//enter keyword in search box and enter
		driver.findElementById("twotabsearchtextbox").sendKeys("iphone 11",Keys.ENTER);
		
		//click on the search icon
		//driver.findElementById("nav-search-submit-button").click();
		
		//click on the brand filter
		driver.findElementByXPath("//span[text()='Apple']").click();
		
    	//click on iphone product
		driver.findElementByXPath("//span[text()='Apple iPhone 11 Pro Max (64GB, Gold) [Locked] + Carrier Subscription']").click();
		
		//get the page
		String productName = driver.findElementByXPath("//h1//span").getText();
		
		if(productName.contains("Samsung iPhone 11 Pro Max (64GB, Gold) [Locked]")) {
			System.out.println("We have opened page successfully");
		}else {
			System.out.println("Page not opened.");
		}

		Thread.sleep(3000);
		
		driver.close();
		
		
	}
	

}
