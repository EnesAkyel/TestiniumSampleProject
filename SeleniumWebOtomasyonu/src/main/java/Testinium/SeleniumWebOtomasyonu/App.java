package Testinium.SeleniumWebOtomasyonu;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import junit.framework.Assert;

public class App 
{
    protected static WebDriver driver;

    @Before
    public void setUp() throws Exception{

    	DesiredCapabilities capabilities = DesiredCapabilities.chrome();
    	System.setProperty("webdriver.chrome.driver", "/Users/akyel_000/Desktop/chromedriver.exe");
    	driver = new ChromeDriver(capabilities);
    	driver.manage().window().maximize();
    	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    	driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() throws Exception{
    	driver.quit();
    }
}
