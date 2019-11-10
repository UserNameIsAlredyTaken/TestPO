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

public class Like {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    ChromeOptions chrome_options = new ChromeOptions();
    chrome_options.addArguments("--window-size=1000,1080", "--disable-application-cache");

    driver = new ChromeDriver(chrome_options);
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    driver.get("https://otvet.mail.ru/");
    driver.findElement(By.id("PH_authLink")).click();
    driver.switchTo().frame(1);

    driver.findElement(By.name("Login")).sendKeys("LabTPO");
    driver.findElement(By.xpath("(.//*[@data-test-id='next-button'])")).click();

    driver.findElement(By.name("Password")).clear();
    driver.findElement(By.name("Password")).sendKeys("testingpo3");

    driver.findElement(By.xpath("(.//*[@data-test-id='submit-button'])")).click();
  }

  @Test
  public void testLike() throws Exception {
    driver.get("https://otvet.mail.ru/question/193343993");

    Integer count_of_likes_before = Integer.decode(driver.findElement(By.xpath("(.//*[@class='totalmarks bold btn--text'])[1]")).getText());

    driver.findElement(By.xpath("(.//*[starts-with(@class, 'btn btn-mark')])[1]")).click();

    Thread.sleep(10000);
    
    Integer count_of_likes_after = Integer.decode(driver.findElement(By.xpath("(.//*[@class='totalmarks bold btn--text'])[1]")).getText());

    assertEquals(count_of_likes_before + 1, count_of_likes_after.longValue());
  }

  @After
  public void tearDown() throws Exception {
    driver.findElement(By.xpath("(.//*[starts-with(@class, 'btn btn-mark')])[1]")).click();

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
