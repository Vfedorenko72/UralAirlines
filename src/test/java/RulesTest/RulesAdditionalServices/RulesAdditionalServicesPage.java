package RulesTest.RulesAdditionalServices;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class RulesAdditionalServicesPage {
    //URI
    private final static String URI_SERVICES = "https://www.uralairlines.ru/rules/pravila-otkaza-ot-dopolnitelnykh-uslug/";

    //Текст для проверки наличия элемента
    private final SelenideElement TEXT_SERVICES = $x("//h1[@class='uk-visible@m']");

    public void test13(){
        //Переход на страницу
        Selenide.open(URI_SERVICES);
        //Проверка по тексту
        TEXT_SERVICES.shouldHave(Condition.text("Правила отказа от дополнительных услуг"));
    }
}


