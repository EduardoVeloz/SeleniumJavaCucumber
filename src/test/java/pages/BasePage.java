package pages;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    //instanciar objeto de webDriver
    protected static WebDriver driver;
    private static WebDriverWait wait;

    static {
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public BasePage (WebDriver driver) {
        BasePage.driver = driver;
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    }
    //defines the page to open the browser
    public static void navigateTo(String url) {
        driver.get(url);
    }
    
}
