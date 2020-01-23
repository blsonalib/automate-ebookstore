package com.ebookstore.util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Utility {
    public static final int pageload = 60;
    public static final int wait = 80;
    public static final int pageNo = 1;

    public static void captureScreenShot(WebDriver driver, String screenshotName) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File dest = new File("/home/admin1/Documents/POM_Sample_Facebook_With_TestNGLister/src/main/resources/ScreenShots/" + screenshotName + ".png");
        try {
            FileUtils.copyFile(src, dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
