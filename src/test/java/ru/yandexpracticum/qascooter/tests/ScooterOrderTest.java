package Tests;

import Pages.MainPage;
import Pages.OrderPage;
import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.open;

public class ScooterOrderTest {
    @Test
    public void orderTest(){
        System.setProperty("selenide.browser", "Chrome");
        MainPage mainPage = open("https://qa-scooter.praktikum-services.ru/", MainPage.class );

        mainPage.hideCookiDisclamer();
        mainPage.headerOrderButtonClick();
        OrderPage orderPage = new OrderPage();
        orderPage.setClient("Иван", "Петров", "+79123456789");
        orderPage.setAddress("Москва, улица Ленина, д. 1", "Комсомольская");
        orderPage.nextButtonClick();


    }
}
