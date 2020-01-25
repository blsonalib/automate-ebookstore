package com.ebookstore.pages;

import com.ebookstore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pagination extends BaseClass {
    @FindBy(xpath = "//body/div[@id='root']/div/div/div/div/div/button[1]")
    WebElement pageButton1;
    @FindBy(xpath = "//body//button[2]")
    WebElement pageButton2;
    @FindBy(xpath = "//body//button[3]")
    WebElement pageButton3;
    @FindBy(xpath = "//body//button[4]")
    WebElement pageButton4;
    @FindBy(xpath = "//body//button[5]")
    WebElement pageButton5;
    @FindBy(xpath = "//body/div[@id='root']/div/div/div/div/div/span[1]")
    WebElement previousButton;
    @FindBy(xpath = "//body/div[@id='root']/div/div/div/div/div/span[2]")
    WebElement nextButton;

    public Pagination() {
        PageFactory.initElements(driver, this);
    }

    public void setPageButton1() {
        pageButton1.click();
    }

    public void setPageButton2() {
        pageButton2.click();
    }

    public void setPageButton3() {
        pageButton3.click();
    }

    public void setPageButton4() {
        pageButton4.click();
    }

    public void setPageButton5() {
        pageButton5.click();
    }

    public void setPreviousButton() {
        previousButton.click();
    }

    public void setNextButton() {
        nextButton.click();
    }

}
