import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class Lap1 {

	@Test
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = null;
	String browser = "chrome";
	if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Moonp/Downloads/chromedriver.exe");
		driver = new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:/Users/Moonp/Downloads/geckodriver.exe");
		driver = new FirefoxDriver();
	}
	driver.get("http://www.google.co.th");
	System.out.println(browser+" is running");
	System.out.println("" + driver.getTitle());
	
	Thread.sleep(4000);
	driver.close();
	System.out.println("Finish !!!");
	}
}
