package com.ebookstore.base;

import com.ebookstore.util.Utility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    Logger log = Logger.getLogger(BaseClass.class);
    public static WebDriver driver;
    public static Properties property;
    public static WebDriverWait wait;
    public static FileInputStream fileInputStream;


    static {
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
        System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver");
    }

    public BaseClass() {

        property = new Properties();
        try {
            fileInputStream = new FileInputStream("./src/main/java/com/ebookstore/config/config.properties");
            property.load(fileInputStream);
            log.info("config properties file is loaded");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void initiation() {
        if (property.getProperty("browser").equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("disable-infobars");
            options.addArguments("--disable-notifications");
            driver = new ChromeDriver(options);
        } else if (property.getProperty("browser").equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Utility.pageload, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Utility.wait, TimeUnit.SECONDS);
        driver.get(property.getProperty("URL"));
        wait = new WebDriverWait(driver, Utility.wait);
    }
}
