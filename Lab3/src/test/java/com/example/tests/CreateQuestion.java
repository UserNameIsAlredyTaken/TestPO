package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateQuestion {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testCreateQuestion() throws Exception {
    driver.get("https://otvet.mail.ru/question/216999412");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Полный список'])[1]/following::span[7]")).click();
    driver.findElement(By.name("question_text")).click();
    driver.findElement(By.name("question_text")).clear();
    driver.findElement(By.name("question_text")).sendKeys("По какому предмету сдавать егэ?");
    driver.findElement(By.name("question_additional")).clear();
    driver.findElement(By.name("question_additional")).sendKeys("Не могу определиться с жизненным путём, что сейчас перспективнее?");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='*'])[2]/following::span[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Наука, Техника, Языки'])[2]/following::span[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='*'])[3]/following::span[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Выберите подкатегорию'])[1]/following::span[1]")).click();
    driver.findElement(By.cssSelector("div.qPvwkx9CGWqBPjuM4IdlX_0._7K1eBCj8XUK2IHMH35eH0_0 > svg")).click();
    driver.findElement(By.linkText("Опубликовать вопрос")).click();
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
