package ru.yandex.praktikum.final_projeck_4_sprint.model;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {


    private static final String PAGE_URL = "https://qa-scooter.praktikum-services.ru/";
    //URL тестируемой страницы сайта
    private static final By COOCKIE_BUTTON = By.id("rcc-confirm-button");
    private static final By ORDER_BUTTON_UPPER = By.xpath(".//div[@class='Header_Nav__AGCXC']/button[@class='Button_Button__ra12g']");
    //верхняя кнопка заказать
    private static final By ORDER_BUTTON_LOWER = By.xpath("//*[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    //нижняя кнопка заказать
    public static final By DROP_DOWN_LIST_1 = By.id("accordion__heading-0");
      //1й эелемент в выпадающем списке в разделе «Вопросы о важном»
    public static final By LIST_AFTER_DROP_DOWN_1 = By.xpath("//*[@id='accordion__panel-0']/p");
    //Элемент, появляющийся после клика на DROP_DOWN_LIST_0



    private final WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(PAGE_URL);
    }
    //открыть тестову страницу
    public void clickCoockieButton() {
        WebDriverWait wait1 = new WebDriverWait(driver, 10);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(COOCKIE_BUTTON));
        driver.findElement(COOCKIE_BUTTON).click();
    }

    public void clickDropDownList1() {
        WebDriverWait wait1 = new WebDriverWait(driver, 10);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(DROP_DOWN_LIST_1));

        driver.findElement(DROP_DOWN_LIST_1).click();
    }
    //кликнули на элемент >
    public String getTextFirstElementDrop() {
        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        wait2.until(ExpectedConditions.visibilityOfElementLocated(DROP_DOWN_LIST_1));
        return driver.findElement(LIST_AFTER_DROP_DOWN_1).getText();
    }
    // метод для получения текста элемента в выпадающем списке
    public void clickOrderButtonUpper() {
        WebDriverWait wait3 = new WebDriverWait(driver, 10);
        wait3.until(ExpectedConditions.visibilityOfElementLocated(ORDER_BUTTON_UPPER));
        driver.findElement(ORDER_BUTTON_UPPER).click();
    }
    //кликнули на верхнюю кнопку Заказать
    public void clickOrderButtonLover() {
        WebDriverWait wait4 = new WebDriverWait(driver, 10);
        wait4.until(ExpectedConditions.visibilityOfElementLocated(ORDER_BUTTON_LOWER));
        driver.findElement(ORDER_BUTTON_LOWER).click();
    }
    //кликнули на нижнюю кнопку Заказать
}
