 package test;
import static org.junit.Assert.assertEquals;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
public class DemoTest extends Base {
	
   
	 @BeforeClass
	    public static void startBrowser() throws MalformedURLException {
	    	DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("browserName", "iPhone");
			caps.setCapability("device", "iPhone 11");
			caps.setCapability("realMobile", "true");
			caps.setCapability("os_version", "14.0");
			caps.setCapability("build", "build 1");
			driver = new RemoteWebDriver(new URL(URL), caps);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    }
	 
    @Test
    public void demo() {
		driver.get("http://google.com");
		assertEquals("Google", driver.getTitle());
    }
    
    @After
    public void tearDown() {
        driver.quit();
    }
    
}