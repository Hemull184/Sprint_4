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
        MainPage page = new MainPage(driver);
        page.open();
        page.clickCoockieButton();
        page.clickOrderButtonUpper();
        ForWhom page1 = new ForWhom(driver);
        page1.enterHolderName();
        page1.enterHolderFamilyName();
        page1.enterTypeWhereToGo();
        page1.ClickTypeMetroStation();
        page1.ClickMetroStation1();
        page1.enterTelephoneNumber();
        page1.clickFurtherButton();
        AboutRent page2 = new AboutRent(driver);
        page2.ClickChooseCalendar();
        page2.ClickCDay();
        page2.ClickChooseCTime();
        page2.ClickNeedTime();
        page2.ClickBoxBlack();
        page2.enterComment();
        page2.ClickFinalOrderButton();
        page2.ClickYesConfirmButton();
        page2.getTextConformationWindow();
        String expected = "Заказ оформлен";
        String actual = page2.getTextConformationWindow();
        assertEquals(expected, actual);
    }
    @Test
    public void checkOrderLover() {
        MainPage page = new MainPage(driver);
        page.open();
        page.clickCoockieButton();
        page.clickOrderButtonLover();
        ForWhom page1 = new ForWhom(driver);
        page1.enterHolderName();
        page1.enterHolderFamilyName();
        page1.enterTypeWhereToGo();
        page1.ClickTypeMetroStation();
        page1.ClickMetroStation2();
        page1.enterTelephoneNumber();
        page1.clickFurtherButton();
        AboutRent page2 = new AboutRent(driver);
        page2.ClickChooseCalendar();
        page2.ClickCDay2();
        page2.ClickChooseCTime();
        page2.ClickNeedTime2();
        page2.ClickBoxGrey();
        page2.enterComment();
        page2.ClickFinalOrderButton();
        page2.ClickYesConfirmButton();
        page2.getTextConformationWindow();
        String expected = "Заказ оформлен";
        String actual = page2.getTextConformationWindow();
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