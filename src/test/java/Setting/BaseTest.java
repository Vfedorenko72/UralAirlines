package Setting;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
//import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;


abstract public class BaseTest {
    public static void setUp(){
        //Атоматическое скачивание и настройка браузера хром
        WebDriverManager.chromedriver().setup();
        //Выбор драйвера
        Configuration.browser = "chrome";
        //Разрешение экрана
        Configuration.browserSize = "1000x800";
        //Отображение экрана
        Configuration.headless = false;

    }

    @BeforeAll
    public static void init(){
        setUp();

    }

    @AfterAll
    public static void tearDown(){
        Selenide.closeWebDriver();
    }
}
