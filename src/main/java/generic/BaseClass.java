package generic;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	 public WebDriver driver;
		public Webdrivreutility wlib=new Webdrivreutility();
		public Fileutlity flib=new Fileutlity();
		public Javautility jlib=new Javautility();
		public DatabaseUtility dlib=new DatabaseUtility();
		public static WebDriver sdriver;
		//@Parameters("BROWSER")
		@BeforeClass
		public void config_BC() throws Throwable {
			System.out.println("-open browser-");
			String BROWSER = flib.readdatafromproperty("browser");
			String URL = flib.readdatafromproperty("url");
			
			if (BROWSER.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get(URL);
			
			}
			
			else {
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}
			sdriver=driver;
			wlib.maximize(driver);
			wlib.implicitWait(driver);
			}
		
		
		@BeforeSuite
		public void  config_BS() throws SQLException {
			dlib.connectTodatabase();
			System.out.println("-connect to database-");
			
		}
		@AfterClass
		public void config_AC() {
			System.out.println("-close browser-");
			driver.close();
		}
		
		
		
		@AfterSuite
		public void  cofig_AS() throws Throwable {
			System.out.println("-disconnect from database-");
			dlib.closedatabase();
		}
	}


