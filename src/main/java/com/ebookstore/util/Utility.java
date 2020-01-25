package com.ebookstore.util;

import com.ebookstore.base.BaseClass;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Utility {
    public static final int pageload = 60;
    public static final int wait = 80;
    public static final int pageNo = 1;
    public static Logger log = Logger.getLogger(BaseClass.class);

    public static void captureScreenShot(WebDriver driver, String screenshotName) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File dest = new File("./src/main/resources/Screenshots/" + screenshotName + ".png");
        try {
            FileUtils.copyFile(src, dest);
        } catch (IOException e) {
            log.error("While reading file we are getting error");
            e.printStackTrace();
        }
    }
}
