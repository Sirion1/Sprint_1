package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ElementsCollection;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class MainPage {

    @FindBy(how = How.ID, using = "rcc-confirm-button")
    public SelenideElement cookieDisclamerButton; // Клавиша согласия на использование куки-файлов
    public void hideCookiDisclamer() // Закрыть куки дисклеймер
    {if (cookieDisclamerButton.isDisplayed()){cookieDisclamerButton.click();}}
    //Элементы хедера- начало
    @FindBy(how = How.CLASS_NAME, using = "Header_Logo__23yGT")
    public SelenideElement logo; // Логотип Яндекс.Самокат
    @FindBy(how= How.CLASS_NAME, using = "Header_LogoYandex__3TSOI")
    public SelenideElement yandexLogoButton; // Ссылка на сайт Яндекс в логотипе
    @FindBy(how= How.XPATH, using = "//a[@class='Header_LogoYandex__3TSOI']/img[@alt='Yandex']")
    public SelenideElement yandexButtonImage; //Картинка Яндекс в хедере
    @FindBy(how= How.CLASS_NAME, using = "Header_LogoScooter__3lsAR")
    public SelenideElement scooterButton; // Ссылка на сайт Яндкс.Самокат в логотипе
    @FindBy(how= How.XPATH, using = "//a[@class='Header_LogoScooter__3lsAR']/img[@alt='Scooter']")
    public SelenideElement scooterButtonImage; // Картинка Самокат в хедере
    @FindBy(how= How.CLASS_NAME, using = "Header_Disclaimer__3VEni")
    public SelenideElement disclamer; //дисклеймер
    @FindBy(how= How.CLASS_NAME, using = "Header_Nav__AGCXC")
    public SelenideElement orderAndCheckOrderButtonsArea; // Область клавиш заказа и проверки заказа
    @FindBy(how= How.XPATH, using = "//button[@class='Button_Button__ra12g']")
    public SelenideElement orderButton; // Клавиша "Заказать"
    public void headerOrderButtonClick(){
        orderButton.shouldBe(Condition.visible);
        orderButton.click();} // Нажать "Заказать"
    @FindBy(how= How.CLASS_NAME, using = "Header_Link__1TAG7")
    public SelenideElement checkOrderButton; // Клавиша "Статус заказа"
    @FindBy(how= How.CLASS_NAME, using = "Header_SearchInput__3YRIQ")
    public SelenideElement checkOrderArea; // Область формы и клавиши поиска заказа
    @FindBy(how= How.CLASS_NAME, using = "Input_InputContainer__3NykH")
    public SelenideElement checkOrderSearchForm; // Форма поиска заказа
    @FindBy(how= How.XPATH, using = "//button[@class='Button_Button__ra12g Header_Button__28dPO']")
    public SelenideElement checkOrderSearchButton; // Клавиша поиска заказа

    // Элементы хедера- конец
    // Элементы первого экрана- начало
    @FindBy(how= How.CLASS_NAME, using = "Home_FirstPart__3g6vG")
    public SelenideElement mainScreenBasic; // Версия первого экрана с самокатом до скролла
    @FindBy(how= How.CLASS_NAME, using = "Home_SecondPart__T0Okx")
    public SelenideElement mainScreenScrolled; // Версия первого экрана с самокатом после скролла

    @FindBy(how= How.CLASS_NAME, using = "Home_BluePrint__TGX2n")
    public SelenideElement scooterImageBackgroundBasic; // Фон картинки с самокатом до скролла
    @FindBy(how= How.XPATH, using = "//div[@class='Home_BluePrint__TGX2n']/img[@alt='Scooter blueprint']")
    public SelenideElement scooterImageBasic; // Картинка с самокатом до скролла
    @FindBy(how= How.CLASS_NAME, using = "Home_Scooter__3YdJy")
    public SelenideElement scooterImageBackgroundScrolled; // Фон картинки с самокатом после скролла
    @FindBy(how= How.XPATH, using = "//div[@class='Home_Scooter__3YdJy']/img[@alt='Scooter blueprint']")
    public SelenideElement scooterImageScrolled; // Картинка с самокатом после скролла

    @FindBy(how= How.XPATH, using = "//div[@class='Home_ArrowDown__fnDme Home_Animated__17o7s Home_Bounce__O19_v']")
    public SelenideElement animatedArrowArea; // Область анимированной стрелки "вниз"
    @FindBy(how= How.XPATH, using = "//img[@alt='Scroll down']")
    public SelenideElement animatedArrowImage; // Изображение анимированной стрелки "вниз"

    @FindBy(how= How.CLASS_NAME, using = "Home_Header__iJKdX")
    public SelenideElement taglineHeaderYandexScooterArea; // Область слогана "Самокат на пару дней" и подписи к слогану
    @FindBy(how= How.XPATH, using = "//div[@class='Home_Header__iJKdX']/div[@class='Home_SubHeader__zwi_E'][1]")
    public SelenideElement taglineSubHeaderYandexScooterAreaBasic; // Область подписи под слоганом "Самокат на пару дней" до скролла
    @FindBy(how= How.XPATH, using = "//div[@class='Home_Header__iJKdX']/div[@class='Home_SubHeader__zwi_E'][2]")
    public SelenideElement taglineSubHeaderYandexScooterAreaScrolled; // Область подписи под слоганом "Самокат на пару дней" после скролла

    @FindBy(how= How.CLASS_NAME, using = "Home_Table__2kPxP")
    public SelenideElement specificationTableArea; // Область таблицы характеристик самоката
    @FindBy(how= How.CLASS_NAME, using = "Home_Separator__3cWAk")
    public ElementsCollection specificarionTableSeparators; // Сепараторы таблицы характеристик, "0"- верхний, "1"- нижний
    @FindBy(how= How.XPATH, using = "//div[@class='Home_Table__2kPxP']/div[contains(@class, 'Home_Row__jdQW2')]")
    public ElementsCollection specificationTableRowAreas; // Области строк таблицы характеристик самоката, "0"- область строки заголовка таблицы
    @FindBy(how= How.XPATH, using = "//div[@class='Home_Table__2kPxP']/div[contains(@class, 'Home_Row__jdQW2')]")
    public ElementsCollection specificationTableRows; // Строки таблицы характеристик самоката, "0"- заголовок таблицы
    @FindBy(how= How.XPATH, using = "//div[@class='Home_Column__xlKDK']")
    public ElementsCollection specificationTableElements; // Элементы таблицы характеристик самоката, "0"- заголовок таблицы, нечетный- содержание характеристики, нечетный+1- значение соответствующей характеристики
    // Элементы первого экрана- конец
    // Элементы второго экрана- начало
    @FindBy(how= How.CLASS_NAME, using = "Home_ThirdPart__LSTEE")
    public SelenideElement howItWorksScreenArea; // Область экрана "Как это работает"
    @FindBy(how= How.CLASS_NAME, using = "Home_SubHeader__zwi_E")
    public SelenideElement howItWorksScreenTagline; // Заголовок экрана "Как это работает"
    @FindBy(how= How.CLASS_NAME, using = "Home_RoadMap__2tal_")
    public SelenideElement howItWorksScreenNoTaglineArea; // Область экрана "Как это работает", без заголовка
    // Нумерация элементов в коллекциях начинается с "0", т.е., элемент коллекции под номером 0 соответствует первому элементуалгаритма, под номером "3"- четвертому
    @FindBy(how= How.CLASS_NAME, using = "Home_StatusBrick__1PsW9")
    public ElementsCollection howItWorksScreenPointsAreas; // Области элементов алгоритма работы с сервисом
    @FindBy(how= How.CLASS_NAME, using = "Home_StatusCircle__3_aTp")
    public ElementsCollection howItWorksScreenPointsNumeration; // Нумерация элементов алгоритма работы с сервисом
    @FindBy(how= How.CLASS_NAME, using = "Home_StatusInfo__HrjoZ")
    public ElementsCollection howItWorksScreenPointsTestAreas; // Области текста элементов алгоритма работы с сервисом
    @FindBy(how= How.CLASS_NAME, using = "Home_Status__YkfmH")
    public ElementsCollection howItWorksScreenPointsFirstStrings; // Первые строки элементов алгоритма работы с сервисом
    @FindBy(how= How.CLASS_NAME, using = "Home_StatusDescription__3WGl5")
    public ElementsCollection howItWorksScreenPointsSecondStrings; // Вторые строки элементов алгоритма работы с сервисом

    @FindBy(how= How.CLASS_NAME, using = "Home_FinishButton__1_cWm")
    public SelenideElement howItWorksScreenOrderButtonArea; // Область клавиши "Заказать"
    @FindBy(how= How.CLASS_NAME, using = "Button_Button__ra12g Button_UltraBig__UU3Lp")
    public SelenideElement howItWorksScreenOrderButton; // Клавиша "Заказать"
    // Элементы второго экрана- конец
    // Элементы третьего экрана- начало
    @FindBy(how= How.CLASS_NAME, using = "Home_FourPart__1uthg")
    public SelenideElement faqScreenArea; // Область экрана "Вопросы о важном"
    @FindBy(how= How.XPATH, using = "//div[@class='Home_FourPart__1uthg']/div[@class='Home_SubHeader__zwi_E']")
    public SelenideElement faqScreenTaglineArea; // Область заголовка экрана "Вопросы о важном"
    @FindBy(how= How.CLASS_NAME, using = "Home_FAQ__3uVm4")
    public SelenideElement faqScreenQuestionsArea; // Область вопросов экрана "Вопросы о важном"
    //Нумерация заголовков(клавиш) аккордеона совпадает с нумерацией выпадающего текста и начинается с "0"
    @FindBy(how= How.XPATH, using = ".//div[@data-accordion-component='AccordionItemButton']")
    public ElementsCollection faqScreenQuestionAccordionButtons; // Клавиши раскрытия "аккордеона"
    public void openQuestion(int questionNumber)
    {faqScreenQuestionAccordionButtons.get(questionNumber).click();}// Нажать на кнопку вопроса, аргумент- номер вопроса, начиная с "0"
    @FindBy(how= How.XPATH, using = "//div[@class='accordion__panel']/p")
    public ElementsCollection faqScreenQuestionAccordionTexts; // Выпадающий текст элементов аккордеона

    public void isAnswerCorrect(int questionNumber, String expected)// сравнить текст ответа под определенным номером с ожидаемым ответом
    {faqScreenQuestionAccordionTexts.get(questionNumber).shouldBe(Condition.visible);
        Assert.assertEquals(expected, faqScreenQuestionAccordionTexts.get(questionNumber).text());}

    // Элементы третьего экрана- конец
}
