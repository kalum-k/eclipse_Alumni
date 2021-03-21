package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class TC4_EditProfile {

	@Test
	void TC4_1EditNamePasss() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moonp\\Downloads\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		
		browser.get("http://localhost/Alumni/");
		browser.findElement(By.name("login")).click();
		browser.findElement(By.id("login_studentid")).click();
		browser.findElement(By.id("login_studentid")).sendKeys("614259054");
		browser.findElement(By.name("login_password")).click();
		browser.findElement(By.name("login_password")).sendKeys("125564321");
		browser.findElement(By.xpath("//*[@type='submit']")).click();
		browser.findElement(By.name("edit")).click();
		browser.findElement(By.name("fname")).click();
		browser.findElement(By.name("fname")).clear();
		browser.findElement(By.name("fname")).sendKeys("สุภาดา ทองไทย");
		browser.findElement(By.xpath("//*[@type='submit']")).click();
		String result = browser.findElement(By.id("สุภาดา ทองไทย")).getText();
		
		assertEquals("สุภาดา ทองไทย",result);
		//Thread.sleep(40000000);
		browser.close();
	}

	@Test
	void TC4_2EditPasswordPass() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moonp\\Downloads\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		
		browser.get("http://localhost/Alumni/");
		browser.findElement(By.name("login")).click();
		browser.findElement(By.id("login_studentid")).click();
		browser.findElement(By.id("login_studentid")).sendKeys("614259054");
		browser.findElement(By.name("login_password")).click();
		browser.findElement(By.name("login_password")).sendKeys("125564321");
		browser.findElement(By.xpath("//*[@type='submit']")).click();
		browser.findElement(By.name("edit")).click();
		browser.findElement(By.name("password")).click();
		browser.findElement(By.name("password")).clear();
		browser.findElement(By.name("password")).sendKeys("1212312121");
		browser.findElement(By.xpath("//*[@type='submit']")).click();
		String result = browser.findElement(By.id("614259054")).getText();
		
		assertEquals("614259054",result);
		//Thread.sleep(4000);
		browser.close();
	}


	
}
