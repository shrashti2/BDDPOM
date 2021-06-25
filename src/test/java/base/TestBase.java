package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		prop = new Properties();
		String path = System.getProperty("user.dir") + "//src//test//resources//configFiles//config.properties";
		
			FileInputStream fin; 
			try {
			fin = new FileInputStream(path);
			prop.load(fin);
						
		}
			catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		 catch (IOException e) {
				
				e.printStackTrace();
}}
		public static void initialize() {	
			String browser = prop.getProperty("browser");
			if(browser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver =  new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				driver =  new EdgeDriver();
			}
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get(prop.getProperty("url"));
		}
		}
	
