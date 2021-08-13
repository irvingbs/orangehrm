package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Reporter;

public class MetodosComunes {

	WebDriver driver;
	public void inicialiarExplorador(String URL, String explorador) {
		
		switch(explorador) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver\\chromedriver.exe");
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--incognito");
			option.addArguments("--start-maximized");
			driver = new ChromeDriver(option);
			driver.get(URL);
		break;
		
		case "msedge":
			System.setProperty("webdriver.msedge.driver", System.getProperty("user.dir") + "\\edgedriver\\msedgedriver.exe");
			EdgeOptions edgOption = new EdgeOptions();
			edgOption.addArguments("--incognito");
			edgOption.addArguments("--start-maximized");
			driver = new EdgeDriver();
			driver.get(URL);
		break;
		
		case "firefox":
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\geckodriver\\geckodriver.exe");
			FirefoxOptions fOption = new FirefoxOptions();
			fOption.addArguments("--incognito");
			fOption.addArguments("--start-maximized");
			driver = new FirefoxDriver();
			driver.get(URL);
		break;
		default:
			Reporter.log("El explorador que intentas abrir no existe [ "+explorador+" ]",true);
			
		}//End Switch
	}
}
/*
 * Meeting ID: 774 3581 7005 Passcode: v5iC1P
 * https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/
https://github.com/mozilla/geckodriver/releases

 */