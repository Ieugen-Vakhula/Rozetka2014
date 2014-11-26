package pages;


import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utils.Log4Test;

public class RozetkaWelcomePage extends TestBase {

    private String URL = "http://rozetka.com.ua/";

    protected By searchString = By.className("header-search-input-text");

    public void open()
    {

        webDriver.get(URL);
        Log4Test.info("Open WebUrl " + URL);

    }

    public boolean isOpened()
    {
        return webDriver.getCurrentUrl().equals(URL);
    }
}
