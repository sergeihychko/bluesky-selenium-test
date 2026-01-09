package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import static java.lang.IO.println;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Browser drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:4200/recent");
        driver.manage().window().maximize();
        Thread.sleep(6000);
        driver.close();

//        System.setProperty("webdriver.gecko.driver", "C:\\Browser drivers\\geckodriver.exe");
//        FirefoxOptions options = new FirefoxOptions();
//        options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");  // Update path
//        WebDriver firedriver = new FirefoxDriver(options);
//        firedriver.get("http://localhost:4200/recent");
//        firedriver.manage().window().maximize();
//        Thread.sleep(3000);
//        firedriver.close();

        println("Selenium first new project");
        }
    }
