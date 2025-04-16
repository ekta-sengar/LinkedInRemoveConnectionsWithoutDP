package com.website;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeTest {
  WebDriver driver;
@Test
  public void firstOneTest(){

    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.linkedin.com/");
    driver.findElement(By.xpath("//a[contains(text(), 'Sign in with email')]")).click();
    Assert.assertTrue(false);

  }
  @AfterSuite
  public void closeTest() {
    driver.close();
  }


}
