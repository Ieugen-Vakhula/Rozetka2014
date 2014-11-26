package pages;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.Log4Test;

import java.security.PrivateKey;


public class Login extends TestBase {

    private String fbLink = ".//*[@type='facebook']/a";


    public void clickOnLogin(){

        WebElement pressLogin = webDriver.findElement(By.className("m-user-signin"));
        Log4Test.info("click on Login");
        pressLogin.click();

    }

    public void swichingWindows() {
        String parentHandle = webDriver.getWindowHandle(); // get the current window handle
        Log4Test.info("click on fb icon");
        webDriver.findElement(By.xpath(fbLink)).click(); // click some link that opens a new window

        for (String winHandle : webDriver.getWindowHandles()) {
            webDriver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
        }

        Log4Test.info("input credentials");

        WebElement searchField = webDriver.findElement(By.xpath(".//*[@class='inputtext']"));

        // Sends "XXXXXXXXXX" text into an input field
        searchField.sendKeys("+380505216035");

        searchField = webDriver.findElement(By.xpath(".//*[@class='inputpassword']"));

        // Sends "XXXXXXXXXX" text into an input field
        searchField.sendKeys("5216035");

        webDriver.findElement(By.xpath(".//*[@id='loginbutton']/input")).click(); //click "Login" key

        webDriver.switchTo().window(parentHandle); // switch back to the original window
    }

    public void nameValidation(){

        WebElement name = webDriver.findElement(By.xpath(".//*[@class='m-user-profile']/a")); //

        Log4Test.info("Name Validation");

        Assert.assertEquals(name.getText().toString().contains("Jim Digriz"), true);

        Log4Test.info("Click on the Name Key");

        name.click();
    }

    public boolean isOpened()
    {
        return webDriver.getCurrentUrl().equals("https://my.rozetka.com.ua/");
    }
}
