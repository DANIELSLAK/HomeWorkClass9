import org.openqa.selenium.By;

public class WebCalculator {
    public static void WebCalculatorPage(){
    }

    public static void pressPlus() {
        DriverSingelton.DriverSingleton.getDriverInstance().findElement(By.id("add")).click();
    }

    public static void pressEquals() {
        DriverSingelton.DriverSingleton.getDriverInstance().findElement(By.id("equal")).click();
    }

    public static String getResult() {
        return DriverSingelton.DriverSingleton.getDriverInstance().findElement(By.id("screen")).getText();
    }

    public static void pressFOUR() {
    }

    public static void pressTHREE() {
    }
}
