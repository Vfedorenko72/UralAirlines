package BaggageTest.BaggageSearch_9;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class BaggageSearchPage {

    //URI
    private final static String URI_SEARCH = "https://www.uralairlines.ru/baggage_detail/rozysk/";

    //Текст для проверки что страница открылась
    private final SelenideElement TEXT_SEARCH = $x("//div[@class='uk-visible@l']//div[@class='title']");

    public void test9(){
        //Открытие страници
        Selenide.open(URI_SEARCH);
        //Проверка по тексту
        TEXT_SEARCH.shouldHave(Condition.text("Розыск багажа"));
    }
}
