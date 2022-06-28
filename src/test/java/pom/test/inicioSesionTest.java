package pom.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.events.*;
import pom.events.inicioSesion;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class inicioSesionTest {
	WebDriver driver;
	inicioSesion InicioSesion;

	@BeforeClass
	public void beforeClass() {
		InicioSesion = new inicioSesion(driver);
		driver = InicioSesion.ChromeDriverConnection();
		driver.manage().window().maximize();
		InicioSesion.visit("https://demo.testfire.net/login.jsp");
	}

	@Test
	public void test2() throws InterruptedException {
		InicioSesion.test();
		InicioSesion.transferir();
		InicioSesion.cerrarSesion();
		
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
