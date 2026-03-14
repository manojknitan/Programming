/*
package com.learning.automation;

public class LoginPage {
    private WebDriver driver;

    //locators
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = by.id("login");

    //constructor
    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    //page actions
    public void enterUserName(String username)
    {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password)
    {
        driver.findElement(passwordField).sendkeys(password);
    }

    public DashBoardPage clickLogin()
    {
        driver.findElement(loginButton).click();
        return new DashBoardPage(driver);
    }
}
*/
