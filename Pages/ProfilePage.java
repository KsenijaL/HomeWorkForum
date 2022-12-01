package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ProfilePage extends LogInPage {

    private final By ProfileBtn = By.xpath("//a[@href='/mypage/Index/']");
    private final By MyInfoBtn = By.xpath("//a[@href='/mypage/profile/'][@class='margin-bottom-quarter inline-block']");
    public final By firstName = By.id("inputFirstName");
    private final By lastName = By.id("inputLastName");
    private final By bdDay = By.id("bdDay");
    private final By bdMonth = By.id("bdMonth");
    private final By bdYear = By.id("bdYear");
    private final By mobNr = By.id("inputMobile");
    private final By cityName = By.id("inputCity");
    private final By selectGenderMale = By.id("genderMale");
    private final By selectLanguage = By.id("preferredLanguage");
    private final By submitProfile = By.xpath("//button[@type='submit'][@class='btn btn-primary']");


    public void clickProfile() {
        driver.findElement(ProfileBtn).click();
    }

    public void clickMyInfo() {
        driver.findElement(MyInfoBtn).click();
    }

    public void editName(String Name) {
        driver.findElement(firstName).clear();
        driver.findElement(firstName).sendKeys(Name);
    }

    public void validateName(String expectedName) {
        String actual;
        actual = driver.findElement(firstName).getAttribute("value");
        assertThat(actual).isEqualTo(expectedName);
    }

    public void editSurname(String Surname) {
        driver.findElement(lastName).clear();
        driver.findElement(lastName).sendKeys(Surname);
    }

    public void validateSurname(String expectedSurname) {
        String actual;
        actual = driver.findElement(lastName).getAttribute("value");
        assertThat(actual).isEqualTo(expectedSurname);
    }

    public void editBDday(String newDBday) {
        Select Day = new Select(driver.findElement(bdDay));
        Day.selectByValue(newDBday);
    }

    public void validateBDday(String expectedDBday) {
        String actual;
        actual = driver.findElement(bdDay).getAttribute("value");
        assertThat(actual).isEqualTo(expectedDBday);
    }

    public void editBDmonth(String newDBmonth) {
        Select Mon = new Select(driver.findElement(bdMonth));
        Mon.selectByValue(newDBmonth);
    }

    public void validateBDmonth(String expectedDBmonth) {
        String actual;
        actual = driver.findElement(bdMonth).getAttribute("value");
        assertThat(actual).isEqualTo(expectedDBmonth);
    }

    public void editBDyear(String newDByear) {
        Select Y = new Select(driver.findElement(bdYear));
        Y.selectByValue(newDByear);
    }

    public void validateBDyear(String expectedDByear) {
        String actual;
        actual = driver.findElement(bdYear).getAttribute("value");
        assertThat(actual).isEqualTo(expectedDByear);
    }

    public void editMobNr(String newMobNr) {
        driver.findElement(mobNr).clear();
        driver.findElement(mobNr).sendKeys(newMobNr);
    }

    public void validateMobNr(String expectedMobNr) {
        String actual;
        actual = driver.findElement(mobNr).getAttribute("value");
        assertThat(actual).isEqualTo(expectedMobNr);
    }

    public void editCityName(String newCity) {
        driver.findElement(cityName).clear();
        driver.findElement(cityName).sendKeys(newCity);
    }

    public void validateCityName(String expectedCity) {
        String actual;
        actual = driver.findElement(cityName).getAttribute("value");
        assertThat(actual).isEqualTo(expectedCity);
    }

    public void selectGenderMale() {
        WebElement radioBtn = driver.findElement(selectGenderMale);
        radioBtn.click();
    }

    public void validateGenderMale() {
        String actual;
        actual = driver.findElement(selectGenderMale).getAttribute("value");
        System.out.println(actual);
        assertThat(actual).isEqualTo("2");
    }

    public void selectLanguage(String LanguageValue) {
        Select Lang = new Select(driver.findElement(selectLanguage));
        Lang.selectByValue(LanguageValue);
    }

    public void validateLanguage(String expectedLanguageValue) {
        String actual;
        actual = driver.findElement(selectLanguage).getAttribute("value");
        assertThat(actual).isEqualTo(expectedLanguageValue);
    }

    public void submitChanges() {
        driver.findElement(submitProfile).click();
    }

}
