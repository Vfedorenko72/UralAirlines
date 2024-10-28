package OpenPage;

import BaggageTest.CheckedBaggage_2.CheckedBaggagePage;
import BaggageTest.HandLuggage_1.HandLuggagePage;
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

}
