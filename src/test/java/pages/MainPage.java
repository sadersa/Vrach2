package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import java.util.List;
import static org.junit.Assert.assertTrue;


public class MainPage extends BasePage {
    public String URL="http://k-vrachu.ru/";

    public MainPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//div[@class='region']")
    WebElement we_region;

    public void goto_region(String region) {
        we_region.click();
        we_region.findElement(By.xpath("//a[text()='"+region +"']")).click();
        WaitPageLoaded();
    }


    @FindBy(xpath = "//div[@class='cap']//a[@class='demo']")
    List<WebElement> we_a_demo_regime;

    public void demo_regime_enable() {
        assertTrue("Не найдена кнопка ДЕМО",we_a_demo_regime.size()==1);
        WebElement el=we_a_demo_regime.get(0);
        Actions a = new Actions(driver);
        a.moveToElement(el).perform();
        el.findElement(By.xpath("//a[text()='Включить демо-режим']")).click();
    }

    @FindBy(xpath = "//div[@class='top-alert']")
    WebElement we_top_alert;

    public void demo_regime_enable_check() {
        String msg=we_top_alert.getText();
        assertTrue(msg.contains("Включен ознакомительный режим."));
    }

    public void demo_regime_disable() {
        we_top_alert.findElement(By.xpath("//a[text()='Выключить']")).click();
    }


    @FindBy(xpath = "//div[@class='path']//a[text()='Услуги']")
    WebElement we_element_path_uslugi;

    public void zapisatsa_k_vrachu() {
        Actions a = new Actions(driver);
        a.moveToElement(we_element_path_uslugi).perform();
        we_element_path_uslugi.findElement(By.xpath("//a[contains(text(),'к врачу')]")).click();
    }


}

