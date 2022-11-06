package com.Qa.Page;

import com.Qa.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class qa_page {
    public qa_page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (id = "login")
    public WebElement username;

    @FindBy (id = "password")
    public WebElement password;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement signinbttn;

    @FindBy (xpath = "//p[@class='alert alert-danger']")
    public WebElement alert;


}

