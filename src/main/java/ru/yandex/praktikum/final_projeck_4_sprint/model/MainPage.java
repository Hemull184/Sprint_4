package ru.yandex.praktikum.final_projeck_4_sprint.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    private static final String PAGE_URL = "https://qa-scooter.praktikum-services.ru/";
    //кнопка принятие cookie
    private static final By COOCKIE_CONFIRM_BUTTON = By.id("rcc-confirm-button");
    //верхняя кнопка заказать
    private static final By ORDER_BUTTON_UPPER = By.xpath(".//div[@class='Header_Nav__AGCXC']/button[@class='Button_Button__ra12g']");
    //нижняя кнопка заказать
    private static final By ORDER_BUTTON_LOWER = By.xpath("//*[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    //1й эелемент в выпадающем списке в разделе «Вопросы о важном»
    public static final By DROP_DOWN_LIST_1 = By.id("accordion__heading-0");
    //Элемент, появляющийся после клика на DROP_DOWN_LIST_1
    public static final By LIST_AFTER_DROP_DOWN_1 = By.xpath("//*[@id='accordion__panel-0']/p");

    private final WebDriver driver;
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
    public void openStartPage() {
        driver.get(PAGE_URL);
    }
    public WebDriverWait waitWebDr(int sek) {
        WebDriverWait wait = new WebDriverWait(driver, sek);
        return wait;
    }
    public void clickCoockieButton() {
        waitWebDr(10).until(ExpectedConditions.visibilityOfElementLocated(COOCKIE_CONFIRM_BUTTON));
        driver.findElement(COOCKIE_CONFIRM_BUTTON).click();
    }
    //кликнули на 1й эелемент в выпадающем списке в разделе «Вопросы о важном»
    public void clickDropDownList1() {
        waitWebDr(10).until(ExpectedConditions.visibilityOfElementLocated(DROP_DOWN_LIST_1));
        driver.findElement(DROP_DOWN_LIST_1).click();
    }
    // метод для получения текста элемента в выпадающем списке
    public String getTextFirstElementDrop() {
        waitWebDr(10).until(ExpectedConditions.visibilityOfElementLocated(DROP_DOWN_LIST_1));
        return driver.findElement(LIST_AFTER_DROP_DOWN_1).getText();
    }
    //кликнули на верхнюю кнопку Заказать
    public void clickOrderButtonUpper() {
        waitWebDr(10).until(ExpectedConditions.visibilityOfElementLocated(ORDER_BUTTON_UPPER));
        driver.findElement(ORDER_BUTTON_UPPER).click();
    }
    //кликнули на нижнюю кнопку Заказать
    public void clickOrderButtonLover() {
        waitWebDr(10).until(ExpectedConditions.visibilityOfElementLocated(ORDER_BUTTON_LOWER));
        driver.findElement(ORDER_BUTTON_LOWER).click();
    }
    //открыли нужную страницу и приняли куки
    public void preparations() {
        openStartPage();
        clickCoockieButton();
    }
}