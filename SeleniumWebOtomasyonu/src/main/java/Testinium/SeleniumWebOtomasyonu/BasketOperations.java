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

public class BasketOperations extends App
{
    @Test
    public static void basketChanges() {

    	driver.findElement(By.cssSelector(".spinnerUp.spinnerArrow")).click();
    	
    	WebElement value = driver.findElement(By.className("quantity"));
    	String amount = value.getAttribute("value");
    	String basketAmount = "2";
    	Assert.assertEquals("Miktar aynı değil!", basketAmount, amount);
    	
    	driver.findElement(By.cssSelector(".removeProd.svgIcon.svgIcon_trash")).click();

    	String emptyBasket = driver.findElement(By.className("title")).getText();
    	String empty = "Sepetiniz Boş";
    	Assert.assertEquals("Sepet boş değil!", empty, emptyBasket);

    }
}
