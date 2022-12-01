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
        //Get actual values
//        profilePage.collectDate();
        String actualFirstName = profileAttributes.getFirstName();
        System.out.println(actualFirstName);
//        String actualLastName = profileAttributes.getLastName();
//        String actualDBDay = profileAttributes.getBdDay();
//        String actualDBMonth = profileAttributes.getBdMonth();
//        String actualDBYear = profileAttributes.getBdYear();
//        String actualMobNr = profileAttributes.getMobNr();
//        String actualCity = profileAttributes.getCityName();
//        String actualLanguage = profileAttributes.getLanguageValue();

        //Adjust values
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
        //profilePage.submitChanges();

        //Validate values
        profilePage.validateName(profileAttributes.firstName);
        System.out.println(profileAttributes.firstName);

        //Return values to existing
        profilePage.editName(actualFirstName);
 //       profilePage.editSurname(actualLastName);
//        profilePage.editBDday(actualDBDay);
//        profilePage.editBDmonth(actualDBMonth);
//        profilePage.editBDyear(actualDBYear);
//        profilePage.editMobNr(actualMobNr);
//        profilePage.editCityName(actualCity);
//        // profilePage.SelectGenderMale();
//        profilePage.selectLanguage(actualLanguage);
    }










}
