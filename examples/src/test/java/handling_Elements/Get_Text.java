package handling_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Get_Text {
	
	@Test
	public void gettext() {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://leafground.com/pages/table.html");
		d1.manage().window().maximize();
		String value1=d1.findElement(By.xpath("/html/body/div/div/div/div[3]/section/div[1]/table/tbody/tr[2]/td[4]")).getText();
		System.out.println(value1);
		System.out.println(d1.getTitle());
		System.out.println(d1.getCurrentUrl());
		System.out.println(d1.getPageSource());
	}
}
