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

public class Categories {
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
  public void testCategories() throws Exception {
    driver.get("https://otvet.mail.ru/");

    driver.findElement(By.xpath("(.//*[starts-with(@class, 'js-text-inner pm-toolbar__button__text__inner  pm-toolbar__button__text__inner_dropdown')])")).click();

    assertEquals(driver.findElement(By.xpath("(.//*[starts-with(@class, 'js-text pm-toolbar__dropdown__item__text')])[1]")).getText(), "Все вопросы проекта");
    assertEquals(driver.findElement(By.xpath("(.//*[starts-with(@class, 'js-text pm-toolbar__dropdown__item__text')])[2]")).getText(), "Домашние задания");
    assertEquals(driver.findElement(By.xpath("(.//*[starts-with(@class, 'js-text pm-toolbar__dropdown__item__text')])[3]")).getText(), "Авто, Мото");
    assertEquals(driver.findElement(By.xpath("(.//*[starts-with(@class, 'js-text pm-toolbar__dropdown__item__text')])[4]")).getText(), "Бизнес, Финансы");
    assertEquals(driver.findElement(By.xpath("(.//*[starts-with(@class, 'js-text pm-toolbar__dropdown__item__text')])[5]")).getText(), "Города и Страны");
    assertEquals(driver.findElement(By.xpath("(.//*[starts-with(@class, 'js-text pm-toolbar__dropdown__item__text')])[6]")).getText(), "Гороскопы, Магия, Гадания");
    assertEquals(driver.findElement(By.xpath("(.//*[starts-with(@class, 'js-text pm-toolbar__dropdown__item__text')])[7]")).getText(), "Досуг, Развлечения");
    assertEquals(driver.findElement(By.xpath("(.//*[starts-with(@class, 'js-text pm-toolbar__dropdown__item__text')])[8]")).getText(), "Еда, Кулинария");
    assertEquals(driver.findElement(By.xpath("(.//*[starts-with(@class, 'js-text pm-toolbar__dropdown__item__text')])[9]")).getText(), "Животные, Растения");
    assertEquals(driver.findElement(By.xpath("(.//*[starts-with(@class, 'js-text pm-toolbar__dropdown__item__text')])[10]")).getText(), "Знакомства, Любовь, Отношения");
    assertEquals(driver.findElement(By.xpath("(.//*[starts-with(@class, 'js-text pm-toolbar__dropdown__item__text')])[11]")).getText(), "Искусство и Культура");
    assertEquals(driver.findElement(By.xpath("(.//*[starts-with(@class, 'js-text pm-toolbar__dropdown__item__text')])[12]")).getText(), "Компьютерные и Видео игры");
    assertEquals(driver.findElement(By.xpath("(.//*[starts-with(@class, 'js-text pm-toolbar__dropdown__item__text')])[13]")).getText(), "Компьютеры, Связь");
    assertEquals(driver.findElement(By.xpath("(.//*[starts-with(@class, 'js-text pm-toolbar__dropdown__item__text')])[14]")).getText(), "Красота и Здоровье");
    assertEquals(driver.findElement(By.xpath("(.//*[starts-with(@class, 'js-text pm-toolbar__dropdown__item__text')])[15]")).getText(), "Наука, Техника, Языки");
    assertEquals(driver.findElement(By.xpath("(.//*[starts-with(@class, 'js-text pm-toolbar__dropdown__item__text')])[16]")).getText(), "Образование");
    assertEquals(driver.findElement(By.xpath("(.//*[starts-with(@class, 'js-text pm-toolbar__dropdown__item__text')])[17]")).getText(), "Общество, Политика, СМИ");
    assertEquals(driver.findElement(By.xpath("(.//*[starts-with(@class, 'js-text pm-toolbar__dropdown__item__text')])[18]")).getText(), "Программирование");
    assertEquals(driver.findElement(By.xpath("(.//*[starts-with(@class, 'js-text pm-toolbar__dropdown__item__text')])[19]")).getText(), "Путешествия, Туризм");
    assertEquals(driver.findElement(By.xpath("(.//*[starts-with(@class, 'js-text pm-toolbar__dropdown__item__text')])[20]")).getText(), "Работа, Карьера");
    assertEquals(driver.findElement(By.xpath("(.//*[starts-with(@class, 'js-text pm-toolbar__dropdown__item__text')])[21]")).getText(), "Семья, Дом, Дети");
    assertEquals(driver.findElement(By.xpath("(.//*[starts-with(@class, 'js-text pm-toolbar__dropdown__item__text')])[22]")).getText(), "Спорт");
    assertEquals(driver.findElement(By.xpath("(.//*[starts-with(@class, 'js-text pm-toolbar__dropdown__item__text')])[23]")).getText(), "Стиль, Мода, Звезды");
    assertEquals(driver.findElement(By.xpath("(.//*[starts-with(@class, 'js-text pm-toolbar__dropdown__item__text')])[24]")).getText(), "Товары и Услуги");
    assertEquals(driver.findElement(By.xpath("(.//*[starts-with(@class, 'js-text pm-toolbar__dropdown__item__text')])[25]")).getText(), "Философия, Непознанное");
    assertEquals(driver.findElement(By.xpath("(.//*[starts-with(@class, 'js-text pm-toolbar__dropdown__item__text')])[26]")).getText(), "Фотография, Видеосъемка");
    assertEquals(driver.findElement(By.xpath("(.//*[starts-with(@class, 'js-text pm-toolbar__dropdown__item__text')])[27]")).getText(), "Юридическая консультация");
    assertEquals(driver.findElement(By.xpath("(.//*[starts-with(@class, 'js-text pm-toolbar__dropdown__item__text')])[28]")).getText(), "Юмор");
    assertEquals(driver.findElement(By.xpath("(.//*[starts-with(@class, 'js-text pm-toolbar__dropdown__item__text')])[29]")).getText(), "О проектах Mail.ru");
    assertEquals(driver.findElement(By.xpath("(.//*[starts-with(@class, 'js-text pm-toolbar__dropdown__item__text')])[30]")).getText(), "Другое");
    assertEquals(driver.findElement(By.xpath("(.//*[starts-with(@class, 'js-text pm-toolbar__dropdown__item__text')])[31]")).getText(), "Золотой фонд");
    assertEquals(driver.findElement(By.xpath("(.//*[starts-with(@class, 'js-text pm-toolbar__dropdown__item__text')])[32]")).getText(), "Полный список");
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
