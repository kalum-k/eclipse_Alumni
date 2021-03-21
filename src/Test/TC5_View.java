package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class TC5_View {

	
	@Test
	void TC4_1View() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moonp\\Downloads\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		
		browser.get("http://localhost/Alumni/");
		browser.findElement(By.name("614259054")).click();
		String result = browser.findElement(By.name("detail")).getText();
		
		assertEquals("สุภาดา ทองไทย",result);
		//Thread.sleep(40000000);
		browser.close();
	}
	@Test
	void TC4_2View() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moonp\\Downloads\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		
		browser.get("http://localhost/Alumni/");
		browser.findElement(By.name("614259055")).click();
		String result = browser.findElement(By.name("detail")).getText();
		
		assertEquals("นางสาว ภัทชราภร ศรีประภาเลิศกุล",result);
		//Thread.sleep(40000000);
		browser.close();
	}
	

	
}
