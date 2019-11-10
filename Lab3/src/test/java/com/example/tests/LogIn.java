package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LogIn {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new ChromeDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testLogIn() throws Exception {
    driver.get("https://otvet.mail.ru/");
    driver.findElement(By.id("PH_authLink")).click();
    driver.switchTo().frame(1);

    driver.findElement(By.name("Login")).sendKeys("LabTPO");
    driver.findElement(By.xpath("(.//*[@data-test-id='next-button'])")).click();

    driver.findElement(By.name("Password")).clear();
    driver.findElement(By.name("Password")).sendKeys("testingpo3");

    driver.findElement(By.xpath("(.//*[@data-test-id='submit-button'])")).click();

    assertEquals("labtpo@mail.ru", driver.findElement(By.xpath("(.//*[@class='x-ph__menu__button__text x-ph__menu__button__text_auth'])")).getText());
    assertTrue(isElementPresent(By.xpath("(.//*[@class='pm-toolbar__button__icon__img  pm-toolbar__button__icon__img_notext pm-toolbar__button__icon__img_avatar pm-toolbar__button__avatar'])")));
  }

  @After
  public void tearDown() throws Exception {
    driver.findElement(By.xpath("(.//*[@class='x-ph__link x-ph__link_last x-ph__auth__link'])")).click();

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
