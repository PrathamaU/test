package functionalities;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import object_repository.Elements;

public class Register {
	@Test
	public void register_fn() throws InterruptedException, AWTException, IOException {
	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	WebDriver d1;
	d1=new ChromeDriver();
	d1.get("https://phptravels.org/register.php");
	d1.manage().window().maximize();

	Elements el=new Elements();

	el.first_name(d1).sendKeys("Prathama");
	el.last_name(d1).sendKeys("U");
	el.e_mail(d1).sendKeys("prathamau99@gmail.com");
	el.phone_no(d1).sendKeys("7337664837");
	el.street_adress(d1).sendKeys("banashankari");
	el.street_adress2(d1).sendKeys("2nd stage");
	el.city(d1).sendKeys("Bangalore");
	el.state(d1).sendKeys("Bihar");
	el.post_code(d1).sendKeys("560070");
	el.country(d1);
	el.company_name(d1).sendKeys("HCL");
	el.mobile_no(d1).sendKeys("7337664837");
	Thread.sleep(2000);
	el.password(d1).sendKeys("Prathama1999@");
	el.confirm_password(d1).sendKeys("Prathama1999@");
	((JavascriptExecutor)d1).executeScript("scroll(0,2500)");
	Thread.sleep(10000);
	el.register_button(d1).click();

	//robot class for taking full screenshot
	Robot robot1=new Robot();
	Dimension sc_size=Toolkit.getDefaultToolkit().getScreenSize();
	Rectangle rect=new Rectangle(sc_size);
	BufferedImage Source=robot1.createScreenCapture(rect);
	File destination=new File("C:\\Users\\Admin\\screen1.png");
	ImageIO.write(Source, "png", destination);	
	}
	
}
