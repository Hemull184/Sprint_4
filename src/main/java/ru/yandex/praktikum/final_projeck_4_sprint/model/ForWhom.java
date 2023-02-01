package ru.yandex.praktikum.final_projeck_4_sprint.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForWhom {

    public static final By TYPE_NAME = By.xpath(".//input[@placeholder='* Имя']");
    //Поле ввода имени
    public static final By TYPE_FAMILY_NAME = By.xpath(".//input[@placeholder='* Фамилия']");
    //Поле ввода фамилии
    public static final By TYPE_WHERE_TO_GO = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    //Поле ввода адреса
    public static final By CHOOSE_METRO_STATION = By.xpath(".//input[@class='select-search__input']");
    //кнопка выбора станции метро
    public static final By CHOOSE_METRO_STATION1 = By.xpath(".//li[@data-index='0']");
    //кнопка выбора станции метро 'Преображенская'
    public static final By CHOOSE_METRO_STATION2 = By.xpath(".//li[@data-index='1']");
    //кнопка выбора станции метро 'Черкизовская'
    public static final By TYPE_TELEPHONE_NUMBER = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    //Поле ввода номера телефона
    private static final By FURTHER_BUTTON = By.xpath("//*[@class='Order_NextButton__1_rCA']/button[text()='Далее']");
    //Кнопка далее на странице ввода личной информации

    private final WebDriver driver;
    public ForWhom(WebDriver driver) {
        this.driver = driver;
    }

    public void enterHolderName() {
        WebDriverWait wait5 = new WebDriverWait(driver, 10);
        wait5.until(ExpectedConditions.visibilityOfElementLocated(TYPE_NAME));
        driver.findElement(TYPE_NAME).clear();
        driver.findElement(TYPE_NAME).sendKeys("Леонид");
    }
    //Заполнили поле Имя
    public void enterHolderFamilyName() {
        driver.findElement(TYPE_FAMILY_NAME).clear();
        driver.findElement(TYPE_FAMILY_NAME).sendKeys("Иванов");
    }
    //Заполнили поле Фамилия
    public void enterTypeWhereToGo() {
        driver.findElement(TYPE_WHERE_TO_GO).clear();
        driver.findElement(TYPE_WHERE_TO_GO).sendKeys("Воронеж, ул. Баранкина, дом 7, кв. 22");
    }
    //Заполнили поле Адрес
    public void ClickTypeMetroStation() {
        WebDriverWait wait5 = new WebDriverWait(driver, 10);
        wait5.until(ExpectedConditions.visibilityOfElementLocated(CHOOSE_METRO_STATION));
        driver.findElement(CHOOSE_METRO_STATION).click();
    }
    //клик по кнопке выбора станции метро
    public void ClickMetroStation1() {
        WebDriverWait wait5 = new WebDriverWait(driver, 10);
        wait5.until(ExpectedConditions.visibilityOfElementLocated(CHOOSE_METRO_STATION));
        driver.findElement(CHOOSE_METRO_STATION1).click();
    }
    //выбрать метро Рокосовского
    public void ClickMetroStation2() {
        WebDriverWait wait5 = new WebDriverWait(driver, 10);
        wait5.until(ExpectedConditions.visibilityOfElementLocated(CHOOSE_METRO_STATION2));
        driver.findElement(CHOOSE_METRO_STATION2).click();
    }
    //выбрать метро Черкизовская
    public void enterTelephoneNumber() {
        driver.findElement(TYPE_TELEPHONE_NUMBER).clear();
        driver.findElement(TYPE_TELEPHONE_NUMBER).sendKeys("+79594444554");
    }
    //Заполнили поле номер телефона
    public void clickFurtherButton() {
        driver.findElement(FURTHER_BUTTON).click();
    }
    //нажали на кнопку далее
}
