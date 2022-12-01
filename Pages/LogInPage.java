package Pages;

import org.openqa.selenium.By;

public class LogInPage extends BasePage {

    private final By LogInBtn = By.xpath("//a[@class='btn btn-login btn-default']");
    private final By UserNameInput = By.id("input-userName");
    private final By PasswordInput = By.id("input-password");
    private final By SubmitBtn = By.xpath("//button[@type='submit'][@class='btn btn-primary btn-block']");


    public void clickLogIn() {
        driver.findElement(LogInBtn).click();
    }

    public void fillUserName(String userName) {
        driver.findElement(UserNameInput).sendKeys(userName);
    }

    public void fillPassword(String Password) {
        driver.findElement(PasswordInput).sendKeys(Password);
    }

    public void clickSubmitLogInDetails() {
        driver.findElement(SubmitBtn).click();
    }

}
