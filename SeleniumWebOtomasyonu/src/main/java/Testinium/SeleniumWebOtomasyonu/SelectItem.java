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

public class SelectItem extends App
{
	public static String price;

    @Test
    public static void selection() {
    	Random rnd = new Random();
    	int index = rnd.nextInt(5);
    	String nextPageUrl = "https://www.n11.com/bilgisayar?pg=2";

    	driver.findElement(By.id("searchData")).sendKeys("Bilgisayar");
    	driver.findElement(By.className("searchBtn")).click();
    	driver.navigate().to(nextPageUrl);
    	List<WebElement> urunlerIsimListesi = driver.findElements(By.className("productName"));
    	urunlerIsimListesi.get(index).click();
    	driver.findElement(By.cssSelector(".btn.btnGrey.btnAddBasket")).click();
    	price = driver.findElement(By.className("newPrice")).getText();
    	driver.findElement(By.className("myBasket")).click();
    	String basketPrice = driver.findElement(By.className("priceArea")).getText();
    	//Assert.assertEquals("Fiyati ayni degil!", basketPrice, price);
    }
}
