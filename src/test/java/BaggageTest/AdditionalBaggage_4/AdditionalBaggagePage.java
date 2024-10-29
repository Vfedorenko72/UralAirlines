package BaggageTest.AdditionalBaggage_4;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AdditionalBaggagePage {

    //URL
    private final static String URI_ADDITINAL = "https://www.uralairlines.ru/baggage_detail/sverkhnormativnyy-bagazh/";

    //Текст для проверки открыта ли страница
    private final SelenideElement TEXT_ADDITINAL = $x("//div[@class='uk-visible@l']//div[contains(text(),'Дополнительный багаж')]");

    //Открывающиеся элементы
    private final SelenideElement IS_RF = $x("//div[@class='uk-visible@l']//div[contains(text(),' Вылет из РФ,')]");
    private final SelenideElement V_RF = $x("//div[@class='uk-visible@l']//div[contains(text(),'Вылет из стран дальнего')]");
    private final SelenideElement IS_USBEKISTANA = $x("//div[@class='uk-visible@l']//div[contains(text(),'Вылет из Узбекистана,')]");
    private final SelenideElement IS_TADJIKISTANA = $x("//div[@class='uk-visible@l']//div[contains(text(),'Вылет из Таджикистана')]");
    private final SelenideElement IS_KIRGISIY = $x("//div[@class='uk-visible@l']//div[contains(text(),'Вылет из Киргизии,')]");

    //Элемент для проверки текста после нажатия на элементов общий блок элементов
    private final SelenideElement TEXT_IS_RF = $x("//div[@class='uk-visible@l']//div[contains(text(),'1500')]");
    private final SelenideElement TEXT_V_RF = $x("//div[@class='uk-visible@l']//div[contains(text(),'130$')]");
    private final SelenideElement TEXT_IS_USBEKISTANA = $x("//div[@class='uk-visible@l']//div[contains(text(),'45$')]");
    private final SelenideElement TEXT_IS_TADJIKISTANA = $x("//div[@class='uk-visible@l']//div[contains(text(),'15/170')]");
    private final SelenideElement TEXT_IS_KIRGISIY = $x("//div[@class='uk-visible@l']//div[contains(text(),'30/2900')]");

    public void test4() {
        //Открытие энд поинта
        Selenide.open(URI_ADDITINAL);



        //Проверка по тексту что страница открыта
        TEXT_ADDITINAL.shouldHave(Condition.text("Дополнительный багаж"));

        //Прокрутка до элемента, Нажатие на элемент и проверить текст
        IS_RF.scrollIntoView(true);
        IS_RF.click();
        TEXT_IS_RF.shouldHave(Condition.text("от 1500 ₽"));

        //Прокрутка до элемента, Нажатие на элемент и проверить текст
        V_RF.scrollIntoView(true);
        V_RF.click();
        TEXT_V_RF.shouldHave(Condition.text("130$"));

        //Прокрутка до элемента, Нажатие на элемент и проверить текст
        IS_USBEKISTANA.scrollIntoView(true);
        IS_USBEKISTANA.click();
        TEXT_IS_USBEKISTANA.shouldHave(Condition.text("45$"));

        //Прокрутка до элемента, Нажатие на элемент и проверить текст
        IS_TADJIKISTANA.scrollIntoView(true);
        IS_TADJIKISTANA.click();
        TEXT_IS_TADJIKISTANA.shouldHave(Condition.text("15/170"));

        //Прокрутка до элемента, Нажатие на элемент и проверить текст
        IS_KIRGISIY.scrollIntoView(true);
        IS_KIRGISIY.click();
        TEXT_IS_KIRGISIY.shouldHave(Condition.text("30/2900"));
    }
}
