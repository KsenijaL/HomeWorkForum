package HWForumCinemas.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;


public class LoginPage extends HomePage {

    private final By LogInBtn = By.xpath("//a[@href='/mypage/logon/?returnUrl=%252f']");
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

    ///check seat plan
//    private final By findMovie=By.xpath("//button[@class='btn btn-default global-search-button ']");
//    private final By fieldForMovie=By.xpath("//input[@class='form-control global-search-input'][@name='query']");
//
//    private final By filmDropDown=By.xpath("//ul[@class='list-group dynamic-search-result']/li[1]");
//
//    private final By seachMovie=By.xpath("//button[@class='btn btn-default'][@type='submit']");
//    private final By seanss=By.xpath("//a[@href='/websales/seatplan/365949/0/?t=638054043323364160&amp;width=1024'");
//
//
//
//    public void selectMovie (String movieName){
//        driver.findElement(findMovie).click();
//        driver.findElement(fieldForMovie).sendKeys(movieName);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
//                driver.findElement(filmDropDown).click();
////        Select suggestedMovies= new Select(driver.findElement(filmDropDown));
////       suggestedMovies.selectByIndex(0);
//        driver.findElement(seachMovie).click();
//        driver.findElement(seanss).click();
//
//        }

}


