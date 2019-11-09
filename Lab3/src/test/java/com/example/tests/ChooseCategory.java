package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ChooseCategory {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    ChromeOptions chrome_options = new ChromeOptions();
    chrome_options.addArguments("--window-size=1920,1080");

    driver = new ChromeDriver(chrome_options);
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testChooseCategory() throws Exception {
    driver.get("https://otvet.mail.ru/");

    driver.findElement(By.xpath("(.//*[starts-with(@class, 'js-text-inner pm-toolbar__button__text__inner  pm-toolbar__button__text__inner_dropdown')])")).click();

    String categoryName = driver.findElement(By.xpath("(.//*[starts-with(@class, 'js-text pm-toolbar__dropdown__item__text')])[15]")).getText();

    driver.findElement(By.xpath("(.//*[starts-with(@class, 'js-text pm-toolbar__dropdown__item__text')])[15]")).click();

    assertEquals(categoryName, driver.findElement(By.xpath("(.//*[starts-with(@class, 'page-index--h1 bordered')])")).getText());
    assertEquals(categoryName, driver.findElement(By.xpath("(.//*[starts-with(@itemprop, 'title')])")).getText());
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
