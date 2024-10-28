/*
 *Открытие вкладки ручная кладь
 */
package BaggageTest.HandLuggage_1;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static org.openqa.selenium.Keys.PAGE_DOWN;

public class HandLuggagePage {

    //URL для перехода на вкладку Ручная Кладь
    private final static String URI_BAGGAGE = "https://www.uralairlines.ru/baggage_detail/hand-luggage/";

    //Элемент для Перелета из РФ
    private final SelenideElement RF = $x("/html/body/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/ul[2]/li/div[1]");

    //Элемент для перелета из Таджикистан
    private final SelenideElement TADJIKISTAN = $x("//div[contains(text(), 'Вылет из Таджикистана')]//ancestor::div[@class='uk-visible@l']");

    //Элемент для перелета из Киргизии
    private final SelenideElement KIRGIZIYA = $x("//div[contains(text(), 'Вылет из Киргизии')]//ancestor::div[@class='uk-visible@l']");

    //Элемент для перелета из Турции
    private final SelenideElement TURCIYA = $x("//div[contains(text(), 'Вылет из ОАЭ')]//ancestor::div[@class='uk-visible@l']");

    //Элемент для перелета из Армении
    private final SelenideElement ARMENIA = $x("//div[contains(text(), 'Вылет из Азербайджана')]//ancestor::div[@class='uk-visible@l']");

    //Элемент для проверки текста после нажатия на элемент RF
    private final SelenideElement TEXT_RF = $x("/html/body/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/ul[2]/li/div[2]/div/div/table/tbody/tr/td[1]");

    private final SelenideElement TEXT = $x("/html/body/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div[1]/button");
    //Всплывающий элемент
    private final SelenideElement POLE = $x("");
    public void test1() {
        Selenide.open(URI_BAGGAGE);
        TEXT.sendKeys(PAGE_DOWN);
        RF.click();
        TEXT_RF.shouldHave(Condition.text("Ручная кладь вес и/или габариты которой превышают установленные размеры (вес более 10кг, габариты более 55х40х20см ), выявленная при выходе на посадку"));
    }
}
