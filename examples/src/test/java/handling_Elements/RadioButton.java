package handling_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButton {
	@Test(enabled=false)
	public void radiobutton1() {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://leafground.com/pages/radio.html");
		d1.findElement(By.id("no")).click();
	}
	
	@Test(enabled=false)
	public void radiobutton2() {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://leafground.com/pages/radio.html");
		d1.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/label[2]/input")).click();
		}
	@Test
	public void radiobutton3() {
	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://leafground.com/pages/radio.html");
		d1.findElement(By.className("myradio")).click();
		}
}

