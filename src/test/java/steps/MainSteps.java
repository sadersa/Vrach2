package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Если;
import io.cucumber.java.ru.Также;
import io.cucumber.java.ru.То;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import pages.MainPage;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;


public class MainSteps {
    WebDriver driver;
    MainPage page;

    @Before
    public void cBefore() {
        //WebDriverManager.firefoxdriver().setup();
        //FirefoxOptions options = new FirefoxOptions();
        //options.setHeadless(false);
        //driver = new FirefoxDriver(options);

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(false);
        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //driver.manage().window().maximize();
        page = PageFactory.initElements(driver, MainPage.class);
    }

    @After
    public void cAfter() {
        driver.close();
        page = null;
    }


    @Дано("Открыть сайт к-Врачу")
    public void открытьСайтКВрачу() {
        driver.get(page.URL);
    }

    @Также("Перейти в регион {string}")
    public void перейтиВРегион(String region) {
        page.goto_region(region);
    }

    @Если("Регион успешно открылся")
    public void регионУспешноОткрылся() {
        assertTrue("Title страници не содержит слова Региональный портал", driver.getTitle().contains("Региональный портал"));
    }

    @То("Включить демо режим")
    public void включитьДемоРежим() {
        page.demo_regime_enable();
    }

    @Если("Демо режим влючен")
    public void демоРежимВлючен() {
        page.demo_regime_enable_check();
    }

    @То("Записаться к врачу")
    public void записатьсяКВрачу() {
        page.zapisatsa_k_vrachu();
    }

    @Также("Выключить Демо режим")
    public void выключитьДемоРежим() {
        page.demo_regime_disable();
    }


}
