package ru.yandex.praktikum.final_projeck_4_sprint.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForWhom {
    //Поле ввода имени
    public static final By TYPE_NAME = By.xpath(".//input[@placeholder='* Имя']");
    //Поле ввода фамилии
    public static final By TYPE_FAMILY_NAME = By.xpath(".//input[@placeholder='* Фамилия']");
    //Поле ввода адреса
    public static final By TYPE_WHERE_TO_GO = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    //кнопка выбора станции метро
    public static final By CHOOSE_METRO_STATION = By.xpath(".//input[@class='select-search__input']");
    //кнопка выбора станции метро 'Преображенская'
    public static final By CHOOSE_METRO_STATION1 = By.xpath(".//li[@data-index='0']");
    //кнопка выбора станции метро 'Черкизовская'
    public static final By CHOOSE_METRO_STATION2 = By.xpath(".//li[@data-index='1']");
    //Поле ввода номера телефона
    public static final By TYPE_TELEPHONE_NUMBER = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    //Кнопка далее на странице ввода личной информации
    private static final By FURTHER_BUTTON = By.xpath("//*[@class='Order_NextButton__1_rCA']/button[text()='Далее']");

    private final WebDriver driver;
    public ForWhom(WebDriver driver) {
        this.driver = driver;
    }
    public WebDriverWait waitWebDr(int sek) {
        WebDriverWait wait = new WebDriverWait(driver, sek);
        return wait;
    }
    //Заполнили поле Имя
    public void enterHolderName(String holderName) {
        waitWebDr(10).until(ExpectedConditions.visibilityOfElementLocated(TYPE_NAME));
        driver.findElement(TYPE_NAME).clear();
        driver.findElement(TYPE_NAME).sendKeys(holderName);
    }
    //Заполнили поле Фамилия
    public void enterHolderFamilyName(String holderfamilyname) {
        driver.findElement(TYPE_FAMILY_NAME).clear();
        driver.findElement(TYPE_FAMILY_NAME).sendKeys(holderfamilyname);
    }
    //Заполнили поле Адрес
    public void enterTypeWhereToGo(String adress) {
        driver.findElement(TYPE_WHERE_TO_GO).clear();
        driver.findElement(TYPE_WHERE_TO_GO).sendKeys(adress);
    }
    //клик по кнопке выбора станции метро
    public void clickTypeMetroStation() {
        waitWebDr(10).until(ExpectedConditions.visibilityOfElementLocated(CHOOSE_METRO_STATION));
        driver.findElement(CHOOSE_METRO_STATION).click();
    }
    //выбрать конкретную станцию метро
    public void clickMetroStation1(By station) {
        waitWebDr(10).until(ExpectedConditions.visibilityOfElementLocated(station));
        driver.findElement(station).click();
    }
    //Заполнили поле номер телефона
    public void enterTelephoneNumber(String telephonenumber) {
        driver.findElement(TYPE_TELEPHONE_NUMBER).clear();
        driver.findElement(TYPE_TELEPHONE_NUMBER).sendKeys(telephonenumber);
    }
    //нажали на кнопку далее
    public void clickFurtherButton() {
        driver.findElement(FURTHER_BUTTON).click();
    }
    public void setForWhomInformation(String holderName, String holderfamilyname, String adress, By station, String telephonenumber){
        enterHolderName(holderName);
        enterHolderFamilyName(holderfamilyname);
        enterTypeWhereToGo(adress);
        clickTypeMetroStation();
        clickMetroStation1(station);
        enterTelephoneNumber(telephonenumber);
        clickFurtherButton();
    }
}