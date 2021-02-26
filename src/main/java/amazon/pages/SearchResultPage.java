package amazon.pages;

import org.openqa.selenium.By;

import TESTng.TESTng.AmazonProducts;
import amazon.base.AmazonBase;

public class SearchResultPage extends AmazonBase {

	public FilterListPage clickFilter(String brand) {
		//click on the brand filter
		driver.findElement(By.xpath("//span[text()='"+brand+"']")).click();
		return new FilterListPage();
	}
	
	
}
