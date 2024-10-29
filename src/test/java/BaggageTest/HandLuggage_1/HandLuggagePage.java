/*
 *Открытие вкладки ручная кладь
 */
package BaggageTest.HandLuggage_1;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class HandLuggagePage {
    //URL для перехода на вкладку Ручная Кладь
    private final static String URI_BAGGAGE = "https://www.uralairlines.ru/baggage_detail/hand-luggage/";

    //Элемент для Перелета из РФ
    private final SelenideElement RF = $x("//div[contains( text(),'Вылет из РФ')]");

    //Элемент для перелета из Таджикистан
    private final SelenideElement TADJIKISTAN = $x("//div[contains( text(),'Вылет из Таджикистана')]");

    //Элемент для перелета из Киргизии
    private final SelenideElement KIRGIZIYA = $x("//div[contains( text(),'Вылет из Киргизии')]");

    //Элемент для перелета из Турции
    private final SelenideElement TURCIYA = $x("//div[contains( text(),'Вылет из ОАЭ')]");

    //Элемент для перелета из Армении
    private final SelenideElement ARMENIA = $x("//div[contains( text(),'Вылет из Азербайджана')]");

    //Элемент для проверки текста после нажатия на элементов
    private final SelenideElement TEXT_RF = $x("/html/body/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div/ul[2]/li/div[2]/div/div/table/tbody/tr/td[1]");
    private final SelenideElement TEXT_TADJIKISTAN = $x("/html/body/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div/ul[3]/li/div[2]/div/div/table/tbody/tr/td[1]");
    private final SelenideElement TEXT_KIRGIZIYA = $x("/html/body/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div/ul[4]/li/div[2]/div/div/table/tbody/tr/td[1]");
    private final SelenideElement TEXT_TURCIYA = $x("/html/body/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div/ul[5]/li/div[2]/div/div/table/tbody/tr/td[1]");
    private final SelenideElement TEXT_ARMENIA = $x("/html/body/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div/ul[6]/li/div[2]/div/div/table/tbody/tr/td[1]");
    //Всплывающее окно при запуске странице
    public static final SelenideElement BUTTON = $x("/html/body/div[1]/div[2]/div[1]/div[1]/div/div/div/button");

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

