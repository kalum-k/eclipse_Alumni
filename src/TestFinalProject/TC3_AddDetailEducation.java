package TestFinalProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class TC3_AddDetailEducation {

	@Test
	void AddMainEducation() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moonp\\Downloads\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		
		browser.get("http://localhost:3000/edudatailall/13");
		browser.findElement(By.id("detail")).click();
		browser.findElement(By.name("id_faculty")).click();
		browser.findElement(By.name("id_faculty")).sendKeys("��Ф����ʵ��");
		browser.findElement(By.name("id_course")).click();
		browser.findElement(By.name("id_course")).sendKeys("��Ե��ʵ��");
		browser.findElement(By.name("major")).click();
		browser.findElement(By.name("major")).sendKeys("���");
		browser.findElement(By.name("number_of_edu")).click();
		browser.findElement(By.name("number_of_edu")).sendKeys("30");
		browser.findElement(By.name("GPA")).click();
		browser.findElement(By.name("GPA")).sendKeys("2.5");
		browser.findElement(By.name("curriculum_edu")).click();
		browser.findElement(By.name("curriculum_edu")).sendKeys("�Է��-��Ե");
		browser.findElement(By.name("id_education")).click();
		browser.findElement(By.name("id_education")).sendKeys("13");
		browser.findElement(By.name("note_condi")).click();
		browser.findElement(By.name("note_condi")).sendKeys("�Ѻ��騺 �.���� ������º���");
		browser.findElement(By.id("submit")).click();
		//String result = browser.findElement(By.name("uni")).getText();
		//assertEquals(" ����Է������ɵ���ʵ�� �Է��ࢵ��ᾧ�ʹ",result);
		//Thread.sleep(4000);
		browser.close();
		}
}
