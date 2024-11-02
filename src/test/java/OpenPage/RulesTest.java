package OpenPage;

import RulesTest.AirTicket.AirTicketPage;
import RulesTest.ContractOfCarriage.ContractOfCarriagePage;
import RulesTest.RulesAdditionalServices.RulesAdditionalServicesPage;
import Setting.BaseTest;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.*;


public class RulesTest extends BaseTest {
    @Test
    @Feature("Тест на проверку окна Договор перевозки")
    public void testAirRules() {
        AirTicketPage airTicketPage = new AirTicketPage();
        airTicketPage.test14();
    }

    @Test
    @Feature("Тест на проверку работы Правила возврата авиабилетов")
    public void testContractOfCarriage() {
        ContractOfCarriagePage contractOfCarriagePage = new ContractOfCarriagePage();
        contractOfCarriagePage.test12();
    }

    @Test
    @Feature("Тест на проверку работы Правила отказа от дополнительных услуг")
    public void testRulesAdditionalServices() {
        RulesAdditionalServicesPage rulesAdditionalServicesPage = new RulesAdditionalServicesPage();
        rulesAdditionalServicesPage.test13();
    }
}

