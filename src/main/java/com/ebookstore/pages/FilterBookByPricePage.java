package com.ebookstore.pages;

import com.ebookstore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class FilterBookByPricePage extends BaseClass {
    @FindBy(name = "min")
    WebElement miniumumLimit;
    @FindBy(xpath = "//input[@name='max']")
    WebElement maximumLimit;
    @FindBy(xpath = "//span[contains(text(),'Filter')]")
    WebElement filterButton;
    @FindBy(className = "MuiButton-label")
    WebElement filterByPrice;

    public FilterBookByPricePage() {
        PageFactory.initElements(driver, this);
    }


    public void setMinimumLimit(String miniumumLimitValue) throws InterruptedException, AWTException {
        Robot robot = new Robot();
        robot.mouseMove(1035, 225);
        Thread.sleep(2000);
        miniumumLimit.clear();
        miniumumLimit.sendKeys(miniumumLimitValue);
    }

    public void setMaximumLimit(String maximumLimitValue) throws InterruptedException {
        Thread.sleep(2000);
        maximumLimit.clear();
        maximumLimit.sendKeys(maximumLimitValue);
    }

    public void clickOnFilterButton() {
        filterButton.click();
    }
}
