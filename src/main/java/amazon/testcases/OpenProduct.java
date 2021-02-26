package amazon.testcases;

import org.testng.annotations.Test;

import amazon.base.AmazonBase;
import amazon.pages.Homepage;

public class OpenProduct extends AmazonBase{

	@Test
	public void openIphoneProduct(String brand) {
		
		if(brand == "Apple") {
			new Homepage().sendKeyword().clickSearchIcon().clickFilter("Apple").selectProduct().getProductTitle().verifyPage();
			
		}else if(brand == "Samsung"){
			new Homepage().sendKeyword().clickSearchIcon().clickFilter("Apple").selectProduct().getProductTitle().verifyPage();
		}
		
	}
	
	//@Test
	public void openSamsungProduct() {
		new Homepage().sendKeyword().clickSearchIcon().clickFilter("Samsung Electronics").selectProduct().getProductTitle().verifyPage();
		
	}
	
}
