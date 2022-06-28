package pom.events;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pom.utils.Base;

public class inicioSesion extends Base{
	public inicioSesion(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	By usernameLocator = By.cssSelector("input[id='uid']");
	By passwordLocator = By.cssSelector("input[id='passw']");
	By btnSubmitLocator = By.xpath("//*[@id=\"login\"]/table/tbody/tr[3]/td[2]/input");
	By imgLocator = By.xpath("//img[@src='/images/logo.gif']");
	By btnTransferLocator = By.cssSelector("a[id='MenuHyperLink3']");
	By fromAccountLocator = By.cssSelector("select[id='fromAccount']>option[value='800003']");
	By toAccountLocator = By.cssSelector("select[id='toAccount']>option[value='4539082039396288']");
	By montoLocator = By.cssSelector("input[id='transferAmount']");
	By btnTransferMoney = By.cssSelector("input[id='transfer']");
	By logoutLocator = By.cssSelector("a[id='LoginLink']");

	public void test() throws InterruptedException {
		if (isDisplayed(imgLocator)) {
			type("jsmith", usernameLocator);
			type("Demo1234", passwordLocator);
			click(btnSubmitLocator);
			Thread.sleep(2000);
		} else {
			System.out.println("Pagina no encontrada");
		}
	}
	public void transferir() throws InterruptedException {
		click(btnTransferLocator);
		Thread.sleep(2000);
		click(fromAccountLocator);
		click(toAccountLocator);
		type("100", montoLocator);
		click(btnTransferMoney);
	}
	public void cerrarSesion() throws InterruptedException {
		Thread.sleep(2000);
		click(logoutLocator);
		
	}
}
