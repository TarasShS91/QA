import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Selenium_tests {

    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "src/test/chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://sandbox.cardpay.com/MI/cardpayment2.html?orderXml=PE9SREVSIFdBTExFVF9JRD0nODI5OScgT1JERVJfTlVNQkVSPSc0NTgyMTEnIEFNT1VOVD0nMjkxLjg2JyBDVVJSRU5DWT0nRVVSJyAgRU1BSUw9J2N1c3RvbWVyQGV4YW1wbGUuY29tJz4KPEFERFJFU1MgQ09VTlRSWT0nVVNBJyBTVEFURT0nTlknIFpJUD0nMTAwMDEnIENJVFk9J05ZJyBTVFJFRVQ9JzY3NyBTVFJFRVQnIFBIT05FPSc4NzY5OTA5MCcgVFlQRT0nQklMTElORycvPgo8L09SREVSPg==&sha512=998150a2b27484b776a1628bfe7505a9cb430f276dfa35b14315c1c8f03381a90490f6608f0dcff789273e05926cd782e1bb941418a9673f43c47595aa7b8b0d";
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
    }

    @Test
    public void testUntitledTestCase2() throws Exception {
        driver.get(baseUrl);

        driver.findElement(By.id("input-card-number")).click();
        driver.findElement(By.id("input-card-number")).clear();
        driver.findElement(By.id("input-card-number")).sendKeys("1234 5678 9012 3456");
        driver.findElement(By.id("payment-data-card-fields")).click();
        driver.findElement(By.id("input-card-holder")).clear();
        driver.findElement(By.id("input-card-holder")).sendKeys("HOMER SIMPSON");
        driver.findElement(By.id("card-expires-month")).click();
        new Select(driver.findElement(By.id("card-expires-month"))).selectByVisibleText("12");
        driver.findElement(By.id("card-expires-year")).click();
        new Select(driver.findElement(By.id("card-expires-year"))).selectByVisibleText("2022");
        driver.findElement(By.id("input-card-cvc")).click();
        driver.findElement(By.id("input-card-cvc")).clear();
        driver.findElement(By.id("input-card-cvc")).sendKeys("777");
        driver.findElement(By.id("action-submit")).click();

    }

    @Test
    public void testUntitledTestCase3() throws Exception {
        driver.get(baseUrl);

        driver.findElement(By.id("input-card-number")).click();
        driver.findElement(By.id("input-card-number")).clear();
        driver.findElement(By.id("input-card-number")).sendKeys("1234567890123456");
        driver.findElement(By.id("input-card-holder")).click();
        driver.findElement(By.id("input-card-holder")).clear();
        driver.findElement(By.id("input-card-holder")).sendKeys("CARDHOLDER");
        driver.findElement(By.id("card-expires-month")).click();
        new Select(driver.findElement(By.id("card-expires-month"))).selectByVisibleText("12");
        driver.findElement(By.id("card-expires-year")).click();
        new Select(driver.findElement(By.id("card-expires-year"))).selectByVisibleText("2022");
        driver.findElement(By.id("input-card-cvc")).click();
        driver.findElement(By.id("input-card-cvc")).clear();
        driver.findElement(By.id("input-card-cvc")).sendKeys("777");
        driver.findElement(By.id("action-submit")).click();

    }

    @Test
    public void testPaymentPage() throws Exception {
        driver.get(baseUrl);

        driver.findElement(By.id("input-card-number")).click();
        driver.findElement(By.id("input-card-number")).clear();
        driver.findElement(By.id("input-card-number")).sendKeys("4000 0000 0000 0002");
        driver.findElement(By.id("input-card-holder")).click();
        driver.findElement(By.id("input-card-holder")).clear();
        driver.findElement(By.id("input-card-holder")).sendKeys("1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
        driver.findElement(By.id("payment-data-card-fields")).click();
        new Select(driver.findElement(By.id("card-expires-month"))).selectByVisibleText("12");
        driver.findElement(By.id("card-expires-year")).click();
        new Select(driver.findElement(By.id("card-expires-year"))).selectByVisibleText("2022");
        driver.findElement(By.id("input-card-cvc")).click();
        driver.findElement(By.id("input-card-cvc")).clear();
        driver.findElement(By.id("input-card-cvc")).sendKeys("777");
        driver.findElement(By.id("action-submit")).click();

    }

    @Test
    public void testPaymentPage2() throws Exception {
        driver.get(baseUrl);

        driver.findElement(By.id("input-card-number")).click();
        driver.findElement(By.id("input-card-number")).clear();
        driver.findElement(By.id("input-card-number")).sendKeys("9876543210987654");
        driver.findElement(By.id("input-card-holder")).click();
        driver.findElement(By.id("input-card-holder")).clear();
        driver.findElement(By.id("input-card-holder")).sendKeys("CARDHOLDER");
        driver.findElement(By.id("card-expires-month")).click();
        new Select(driver.findElement(By.id("card-expires-month"))).selectByVisibleText("12");
        driver.findElement(By.id("card-expires-year")).click();
        new Select(driver.findElement(By.id("card-expires-year"))).selectByVisibleText("2022");
        driver.findElement(By.id("input-card-cvc")).click();
        driver.findElement(By.id("input-card-cvc")).clear();
        driver.findElement(By.id("input-card-cvc")).sendKeys("777");
        driver.findElement(By.id("action-submit")).click();

    }

    @Test
    public void testPaymentPage3() throws Exception {
        driver.get(baseUrl);

        String OrderNumber = driver.findElement(By.id("order-number")).getText();
        String TotalAmount = driver.findElement(By.id("total-amount")).getText();
        String CardHolder = "HOMER SIMPSON";
        String ConfirmedStatus = "Confirmed";

        driver.findElement(By.id("input-card-number")).click();
        driver.findElement(By.id("input-card-number")).clear();
        driver.findElement(By.id("input-card-number")).sendKeys("4000 0000 0000 0002");
        driver.findElement(By.id("input-card-holder")).click();
        driver.findElement(By.id("input-card-holder")).clear();
        driver.findElement(By.id("input-card-holder")).sendKeys("CardHolder");
        driver.findElement(By.id("card-expires-month")).click();
        new Select(driver.findElement(By.id("card-expires-month"))).selectByVisibleText("12");
        driver.findElement(By.id("card-expires-year")).click();
        new Select(driver.findElement(By.id("card-expires-year"))).selectByVisibleText("2022");
        driver.findElement(By.id("input-card-cvc")).click();
        driver.findElement(By.id("input-card-cvc")).clear();
        driver.findElement(By.id("input-card-cvc")).sendKeys("777");
        driver.findElement(By.id("action-submit")).click();
        driver.findElement(By.id("success")).click();
        driver.findElement(By.xpath("//div[@id='payment-item-status']/div[2]")).click();

        Assert.assertEquals(OrderNumber, driver.findElement(By.xpath("//*[@id=\"payment-item-ordernumber\"]/div[2]")).getText());
        Assert.assertEquals(TotalAmount, driver.findElement(By.xpath("//*[@id=\"payment-item-total-amount\"]")).getText());
        Assert.assertEquals(CardHolder, driver.findElement(By.xpath("//*[@id=\"payment-item-cardholder\"]/div[2]")).getText());
        Assert.assertEquals(ConfirmedStatus, driver.findElement(By.xpath("//*[@id=\"payment-item-status\"]/div[2]")).getText());

    }

    @Test
    public void InvalidCVC() throws Exception {
        driver.get(baseUrl);

        driver.findElement(By.id("input-card-number")).click();
        driver.findElement(By.id("input-card-number")).clear();
        driver.findElement(By.id("input-card-number")).sendKeys("4000 0000 0000 0002");
        driver.findElement(By.id("input-card-holder")).click();
        driver.findElement(By.id("input-card-holder")).clear();
        driver.findElement(By.id("input-card-holder")).sendKeys("HOMER SIMPSON");
        driver.findElement(By.id("card-expires-month")).click();
        new Select(driver.findElement(By.id("card-expires-month"))).selectByVisibleText("12");
        driver.findElement(By.id("card-expires-year")).click();
        new Select(driver.findElement(By.id("card-expires-year"))).selectByVisibleText("2022");
        driver.findElement(By.id("input-card-cvc")).click();
        driver.findElement(By.id("input-card-cvc")).clear();
        driver.findElement(By.id("input-card-cvc")).sendKeys("par");
        driver.findElement(By.id("action-submit")).click();

    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}

