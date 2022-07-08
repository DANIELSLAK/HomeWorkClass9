import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
public class HomeWork extends DriverSingelton {
    private static WebDriver driver;

    @BeforeClass
    public void before_class() {
        driver = DriverSingelton.DriverSingleton.getDriverInstance();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void Test(String WebDriverPage) throws InterruptedException {
        driver.get("https://dgotlieb.github.io/WebCalculator");
        System.out.println(driver.findElement(By.id("SEVEN")).getSize());
        System.out.println(driver.findElement(By.id("SIX")).isDisplayed());
        String a = WebDriverPage;
        WebCalculator.pressFOUR();
        WebCalculator.pressPlus();
        WebCalculator.pressTHREE();
        WebCalculator.pressEquals();
        String ExpectedResult = "7";
        assertEquals(ExpectedResult, WebCalculator.getResult());
    }


    @Test
    public void URL_test(String oneURL) {
        String OneURL = "https://www.one.co.il";
        ChromeDriver chromeDriver = new ChromeDriver();
        Assert.assertEquals(chromeDriver.getCurrentUrl(),OneURL);
    }

    @Test
    public void Booking_title(){
        String BookingTitle = "מצאו את מקום האירוח הבא שלכם";
        new WebDriver.Navigation() {
            @Override
            public void back() {
            }

            @Override
            public void forward() {
            }

            @Override
            public void to(String url) {
            }

            @Override
            public void to(URL url) {
            }

            @Override
            public void refresh() {
            }
        }.refresh();

    }
    @Test
    public void extensions(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("Disable extensions");

    }

        @Test
        public void Web_controllers(){
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://gotlieb.github.io/Controllers/");
        List<WebElement> list = chromeDriver.findElements(By.name("Milk product"));
        for (WebElement tempelemnet : list){
            if(tempelemnet.getAttribute("value").equals("Cheese"));
            tempelemnet.click();
            System.out.println(tempelemnet.getAttribute("value"));
        }
    }

    @Test
    public void test_digits(){
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://dgotlieb.github.io/WebCalculator/");
        System.out.println(chromeDriver.findElement(By.id("two")).getRect().getHeight());
        System.out.println(chromeDriver.findElement(By.id("six")).getRect().getWidth());
    }

    @AfterClass
    public void after_all_test(){
        driver.quit();
    }

}