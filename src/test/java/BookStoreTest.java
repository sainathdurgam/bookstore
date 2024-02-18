
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Set;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.Assert;
import pages.*;




public class BookStoreTest {
    public WebDriver driver;
    BookStore bookStore;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win32 (3)\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        //loginPage.logoutB();
         bookStore= new BookStore(driver);
    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test(priority = 1)
    public void registerPage(){

        //Registration
       bookStore.registerClick();
       bookStore.checkClick();
       bookStore.first("sainath");
       bookStore.last("durgam");
       bookStore.mail("sainathladdu44@gmail.com");
       bookStore.password("Sainathqa123");
       bookStore.rePassword("Sainathqa123");
       bookStore.button();

       //Login
        bookStore.loginClick();
        bookStore.loginMail("sainathladdu44@gmail.com");
        bookStore.loginPassE("Sainathqa123");
        bookStore.loginButton();
        Assert.assertTrue(bookStore.logout().isDisplayed(),"logout out anchor not display");

        //Add to cart
        bookStore.searchInput("First Prize Pies");
        bookStore.searchButton();
        Assert.assertTrue(bookStore.bookItem().isDisplayed(),"book item is not display");
        bookStore.addToCart();

        //Shopping
        bookStore.shopClick();;
        Assert.assertTrue(bookStore.item().isDisplayed(),"shop item is not displayed");
        bookStore.agreeClick();
        bookStore.checkoutClick();

        //Adress
        //loginPage.sameClick();
        bookStore.selectCountry();
        bookStore.city("hyd");
        bookStore.address("1-43");
        bookStore.pincode("500001");
        bookStore.phone("9000000100");
        bookStore.buttonClick();

        bookStore.shippingButtonContinue();
        bookStore.shippingMethod();

        Assert.assertEquals(bookStore.thanks(),"Thank you","thank you is not matched or not display");
        Assert.assertEquals(bookStore.thanks2(),"Your order has been successfully processed!","thank  2 message you is not matched or not display");
        bookStore.finalButton();

        bookStore.loginButton();
        Assert.assertTrue(bookStore.loginB().isDisplayed(),"logout not succesfully");

    }



}
