package handling_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert_example {
	
	@Test
	public void pop_upEx()
	 {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://demo.automationtesting.in/Alerts.html");
		
		// 1) Alert pop-up
		
		d1.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();   //click on ater box
		String msg1=d1.switchTo().alert().getText();  // for getting the text we use getText();
		System.out.println(msg1);  // printing the message
		d1.switchTo().alert().accept();     //to click on ok button
		
	// 2) confirm pop-up

		d1.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		d1.switchTo().alert().dismiss();
		
		
		//prompt box
		
		d1.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		d1.switchTo().alert().sendKeys("how are you!!!!!!");
		d1.switchTo().alert().accept();

		
		
}


}
