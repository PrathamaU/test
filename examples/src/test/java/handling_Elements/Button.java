package handling_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Button {

	@Test(enabled=false)
	public void button1() {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://leafground.com/pages/Button.html");
		d1.findElement(By.id("home")).click();
		}
	
	@Test(enabled=false)
	public void button2() {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://leafground.com/pages/Button.html");
		d1.findElement(By.id("position")).click();
		}
	
	@Test(enabled=false)
	public void button3() {
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://leafground.com/pages/Button.html");
		d1.findElement(By.id("color")).click();
	}
	
@Test
public void button4() {
	System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
	WebDriver d1;
	d1=new ChromeDriver();
	d1.get("http://leafground.com/pages/Button.html");
	d1.findElement(By.id("size")).click();
	d1.close();
}

}
