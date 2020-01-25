package com.ebookstore.tests;

import com.ebookstore.base.BaseClass;
import com.ebookstore.base.IAutoConstants;
import com.ebookstore.pages.FilterBookByPricePage;
import com.ebookstore.util.CustomListener;
import com.ebookstore.util.JsonReader;
import org.apache.log4j.Logger;
import org.testng.annotations.*;

import java.awt.*;
import java.io.IOException;

@Listeners(CustomListener.class)
public class FilterBookByPriceTest extends BaseClass {
    Logger log = Logger.getLogger(BaseClass.class);
    FilterBookByPricePage filterBookByPricePage;

    @DataProvider(name = "FilterBooks TestData")
    public Object[][] passData() throws IOException {

        return JsonReader.getdata(IAutoConstants.filePath, "FilterBooks TestData", 7, 2);
    }

    @BeforeMethod
    public void setUp() {
        log.info("initialized driver and object of FilterBookPage is created");
        initiation();
        filterBookByPricePage = new FilterBookByPricePage();
        log.info("initialized driver and object of FilterBookPage is created");
    }

    @Test(dataProvider = "FilterBooks TestData")
    public void givenMinimumPriceAndMaximumPriceLimit_WhenBooksAvailable_ThenShouldReturnBooksList(String min,String max) throws InterruptedException, AWTException {
        System.out.println(max+"+++++++++++++++"+min);
        log.info("****filterbook test script started****");
        filterBookByPricePage.setMiniumumLimit(min);
        log.info("set min limit");
        filterBookByPricePage.setMaximumLimit(max);
        log.info("set max limit ");
        filterBookByPricePage.clickOnFilterButton();
        log.info("clicked on filter");
        log.info("filterbook test script is completed");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
