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

public class Login extends App
{
    @Test
    public static void LoginUsingSelenium() {

    	driver.findElement(By.className("btnSignIn")).click();

		WebElement username=driver.findElement(By.id("email")); 
		WebElement password=driver.findElement(By.id("password")); 
		WebElement login=driver.findElement(By.id("loginButton")); 
		username.sendKeys("example@hotmail.com");
		password.sendKeys("password"); 
		login.click();
		String actualUrl="https://www.n11.com/"; 
		String expectedUrl= driver.getCurrentUrl(); 
		//Assert.assertEquals(expectedUrl,actualUrl);
    }
}
