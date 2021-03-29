package TestFinalProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class TC1_Login {

	@Test
	void Loginpass() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moonp\\Downloads\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		
	browser.get("http://localhost:3000");
	browser.findElement(By.id("login")).click();
	browser.findElement(By.name("id_stu")).click();
	browser.findElement(By.name("id_stu")).sendKeys("630001");
	browser.findElement(By.name("password_stu")).click();
	browser.findElement(By.name("password_stu")).sendKeys("12345678");
	browser.findElement(By.id("submit")).click();
	//String result = browser.findElement(By.id("username")).getText();
	//assertEquals("สิรินทร์รัตน์ ปานประดิษฐ์",result);
	//Thread.sleep(4000);
	browser.close();
	}
	@Test
	void Loginflase() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moonp\\Downloads\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		
	browser.get("http://localhost:3000");
	browser.findElement(By.id("login")).click();
	browser.findElement(By.name("id_stu")).click();
	browser.findElement(By.name("id_stu")).sendKeys("630001");
	browser.findElement(By.id("submit")).click();
	//String result = browser.findElement(By.id("swal2-title")).getText();
	//assertEquals("เข้าสู่ระบบล้มเหลว",result);
	Thread.sleep(4000);
	browser.close();
	}

}
