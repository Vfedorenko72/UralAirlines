package BaggageTest.ChildrenAndLuggage_3;

import BaggageTest.HandLuggage_1.HandLuggagePage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ChildrenAndLuggagePage {
    private final static String URI_CILDREN = "https://www.uralairlines.ru/baggage_detail/deti-i-bagazh/";
    private final SelenideElement TEXT_CILDEN = $x("/html/body/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div/div[1]/div");
    private final SelenideElement FLAG = $x("/html/body/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div/div[3]/div/div[2]/div[7]/div/a");
    private final SelenideElement TEXT_PAGE = $x("/html/body/div[1]/div[2]/div[1]/div[2]/div/div/h1");
    public void test3(){
        //Открытие энд поинта
        Selenide.open(URI_CILDREN);
        //Проверка по тексту
        TEXT_CILDEN.shouldHave(Condition.text("Дети и багаж"));
        //Прокрутка до элемента
        FLAG.scrollIntoView(true);
        //Нажатие на элемент
        FLAG.click();
        //Проверка по тексту
        TEXT_PAGE.shouldHave(Condition.text("Правила перевозки несопровождаемых детей"));




    }
}
