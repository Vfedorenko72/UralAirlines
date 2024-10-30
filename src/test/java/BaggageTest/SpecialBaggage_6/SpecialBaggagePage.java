package BaggageTest.SpecialBaggage_6;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SpecialBaggagePage {
    //URL
    private final static String URI_SPECIAL = "https://www.uralairlines.ru/baggage_detail/osobyy-bagazh/";

    //Элементы страници
    private final SelenideElement RASTENIY = $x("//div[@class='uk-visible@l']//div[@class='sub-link-container']//a[contains(text(),'Расте')]");
    private final SelenideElement MUSIK = $x("//div[@class='uk-visible@l']//div[@class='sub-link-container']//a[contains(text(),'Музы')]");
    private final SelenideElement ORUZHIE = $x("//div[@class='uk-visible@l']//div[@class='sub-link-container']//a[contains(text(),'Оружие')]");
    private final SelenideElement KULTURA = $x("//div[@class='uk-visible@l']//div[@class='sub-link-container']//a[contains(text(),'Культурные')]");
    private final SelenideElement KOLL = $x("//div[@class='uk-visible@l']//div[@class='sub-link-container']//a[contains(text(),'Колющие')]");

    //Текст для проверки элментов страниуи
    private final SelenideElement TEXT_RASTENIY = $x("//div[@class='uk-visible@l']//span");
    private final SelenideElement TEXT_MUSIK = $x("//div[@class='uk-visible@l']//div[@class='image-title']");
    private final SelenideElement TEXT_ORUZHIE = $x("//div[@class='uk-visible@l']//div[@class='image-title']");
    private final SelenideElement TEXT_KULTURA = $x("//div[@class='uk-visible@l']//span");
    private final SelenideElement TEXT_KOLL = $x("//div[@class='uk-visible@l']//div[@class='image-title']");

    //Элементы во вкладки Культурные ценности
    private final SelenideElement KULTURA_REGISTR = $x("//div[@class='uk-visible@l']//div[contains(text(),'Что можно')]");
    private final SelenideElement KULTURA_VVOZ = $x("//div[@class='uk-visible@l']//div[contains(text(),'Правила ввоза')]");
    private final SelenideElement KULTURA_VIVOZ = $x("//div[@class='uk-visible@l']//div[contains(text(),'Правила вывоза')]");

    //Текст для проверки элементов культурные ценности
    private final SelenideElement TEXT_KULTURA_REGISTR = $x("//div[@class='uk-visible@l']//li[contains(text(),'Архивы')]");
    private final SelenideElement TEXT_KULTURA_VVOZ = $x("//div[@class='uk-visible@l']//p[contains(text(),'Часть')]");
    private final SelenideElement TEXT_KULTURA_VIVOZ = $x("//div[@class='uk-visible@l']//p[contains(text(),'В соответствии с действующим')]");



    public void test6() {
        //Открыть URL
        Selenide.open(URI_SPECIAL);
        //Открыть и проверить по тексту во вкладке Растения
        RASTENIY.click();//
        TEXT_RASTENIY.shouldHave(Condition.text("Растения"));

        //Открыть и проверить по тексту во вкладке Музыкальные инструменты
        MUSIK.click();
        TEXT_MUSIK.shouldHave(Condition.text("Музыкальные инструменты"));

        //Открыть и проверить по тексту во вкладке Оружие
        ORUZHIE.click();
        TEXT_ORUZHIE.shouldHave(Condition.text("Оружие"));

        //Открыть и проверить по тексту во вкладке Культурные ценности, а также проверка вкладок внутри
        KULTURA.click();
        TEXT_KULTURA.shouldHave(Condition.text("Культурные ценности"));
        KULTURA_REGISTR.click();// Открытие вкладки Что можно зарегистрировать как культурная ценность
        TEXT_KULTURA_REGISTR.scrollIntoView(true).shouldHave(Condition.text("Архивы"));//Проверка по тексту
        KULTURA_VVOZ.click();//Открытие вкладки Правила ввоза
        TEXT_KULTURA_VVOZ.shouldHave(Condition.text("часть"));//Проверка по тексту
        KULTURA_VIVOZ.scrollIntoView(true).click();//Скрол до вкладки Правила вывоза и клик по ней
        TEXT_KULTURA_VIVOZ.shouldHave(Condition.text("В соответствии с действующим"));//Проверка по тексту

        //Открыть и проверить по тексту во вкладке Колющие и режущие предметы
        KOLL.click();
        TEXT_KOLL.shouldHave(Condition.text("Холодное "));
    }
}
