package object_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Elements {
	
	public WebElement first_name(WebDriver d1) {
		return d1.findElement(By.id("inputFirstName"));
	}
	
	public WebElement last_name(WebDriver d1) {
		return	d1.findElement(By.id("inputLastName"));

	}
	
	public WebElement e_mail(WebDriver d1) {
		return d1.findElement(By.id("inputEmail"));

	}

	public WebElement phone_no(WebDriver d1) {
		return d1.findElement(By.id("inputPhone"));
	}

	public WebElement company_name(WebDriver d1) {
		return d1.findElement(By.id("inputCompanyName"));

		
	}
	
	public WebElement street_adress(WebDriver d1) {
		return d1.findElement(By.id("inputAddress1"));

	}
	
	public WebElement street_adress2(WebDriver d1) {
		return d1.findElement(By.id("inputAddress2"));

	}
	
	public WebElement city(WebDriver d1) {
		return d1.findElement(By.id("inputCity"));
	
	}
	
		public WebElement state(WebDriver d1) {
			return d1.findElement(By.id("stateinput"));
			
	}
	
	public WebElement post_code(WebDriver d1) {
		return d1.findElement(By.id("inputPostcode"));

	}

	public WebElement country(WebDriver d1) {
		Select s2=new Select(d1.findElement(By.id("inputCountry")));
		s2.selectByValue("IN");
		return null;
	}
	public WebElement mobile_no(WebDriver d1) {
		return d1.findElement(By.id("customfield2"));

	}

	public WebElement password(WebDriver d1) {
return d1.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div/div[1]/form/div[2]/div/div[2]/div/div[1]/input"));
}

	
	public WebElement confirm_password(WebDriver d1) {
		return	d1.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div/div[1]/form/div[2]/div/div[3]/div/input"));

	}
	
	public WebElement register_button(WebDriver d1) {
		return d1.findElement(By.xpath("//input[@value='Register']"));	
	}
}
