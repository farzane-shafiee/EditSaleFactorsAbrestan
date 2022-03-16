package Establishment.Login.pageObject;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	Actions action;
	
	@FindBy(id="username") WebElement username;
	@FindBy(id="password") WebElement password;
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/div/div[2]/form/div[3]/button") WebElement insert;
	@FindBy(id="login_google_btn") WebElement insertWhitGoogle;
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);	
		action = new Actions(driver);
	}
	
	//login whit username and password number or email
	public void login(List<String[]> list) {
		//Iterator<String[]> loginDataIt = login.iterator();		
		username.sendKeys(list.get(0));
		password.sendKeys(list.get(1));
		insert.click();
	}
	
	//
	public void EditFactors(List<String[]> list) throws InterruptedException {
		//Iterator<String[]> loginDataIt = login.iterator();
		for(int i = 0 ; i < list.size() ; i++) {
			driver.get("https://kasb.abrestan.com/user/edit_factor/editbuyfactor/" + list.get(i)[0]);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/div[1]/div/div/div[4]/div/div/button[1]")).click();
		}
		
	}
}
