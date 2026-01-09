package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class NoEngagement {
    static void main() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver", "C:\\Browser drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:4200/delete");
        driver.manage().window().maximize();
        Thread.sleep(6000);
        driver.close();

        //System.setProperty("webdriver.gecko.driver", "C:\\Browser drivers\\geckodriver.exe");
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");  // Update path
        WebDriver firedriver = new FirefoxDriver(options);
        firedriver.get("http://localhost:4200/delete");
        firedriver.manage().window().maximize();
        Thread.sleep(3000);
        firedriver.close();

    }
}
