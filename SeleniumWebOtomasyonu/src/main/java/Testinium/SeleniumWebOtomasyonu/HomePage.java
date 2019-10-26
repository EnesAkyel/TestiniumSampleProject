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

public class HomePage extends App
{
    @Test
    public void Control() {

    	driver.get("https://www.n11.com/");

    	String actualUrl = "https://www.n11.com/";
    	String expectedUrl = driver.getCurrentUrl();
    	Assert.assertEquals(expectedUrl, actualUrl);

    	Login.LoginUsingSelenium();
    	SelectItem.selection();
    	BasketOperations.basketChanges();
    }
}
