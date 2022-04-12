package senaicursos;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testecurso {
 private WebDriver driver;

@Before
 public void abrirNavegador() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\OneDrive\\Documentos\\Atividades Senai\\UC11\\chromedriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
    }

/* @Test
public void testNavegador() {
	driver.get("https://sp.senai.br/");
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS );
	driver.findElement(By.id("oqEstabuscando")).sendKeys("gestão");
	driver.findElement(By.className("btnBuscaJavaScript")).click();
   }
} */

@Test
public void testNavegador() {
	driver.get("https://informatica.sp.senai.br");
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS );
	driver.findElement(By.id("Busca1_txtFiltro")).sendKeys("gestão");
	driver.findElement(By.id("Busca1_btnBusca")).click();
  }
}


