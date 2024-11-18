

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Scenario;


public class Base {
	public static WebDriver driver;
	
	public static Properties prop;
	
	static {
		
		FileInputStream file = null;
		try {
			file = new FileInputStream("C:\\Users\\user\\eclipse-workspace\\Com.Myntra\\src\\test\\java\\resources\\env.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 prop = new Properties();
		try {
			prop.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void setup() {
		String browsername = prop.getProperty("browser");
		if (browsername.equals("chrome")) {
			driver = new ChromeDriver();
		}
			else if (browsername.equals("ff")) {
				driver = new FirefoxDriver();
			}
				else if (browsername.equals("edge")) {
					driver = new EdgeDriver();
		}
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		}
	public void close() {
		driver.quit();
	}

	public void teardown(Scenario status) throws IOException {
		if(status.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			org.openqa.selenium.io.FileHandler.copy(src, new File("")); 
			
		}
		driver.quit();
		
		
	}
public void waitforelement(WebElement ele) {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(ele));
}

public void test() {
WebElement dropdown =	driver.findElement(By.xpath(""));
	waitforelement(dropdown);
	}
 public void selectByVisibilityText(WebElement ele,String value) {
	 
	 Select s = new Select(ele);
	 s.selectByVisibleText(value);
	 
	}
 public void selectbyindex(WebElement ele,int num) {
	 Select s = new Select(ele);
	 s.selectByIndex(num);
 }
 public void selectbyvalue(WebElement ele,String value) {
	 Select s = new Select(ele);
	 s.selectByValue(value);
 }	 
	 public void mousehover(WebElement ele) {
		 
		Actions a = new Actions(driver);
		a.moveToElement(ele).build().perform();
		
	 }
	 
	 public void selectbootstrapdropdown(List<WebElement>list,String value) {
		 
		 for( WebElement ele :list) {
			 String actualtext =ele.getText();
			 if (actualtext.equals(value)) {
				 ele.click();
				 break;
				 
			 
			 
			 }
		 }
	 }
	 
	 public void windowhandle(Set<String>windows,String expectedtittle) {
		 for (String s : windows) {
			 
			 driver.switchTo().window(s);
			 String actualtittle =  driver.getTitle();	
			 if (actualtittle.contains(expectedtittle)) {
				 break;
			 }
			 }
	 }
	 
	 public void selectalertpopup() {
		 Alert a = driver.switchTo().alert();
		 a.accept();
	 }
	 public void selectframe(String name) {
		 driver.switchTo().frame(name);
	 }
	 
	 public void clearandentertext(WebElement ele, String value) {
		 
		ele.clear();
		ele.sendKeys(value);
	 }
	 
	 public void clickonelement(WebElement ele) {
		 
		 try {
			 ele.click();
 			 }
			 catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
		    js.executeScript("arguments[0].click();",ele);
			}
		 }
		
		
		
		
		
		
		
		
	 
	 }
	 

