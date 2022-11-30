package HWForumCinemas;

import HWForumCinemas.Pages.LoginPage;
import HWForumCinemas.Pages.ProfilePage;
import HWForumCinemas.Pages.HomePage;
import org.junit.jupiter.api.Test;



public class Tests {

    HomePage homePage = new HomePage();
    LoginPage loginPage=new LoginPage();
    ProfilePage profilePage=new ProfilePage();

//    String movieName="qf";///"pantera";
//
//
//    @Test
//    public void bonusTest() {
//        homePage.openBaseUrl();
//
//        loginPage.clickLogIn();
//        loginPage.fillUserName("ksenija.lohina@gmail.com");
//        loginPage.fillPassword("123");
//        loginPage.clickSubmitLogInDetails();
//        loginPage.selectMovie(movieName);
//    }

    @Test
    public void LogInTest() {
        homePage.openBaseUrl();

        loginPage.clickLogIn();
        loginPage.fillUserName("ksenija.lohina@gmail.com");
        loginPage.fillPassword("123");
        loginPage.clickSubmitLogInDetails();
    }

    @Test
    public void ProfileTest() {
        String newName="Ksenija2";
        String newSurname="Lohina2";
        String newDBday = "21";
        String newDBmonth = "3";
        String newDByear ="2000";
        String newMobNr ="20231588";
        String newCity ="Riga2";
        String LanguageValue="1000";


        homePage.openBaseUrl();
        loginPage.clickLogIn();
        loginPage.fillUserName("ksenija.lohina@gmail.com");
        loginPage.fillPassword("123");
        loginPage.clickSubmitLogInDetails();
        profilePage.clickProfile();
        profilePage.clickMyInfo();
        profilePage.editName(newName);
        profilePage.editSurname(newSurname);
        profilePage.editBDday(newDBday);
        profilePage.editBDmonth(newDBmonth);
        profilePage.editBDyear(newDByear);
        profilePage.editMobNr(newMobNr);
        profilePage.editCityName(newCity);
        profilePage.SelectGenderMale();
        profilePage.SelectLanguage(LanguageValue);
        //profilePage.SubmitChanges();
        profilePage.ValidateName(newName);
        profilePage.ValidateSurname(newSurname);
        profilePage.ValidateBDday(newDBday);
        profilePage.ValidateBDmonth(newDBmonth);
        profilePage.ValidateBDyear(newDByear);
        profilePage.ValidateMobNr(newMobNr);
        profilePage.ValidateCityName(newCity);
        profilePage.ValidateGenderMale();
        profilePage.ValidateLanguage(LanguageValue);
    }

    }
