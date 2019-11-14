package com.example.tests;

import java.util.Random;
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

public class LeadQuestions {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
//          System.setProperty("webdriver.chrome.driver","C:\\Users\\danil\\Desktop\\chromedriver_win32\\chromedriver.exe");

        ChromeOptions chrome_options = new ChromeOptions();
        chrome_options.addArguments("--window-size=1000,1080", "--disable-application-cache");

        driver = new ChromeDriver(chrome_options);
        baseUrl = "https://www.katalon.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://otvet.mail.ru/");
        driver.findElement(By.id("PH_authLink")).click();

        driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@class='ag-popup__frame__layout__iframe']")));
        driver.findElement(By.name("Login")).sendKeys("LabTPO");
        driver.findElement(By.xpath("(.//*[@data-test-id='next-button'])")).click();

        driver.findElement(By.name("Password")).clear();
        driver.findElement(By.name("Password")).sendKeys("testingpo3");

        driver.findElement(By.xpath("(.//*[@data-test-id='submit-button'])")).click();

    }

    @Test
    public void testAnswer() throws Exception {
        driver.findElement(By.xpath("//*[@class= 'question-leaders']/div/*[@class='black list__title']")).click();

        assertEquals(driver.findElement(By.xpath("//*[@class='page-index--h1 bordered']")).getText(), "Вопросы-лидеры");
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
