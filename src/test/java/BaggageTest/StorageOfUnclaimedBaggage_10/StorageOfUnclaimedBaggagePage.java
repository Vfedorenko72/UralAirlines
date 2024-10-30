package BaggageTest.StorageOfUnclaimedBaggage_10;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class StorageOfUnclaimedBaggagePage {

    //URI
    private final static String URI_UNCLAIMED = "https://www.uralairlines.ru/baggage_detail/unclaimed-baggage/";

    //Текст для проверки что страница открылась
    private final SelenideElement TEXT_SEARCH = $x("//div[@class='uk-visible@l']//h2");

    public void test10(){
        //Открытие страници
        Selenide.open(URI_UNCLAIMED);
        //Проверка по тексту
        TEXT_SEARCH.shouldHave(Condition.text("Хранение невостребованного багажа"));
    }
}
