package handling_Elements;


import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Ordered_list {
	
	@Test
	public void orderedlist() {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://leafground.com/pages/selectable.html");
		java.util.List<WebElement> element=d1.findElements(By.xpath("//ol[@id='selectable']/li"));
		System.out.println(element.size());    //total 7 values
		
		
		Actions act1=new Actions(d1);
		
		//we be prssed on control key and select the items nxt
		//we target the element and click on it
		act1.keyDown(Keys.CONTROL).click(element.get(0)).click(element.get(2)).click(element.get(4)).click(element.get(6)).build().perform();
		
	
		
		
		
	}
}
