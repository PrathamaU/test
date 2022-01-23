package handling_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Image {
	@Test(enabled=false)
	public void image1() {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://leafground.com/pages/Image.html");
		d1.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div/div/img")).click();
	}
	@Test(enabled=false)
	public void image2() {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://leafground.com/pages/Image.html");
		d1.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/img")).click();
	}
	
	@Test
	public void image3() {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://leafground.com/pages/Image.html");
		d1.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/img")).click();
		d1.close();
	}

}
