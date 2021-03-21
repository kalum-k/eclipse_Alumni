package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class TC1_Register {

	
		@Test
		void Registerpass1() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moonp\\Downloads\\chromedriver.exe");
			WebDriver browser = new ChromeDriver();
			
			browser.get("http://localhost/alumni/index.php/welcome/reg_alumni");
			browser.findElement(By.id("card_id")).click();
			browser.findElement(By.id("card_id")).sendKeys("1730501138100");
			browser.findElement(By.name("prefix")).click();
			browser.findElement(By.name("prefix")).sendKeys("π“ß “«");
			browser.findElement(By.name("fname")).click();
			browser.findElement(By.name("fname")).sendKeys(" ÿæ√√…“");
			browser.findElement(By.name("lname")).click();
			browser.findElement(By.name("lname")).sendKeys("‡ ◊Õß“¡‡Õ’Ë¬¡");
			browser.findElement(By.name("gender")).click();
			browser.findElement(By.name("gender")).sendKeys("À≠‘ß");
			browser.findElement(By.name("birthday")).click();
			browser.findElement(By.name("birthday")).sendKeys("03/08/1999");
			browser.findElement(By.name("p_number")).click();
			browser.findElement(By.name("p_number")).sendKeys("23/1");
			browser.findElement(By.name("p_road")).click();
			browser.findElement(By.name("p_road")).sendKeys("-");
			browser.findElement(By.name("p_district")).click();
			browser.findElement(By.name("p_district")).sendKeys("∫“ßª≈“");
			browser.findElement(By.name("p_amphoe")).click();
			browser.findElement(By.name("p_amphoe")).sendKeys("∫“ß‡≈π");
			browser.findElement(By.name("p_province")).click();
			browser.findElement(By.name("p_province")).sendKeys("π§√ª∞¡");
			browser.findElement(By.name("p_zipcode")).click();
			browser.findElement(By.name("p_zipcode")).sendKeys("73130");
			browser.findElement(By.name("tel")).click();
			browser.findElement(By.name("tel")).sendKeys("0800253481");
			browser.findElement(By.name("facebook")).click();
			browser.findElement(By.name("facebook")).sendKeys("Hna");
			browser.findElement(By.name("email")).click();
			browser.findElement(By.name("email")).sendKeys("Han@gmail.com");
			browser.findElement(By.name("password")).click();
			browser.findElement(By.name("password")).sendKeys("125564321");
			browser.findElement(By.name("student_id")).click();
			browser.findElement(By.name("student_id")).sendKeys("614259100");
			browser.findElement(By.name("group")).click();
			browser.findElement(By.name("group")).sendKeys("61/47");
			browser.findElement(By.name("branch")).click();
			browser.findElement(By.name("branch")).sendKeys("SE");
			browser.findElement(By.name("faculty")).click();
			browser.findElement(By.name("faculty")).sendKeys("Science and technology");
			browser.findElement(By.name("semester")).click();
			browser.findElement(By.name("semester")).sendKeys("Regular");
			browser.findElement(By.name("education_level")).click();
			browser.findElement(By.name("education_level")).sendKeys("Bachelor's degree");
			browser.findElement(By.name("year_int")).click();
			browser.findElement(By.name("year_int")).sendKeys("2561");
			browser.findElement(By.name("year_out")).click();
			browser.findElement(By.name("year_out")).sendKeys("2564");
			browser.findElement(By.name("outstanding_work")).click();
			browser.findElement(By.name("outstanding_work")).sendKeys("-");
			browser.findElement(By.name("position")).click();
			browser.findElement(By.name("position")).sendKeys("SA");
			browser.findElement(By.name("company")).click();
			browser.findElement(By.name("company")).sendKeys("NPRU");
			browser.findElement(By.name("c_tel")).click();
			browser.findElement(By.name("c_tel")).sendKeys("0800253481");
			browser.findElement(By.name("c_number")).click();
			browser.findElement(By.name("c_number")).sendKeys("23/1");
			browser.findElement(By.name("c_road")).click();
			browser.findElement(By.name("c_road")).sendKeys("-");
			browser.findElement(By.name("c_district")).click();
			browser.findElement(By.name("c_district")).sendKeys("∫“ßª≈“");
			browser.findElement(By.name("c_amphoe")).click();
			browser.findElement(By.name("c_amphoe")).sendKeys("∫“ß‡≈π");
			browser.findElement(By.name("c_province")).click();
			browser.findElement(By.name("c_province")).sendKeys("π§√ª∞¡");
			browser.findElement(By.name("c_zipcode")).click();
			browser.findElement(By.name("c_zipcode")).sendKeys("73130");
			browser.findElement(By.xpath("//*[@type='submit']")).click();
			String result = browser.findElement(By.id("614259100")).getText();
			
			
			//Thread.sleep(4000);

			
			assertEquals("614259100",result);
			browser.close();
		}


		@Test
		void TC1_2RegisterPass2() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moonp\\Downloads\\chromedriver.exe");
			WebDriver browser = new ChromeDriver();
			
			browser.get("http://localhost/alumni/index.php/welcome/reg_alumni");
			browser.findElement(By.id("card_id")).click();
			browser.findElement(By.id("card_id")).sendKeys("1730501138456");
			browser.findElement(By.name("prefix")).click();
			browser.findElement(By.name("prefix")).sendKeys("π“ß “«");
			browser.findElement(By.name("fname")).click();
			browser.findElement(By.name("fname")).sendKeys("¡≥±≥“");
			browser.findElement(By.name("lname")).click();
			browser.findElement(By.name("lname")).sendKeys(" —ß¢ÏÕ¬ŸË¥’");
			browser.findElement(By.name("gender")).click();
			browser.findElement(By.name("gender")).sendKeys("À≠‘ß");
			browser.findElement(By.name("birthday")).click();
			browser.findElement(By.name("birthday")).sendKeys("22/05/1998");
			browser.findElement(By.name("p_number")).click();
			browser.findElement(By.name("p_number")).sendKeys("1/1");
			browser.findElement(By.name("p_road")).click();
			browser.findElement(By.name("p_road")).sendKeys("-");
			browser.findElement(By.name("p_district")).click();
			browser.findElement(By.name("p_district")).sendKeys("¥ß¢ÿ¬");
			browser.findElement(By.name("p_amphoe")).click();
			browser.findElement(By.name("p_amphoe")).sendKeys("™π·¥π");
			browser.findElement(By.name("p_province")).click();
			browser.findElement(By.name("p_province")).sendKeys("‡æ™√∫Ÿ√≥Ï");
			browser.findElement(By.name("p_zipcode")).click();
			browser.findElement(By.name("p_zipcode")).sendKeys("67190");
			browser.findElement(By.name("tel")).click();
			browser.findElement(By.name("tel")).sendKeys("0871605914");
			browser.findElement(By.name("facebook")).click();
			browser.findElement(By.name("facebook")).sendKeys("EA");
			browser.findElement(By.name("email")).click();
			browser.findElement(By.name("email")).sendKeys("Ea@gmail.com");
			browser.findElement(By.name("password")).click();
			browser.findElement(By.name("password")).sendKeys("");
			browser.findElement(By.name("student_id")).click();
			browser.findElement(By.name("student_id")).sendKeys("614259002");
			browser.findElement(By.name("group")).click();
			browser.findElement(By.name("group")).sendKeys("61/47");
			browser.findElement(By.name("branch")).click();
			browser.findElement(By.name("branch")).sendKeys("SE");
			browser.findElement(By.name("faculty")).click();
			browser.findElement(By.name("faculty")).sendKeys("Science and technology");
			browser.findElement(By.name("semester")).click();
			browser.findElement(By.name("semester")).sendKeys("Regular");
			browser.findElement(By.name("education_level")).click();
			browser.findElement(By.name("education_level")).sendKeys("Bachelor's degree");
			browser.findElement(By.name("year_int")).click();
			browser.findElement(By.name("year_int")).sendKeys("2561");
			browser.findElement(By.name("year_out")).click();
			browser.findElement(By.name("year_out")).sendKeys("2564");
			browser.findElement(By.name("outstanding_work")).click();
			browser.findElement(By.name("outstanding_work")).sendKeys("-");
			browser.findElement(By.name("position")).click();
			browser.findElement(By.name("position")).sendKeys("SA");
			browser.findElement(By.name("company")).click();
			browser.findElement(By.name("company")).sendKeys("NPRU");
			browser.findElement(By.name("c_tel")).click();
			browser.findElement(By.name("c_tel")).sendKeys("0871605914");
			browser.findElement(By.name("c_number")).click();
			browser.findElement(By.name("c_number")).sendKeys("1/1");
			browser.findElement(By.name("c_road")).click();
			browser.findElement(By.name("c_road")).sendKeys("-");
			browser.findElement(By.name("c_district")).click();
			browser.findElement(By.name("c_district")).sendKeys("¥ß¢ÿ¬");
			browser.findElement(By.name("c_amphoe")).click();
			browser.findElement(By.name("c_amphoe")).sendKeys("™π·¥π");
			browser.findElement(By.name("c_province")).click();
			browser.findElement(By.name("c_province")).sendKeys("‡æ™√∫Ÿ√≥Ï");
			browser.findElement(By.name("c_zipcode")).click();
			browser.findElement(By.name("c_zipcode")).sendKeys("67190");
			browser.findElement(By.xpath("//*[@type='submit']")).click();
			String result = browser.findElement(By.id("614259002")).getText();
			
			
			//Thread.sleep(4000);
			assertEquals("614259002",result);
			browser.close();
		}

	

		@Test
		void  TC1_3RegisterFalse() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moonp\\Downloads\\chromedriver.exe");
			WebDriver browser = new ChromeDriver();
			
			browser.get("http://localhost/alumni/index.php/welcome/reg_alumni");
			browser.findElement(By.id("card_id")).click();
			browser.findElement(By.id("card_id")).sendKeys("1730501138789");
			browser.findElement(By.name("prefix")).click();
			browser.findElement(By.name("prefix")).sendKeys("π“ß “«");
			browser.findElement(By.name("fname")).click();
			browser.findElement(By.name("fname")).sendKeys("æ√√¿—∑√Ï…“");
			browser.findElement(By.name("lname")).click();
			browser.findElement(By.name("lname")).sendKeys(" ÿ¢ ¡°‘®");
			browser.findElement(By.name("gender")).click();
			browser.findElement(By.name("gender")).sendKeys("À≠‘ß");
			browser.findElement(By.name("birthday")).click();
			browser.findElement(By.name("birthday")).sendKeys("22/05/1998");
			browser.findElement(By.name("p_number")).click();
			browser.findElement(By.name("p_number")).sendKeys("1/1");
			browser.findElement(By.name("p_road")).click();
			browser.findElement(By.name("p_road")).sendKeys("-");
			browser.findElement(By.name("p_district")).click();
			browser.findElement(By.name("p_district")).sendKeys("¥ß¢ÿ¬");
			browser.findElement(By.name("p_amphoe")).click();
			browser.findElement(By.name("p_amphoe")).sendKeys("™π·¥π");
			browser.findElement(By.name("p_province")).click();
			browser.findElement(By.name("p_province")).sendKeys("‡æ™√∫Ÿ√≥Ï");
			browser.findElement(By.name("p_zipcode")).click();
			browser.findElement(By.name("p_zipcode")).sendKeys("67190");
			browser.findElement(By.name("tel")).click();
			browser.findElement(By.name("tel")).sendKeys("0871605914");
			browser.findElement(By.name("facebook")).click();
			browser.findElement(By.name("facebook")).sendKeys("EA");
			browser.findElement(By.name("email")).click();
			browser.findElement(By.name("email")).sendKeys("Ea@gmail.com");
			browser.findElement(By.name("password")).click();
			browser.findElement(By.name("password")).sendKeys("");
			browser.findElement(By.name("student_id")).click();
			browser.findElement(By.name("student_id")).sendKeys("614259003");
			browser.findElement(By.name("group")).click();
			browser.findElement(By.name("group")).sendKeys("61/47");
			browser.findElement(By.name("branch")).click();
			browser.findElement(By.name("branch")).sendKeys("SE");
			browser.findElement(By.name("faculty")).click();
			browser.findElement(By.name("faculty")).sendKeys("Science and technology");
			browser.findElement(By.name("semester")).click();
			browser.findElement(By.name("semester")).sendKeys("Regular");
			browser.findElement(By.name("education_level")).click();
			browser.findElement(By.name("education_level")).sendKeys("Bachelor's degree");
			browser.findElement(By.name("year_int")).click();
			browser.findElement(By.name("year_int")).sendKeys("2561");
			browser.findElement(By.name("year_out")).click();
			browser.findElement(By.name("year_out")).sendKeys("2564");
			browser.findElement(By.name("outstanding_work")).click();
			browser.findElement(By.name("outstanding_work")).sendKeys("-");
			browser.findElement(By.name("position")).click();
			browser.findElement(By.name("position")).sendKeys("SA");
			browser.findElement(By.name("company")).click();
			browser.findElement(By.name("company")).sendKeys("NPRU");
			browser.findElement(By.name("c_tel")).click();
			browser.findElement(By.name("c_tel")).sendKeys("0871605914");
			browser.findElement(By.name("c_number")).click();
			browser.findElement(By.name("c_number")).sendKeys("1/1");
			browser.findElement(By.name("c_road")).click();
			browser.findElement(By.name("c_road")).sendKeys("-");
			browser.findElement(By.name("c_district")).click();
			browser.findElement(By.name("c_district")).sendKeys("¥ß¢ÿ¬");
			browser.findElement(By.name("c_amphoe")).click();
			browser.findElement(By.name("c_amphoe")).sendKeys("™π·¥π");
			browser.findElement(By.name("c_province")).click();
			browser.findElement(By.name("c_province")).sendKeys("‡æ™√∫Ÿ√≥Ï");
			browser.findElement(By.name("c_zipcode")).click();
			browser.findElement(By.name("c_zipcode")).sendKeys("67190");
			browser.findElement(By.xpath("//*[@type='submit']")).click();
			String result = browser.findElement(By.id("614259003")).getText();
			
			
			//Thread.sleep(4000);
			assertEquals("614259003",result);
			browser.close();
		}

	}
