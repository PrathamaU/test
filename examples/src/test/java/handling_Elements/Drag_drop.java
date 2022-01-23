package handling_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Drag_drop {
	@Test
	public void dragdrop() {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://leafground.com/pages/drag.html");
		
		WebElement ele1= d1.findElement(By.id("draggable"));
		Actions act1=new Actions(d1);
		act1.dragAndDropBy(ele1, 250, 350).build().perform();
		
		d1.navigate().to("http://leafground.com/pages/drop.html");
		Actions act2=new Actions(d1);
		WebElement ele2=d1.findElement(By.id("draggable"));
		WebElement ele3=d1.findElement(By.id("droppable"));
		act2.dragAndDrop(ele2, ele3).build().perform();
	}
}
