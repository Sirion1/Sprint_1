package Tests;

import Pages.MainPage;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.*;

public class AreAnswersForFaqSectionCorrect {
    @Test
    public void isAnswerForQuestionOneCorrect() {
        System.setProperty("selenide.browser", "Chrome");
        MainPage mainPage = open("https://qa-scooter.praktikum-services.ru/", MainPage.class );
        mainPage.hideCookiDisclamer();
        mainPage.openQuestion(0);
        mainPage.isAnswerCorrect(0, "Сутки — 400 рублей. Оплата курьеру — наличными или картой.");
    }
    @Test
    public void isAnswerForQuestionTwoCorrect() {
        System.setProperty("selenide.browser", "Chrome");
        MainPage mainPage = open("https://qa-scooter.praktikum-services.ru/", MainPage.class );
        mainPage.hideCookiDisclamer();
        mainPage.openQuestion(1);
        mainPage.isAnswerCorrect(1, "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.");
    }
    @Test
    public void isAnswerForQuestionThreeCorrect() {
        System.setProperty("selenide.browser", "Chrome");
        MainPage mainPage = open("https://qa-scooter.praktikum-services.ru/", MainPage.class );
        mainPage.hideCookiDisclamer();
        mainPage.openQuestion(2);
        mainPage.isAnswerCorrect(2, "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.");
    }
    @Test
    public void isAnswerForQuestionFourCorrect() {
        System.setProperty("selenide.browser", "Chrome");
        MainPage mainPage = open("https://qa-scooter.praktikum-services.ru/", MainPage.class );
        mainPage.hideCookiDisclamer();
        mainPage.openQuestion(3);
        mainPage.isAnswerCorrect(3, "Только начиная с завтрашнего дня. Но скоро станем расторопнее.");
    }
    @Test
    public void isAnswerForQuestionFiveCorrect() {
        System.setProperty("selenide.browser", "Chrome");
        MainPage mainPage = open("https://qa-scooter.praktikum-services.ru/", MainPage.class );
        mainPage.hideCookiDisclamer();
        mainPage.openQuestion(4);
        mainPage.isAnswerCorrect(4, "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.");
    }
    @Test
    public void isAnswerForQuestionSixCorrect() {
        System.setProperty("selenide.browser", "Chrome");
        MainPage mainPage = open("https://qa-scooter.praktikum-services.ru/", MainPage.class );
        mainPage.hideCookiDisclamer();
        mainPage.openQuestion(5);
        mainPage.isAnswerCorrect(5, "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.");
    }
    @Test
    public void isAnswerForQuestionSevenCorrect() {
        System.setProperty("selenide.browser", "Chrome");
        MainPage mainPage = open("https://qa-scooter.praktikum-services.ru/", MainPage.class );
        mainPage.hideCookiDisclamer();
        mainPage.openQuestion(6);
        mainPage.isAnswerCorrect(6, "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.");
    }
    @Test
    public void isAnswerForQuestionEightCorrect() {
        System.setProperty("selenide.browser", "Chrome");
        MainPage mainPage = open("https://qa-scooter.praktikum-services.ru/", MainPage.class );
        mainPage.hideCookiDisclamer();
        mainPage.openQuestion(7);
        mainPage.isAnswerCorrect(7, "Да, обязательно. Всем самокатов! И Москве, и Московской области.");
    }

    }


