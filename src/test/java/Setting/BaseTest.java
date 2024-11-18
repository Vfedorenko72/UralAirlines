package Setting;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeOptions;

abstract public class BaseTest {
    public static void setUp() {
        // Автоматическая настройка драйвера под Chrome
        WebDriverManager.chromedriver().setup();

        // Основные настройки Selenide
        Configuration.browser = "chrome";            // Браузер Chrome
        Configuration.browserSize = "1920x1080";     // Размер окна браузера
        Configuration.headless = true;               // Включение headless-режима
        Configuration.pageLoadStrategy = "normal";   // Ждать полной загрузки страницы
        Configuration.pageLoadTimeout = 15000;       // Увеличено время ожидания

        // ChromeOptions для тонкой настройки
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");              // Безопасный режим для контейнеров
        options.addArguments("--disable-dev-shm-usage");   // Для контейнеров Docker
        options.addArguments("--remote-allow-origins=*");  // Исправление для Chrome 111+
        options.addArguments("--window-size=1920,1080");   // Явная установка размеров окна

        // Применение настроек для Selenide
        Configuration.browserCapabilities = options;

        // Логи и отчеты
        Configuration.reportsFolder = "build/reports/tests";
        Configuration.screenshots = true;                 // Сохранять скриншоты при ошибках
        Configuration.savePageSource = true;              // Сохранять HTML страницы
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
