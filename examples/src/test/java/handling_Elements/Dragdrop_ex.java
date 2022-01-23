package handling_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Dragdrop_ex {
	@Test
	public void draganddrop() {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://leafground.com/pages/drop.html");
		WebElement ele1= d1.findElement(By.id("draggable"));
//		Actions act1=new Actions(d1);
		
		Actions act2=new Actions(d1);
		WebElement ele2=d1.findElement(By.id("droppable"));
		act2.dragAndDrop(ele1, ele2).build().perform();
	}

}
