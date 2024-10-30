package OpenPage;

import BaggageTest.AdditionalBaggage_4.AdditionalBaggagePage;
import BaggageTest.AllRules_11.AllRulesPage;
import BaggageTest.BabyStrollers_7.BabyStrollersPage;
import BaggageTest.BaggageOnTourOperator_8.BaggageOnTourOperatorPage;
import BaggageTest.BaggageSearch_9.BaggageSearchPage;
import BaggageTest.CheckedBaggage_2.CheckedBaggagePage;
import BaggageTest.ChildrenAndLuggage_3.ChildrenAndLuggagePage;
import BaggageTest.HandLuggage_1.HandLuggagePage;
import BaggageTest.SpecialBaggage_6.SpecialBaggagePage;
import BaggageTest.SportsEquipment_5.SpoatsEquimentPage;
import BaggageTest.StorageOfUnclaimedBaggage_10.StorageOfUnclaimedBaggagePage;
import Setting.BaseTest;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MainTest extends BaseTest {
    @Test
    @Feature("Тест на проверку окна Ручная кладь")
    public void testOpenHandLuggage(){
        HandLuggagePage handLuggagePage = new HandLuggagePage();
        handLuggagePage.test1();
    }
    @Test
    @Feature("Тест на проверку работы Регестрируемый багаж")
    public void testCheckedBaggage(){
        CheckedBaggagePage checkedBaggagePage = new CheckedBaggagePage();
        checkedBaggagePage.test2();
    }
    @Test
    @Feature("Тест на проверку работы Дети и багаж")
    public void testCildrenAndLuggage(){
        ChildrenAndLuggagePage childrenAndLuggagePage = new ChildrenAndLuggagePage();
        childrenAndLuggagePage.test3();
    }
    @Test
    @Feature("Тест на проверку вкладки Дополнительный багаж")
    public void testAdditionalBaggage(){
        AdditionalBaggagePage additionalBaggagePage = new AdditionalBaggagePage();
        additionalBaggagePage.test4();
    }

    @Test
    @Feature("Тест на проверку вкладки Спортивный инвентарь")
    public void testSportsEquiment(){
        SpoatsEquimentPage spoatsEquimentPage = new SpoatsEquimentPage();
        spoatsEquimentPage.test5();
    }

    @Test
    @Order(1)
    @Feature("Тест на проверку вкладки Особый багаж")
    public void testSpecialBaggage(){
        SpecialBaggagePage specialBaggagePage = new SpecialBaggagePage();
        specialBaggagePage.test6();
    }

    @Test
    @Order(1)
    @Feature("Тест на проверку вкладки Детская коляска")
    public void testBabyStrollers(){
        BabyStrollersPage babyStrollersPage = new BabyStrollersPage();
        babyStrollersPage.test7();
    }

    @Test
    @Feature("Тест на проверку вкладки Багаж на рейсах туроператоров")
    public void testBaggageOnTourOperator(){
        BaggageOnTourOperatorPage baggageOnTourOperatorPage = new BaggageOnTourOperatorPage();
        baggageOnTourOperatorPage.test8();
    }

    @Test
    @Feature("Тест на проверку вкладки Розыск багажа")
    public void testBaggageSearch(){
        BaggageSearchPage baggageSearchPage = new BaggageSearchPage();
        baggageSearchPage.test9();
    }

    @Test
    @Feature("Тест на проверку вкладки Хранение невостребованного багажа")
    public void testStorageOfUnclaimedBaggage(){
        StorageOfUnclaimedBaggagePage storageOfUnclaimedBaggagePage = new StorageOfUnclaimedBaggagePage();
        storageOfUnclaimedBaggagePage.test10();
    }

    @Test
    @Feature("Тест на проверку вкладки Все правила")
    public void testAllRules(){
        AllRulesPage allRulesPage = new AllRulesPage();
        allRulesPage.test11();
    }

}
