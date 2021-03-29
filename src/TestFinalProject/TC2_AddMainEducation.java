package TestFinalProject;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class TC2_AddMainEducation {

	@Test
	void AddMainEducation() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moonp\\Downloads\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		
		browser.get("http://localhost:3000/educationall");
		browser.findElement(By.id("inserteducation")).click();
		browser.findElement(By.name("year_edu")).click();
		browser.findElement(By.name("year_edu")).sendKeys("2021");
		browser.findElement(By.name("id_round")).click();
		browser.findElement(By.name("id_round")).sendKeys("Admission");
		browser.findElement(By.name("id_university")).click();
		browser.findElement(By.name("id_university")).sendKeys("����Է������ɵ���ʵ�� �Է��ࢵ��ᾧ�ʹ");
		browser.findElement(By.name("tcas")).click();
		browser.findElement(By.name("tcas")).sendKeys("�������");
		browser.findElement(By.name("open_date")).click();
		browser.findElement(By.name("open_date")).sendKeys(" \r\n");
		browser.findElement(By.name("close_date")).click();
		browser.findElement(By.name("close_date")).sendKeys(" \r\n");
		browser.findElement(By.name("list_day")).click();
		browser.findElement(By.name("list_day")).sendKeys(" \r\n");
		browser.findElement(By.name("general")).click();
		browser.findElement(By.name("general")).sendKeys("1. �����Ѥèе�ͧ�繼������稡���֡����дѺ�Ѹ���֡�ҵ͹����������º�������դس���ѵ�੾���Ң��Ԫҵ���������Է������ ���˹�\r\n"
				+ "2. �����Ѥèе�ͧ�繼�������ѧ�֡��������дѺ����Ѹ���֡�ҵ͹���� ��ͧ�ռš��\r\n"
				+ "���¹����������Ѻ������Ҥ���¹�á �֧�Ҥ���¹��� 4 ���� 5 �ͧ�дѺ�Ѹ���֡�ҵ͹���� ������º\r\n"
				+ "��� ���ͼ���������稡���֡������ ����դس���ѵ�੾���Ң��Ԫҵ���������Է������ ���˹�\r\n"
				+ "3. ���آ�Ҿ����ó����ç ���������ä�Դ��������ç ����������ä������ػ��ä��͡���֡��\r\n"
				+ "4. �繼�����դ�����оĵԴ�\r\n"
				+ "5. ���͹䢡���Ѻ��Ѥ�\r\n");
		browser.findElement(By.name("doculment_edu")).click();
		browser.findElement(By.name("doculment_edu")).sendKeys("�����¹�ʴ��š�����¹ ��.1");
		browser.findElement(By.name("note_edu")).click();
		browser.findElement(By.name("note_edu")).sendKeys("");
		browser.findElement(By.name("url_doculment")).click();
		browser.findElement(By.name("url_doculment")).sendKeys("https://drive.google.com/file/d/1xSsRUnPhXhXfWlhGJNh9M0hMhTgXasQ9/view");
		browser.findElement(By.id("submit")).click();
		//String result = browser.findElement(By.name("uni")).getText();
		//assertEquals(" ����Է������ɵ���ʵ�� �Է��ࢵ��ᾧ�ʹ",result);
		//Thread.sleep(4000);
		browser.close();
		}
}
