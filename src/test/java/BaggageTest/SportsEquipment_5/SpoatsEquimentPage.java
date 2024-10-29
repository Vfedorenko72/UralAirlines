package BaggageTest.SportsEquipment_5;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SpoatsEquimentPage {
    //URL
    private final static String URI_SPORTS = "https://www.uralairlines.ru/baggage_detail/sportivnyy-inventar/";

    //Элемент для проверки по тексту что страница открылась
    private final SelenideElement TEXT = $x("//div[@class='uk-visible@l']//div[contains(text(),'Спортивный инвентарь')]");

    //Элемент для закрыти всплывающего окна
    public static final SelenideElement BUTTON = $x("//div[@class='uk-modal-dialog uan-modal__dialog uk-margin-auto-vertical']//button");

    public void test5() {
        //Открытие энд поинта
        Selenide.open(URI_SPORTS);

        //Закрытие всплывающего окна
        BUTTON.click();

        //Проверка по тексту что страница открыта
        TEXT.shouldHave(Condition.text("Спортивный инвентарь"));
    }
}
