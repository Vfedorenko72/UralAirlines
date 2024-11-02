package RulesTest.ContractOfCarriage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ContractOfCarriagePage {
    //URI
    private final static String URI_CONTRACT = "https://www.uralairlines.ru/rules/dogovor-perevozki/";

    //Текст для проверки наличия элемента
    private final SelenideElement TEXT_CONTRACT = $x("//h1[@class='uk-visible@m']");

    public void test12(){
        //Переход на страницу
        Selenide.open(URI_CONTRACT);
        //Проверка по тексту
        TEXT_CONTRACT.shouldHave(Condition.text("Договор перевозки"));
    }
}
