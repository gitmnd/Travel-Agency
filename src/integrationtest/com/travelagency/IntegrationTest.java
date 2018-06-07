package com.travelagency;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class IntegrationTest {

    static WebDriver driver;
    static String HOME_TAB="//a[text()='HOME']";
    static String HOME_PAGE_IMAGE="//div[@class='row text-center']";
    static String FLIGHTS_TAB="//a[text()='FLIGHTS']";
    static String FLIGHTS_TAB_TEXT="//h2[contains(text(),'Domestic ')]";
    static String FROM_FIELD="//input[@id='from']";
    static String TO_FIELD="//input[@id='to']";
    static String DEPART_FIELD="//input[@id='depart']";
    static String PASSENGER_CLASS_FIELD="//input[@id='passengerclass']";
    static String SEARCH_BUTTON="//button[text()='Search']";
    static String DEALS_TAB="//a[text()='DEALS']";
    static String DEALS_TAB_TEXT="//h3[contains(text(),'Deals in Travel Agency')]";
    static String CONTACT_US_TAB="//a[text()='CONTACT US']";
    static String CONTACT_US_TEXT="//div[text()='Travel Agency Limited']";

    WebDriverWait wait = new WebDriverWait(driver, 60, 1000);
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @BeforeClass
    public static void setup() {
        ChromeDriverManager.getInstance().setup();
        driver= new ChromeDriver();
    }

    @AfterClass
    public static void cleanUp() {
        driver.quit();
    }

    @Test
    public void startSystemTest() {
        driver.get("http://localhost:9090/Travel-Agency");
        verifyHomeTab();
        verifyFlightBooking();
        verifyCabBooking();
        verifyDeals();
        verifyContactUs();
    }

    private void verifyFlightBooking() {
        driver.findElement(By.xpath(FLIGHTS_TAB)).click();
        driver.findElement(By.xpath(FLIGHTS_TAB_TEXT)).isDisplayed();
        driver.findElement(By.xpath(FROM_FIELD)).sendKeys("LONDON");
        driver.findElement(By.xpath(TO_FIELD)).sendKeys("BANGALORE");
        driver.findElement(By.xpath(DEPART_FIELD)).sendKeys("12th June");
        driver.findElement(By.xpath(PASSENGER_CLASS_FIELD)).sendKeys("BUSINESS CLASS");
        driver.findElement(By.xpath(SEARCH_BUTTON)).click();
        logger.info("Flight booking functionality tested");
    }


    private void verifyHomeTab() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(HOME_TAB)));
        driver.findElement(By.xpath(HOME_TAB)).click();
        driver.findElement(By.xpath(HOME_PAGE_IMAGE)).isDisplayed();
        logger.info("Homepage verified");
    }

    private void verifyCabBooking() {
        logger.info("Cabs functionality not yet implemented");
    }

    private void verifyDeals() {
        driver.findElement(By.xpath(DEALS_TAB)).click();
        driver.findElement(By.xpath(DEALS_TAB_TEXT)).isDisplayed();
        logger.info("Deals tab verified");
    }

    private void verifyContactUs() {
        driver.findElement(By.xpath(CONTACT_US_TAB)).click();
        driver.findElement(By.xpath(CONTACT_US_TEXT)).isDisplayed();
        logger.info("Contact us verified");
    }
}
