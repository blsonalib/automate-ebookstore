package com.ebookstore.tests;

import com.ebookstore.base.BaseClass;
import com.ebookstore.pages.Pagination;
import com.ebookstore.util.CustomListener;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomListener.class)

    public class PaginationTest extends BaseClass {
        Logger log = Logger.getLogger(BaseClass.class);
        Pagination pagination;

        @BeforeMethod
        public void setUp() {
            log.info("initialized driver and object of Pagination is created");
            initiation();
            pagination = new Pagination();
            log.info("initialized driver and object of Pagination is created");
        }

        @Test
        public void givenPaginationButton_WhenClickOnButton_ThenShouldReturnNewPage() {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            log.info("****Pagination test script started****");
            // This  will scroll down the page by  1000 pixel vertical
            js.executeScript("window.scrollBy(0,1000)");
            pagination.setPageButton1();
            log.info("First pagination button click");
            pagination.setPageButton2();
            log.info("Second pagination button click");
            pagination.setPageButton3();
            log.info("Third pagination button click");
            pagination.setPageButton4();
            log.info("Forth pagination button click");
            pagination.setPageButton5();
            log.info("Fifth pagination button click");
            pagination.setPreviousButton();
            log.info("Previous pagination button click");
            pagination.setNextButton();
            log.info("Next pagination button click");

            log.info("Pagination test script is completed");
        }

        @AfterMethod
        public void tearDown() {
            driver.quit();
        }
    }

