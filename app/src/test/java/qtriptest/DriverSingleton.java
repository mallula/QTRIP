package qtriptest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class DriverSingleton {

    private static DriverSingleton instanceOfSingletonBrowserClass = null;
    private RemoteWebDriver driver;

    private DriverSingleton() {
        // Use WebDriverManager to set up ChromeDriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static DriverSingleton getInstanceOfSingletonBrowserClass() {
        if (instanceOfSingletonBrowserClass == null) {
            instanceOfSingletonBrowserClass = new DriverSingleton();
        }
        return instanceOfSingletonBrowserClass;
    }

    public RemoteWebDriver getDriver() {
        return driver;
    }
}
