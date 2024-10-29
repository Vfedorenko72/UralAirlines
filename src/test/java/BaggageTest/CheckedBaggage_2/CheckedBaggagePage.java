package BaggageTest.CheckedBaggage_2;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CheckedBaggagePage {
    //URL
    private final static String URI_CHECKED = "https://www.uralairlines.ru/baggage_detail/reg-baggage/";

    //Элемент для проверки по тексту что страница открылась
    private final SelenideElement TEXT = $x("//div[@class='uk-visible@l']//h1");

    public void test2() {
        Selenide.open(URI_CHECKED);
        TEXT.shouldHave(Condition.text("Регистрируемый багаж"));
    }
}
