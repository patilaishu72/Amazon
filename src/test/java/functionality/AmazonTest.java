package functionality;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import elements.Elements;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {

	@Test
	public void test() throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		// fetch product name to search from properties file
		FileInputStream file = new FileInputStream("src\\test\\java\\Config.properties");
		Properties properties = new Properties();
		properties.load(file);
		String product = properties.getProperty("product"); // use POM Page Factory
		PageFactory.initElements(driver, Elements.class);
		String str = Elements.mobiles1.getText();
		if (str.equalsIgnoreCase("mobiles"))
			Elements.mobiles1.click();
		else
			Elements.mobiles2.click();
		Elements.electronics.click();
		Elements.accessories.click();
		Elements.mobileAccessories.click();
		Elements.search.sendKeys(product);
		Elements.searchSubmit.click();
		Elements.firstProduct.click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> iterator = windows.iterator();//*[@id="nav-xshop"]/a[3]
		String window1 = iterator.next();
		String window2 = iterator.next();
		driver.switchTo().window(window2);
		Elements.addToCart.click();// take screenshot
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\VS82UD\\Downloads\\amazon_screenshot.png");
		FileHandler.copy(source, destination);// delete all cookies
		driver.manage().deleteAllCookies();
		driver.quit();
		
	}
}
