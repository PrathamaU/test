package handling_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frames {
	
	@Test
	public void frame()
	 {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://leafground.com/pages/frame.html");
		
		//single frame
		
		
		d1.switchTo().frame(0);     //frame with index value        
		d1.findElement(By.id("Click")).click();
		d1.switchTo().defaultContent();   //come out of frame
		
		
		//double frame
		
		WebElement element1=d1.findElement(By.xpath("//iframe[@src='page.html']"));
		d1.switchTo().frame(element1);   //frame with webelement
		//inner frame
		d1.switchTo().frame("frame2");   //frame with name
		d1.findElement(By.id("Click1")).click();
		d1.switchTo().parentFrame();         //coming to parent frame
		
		
	 }
}
