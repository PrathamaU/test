package handling_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UnorderedList_Ex {
	
	@Test
	public void unordered_list_ex() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://demo.automationtesting.in/AutoComplete.html");
		
		//find element and send the value to the textbox to be searched
		d1.findElement(By.id("searchbox")).sendKeys("I");
		
		Thread.sleep(5000);
		 java.util.List<WebElement> element1 = d1.findElements(By.xpath("//ul[@id='ui-id-1']/li"));

		 
		 //iterate
		 
		 for(WebElement  el:element1) {
			if( el.getText().equalsIgnoreCase("India")) {
				el.click();
				break;
			}
		 }

	}
}
