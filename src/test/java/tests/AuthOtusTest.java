package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.Test;
import pages.MainPage;

public class AuthOtusTest extends BaseTest{

    @Step("Открытие отуса")
    @Description("Открывает отус")
    @Test
    public void openOtus () {
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        screenshot();
    }


}
