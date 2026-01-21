package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class NotificationDialog {
    static void main() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:4200/feed");
        driver.findElement(By.id("not-button")).click();
        driver.manage().window().maximize();
        Thread.sleep(6000);
        driver.close();

//        FirefoxOptions options = new FirefoxOptions();
//        options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");  // Update path
//        WebDriver firedriver = new FirefoxDriver(options);
//        firedriver.get("http://localhost:4200/delete");
//        driver.findElement(By.id("not-button")).click();
//        firedriver.manage().window().maximize();
//        Thread.sleep(3000);
//        firedriver.close();
    }
}
