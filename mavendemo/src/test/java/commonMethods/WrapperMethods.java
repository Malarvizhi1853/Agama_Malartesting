package commonMethods;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class WrapperMethods {
	WebDriver driver;

	public void chrome_browser(String Url) {
		String strchromedriver = "C:/Users/krant/Downloads/Selenium Java/chromedriver_win32/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", strchromedriver);
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("start-maximized");
		//WebDriver driver = new ChromeDriver(options);
		//new
		
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Url);
	}

	public void ie_browser(String Url) {
		System.setProperty("webdriver.ie.driver",
				"C:/Users/krant/Downloads/Selenium Java/IEDriverServer_x64_3.150.1/IEDriverServer.exe");

		driver = new InternetExplorerDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Url);
	}

	public void byid_sendkey(String id, String val) {
		driver.findElement(By.id(id)).sendKeys(val);
	}

	
	public void enterbyid(String val,String name)
	{
			driver.findElement(By.id(val)).sendKeys(name);
	}
			
		public void clickbyxpath(String val1)
	{
			driver.findElement(By.xpath(val1)).click();
	}
		public void closeapp() 
	{
			driver.close();
	}
		public void takesnap(String path) throws IOException 
	{
			TakesScreenshot ts =(TakesScreenshot)driver;
		    File source = ts.getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(source,new File((path)));
	
	
	//public void selectdropdown(String id,String vtxt) {
		//Select month = new Select(driver.findElement(By.id(id)));
		//month.selectByVisibleText(vtxt);
	//}
	
		//public void searchtextcount(String tname)
	//{
		//List<WebElement> links = driver.findElements(By.tagName(tname));
		//System.out.println("No. of links: " + links.size());
			//for (int i = 0; i <= links.size(); i = i + 1)
			//{
		
			//	System.out.println(links.get(i).getText());
			//}
	}
		
		public void FileUpload(String id, String Path)
		{
						driver.findElement(By.id(id)).sendKeys(Path);
		}
	
	
	/*public void selectdropdown(String text) {
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText(text);
	}*/
}
	

