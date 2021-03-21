package Test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class TC3_Search {

	@Test
	void TC3_1testSearchWithNameAndLocation() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moonp\\Downloads\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		
		browser.get("http://localhost/Alumni/");
		browser.findElement(By.xpath("//*[@type='search']")).click();
		browser.findElement(By.xpath("//*[@type='search']")).sendKeys("¿—∑™√“¿√");
		String result = browser.findElement(By.id("614259055")).getText();
		
		
		//
		assertEquals("614259055",result);
		//Thread.sleep(4000);
		browser.close();
	}



@Test
void TC3_2testSearchWithNameAndLocation() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moonp\\Downloads\\chromedriver.exe");
	WebDriver browser = new ChromeDriver();
	
	browser.get("http://localhost/Alumni/");
	browser.findElement(By.xpath("//*[@type='search']")).click();
	browser.findElement(By.xpath("//*[@type='search']")).sendKeys("614259054");
	
	String result = browser.findElement(By.id("614259054")).getText();
	
	
	
	assertEquals("614259054",result);
	//Thread.sleep(4000);
	browser.close();
}



@Test
void  TC3_3testSearchWithNameAndLocation() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moonp\\Downloads\\chromedriver.exe");
	WebDriver browser = new ChromeDriver();
	
	browser.get("http://localhost/Alumni/");
	browser.findElement(By.xpath("//*[@type='search']")).click();
	browser.findElement(By.xpath("//*[@type='search']")).sendKeys("61/47");
	
	String result = browser.findElement(By.id("61/47")).getText();
	
	
	
	assertEquals("61/47",result);
	//Thread.sleep(4000);
	browser.close();
}



@Test
void  TC3_4testSearchWithNameAndLocation() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moonp\\Downloads\\chromedriver.exe");
	WebDriver browser = new ChromeDriver();
	
	browser.get("http://localhost/Alumni/");
	browser.findElement(By.xpath("//*[@type='search']")).click();
	browser.findElement(By.xpath("//*[@type='search']")).sendKeys("π§√ª∞¡");
	String result = browser.findElement(By.id("π§√ª∞¡")).getText();
	
	
	assertEquals("π§√ª∞¡",result);
	//Thread.sleep(4000);
	browser.close();
}



@Test
void  TC3_5testSearchWithNameAndLocation() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moonp\\Downloads\\chromedriver.exe");
	WebDriver browser = new ChromeDriver();
	
	browser.get("http://localhost/Alumni/");
	browser.findElement(By.xpath("//*[@type='search']")).click();
	browser.findElement(By.xpath("//*[@type='search']")).sendKeys("2561");
	String result = browser.findElement(By.id("2561")).getText();
	
	
	
	assertEquals("2561",result);
	//Thread.sleep(4000);
	browser.close();
}



@Test
void  TC3_6testSearchWithNameAndLocation() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moonp\\Downloads\\chromedriver.exe");
	WebDriver browser = new ChromeDriver();
	
	browser.get("http://localhost/Alumni/");
	browser.findElement(By.xpath("//*[@type='search']")).click();
	browser.findElement(By.xpath("//*[@type='search']")).sendKeys(" ‘√‘π∑√Ï√—µπÏ");
	String result = browser.findElement(By.xpath("//*[@class='dataTables_empty']")).getText();
	
	
	
	assertEquals("No matching records found",result);
	//Thread.sleep(4000);
	browser.close();
}



@Test
void  TC3_7testSearchWithNameAndLocation() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moonp\\Downloads\\chromedriver.exe");
	WebDriver browser = new ChromeDriver();
	
	browser.get("http://localhost/Alumni/");
	browser.findElement(By.xpath("//*[@type='search']")).click();
	browser.findElement(By.xpath("//*[@type='search']")).sendKeys("614259000");
	String result = browser.findElement(By.xpath("//*[@class='dataTables_empty']")).getText();
	
	
	
	assertEquals("No matching records found",result);
	//Thread.sleep(4000);
	browser.close();
}

}