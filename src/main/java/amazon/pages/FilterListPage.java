package amazon.pages;

import org.openqa.selenium.By;

import TESTng.TESTng.AmazonProducts;
import amazon.base.AmazonBase;

public class FilterListPage extends AmazonBase{

	public ProductPage selectProduct() {
		//click on iphone product
		driver.findElement(By.xpath("//span[text()='Apple iPhone 11 (64GB, Yellow) [Locked] + Carrier Subscription']")).click();
		return new ProductPage();
		
	}
	
	
}
