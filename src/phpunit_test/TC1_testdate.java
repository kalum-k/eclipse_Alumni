package phpunit_test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class TC1_testdate {

	@Test
	void testdate1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moonp\\Downloads\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		
		browser.get("http://localhost/UnitTest/");
		browser.findElement(By.name("month")).click();
		browser.findElement(By.name("month")).sendKeys("May");
		browser.findElement(By.name("date")).click();
		browser.findElement(By.name("date")).sendKeys("20");
		browser.findElement(By.name("submit")).click();
		String result = browser.findElement(By.id("date")).getText();
		
		
		//Thread.sleep(4000);

		
		assertEquals("Thursday",result);
		browser.close();
	}
	@Test
	void testdate2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moonp\\Downloads\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		
		browser.get("http://localhost/UnitTest/");
		browser.findElement(By.name("month")).click();
		browser.findElement(By.name("month")).sendKeys("January");
		browser.findElement(By.name("date")).click();
		browser.findElement(By.name("date")).sendKeys("15");
		browser.findElement(By.name("submit")).click();
		String result = browser.findElement(By.id("date")).getText();
		
		
		Thread.sleep(4000);

		
		assertEquals("Friday",result);
		browser.close();
	}
	@Test
	void testdate3() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moonp\\Downloads\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		
		browser.get("http://localhost/UnitTest/");
		browser.findElement(By.name("month")).click();
		browser.findElement(By.name("month")).sendKeys("Fabruary");
		browser.findElement(By.name("date")).click();
		browser.findElement(By.name("date")).sendKeys("3");
		browser.findElement(By.name("submit")).click();
		String result = browser.findElement(By.id("date")).getText();
		
		
		//Thread.sleep(4000);

		
		assertEquals("Wednesday",result);
		browser.close();
	}
}
