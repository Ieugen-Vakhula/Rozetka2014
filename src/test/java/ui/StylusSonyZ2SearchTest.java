package ui;

import org.apache.xpath.SourceTree;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class StylusSonyZ2SearchTest {
    WebDriver driver;

    //Precondition
    @BeforeClass
    public void setUp() {

        //Initializes a browser
        driver = new FirefoxDriver();

        //Sets imlicit wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //Maximizes a window size
        driver.manage().window().maximize();

        //Opens a url
        driver.get("https://www.stylus.com.ua");
    }
    @Test
    public void stylusSonyZ2SearchTest() {

        WebElement searchField = driver.findElement(By.className("s_in"));
    }
    public void searchTest()

    {

        WebElement searchField = driver.findElement(By.className("s_in"));


        searchField.sendKeys("Sony Z2");

        WebElement searchButtom = driver.findElement(By.xpath(".//*[@id='button']"));


        searchButtom.click();

        searchButtom.click();


        WebDriverWait wait = new WebDriverWait(driver, 40);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='button']")));

        WebElement link = driver.findElement(By.partialLinkText("Z2"));

        link.click();

        WebElement charTab = driver.findElement(By.xpath(".//*[@id='menulink']/ul/li[1]/a/span"));

        wait.until(ExpectedConditions.elementToBeClickable(charTab));


        charTab.click();

        WebElement tabInet = driver.findElement(By.xpath(".//*[@id='col1_content']/div[4]/div[1]/div[5]/table/tbody/tr[29]/td[2]/div"));

        charTab.click();

        //   WebElement tabInet = driver.findElement(By.xpath(".//*[@id='col1_content']/div[4]/div[1]/div[5]/table/tbody/tr[29]/td[1]"));


        wait.until(ExpectedConditions.visibilityOf(tabInet));

        Assert.assertEquals(tabInet.getText().toString().contains("HTML, HTML5, Adobe Flash, RSS"), true);


        System.out.println("");


    }




    @AfterClass
    public void tearDown() {
        //Closes a browser
        driver.quit();
    }
}
