package selintro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	@BeforeTest
	public void setup() {
		System.out.println("Setup");
		System.out.println("Ok");
	}
    @Test
    public void testGoogleHomePage() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println("Title:"+driver.getTitle());
        System.out.println("Test Passed!");
        driver.quit();
        
    }
}
