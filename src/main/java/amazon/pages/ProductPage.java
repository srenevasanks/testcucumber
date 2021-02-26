package amazon.pages;

import org.openqa.selenium.By;


import amazon.base.AmazonBase;

public class ProductPage extends AmazonBase {

	public static String productName;
	
	public ProductPage getProductTitle() {
		//get the title of the product
		productName = driver.findElement(By.xpath("//h1//span")).getText();
		return this;
	}
	
	public void verifyPage() {
		if(productName.contains("Samsung iPhone 11 Pro Max (64GB, Gold) [Locked]")) {
			System.out.println("We have opened page successfully");
		}else {
			System.out.println("Page not opened.");
		}
	}
	
}
