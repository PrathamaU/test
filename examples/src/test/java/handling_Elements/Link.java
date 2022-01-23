package handling_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Link {
	@Test(enabled=false)
	public void link1() {
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://leafground.com/pages/Link.html");
		d1.findElement(By.linkText("Go to Home Page")).click();
		}
	@Test(enabled=false)
	public void link2() {
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://leafground.com/pages/Link.html");
		d1.findElement(By.linkText("Find where am supposed to go without clicking me?")).click();
		}
	
	@Test(enabled=false)
	public void link3() {
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://leafground.com/pages/Link.html");
		d1.findElement(By.linkText("Verify am I broken?")).click();
		}
	@Test(enabled=false)
	public void link4() {
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://leafground.com/pages/Link.html");
		d1.findElement(By.linkText("Go to Home Page")).click();
		}
	@Test
	public void link5() {
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://leafground.com/pages/Link.html");
		d1.findElement(By.linkText("How many links are available in this page?")).click();
		d1.close();
		}
	
}
