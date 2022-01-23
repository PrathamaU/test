package handling_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown {
	@Test
	public void checkbox1() {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://leafground.com/pages/Dropdown.html");
		
		//selectByVisibleText
		Select s1=new Select(d1.findElement(By.id("dropdown1")));   // identifing the element
		s1.selectByVisibleText("UFT/QTP");    
		
		//selectByValue
		Select s2=new Select(d1.findElement(By.name("dropdown2")));
		s2.selectByValue("1");
		
		//selectbyindex
		Select s3=new Select(d1.findElement(By.id("dropdown3")));
		s3.selectByIndex(2);
		
		//it cannot handle more than 1
		Select s4=new Select(d1.findElement(By.className("dropdown")));
		Boolean msg=s4.isMultiple();
		System.out.println(msg);
		
		//assignment of dropdown checkbox
		Select s5=new Select(d1.findElement(By.className("dropdown")));
		s5.selectByVisibleText("Selenium");
		
		
		
}
}