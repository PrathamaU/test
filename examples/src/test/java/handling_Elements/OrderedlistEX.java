package handling_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OrderedlistEX {
	
	@Test
	public void orderedlistex() {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://demo.automationtesting.in/Selectable.html");
		java.util.List<WebElement> element=d1.findElements(By.xpath("//ul[@id='Serialize']/li"));
		System.out.println(element.size());    //we will get total number of values
		
		
		Actions act1=new Actions(d1);
		
		//we be pressed on control key and select the items nxt
		//we target the element and click on it
		act1.keyDown(Keys.CONTROL).click(element.get(0)).build().perform();
		
	
		
		
		
	}

}
