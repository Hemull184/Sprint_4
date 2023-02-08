import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.praktikum.final_projeck_4_sprint.model.AboutRent;
import ru.yandex.praktikum.final_projeck_4_sprint.model.ForWhom;
import ru.yandex.praktikum.final_projeck_4_sprint.model.MainPage;
import static org.junit.Assert.assertEquals;


public class CheckFillOutOrderForm {
    private WebDriver driver;
    @Before
    public void setup() {
        driver = new ChromeDriver();
    }
    @Test
    public void checkOrderUpper() {
        MainPage mainPage = new MainPage(driver);
        mainPage.preparations();
        mainPage.clickOrderButtonUpper();
        ForWhom forWhomPage = new ForWhom(driver);
        forWhomPage.setForWhomInformation(
                "леонид",
                "Иванов",
                "Воронеж, ул. Баранкина, дом 7, кв. 22",
                ForWhom.CHOOSE_METRO_STATION1,
                "+79594444554");
        AboutRent aboutRentPage = new AboutRent(driver);
        aboutRentPage.setAboutRentformation(
                AboutRent.CLICK_DAY,
                AboutRent.CLICK_TIME,
                "проба1");
        aboutRentPage.getTextConformationWindow();
        String expected = "Заказ оформлен";
        String actual = aboutRentPage.getTextConformationWindow();
        assertEquals(expected, actual);
    }
    @Test
    public void checkOrderLover() {
        MainPage mainPage = new MainPage(driver);
        mainPage.preparations();
        mainPage.clickOrderButtonLover();
        ForWhom forWhomPage = new ForWhom(driver);
        forWhomPage.setForWhomInformation(
                "Сергей",
                "Петров",
                "Москва, ул. Вавилова, дом 5, кв. 2",
                ForWhom.CHOOSE_METRO_STATION2,
                "+79594224554");
        AboutRent aboutRentPage = new AboutRent(driver);
        aboutRentPage.setAboutRentformation(
                AboutRent.CLICK_DAY2,
                AboutRent.CLICK_TIME2,
                "проба2");
        aboutRentPage.getTextConformationWindow();
        String expected = "Заказ оформлен";
        String actual = aboutRentPage.getTextConformationWindow();
        assertEquals(expected, actual);
    }
    @After
    public void cleanUp() {
        driver.manage().deleteAllCookies();
        //удалть все куки
        driver.quit();
        // Закрой браузер
    }
}