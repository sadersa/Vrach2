package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.fail;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
    }

    public void WaitPageLoaded(){
        new WebDriverWait(driver, 15).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }

    public void WaitForAjax() {
        try {
            while (true) {
                Boolean ajaxIsComplete = (Boolean) ((JavascriptExecutor) driver).executeScript("return jQuery.active == 0");
                if (ajaxIsComplete) {
                    break;
                }
                Thread.sleep(100);
            }
        } catch (Exception e) {
            fail();
        }
    }
}
