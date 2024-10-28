package Setting;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeOptions;

abstract public class BaseTest {
    public static void setUp() {
        // Автоматическая настройка драйвера под Chrome версии 130
        WebDriverManager.chromedriver().browserVersion("130").setup();

        // Настройки Selenide
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
        Configuration.pageLoadStrategy = "eager";
        Configuration.pageLoadTimeout = 6000;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");

    }

    @BeforeAll
    public static void init() {
        setUp();
    }

    @AfterAll
    public static void tearDown() {
        Selenide.closeWebDriver();
    }
}
