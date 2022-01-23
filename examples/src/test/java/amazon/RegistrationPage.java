package amazon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegistrationPage {
	@Test
	public void registraion() {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("https://www.amazon.com/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fdp%2FB014S6TV0Q%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		
		d1.findElement(By.id("ap_customer_name")).sendKeys("Prathama.U");
		d1.findElement(By.id("ap_email")).sendKeys("prathama.u@hcl.com");
		d1.findElement(By.id("ap_password")).sendKeys("prathama1234@123");
		d1.findElement(By.id("ap_password_check")).sendKeys("prathama1234@123");
		d1.findElement(By.id("continue")).click();

	}

}
