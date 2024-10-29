package BaggageTest.ChildrenAndLuggage_3;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ChildrenAndLuggagePage {
    //URL
    private final static String URI_CILDREN = "https://www.uralairlines.ru/baggage_detail/deti-i-bagazh/";

    //Элемент для проверки что страница открылась
    private final SelenideElement TEXT_CILDEN = $x("//div[@class='uk-visible@l']//div[contains(text(),'В соответствии с законодательством')]");

    //Гипер ссылка для перехода на страницу Несопровождаемый ребенок
    private final SelenideElement FLAG = $x("//div[@class='uk-visible@l']//a[contains(text(),'Несопровождаемый ребенок')]");

    //Элемент для проверки перехода на странице Несопровождаемый ребенок
    private final SelenideElement TEXT_PAGE = $x("//h1[@class='uk-visible@m']");

    public void test3(){
        //Открытие энд поинта
        Selenide.open(URI_CILDREN);
        //Проверка по тексту
        TEXT_CILDEN.shouldHave(Condition.text("В соответствии с законодательством"));
        //Прокрутка до элемента
        FLAG.scrollIntoView(true);
        //Нажатие на элемент
        FLAG.click();
        //Проверка по тексту
        TEXT_PAGE.shouldHave(Condition.text("Правила перевозки несопровождаемых детей"));




    }
}
