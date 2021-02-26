package amazon.pages;

import javax.naming.directory.SearchResult;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import amazon.base.AmazonBase;

public class Homepage extends AmazonBase{

	
	
	public Homepage sendKeyword() {
		//enter keyword in search box and enter
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 11");
		return this;
	}
	
	
	public SearchResultPage clickSearchIcon() {
		//click on the search icon
		driver.findElement(By.id("nav-search-submit-button")).click();
		return new SearchResultPage();
	}
	
	
}
