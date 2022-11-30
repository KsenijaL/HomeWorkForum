package HWForumCinemas.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ProfilePage extends LoginPage {

    private final By ProfileBtn = By.xpath("//a[@href='/mypage/Index/']");
    private final By MyInfoBtn = By.xpath("//a[@href='/mypage/profile/'][@class='margin-bottom-quarter inline-block']");
    private final By firstName = By.id("inputFirstName");
    private final By lastName = By.id("inputLastName");
    private final By bdDay = By.id("bdDay");
    private final By bdMonth = By.id("bdMonth");
    private final By bdYear = By.id("bdYear");
    private final By mobNr = By.id("inputMobile");
    private final By CityName = By.id("inputCity");
    private final By SelectGenderMale = By.id("genderMale");
    private final By SelectLanguage = By.id("preferredLanguage");
    private final By SubmitProfile = By.xpath("//button[@type='submit'][@class='btn btn-primary']");


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

    public void ValidateName(String expectedName) {
        String actual;
        actual = driver.findElement(firstName).getAttribute("value");
        assertThat(actual).isEqualTo(expectedName);
    }

    public void editSurname(String Surname) {
        driver.findElement(lastName).clear();
        driver.findElement(lastName).sendKeys(Surname);
    }

    public void ValidateSurname(String expectedSurname) {
        String actual;
        actual = driver.findElement(lastName).getAttribute("value");
        assertThat(actual).isEqualTo(expectedSurname);
    }

    public void editBDday(String newDBday) {
        Select Day = new Select(driver.findElement(bdDay));
        Day.selectByValue(newDBday);
    }

    public void ValidateBDday(String expectedDBday) {
        String actual;
        actual = driver.findElement(bdDay).getAttribute("value");
        assertThat(actual).isEqualTo(expectedDBday);
    }

    public void editBDmonth(String newDBmonth) {
        Select Mon = new Select(driver.findElement(bdMonth));
        Mon.selectByValue(newDBmonth);
    }

    public void ValidateBDmonth(String expectedDBmonth) {
        String actual;
        actual = driver.findElement(bdMonth).getAttribute("value");
        assertThat(actual).isEqualTo(expectedDBmonth);
    }

    public void editBDyear(String newDByear) {
        Select Y = new Select(driver.findElement(bdYear));
        Y.selectByValue(newDByear);
    }

    public void ValidateBDyear(String expectedDByear) {
        String actual;
        actual = driver.findElement(bdYear).getAttribute("value");
        assertThat(actual).isEqualTo(expectedDByear);
    }

    public void editMobNr(String newMobNr) {
        driver.findElement(mobNr).clear();
        driver.findElement(mobNr).sendKeys(newMobNr);
    }

    public void ValidateMobNr(String expectedMobNr) {
        String actual;
        actual = driver.findElement(mobNr).getAttribute("value");
        assertThat(actual).isEqualTo(expectedMobNr);
    }

    public void editCityName(String newCity) {
        driver.findElement(CityName).clear();
        driver.findElement(CityName).sendKeys(newCity);
    }

    public void ValidateCityName(String expectedCity) {
        String actual;
        actual = driver.findElement(CityName).getAttribute("value");
        assertThat(actual).isEqualTo(expectedCity);
    }

    public void SelectGenderMale() {
        WebElement radioBtn = driver.findElement(SelectGenderMale);
        radioBtn.click();
    }

    public void ValidateGenderMale() {
        String actual;
        actual = driver.findElement(SelectGenderMale).getAttribute("value");
        System.out.println(actual);
        assertThat(actual).isEqualTo("2");
    }

    public void SelectLanguage(String LanguageValue) {
        Select Lang = new Select(driver.findElement(SelectLanguage));
        Lang.selectByValue(LanguageValue);
    }

    public void ValidateLanguage(String expectedLanguageValue) {
        String actual;
        actual = driver.findElement(SelectLanguage).getAttribute("value");
        assertThat(actual).isEqualTo(expectedLanguageValue);
    }

    public void SubmitChanges() {
        driver.findElement(SubmitProfile).click();
    }

}