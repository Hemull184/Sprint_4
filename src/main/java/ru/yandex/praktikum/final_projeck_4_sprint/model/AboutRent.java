package ru.yandex.praktikum.final_projeck_4_sprint.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AboutRent {
    //Кнопка для выбора даты доставки самоката
    private static final By CHOOSE_CALENDAR = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    //кнопка, выбирающая конкретный день
    public static final By CLICK_DAY = By.xpath(".//div[@aria-label='Choose понедельник, 30-е января 2023 г.']");
    //кнопка, выбирающая конкретный день2
    public static final By CLICK_DAY2 = By.xpath(".//div[@aria-label='Choose вторник, 31-е января 2023 г.']");
    //Кнопка для выбора срока аренды
    public static final By CLICK_CHOOSE_TIME = By.xpath(".//div[@class='Dropdown-placeholder'][text()='* Срок аренды']");
    //Кнопка для выбора суток
    public static final By CLICK_TIME = By.xpath(".//div[@class='Dropdown-option'][text()='сутки']");
    //Кнопка для выбора 3х суток
    public static final By CLICK_TIME2 = By.xpath(".//div[@class='Dropdown-option'][text()='трое суток']");
    //Кнопка для выбора черного цвета самоката
    public static final By BOX_BLACK = By.id("black");
    //Кнопка для выбора серого цвета самоката
    public static final By BOX_grey = By.id("grey");
    //поле для комментария курьеру
    private static final By TYPE_COMMENT = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    //Кнопка Заказать для финальног заказа
    private static final By CLICK_FINAL_ORDER_BUTTON = By.xpath("//*[@class='Order_Buttons__1xGrp']/button[text()='Заказать']");
    //Кнопка да в подтверждении заказа
    private static final By CLICK_YES_CONFIRM_BUTTON = By.xpath("//*[@class='Order_Buttons__1xGrp']//button[text()='Да']");
    //Окно подтверждения информации
    private static final By CONFORMATION_WINDOW = By.xpath("//*[@class='Order_ModalHeader__3FDaJ'][text()='Заказ оформлен']");
    //КНОПКА ПОСМОТРЕТЬ СТАТУС
    private static final By CHECK_STATUS_BUTTON = By.xpath("//*[@class='Order_NextButton__1_rCA']/Button[text()='Посмотреть статус']");

    private final WebDriver driver;
    public AboutRent(WebDriver driver) {
        this.driver = driver;
    }
    public WebDriverWait waitWebDr(int sek) {
        WebDriverWait wait = new WebDriverWait(driver, sek);
        return wait;
    }
    //нажали на кнопку выбора календаря
    public void clickChooseCalendar() {
        waitWebDr(10).until(ExpectedConditions.visibilityOfElementLocated(CHOOSE_CALENDAR));
        driver.findElement(CHOOSE_CALENDAR).click();
    }
    //выбрали дату поставки
    public void clickDay(By day) {
        waitWebDr(10).until(ExpectedConditions.visibilityOfElementLocated(day));
        driver.findElement(day).click();
    }
    //нажали на кнопку срок аренды
    public void clickChooseRentTime() {
        waitWebDr(10).until(ExpectedConditions.visibilityOfElementLocated(CLICK_CHOOSE_TIME));
        driver.findElement(CLICK_CHOOSE_TIME).click();
    }
    //нажали на требуемый срок аренды
    public void clickNeedRentTime(By time) {
        waitWebDr(10).until(ExpectedConditions.visibilityOfElementLocated(time));
        driver.findElement(time).click();
    }
    //нажали на чек-бокс черный
    public void clickBoxBlack() {
        driver.findElement(BOX_BLACK).click();
    }
    public void clickBoxGrey() {
        driver.findElement(BOX_grey).click();
    }
    //оставили комментарий для курьера
    public void enterComment(String comment) {
        driver.findElement(TYPE_COMMENT).clear();
        driver.findElement(TYPE_COMMENT).sendKeys(comment);
    }
    //нажали на кнопку заказать на странце 'Про аренду'
    public void clickFinalOrderButton() {
        driver.findElement(CLICK_FINAL_ORDER_BUTTON).click();
    }
    //нажали на кнопку да во всплывающем окне подтверждения заказа
    public void clickYesConfirmButton() {
        waitWebDr(10).until(ExpectedConditions.visibilityOfElementLocated(CLICK_YES_CONFIRM_BUTTON));
        driver.findElement(CLICK_YES_CONFIRM_BUTTON).click();
    }
    //Получили текс из окна подтврждения информации
    public String getTextConformationWindow() {
        waitWebDr(10).until(ExpectedConditions.visibilityOfElementLocated(CHECK_STATUS_BUTTON));
        return driver.findElement(CONFORMATION_WINDOW).getText();
    }
    public void setAboutRentformation(By day, By time, String comment){
        clickChooseCalendar();
        clickDay(day);
        clickChooseRentTime();
        clickNeedRentTime(time);
        clickBoxBlack();
        enterComment(comment);
        clickFinalOrderButton();
        clickYesConfirmButton();
    }
}