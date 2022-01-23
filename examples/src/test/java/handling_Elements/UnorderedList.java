package handling_Elements;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UnorderedList {
	@Test
	public void unordered_list() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://leafground.com/pages/autoComplete.html");
		
		//find element and sen the value to the textbox to be searched
		d1.findElement(By.id("tags")).sendKeys("A");
		
		Thread.sleep(3000);
//		 java.util.List<WebElement> element1 = d1.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		 java.util.List<WebElement> element1 = d1.findElements(By.xpath(""));

		 
		 //iterate
		 
		 for(WebElement  el:element1) {
			if( el.getText().equals("SOAP")) {
				el.click();
				break;
			}
		 }
		 
		 
	}

}
