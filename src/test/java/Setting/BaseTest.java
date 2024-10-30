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

        // Настройки Selenide для браузера и размера окна
        Configuration.browser = "chrome";          // Тесты в браузере Chrome
        Configuration.browserSize = "1920x1080";   // Устанавливает размер окна браузера
        Configuration.headless = false;            // Запуск без интерфейса
        Configuration.pageLoadStrategy = "eager";  // Стратегия загрузки: тесты продолжаются, как только основной HTML загружен
        Configuration.pageLoadTimeout = 10000;      // Максимальное время ожидания

        // Настройки опций для Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");                // Запуск Chrome без интерфейса
        options.addArguments("--disable-gpu");             // Отключение GPU
        options.addArguments("--no-sandbox");              // Отключение песочницы необходимо для контейнеров
        options.addArguments("--disable-dev-shm-usage");   // Отключение использования общей памяти, чтобы избежать ограничений памяти в контейнерах
        options.addArguments("--window-size=1920,1080");   // Установка размера окна браузера

        //ChromeOptions к настройкам Selenide
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
