package com.ebookstore.pages;

import com.ebookstore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.InputEvent;

public class BuyBookPage extends BaseClass {

    @FindBy(xpath = "//span[@class='MuiButton-label' and @xpath='1']")
    WebElement placeOrderButton;
    @FindBy(name = "username")
    WebElement userName;
    @FindBy(name = "mobile")
    WebElement mobileNumber;
    @FindBy(name = "pincode")
    WebElement pinCode;
    @FindBy(name = "locality")
    WebElement locality;
    @FindBy(name = "emailId")
    WebElement emailId;
    @FindBy(name = "address")
    WebElement address;
    @FindBy(name = "city")
    WebElement city;
    @FindBy(name = "landmark")
    WebElement landMark;
    @FindBy(xpath = "//span[contains(text(),'Home')]")
    WebElement homeSelect;

    public BuyBookPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnBuyBookButton() throws AWTException {
        Robot robot = new Robot();
        robot.mouseMove(340, 517);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    public void clickOnPlaceOrder() {
        //placeOrderButton.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(placeOrderButton).perform();
    }


}
