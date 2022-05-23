package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import java.io.IOException;
//import java.util.concurrent.TimeUnit;
//
//import org.apache.poi.EncryptedDocumentException;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {

//	public void initialization() throws EncryptedDocumentException, IOException 
//	{
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--disable-notifications"); //check this*****************
//		System.setProperty("webdriver.chrome.driver","chromedriver.exe");	
//		driver = new ChromeDriver(options);
//		driver.manage().window().maximize();
//		driver.get(prop.getProperty("url")) ;
//		driver.get(Utility.Util.readExcel(0, 0));
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	public void initialization()
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		
		
	}
	
	
	
}
