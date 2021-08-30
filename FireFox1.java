package FireFox;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FireFox1 {

	public static void main(String[] args) {
		
	System.setProperty("WebDriver.gecko.driver", "C:\\Users\\MAYURI\\eclipse-workspace\\FireFox\\Driver\\geckodriver-v0.29.1-win64");
	WebDriver driver =new FirefoxDriver();
	driver.get("https://www.google.in");
	System.out.println(driver.getTitle());
	}
}

