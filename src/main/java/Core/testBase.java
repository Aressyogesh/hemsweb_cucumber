package Core;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class testBase {

	
	public static WebDriver driver;
	public static Properties objConfig = new Properties();
	
	public WebDriver getDriver() {
		return driver;
	}

	@SuppressWarnings("deprecation")
	public void setUp()
	{
		try
		  {
		   // Load configuration file  
		   Properties objConfig = new Properties();
		   objConfig.load(new FileInputStream(System.getProperty("user.dir") + "/src/main/java/Config.properties"));
		   
		   if(objConfig.getProperty("test.browser").equalsIgnoreCase("chrome"))
		   {
			  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"/Drivers/chromedriver.exe");
			  driver = new ChromeDriver();
	  	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  	      driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
	  	      driver.manage().window().maximize();
	  	      driver.get(objConfig.getProperty("test.browser.url"));
		   }else if (objConfig.getProperty("test.browser").equalsIgnoreCase("firefox"))
		   {
			  System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +"/Drivers/geckodriver.exe");
			  driver = new FirefoxDriver();
		  	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  	  driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		  	  driver.manage().window().maximize();
		  	  driver.get(objConfig.getProperty("test.browser.url"));
			   
		   }
		   
		   
		  }
		  catch(Exception exception)
		  {
		   exception.printStackTrace();
		  }
	}
	
	public  void tearDown() throws Exception {
		driver.quit();

	}
	
}
