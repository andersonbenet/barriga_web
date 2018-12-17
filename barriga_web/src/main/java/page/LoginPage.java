package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginPage {
	
	WebDriver driver;
	
	public void login(String user, String password) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Python27\\Scripts\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://10.10.30.30");
		
		WebElement txtUser = driver.findElement(By.id("ContentPlaceHolder1_usuario"));
		txtUser.sendKeys(user);
				
		WebElement txtPassword = driver.findElement(By.id("ContentPlaceHolder1_senha"));
		txtPassword.sendKeys(password);
		
		WebElement btn_entrar = driver.findElement(By.id("ContentPlaceHolder1_entrar"));
		btn_entrar.click();
		
		
		
	}
	
	public void addProposta() {
		
		WebDriverWait wait = new WebDriverWait(driver, 80);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_NovaProposta"))).click();
		
		
		
		
	}
	
	@Test
	public void logarHome() {
		String user = "datuma";
		String password = "123456";
		
		login(user, password);
		
		
				
	}
	
	@Test
	public void adicionarProposta() {
		
		addProposta();
		
	}

}
