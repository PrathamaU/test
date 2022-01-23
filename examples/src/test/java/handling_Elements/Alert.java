package handling_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert {
	@Test
	public void popup()
	 {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://leafground.com/pages/Alert.html");
		
		// 1) Alert pop-up
		
		d1.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div/div/button")).click();   //click on ater box
		String msg1=d1.switchTo().alert().getText();  // for getting the text we use getText();
		System.out.println(msg1);  // printing the message
		d1.switchTo().alert().accept(); 
		
		//to click on ok button
//		
		// 2) confirm pop-up
//		
//		d1.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/button")).click();
//		d1.switchTo().alert().dismiss();
		
		//prompt box
		
//		d1.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
//		d1.switchTo().alert().sendKeys("HCL");       // for entering the text
//		d1.switchTo().alert().accept();	
//		
	}
}
