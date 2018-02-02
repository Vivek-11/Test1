package resources;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInitialization {

	public static File directory = new File(".");
	protected static WebDriver driver;
	
	public void driverSetup() throws IOException{
		System.out.println(directory.getCanonicalPath()+ File.separator + "driverLibrary" + File.separator);
		String path =directory.getCanonicalPath()+ File.separator + "driverLibrary" + File.separator;
		System.setProperty("webdriver.chrome.driver", path + "chromedriver_win" + File.separator + "chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("========Opening Chrome========");
	}
	
	public void tearDown() {
		driver.manage().deleteAllCookies();
		driver.close();
		driver.quit();
		System.out.println("Driver Closed!!");
	}
}
