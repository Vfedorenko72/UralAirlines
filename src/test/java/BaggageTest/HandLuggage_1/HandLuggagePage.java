
package BaggageTest.HandLuggage_1;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class HandLuggagePage {
    //URL для перехода на вкладку Ручная Кладь
    private final static String URI_BAGGAGE = "https://www.uralairlines.ru/baggage_detail/hand-luggage/";

    //Открывающиеся элементы
    private final SelenideElement RF = $x("//div[@class='uk-visible@l'] //div[contains(text(), 'Вылет из РФ, в рублях (RUB)')]");
    private final SelenideElement TADJIKISTAN = $x("//div[@class='uk-visible@l'] //div[contains( text(),'Вылет из Таджикистана')]");
    private final SelenideElement KIRGIZIYA = $x("//div[@class='uk-visible@l'] //div[contains( text(),'Вылет из Киргизии')]");
    private final SelenideElement TURCIYA = $x("//div[@class='uk-visible@l'] //div[contains( text(),'Вылет из ОАЭ')]");
    private final SelenideElement ARMENIA = $x("//div[@class='uk-visible@l'] //div[contains( text(),'Вылет из Азербайджана')]");

    //Элемент для проверки текста после нажатия на элементов общий блок элементов
    private final SelenideElement TEXT_RF = $x("//div[@class='uk-visible@l'] //td[contains(text(), 'Ручная кладь')]");
    private final SelenideElement TEXT_TADJIKISTAN = $x("//div[@class='uk-visible@l'] //td[contains(text(), 'Ручная кладь')]");
    private final SelenideElement TEXT_KIRGIZIYA = $x("//div[@class='uk-visible@l'] //td[contains(text(), 'Ручная кладь')]");
    private final SelenideElement TEXT_TURCIYA = $x("//div[@class='uk-visible@l'] //td[contains(text(), 'Ручная кладь')]");
    private final SelenideElement TEXT_ARMENIA = $x("//div[@class='uk-visible@l'] //td[contains(text(), 'Ручная кладь')]");

    public void test1() {
        //Открытие страници
        Selenide.open(URI_BAGGAGE);
        //Прокрутка сайта до элемента
        RF.scrollIntoView(true);
        //Нажатие и проверка элемента
        RF.click();
        TEXT_RF.shouldHave(Condition.text("Ручная кладь вес и/или "));
        //Нажатие и проверка элемента
        TADJIKISTAN.click();
        TEXT_TADJIKISTAN.shouldHave(Condition.text("Ручная кладь вес и/или "));
        //Нажатие и проверка элемента
        KIRGIZIYA.click();
        TEXT_KIRGIZIYA.shouldHave(Condition.text("Ручная кладь вес и/или "));
        //Нажатие и проверка элемента
        TURCIYA.click();
        TEXT_TURCIYA.shouldHave(Condition.text("Ручная кладь вес и/или "));
        //Нажатие и проверка элемента
        ARMENIA.click();
        TEXT_ARMENIA.shouldHave(Condition.text("Ручная кладь вес и/или "));
    }
}

