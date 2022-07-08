import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSingelton {


    public static SearchContext getDriverInstance() {
        return null;
    }

    public class DriverSingleton {
        private static WebDriver driver;

        public static WebDriver getDriverInstance(){
            if(driver == null){
                driver = new ChromeDriver();
            }

            return driver;
        }
    }
}
