package RulesTest.AirTicket;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static BaggageTest.BabyStrollers_7.BabyStrollersPage.BUTTON;
import static com.codeborne.selenide.Selenide.$x;

public class AirTicketPage {
    private final static String URI_VOZVRAT = "https://www.uralairlines.ru/rules/pravila-vozvrata-aviabileta/";
    // Основные шторки
    private final SelenideElement REFUND_TICKET = $x("(//div[contains(text(), 'Возврат авиабилета')])[1]");
    private final SelenideElement REFUND_SERVICES = $x("(//div[contains(text(), 'Возврат дополнительных услуг')])[1]");

    // Шторки внутри "Возврат авиабилета"
    private final SelenideElement VOLUNTARY_TICKET = $x("(//div[contains(text(), 'Добровольный возврат')])[1]");
    private final SelenideElement FORCED_TICKET = $x("(//div[contains(text(), 'Вынужденный')])[1]");

    // Вложенные шторки для "Добровольный возврат" в разделе "Возврат авиабилета"
    private final SelenideElement VOLUNTARY_TICKET_APP = $x("(//div[contains(text(), 'в мобильном приложении')])[1]");
    private final SelenideElement VOLUNTARY_TICKET_AGENCY = $x("(//div[contains(text(), 'в кассах агентств')])[1]");

    // Вложенные шторки для "Вынужденный возврат" в разделе "Возврат авиабилета"
    private final SelenideElement FORCED_TICKET_APP = $x("(//div[contains(text(), 'в мобильном приложении')])[2]");
    private final SelenideElement FORCED_TICKET_AGENCY = $x("(//div[contains(text(), 'в кассах агентств')])[2]");

    // Шторки внутри "Возврат дополнительных услуг"
    private final SelenideElement VOLUNTARY_SERVICES = $x("(//div[contains(text(), 'Добровольный возврат')])[2]");
    private final SelenideElement FORCED_SERVICES = $x("(//div[contains(text(), 'Вынужденный')])[2]");

    // Вложенные шторки для "Добровольный возврат" в разделе "Возврат дополнительных услуг"
    private final SelenideElement VOLUNTARY_SERVICES_APP = $x("(//div[contains(text(), 'в мобильном приложении')])[3]");
    private final SelenideElement VOLUNTARY_SERVICES_AGENCY = $x("(//div[contains(text(), 'в кассах агентств')])[3]");

    // Вложенные шторки для "Вынужденный возврат" в разделе "Возврат дополнительных услуг"
    private final SelenideElement FORCED_SERVICES_APP = $x("(//div[contains(text(), 'в мобильном приложении')])[4]");
    private final SelenideElement FORCED_SERVICES_AGENCY = $x("(//div[contains(text(), 'в кассах агентств')])[4]");

    public void test14() {
        Selenide.open(URI_VOZVRAT);
        REFUND_TICKET.scrollIntoView(true).shouldBe(Condition.visible).click();
        VOLUNTARY_TICKET.scrollIntoView(true).shouldBe(Condition.visible).click();
        VOLUNTARY_TICKET_APP.scrollIntoView(true).shouldBe(Condition.visible).click();
        VOLUNTARY_TICKET_AGENCY.scrollIntoView(true).shouldBe(Condition.visible).click();

        FORCED_TICKET.scrollIntoView(true).shouldBe(Condition.visible).click();
        FORCED_TICKET_APP.scrollIntoView(true).shouldBe(Condition.visible).click();
        FORCED_TICKET_AGENCY.scrollIntoView(true).shouldBe(Condition.visible).click();

        REFUND_SERVICES.scrollIntoView(true).shouldBe(Condition.visible).click();
        VOLUNTARY_SERVICES.scrollIntoView(true).shouldBe(Condition.visible).click();
        VOLUNTARY_SERVICES_APP.scrollIntoView(true).shouldBe(Condition.visible).click();
        VOLUNTARY_SERVICES_AGENCY.scrollIntoView(true).shouldBe(Condition.visible).click();

        FORCED_SERVICES.scrollIntoView(true).shouldBe(Condition.visible).click();
        FORCED_SERVICES_APP.scrollIntoView(true).shouldBe(Condition.visible).click();
        FORCED_SERVICES_AGENCY.scrollIntoView(true).shouldBe(Condition.visible).click();
    }
}
