package handling_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class test1 {
	@Test
	public void testleaf() {
	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://leafground.com/");
		d1.findElement(By.linkText("Edit")).click();
		Actions act1=new Actions(d1);
		WebElement ele1=d1.findElement(By.id("email"));
		
		act1.sendKeys(ele1,"pratha@123").doubleClick().contextClick().build().perform();
	}
}

				
				
				
				
				
				
				
				
		
	
		
