package handling_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Checkbox {
	@Test
	public void checkbox1() {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://leafground.com/pages/checkbox.html");
		d1.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div[1]/input")).click();
		d1.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div[2]/input")).click();
		d1.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div[5]/input")).click();
		
		
		d1.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div[2]/input")).click();
		d1.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div[4]/input")).click();
		d1.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div[1]/input")).click();
		d1.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div[3]/input")).click();
		d1.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div[5]/input")).click();
}
	
}
