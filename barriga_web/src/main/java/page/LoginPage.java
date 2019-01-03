package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LoginPage {
	
	WebDriver driver;
	
	//##########################################################page
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
	
	public void addProposta(String cliente) throws InterruptedException {
		
		WebElement btnNovaProposta = driver.findElement(By.id("ContentPlaceHolder1_NovaProposta"));
			
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement novaProposta = wait.until(ExpectedConditions.visibilityOf(btnNovaProposta));
		novaProposta.click();
		
		Thread.sleep(9000);
		WebElement txt_cpfPick = driver.findElement(By.id("BtnPickCPF"));
		txt_cpfPick.click();
		
		Thread.sleep(9000);
		String cpf = cliente;
		WebElement txt_cpf = driver.findElement(By.id("ContentPlaceHolder1_DialogPickListCliente1_cpf"));
		txt_cpf.sendKeys(cpf);
		
		Thread.sleep(9000);
		WebElement btn_buscaCPF = driver.findElement(By.id("ContentPlaceHolder1_DialogPickListCliente1_ConsultarCPF"));
		btn_buscaCPF.click();
		
		Thread.sleep(20000);
		WebElement link_buscaCPF = driver.findElement(By.linkText("72999004915"));
		link_buscaCPF.click();   

		Thread.sleep(8000);
		WebElement txt_midiaPick = driver.findElement(By.id("ContentPlaceHolder1_PickListMidia1_BtnPickMidia"));
		txt_midiaPick.click();
		
		Thread.sleep(8000);
		String midia = "91";
		WebElement txt_midia = driver.findElement(By.id("ContentPlaceHolder1_PickListMidia1_txtMidia"));
		txt_midia.sendKeys(midia);
		
		Thread.sleep(6000);
		WebElement btn_buscaMidia = driver.findElement(By.id("ContentPlaceHolder1_PickListMidia1_ConsultarMidia"));
		btn_buscaMidia.click();
		
		Thread.sleep(3000);
		WebElement link_buscaMidia = driver.findElement(By.linkText("91"));
		link_buscaMidia.click();  
		
		Thread.sleep(8000);
		double tx_valor= 35000;
		WebElement txt_valor = driver.findElement(By.id("ContentPlaceHolder1_txtValorSolicitado"));
		txt_valor.sendKeys(String.valueOf(tx_valor));
		txt_valor.sendKeys(Keys.TAB);
		
	}
	
	public void encerrarAplicacao() {
		WebElement element = driver.findElement(By.id("lkbSair"));
		driver.quit();
		
		
	}
	
	//############################################################### Test
	
	@Test
	public void adicionarProposta() throws InterruptedException {
		String user = "datuma";
		String password = "123456";
		login(user, password);
		
		String cliente = "729990049151";
		addProposta(cliente);
		
	}
	
	@AfterMethod
	public void close() throws InterruptedException {
		Thread.sleep(8000);
		encerrarAplicacao();
		
	}

}
