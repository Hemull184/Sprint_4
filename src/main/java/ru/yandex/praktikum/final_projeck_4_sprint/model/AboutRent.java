package ru.yandex.praktikum.final_projeck_4_sprint.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AboutRent {

    private static final By CHOOSE_CALENDAR = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    //Кнопка для выбора даты доставки самоката
    private static final By CLICK_DAY = By.xpath(".//div[@aria-label='Choose понедельник, 30-е января 2023 г.']");
    //кнопка, выбирающая конкретный день
    private static final By CLICK_DAY2 = By.xpath(".//div[@aria-label='Choose понедельник, 30-е января 2023 г.']");
    //кнопка, выбирающая конкретный день2
    private static final By CLICK_CHOOSE_TIME = By.xpath(".//div[@class='Dropdown-placeholder'][text()='* Срок аренды']");
    //Кнопка для выбора срока аренды?
    private static final By CLICK_TIME = By.xpath(".//div[@class='Dropdown-option'][text()='сутки']");
    //Кнопка для выбора суток
    private static final By CLICK_TIME2 = By.xpath(".//div[@class='Dropdown-option'][text()='трое суток']");
    //Кнопка для выбора 3е суток
    private static final By BOX_BLACK = By.id("black");
    //Кнопка для выбора цвета самоката
    private static final By BOX_grey = By.id("grey");
    private static final By TYPE_COMMENT = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    //поле для комментария курьеру
    private static final By CLICK_FINAL_ORDER_BUTTON = By.xpath("//*[@class='Order_Buttons__1xGrp']/button[text()='Заказать']");
    //Кнопка для финальног заказа
    private static final By CLICK_YES_CONFIRM_BUTTON = By.xpath("//*[@class='Order_Buttons__1xGrp']//button[text()='Да']");
    //Кнопка да в подтверждении заказа
    private static final By CONFORMATION_WINDOW = By.xpath("//*[@class='Order_ModalHeader__3FDaJ'][text()='Заказ оформлен']");
    //Окно подтверждения информации
    private static final By CHECK_STATUS_BUTTON = By.xpath("//*[@class='Order_NextButton__1_rCA']/Button[text()='Посмотреть статус']");
    //КНОПКА ПОСМОТРЕТЬ СТАТУС

    private final WebDriver driver;
    public AboutRent(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickChooseCalendar() {
        WebDriverWait wait5 = new WebDriverWait(driver, 10);
        wait5.until(ExpectedConditions.visibilityOfElementLocated(CHOOSE_CALENDAR));
        driver.findElement(CHOOSE_CALENDAR).click();
    }
    //нажали на кнопку выбора календаря
    public void ClickCDay() {
        WebDriverWait wait5 = new WebDriverWait(driver, 10);
        wait5.until(ExpectedConditions.visibilityOfElementLocated(CLICK_DAY));
        driver.findElement(CLICK_DAY).click();
    }
    //выбрали дату поставки
    public void ClickCDay2() {
        WebDriverWait wait5 = new WebDriverWait(driver, 10);
        wait5.until(ExpectedConditions.visibilityOfElementLocated(CLICK_DAY2));
        driver.findElement(CLICK_DAY2).click();
    }
    //выбрали дату поставки 2
    public void ClickChooseCTime() {
        WebDriverWait wait5 = new WebDriverWait(driver, 10);
        wait5.until(ExpectedConditions.visibilityOfElementLocated(CLICK_CHOOSE_TIME));
        driver.findElement(CLICK_CHOOSE_TIME).click();
    }
    //нажали на кнопку срок аренды
    public void ClickNeedTime() {
        WebDriverWait wait5 = new WebDriverWait(driver, 10);
        wait5.until(ExpectedConditions.visibilityOfElementLocated(CLICK_TIME));
        driver.findElement(CLICK_TIME).click();
    }
    //нажали на требуемый срок аренды (сутки)
    public void ClickNeedTime2() {
        WebDriverWait wait5 = new WebDriverWait(driver, 10);
        wait5.until(ExpectedConditions.visibilityOfElementLocated(CLICK_TIME2));
        driver.findElement(CLICK_TIME2).click();
    }
    //нажали на требуемый срок аренды (3 суток)
    public void ClickBoxBlack() {
        driver.findElement(BOX_BLACK).click();
    }
    //нажали на чек-бокс черный
    public void ClickBoxGrey() {
        driver.findElement(BOX_grey).click();
    }
    public void enterComment() {
        driver.findElement(TYPE_COMMENT).clear();
        driver.findElement(TYPE_COMMENT).sendKeys("Проба");
    }
    //оставили комментарий для курьера
    public void ClickFinalOrderButton() {
        driver.findElement(CLICK_FINAL_ORDER_BUTTON).click();
    }
    //нажали на кнопку заказать на странце 'Про аренду'
    public void ClickYesConfirmButton() {
        WebDriverWait wait5 = new WebDriverWait(driver, 10);
        wait5.until(ExpectedConditions.visibilityOfElementLocated(CLICK_YES_CONFIRM_BUTTON));
        driver.findElement(CLICK_YES_CONFIRM_BUTTON).click();
    }
    //нажали на кнопку да во всплывающем окне подтверждения заказа
    public String getTextConformationWindow() {
        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        wait2.until(ExpectedConditions.visibilityOfElementLocated(CHECK_STATUS_BUTTON));
        return driver.findElement(CONFORMATION_WINDOW).getText();
    }
}
