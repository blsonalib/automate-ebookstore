package com.ebookstore.tests;

import com.ebookstore.base.BaseClass;
import com.ebookstore.base.IAutoConstants;
import com.ebookstore.pages.SearchBookByAuthorOrTitle;
import com.ebookstore.util.CustomListener;
import com.ebookstore.util.JsonReader;
import org.testng.annotations.*;
import org.testng.log4testng.Logger;

import java.io.IOException;

@Listeners(CustomListener.class)
public class TestSearchBookByAutherOrTitle extends BaseClass {

    Logger log = Logger.getLogger(BaseClass.class);
    SearchBookByAuthorOrTitle searchBookByAuthorAndTitle;

    @DataProvider(name = "SearchBook")
    public Object[][] passData() throws IOException {

        return JsonReader.getdata(IAutoConstants.filePathForSearch, "SearchBook", 5, 1);
    }

    @BeforeMethod
    public void setUp() {
        log.info("initialized driver and object of SearchBookPage is created");
        initiation();
        searchBookByAuthorAndTitle = new SearchBookByAuthorOrTitle(driver);
        log.info("initialized driver and object of SearchBookPage is created");
    }

    @Test(dataProvider = "SearchBook")
    public void givenSearchBook_WhenSearchByAuthorAndTitle_ThenShouldReturnBooks(String field) throws InterruptedException {
        log.info("****Search book test script started****");
        log.info("set search book");
        searchBookByAuthorAndTitle.setSearchBook(field);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
