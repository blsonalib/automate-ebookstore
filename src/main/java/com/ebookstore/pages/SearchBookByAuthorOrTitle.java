package com.ebookstore.pages;

import com.ebookstore.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBookByAuthorOrTitle extends BaseClass {
    @FindBy(className = "MuiInputBase-input")
    private WebElement searchBook;

    public SearchBookByAuthorOrTitle(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void setSearchBook(String bookNameOrTitle){
        searchBook.sendKeys(bookNameOrTitle);
    }
}
