package com.ebookstore.tests;

import com.ebookstore.base.BaseClass;
import com.ebookstore.base.IAutoConstants;
import com.ebookstore.pages.BuyBookPage;
import com.ebookstore.util.JsonReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class BuyBookTest extends BaseClass {
    BuyBookPage buyBookPage;

    @BeforeMethod
    public void setUp() {
        buyBookPage = new BuyBookPage();
        initiation();
    }

    @DataProvider(name = "AddUser TestData")
    public Object[][] passData() throws IOException {
        return JsonReader.getdata(IAutoConstants.BUY_BOOK_JSON_FILE_PATH, "AddUserTestData", 5, 2);
    }
    /*{
        "username": "Laxman",
            "mobile": "1425634152",
            "pincode": "142563",
            "locality": "sdfgd",
            "address": "fdgfg",
            "emailId": "dfsdf@gmail.com",
            "city": "dgdfg",
            "landmark": "dgdfg",
            "type": "home"
    }*/

    @Test(dataProvider = "AddUser TestData")
    public void buyBookTest(String username,String mobile,String pincode,String locality,String address,String emailId,String city,String landmark,String type) throws AWTException, InterruptedException {

        System.out.println("Name===>"+username);
        System.out.println("Mobile===>"+mobile);
 }

    @AfterMethod
    public void tearDown() {
        //   driver.close();
    }
}
