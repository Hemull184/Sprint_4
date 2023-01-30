package ru.yandex.praktikum.final_projeck_4_sprint.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForWhom {

    public static final By TYPE_NAME = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/input");
    //Поле ввода имени
    public static final By TYPE_FAMILY_NAME = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/input");
    //Поле ввода фамилии
    public static final By TYPE_WHERE_TO_GO = By.xpath("/html/body/div/div/div[2]/div[2]/div[3]/input");
    //Поле ввода адреса
    public static final By CHOOSE_METRO_STATION = By.xpath("/html/body/div/div/div[2]/div[2]/div[4]/div/div/input[@class='select-search__input']");
    //кнопка выбора станции метро
    public static final By CHOOSE_METRO_STATION1 = By.xpath("/html/body/div/div/div[2]/div[2]/div[4]/div/div[2]/ul/li[3]/button/div[2]");
    //кнопка выбора станции метро 'Преображенская'
    public static final By CHOOSE_METRO_STATION2 = By.xpath("/html/body/div/div/div[2]/div[2]/div[4]/div/div[2]/ul/li[2]/button/div[2]");
    //кнопка выбора станции метро 'Черкизовская'
    public static final By TYPE_TELEPHONE_NUMBER = By.xpath("/html/body/div/div/div[2]/div[2]/div[5]/input");
    //Поле ввода номера телефона
    private static final By FURTHER_BUTTON = By.xpath("/html/body/div/div/div[2]/div[3]/button");
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
