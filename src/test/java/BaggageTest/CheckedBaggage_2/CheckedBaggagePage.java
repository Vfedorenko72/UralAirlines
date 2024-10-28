package BaggageTest.CheckedBaggage_2;

import BaggageTest.HandLuggage_1.HandLuggagePage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CheckedBaggagePage {
    //URL
    private final static String URI_CHECKED = "https://www.uralairlines.ru/baggage_detail/reg-baggage/";
    private final SelenideElement TEXT = $x("/html/body/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div/p[1]");
    public void test2(){
        Selenide.open(URI_CHECKED);
        HandLuggagePage.BUTTON.click();
        TEXT.shouldHave(Condition.text("Норма бесплатного провоза багажа зависит от выбранного тарифа."));
    }
}
