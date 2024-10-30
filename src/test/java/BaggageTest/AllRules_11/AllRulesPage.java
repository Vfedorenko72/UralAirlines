package BaggageTest.AllRules_11;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AllRulesPage {
    //URI
    private final static String URI_ALL = "https://www.uralairlines.ru/baggage_detail/all_rules/";

    //Текст для проверки что страница открылась
    private final SelenideElement TEXT_ALL = $x("//div[@class='uk-visible@l']//div[contains(text(),'Все правила')]");

    //Кнопка для перехода ко всем правилам
    private final SelenideElement VSE_PRAVILA = $x("//div[@class='uk-visible@l']//a[@class='uk-button uk-button-primary']");

    private final SelenideElement TEXT_VSE_PRAVILA = $x("//h1[@class='uk-visible@m']");

    public void test11(){
        //Открытие страници
        Selenide.open(URI_ALL);
        //Проверка по тексту
        TEXT_ALL.shouldHave(Condition.text("Все правила"));
        //Скрол и клик на элемент
        VSE_PRAVILA.scrollIntoView(true).click();
        //Проверка по тексту
        TEXT_VSE_PRAVILA.shouldHave(Condition.text("Багаж"));
    }
}