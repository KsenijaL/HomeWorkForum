import Pages.BasePage;
import Pages.LogInPage;
import Pages.ProfilePage;
import org.junit.jupiter.api.Test;


public class TestForumProfile {
    String userName = "ksenija.lohina@gmail.com";
    String password = "123";


    BasePage basePage = new BasePage();
    LogInPage logInPage = new LogInPage();
    ProfilePage profilePage = new ProfilePage();
    ProfileAttributes profileAttributes = new ProfileAttributes();


    @Test
    public void logInTest() {
        basePage.openBaseUrl();
        logInPage.clickLogIn();
        logInPage.fillUserName(userName);
        logInPage.fillPassword(password);
        logInPage.clickSubmitLogInDetails();
    }

    @Test
    public void testProfileUpdate() {
        basePage.openBaseUrl();
        logInPage.clickLogIn();
        logInPage.fillUserName(userName);
        logInPage.fillPassword(password);
        logInPage.clickSubmitLogInDetails();
        profilePage.clickProfile();
        profilePage.clickMyInfo();
        profileAttributes.setFirstName("Ksenija2");
        profileAttributes.setLastName("Lohina2");
        profileAttributes.setBdDay("21");
        profileAttributes.setBdMonth("3");
        profileAttributes.setBdYear("2000");
        profileAttributes.setMobNr("20231588");
        profileAttributes.setCityName("Riga2");
        profileAttributes.setLanguageValue("1002");
        profilePage.editName(profileAttributes.firstName);
        profilePage.editSurname(profileAttributes.lastName);
        profilePage.editBDday(profileAttributes.bdDay);
        profilePage.editBDmonth(profileAttributes.bdMonth);
        profilePage.editBDyear(profileAttributes.bdYear);
        profilePage.editMobNr(profileAttributes.mobNr);
        profilePage.editCityName(profileAttributes.cityName);
        profilePage.selectGenderMale();
        profilePage.selectLanguage(profileAttributes.languageValue);
        profilePage.submitChanges();
        profilePage.validateName(profileAttributes.firstName);
        profilePage.validateSurname(profileAttributes.lastName);
        profilePage.validateBDday(profileAttributes.bdDay);
        profilePage.validateBDmonth(profileAttributes.bdMonth);
        profilePage.validateBDyear(profileAttributes.bdYear);
        profilePage.validateCityName(profileAttributes.cityName);
        profilePage.validateGenderMale();
        profilePage.validateLanguage(profileAttributes.languageValue);
    }
}
