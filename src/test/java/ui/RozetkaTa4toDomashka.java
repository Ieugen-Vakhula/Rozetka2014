package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Collection;
import java.util.Set;
import java.util.concurrent.TimeUnit;


    public class RozetkaTa4toDomashka {
        WebDriver driver;


        //Precondition
        @BeforeClass
        public void setUp() {

            //Initializes a browser

        }

        @Test
        public void rozetk_a() {


            driver = new FirefoxDriver();
            //Sets imlicit wait
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            //Maximizes a window size
            driver.manage().window().maximize();

            //Opens a url
            driver.get("http:/rozetka.com.ua");
// переход на закладку планшеты
            WebElement searchField = driver.findElement(By.xpath(".//*[@id='head_banner_container']/div[4]/div[1]/div/div[3]/div[1]/div/ul/li[1]/a"));

            searchField.click();
// переход на закладку Apple
            WebElement searchButtom = driver.findElement(By.xpath(".//*[@id='head_banner_container']/div[4]/div/div/div[2]/div[3]/ul/li[2]/ul/li[2]/a"));

            searchButtom.click();


//            WebDriverWait wait = new WebDriverWait(driver, 40);
//
//
//            WebElement tabInet = driver.findElement(By.xpath(".//*[@id='head_banner_container']/div[4]/div/div/div[2]/div[3]/ul/li[2]/ul"));
//
//              wait.until(ExpectedConditions.visibilityOf(tabInet));
//
//            Assert.assertEquals(tabInet.getText().toString().contains(" Acer, Appel, Asus, Dell, Fujitsu, HP (Hewlett Packard), Lenovo, MSI,Sony"), true);



            WebDriverWait wait = new WebDriverWait(driver, 40);

// проверка, перешли ли в вкладку Эпл
            WebElement tabInet = driver.findElement(By.xpath(".//*[@id='head_banner_container']/div[4]/div/div[1]/div[2]/div/div[2]/h1"));

            wait.until(ExpectedConditions.visibilityOf(tabInet));

            Assert.assertEquals(tabInet.getText().toString().contains("Ноутбуки Apple"), true);
//сортировка по цене
            WebElement searchAppel = driver.findElement(By.xpath(".//*[@id='sort_view']/a/i"));

            searchAppel.click();

            WebElement searchAppel2 = driver.findElement(By.xpath(".//*[@id='sort_view']/div/div/ul/li[2]/a"));

            searchAppel2.click();


//            WebElement tabInete = driver.findElement(By.xpath(".//*[@id='block_with_goods']/div[1]/div[1]/div[3]/div[1]/div/div/div[3]/a"));
//
//            wait.until(ExpectedConditions.visibilityOf(tabInete));
//
//            Assert.assertEquals(tabInete.getText().toString().contains(" Apple MacBook Pro Retina 15 (Z0PU002JE)Официальная гарантия!"), true);
// открытие 21й позиции в списке ноутбуков
            WebElement searchAppel21 = driver.findElement(By.xpath(".//*[@id='block_with_goods']/div[2]/a"));

            searchAppel21.click();

//добавление в список сравнения Apple MacBook Pro Retina 15 "(Z0PU002JE) Официальная гарантия
            WebElement searchAppel3 = driver.findElement(By.name("tocomparison"));

            searchAppel3.click();

            WebElement searchAppel31 = driver.findElement(By.xpath(".//*[@id='block_with_goods']/div/div[1]/div/div[1]/div/div/div[5]/div[1]/label/span"));

            searchAppel31.click();

//            WebElement tabInete = driver.findElement(By.xpath(""));
//
//            wait.until(ExpectedConditions.visibilityOf(tabInete));
//
//            Assert.assertEquals(tabInete.getText().toString().contains(" "), true);

////добавление в список сравнения Apple MacBook Air 11 "(MD712UA /)
            WebElement searchAppel4 = driver.findElement(By.xpath(".//*[@id='block_with_goods']/div[1]/div[1]/div[25]/div/div[1]/div/div[5]/div[1]/label/input"));

            searchAppel4.click();

            WebElement searchAppel41 = driver.findElement(By.xpath(".//*[@id='block_with_goods']/div[1]/div[1]/div[25]/div/div[1]/div/div[5]/div[1]/label/span"));

            searchAppel41.click();

// нажатие на кнопку "сравнить"
            WebElement searchAppel5 = driver.findElement(By.xpath(".//*[@class='underline']/a/span"));

            searchAppel5.click();

        }
            @AfterClass
            public void tearDown () {
                //Closes a browser
                driver.quit();
            }
        }

