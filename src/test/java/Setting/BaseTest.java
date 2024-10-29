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

        // Опции для Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Оставьте, если нужно без GUI
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage"); // Для контейнеров
        options.addArguments("--window-size=1920,1080");

        // Применение опций к Selenide
        Configuration.browserCapabilities = options;

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
