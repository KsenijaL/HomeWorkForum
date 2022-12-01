package Pages;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    public static ChromeDriver driver;
    private static String ForumHomeUrl = "https://www.forumcinemas.lv/";

    public void startDriver() {
        String path = "C:\\Users\\Edgars\\Desktop\\Ksenija\\SampleProjectGradle\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();
    }

    public void openBaseUrl() {
        startDriver();
        driver.get(ForumHomeUrl);
    }

    public void stopDriver() {
        driver.quit();
    }
}
