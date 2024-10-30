package BaggageTest.BaggageOnTourOperator_8;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class BaggageOnTourOperatorPage {
    //URI
    private final static String URI_OPERATOR = "https://www.uralairlines.ru/baggage_detail/bagagge-tour-operator/";

    //Текст для проверки что страница открылась
    private final SelenideElement TEXT_OPERATOR = $x("//div[@class='uk-visible@l']//span");



    public void test8(){
        //Открытие страници
        Selenide.open(URI_OPERATOR);
        //Проверка по тексту
        TEXT_OPERATOR.shouldHave(Condition.text("Fun & Sun Travel"));
    }
}
