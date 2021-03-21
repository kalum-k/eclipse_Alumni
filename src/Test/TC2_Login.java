package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class TC2_Login {

	

		@Test
		void TC2_1LoginPass() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moonp\\Downloads\\chromedriver.exe");
			WebDriver browser = new ChromeDriver();
			
			browser.get("http://localhost/Alumni/");
			browser.findElement(By.name("login")).click();
			browser.findElement(By.id("login_studentid")).click();
			browser.findElement(By.id("login_studentid")).sendKeys("614259054");
			browser.findElement(By.name("login_password")).click();
			browser.findElement(By.name("login_password")).sendKeys("125564321");
			browser.findElement(By.xpath("//*[@type='submit']")).click();
			String result = browser.findElement(By.id("name")).getText();
			
			assertEquals("ผู้ใช้งาน : สุภาดา ทองไทย",result);
			//Thread.sleep(4000);
			browser.close();
		}

	
		@Test
		void TC2_2LoginPass() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moonp\\Downloads\\chromedriver.exe");
			WebDriver browser = new ChromeDriver();
			
			browser.get("http://localhost/Alumni/");
			browser.findElement(By.name("login")).click();
			browser.findElement(By.id("login_studentid")).click();
			browser.findElement(By.id("login_studentid")).sendKeys("614259055");
			browser.findElement(By.xpath("//*[@type='submit']")).click();
			String result = browser.findElement(By.id("name")).getText();
			
			assertEquals("ผู้ใช้งาน : นางสาว ภัทชราภร ศรีประภาเลิศกุล",result);
			browser.close();
			
		}

		@Test
		void TC2_2LoginPass1() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moonp\\Downloads\\chromedriver.exe");
			WebDriver browser = new ChromeDriver();
			
			browser.get("http://localhost/Alumni/");
			browser.findElement(By.name("login")).click();
			browser.findElement(By.id("login_studentid")).click();
			browser.findElement(By.id("login_studentid")).sendKeys("614259055");
			browser.findElement(By.xpath("//*[@type='submit']")).click();
			String result = browser.findElement(By.id("name")).getText();
			
			assertEquals("ผู้ใช้งาน : นางสาว ภัทชราภร ศรีประภาเลิศกุล",result);
			browser.close();
			
		}
	

	}

