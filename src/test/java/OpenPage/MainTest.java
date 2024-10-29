package OpenPage;

import BaggageTest.AdditionalBaggage_4.AdditionalBaggagePage;
import BaggageTest.CheckedBaggage_2.CheckedBaggagePage;
import BaggageTest.ChildrenAndLuggage_3.ChildrenAndLuggagePage;
import BaggageTest.HandLuggage_1.HandLuggagePage;
import BaggageTest.SportsEquipment_5.SpoatsEquimentPage;
import Setting.BaseTest;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;

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

}
