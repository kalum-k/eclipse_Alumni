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
		browser.findElement(By.name("id_university")).sendKeys("มหาวิทยาลัยเกษตรศาสตร์ วิทยาเขตกำแพงแสน");
		browser.findElement(By.name("tcas")).click();
		browser.findElement(By.name("tcas")).sendKeys("เข้าร่วม");
		browser.findElement(By.name("open_date")).click();
		browser.findElement(By.name("open_date")).sendKeys(" \r\n");
		browser.findElement(By.name("close_date")).click();
		browser.findElement(By.name("close_date")).sendKeys(" \r\n");
		browser.findElement(By.name("list_day")).click();
		browser.findElement(By.name("list_day")).sendKeys(" \r\n");
		browser.findElement(By.name("general")).click();
		browser.findElement(By.name("general")).sendKeys("1. ผู้สมัครจะต้องเป็นผู้สำเร็จการศึกษาในระดับมัธยมศึกษาตอนปลายหรือเทียบเท่าและมีคุณสมบัติเฉพาะสาขาวิชาตามที่มหาวิทยาลัยฯ กําหนด\r\n"
				+ "2. ผู้สมัครจะต้องเป็นผู้ที่กําลังศึกษาอยู่ในระดับชั้นมัธยมศึกษาตอนปลาย ต้องมีผลการ\r\n"
				+ "เรียนเฉลี่ยสะสมนับตั้งแต่ภาคเรียนแรก ถึงภาคเรียนที่ 4 หรือ 5 ของระดับมัธยมศึกษาตอนปลาย หรือเทียบ\r\n"
				+ "เท่า หรือผู้ที่สสำเร็จการศึกษาแล้ว และมีคุณสมบัติเฉพาะสาขาวิชาตามที่มหาวิทยาลัยฯ กําหนด\r\n"
				+ "3. มีสุขภาพสมบูรณ์แข็งแรง และไม่เป็นโรคติดต่อร้ายแรง หรือไม่เป็นโรคที่เป็นอุปสรรคต่อการศึกษา\r\n"
				+ "4. เป็นผู้ที่มีความประพฤติดี\r\n"
				+ "5. เงื่อนไขการรับสมัคร\r\n");
		browser.findElement(By.name("doculment_edu")).click();
		browser.findElement(By.name("doculment_edu")).sendKeys("ใบระเบียนแสดงผลการเรียน ปพ.1");
		browser.findElement(By.name("note_edu")).click();
		browser.findElement(By.name("note_edu")).sendKeys("");
		browser.findElement(By.name("url_doculment")).click();
		browser.findElement(By.name("url_doculment")).sendKeys("https://drive.google.com/file/d/1xSsRUnPhXhXfWlhGJNh9M0hMhTgXasQ9/view");
		browser.findElement(By.id("submit")).click();
		//String result = browser.findElement(By.name("uni")).getText();
		//assertEquals(" มหาวิทยาลัยเกษตรศาสตร์ วิทยาเขตกำแพงแสน",result);
		//Thread.sleep(4000);
		browser.close();
		}
}
