package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class BookStore{
    WebDriver driver;
    WebDriverWait wait;

    //Register
    By registerE=By.xpath("//div[@class='header-links']//a[@class='ico-register']");
    By checkBoxE=By.xpath("//input[@id='gender-male']");
    By fNameE=By.xpath("//input[@id='FirstName']");
    By lNameE=By.xpath("//input[@id='LastName']");
    By emailE=By.xpath("//input[@id='Email']");
    By passwordE=By.xpath("//input[@id='Password']");
    By rePasswordE=By.xpath("//input[@id='ConfirmPassword']");
    By buttonE=By.xpath("//button[@id='register-button']");
    By completedE=By.xpath("//div[text()='Your registration completed']");
    By continuE=By.xpath("//a[text()='Continue']");

    //Login
    By loginE=By.xpath("//a[text()='Log in']");
    By loginEmailE=By.xpath("//input[@id='Email']");
    By loginPasswordE=By.xpath("//input[@id='Password']");
    By loginButtonE=By.xpath("//button[text()='Log in']");
    By logoutE=By.xpath("//a[text()='Log out']");

    //Add To cart
    By searchE=By.xpath("//input[@id='small-searchterms']");
    By searchButtonE=By.xpath("//button[text()='Search']");
    By bookItemE=By.xpath("//div[@class='product-item']");
    By addToCartE=By.xpath("//button[text()='Add to cart']");

    //Shopping
    By shoppingAncharE=By.xpath("//a[@class='ico-cart']");
    By itemE=By.xpath("//div[@class='table-wrapper']");
    By removeItem=By.xpath("//td[@class='remove-from-cart']");
    //By detailsCardE=By.xpath("");
    By agreeE=By.xpath("//input[@id='termsofservice']");
    By checkoutE=By.xpath("//button[@id='checkout']");


    //Address
    By sameAddressE=By.xpath("//input[@id='ShipToSameAddress']");
    By countryE=By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By cityE=By.xpath("//input[@id='BillingNewAddress_City']");
    By addressE=By.xpath("//input[@id='BillingNewAddress_Address1']");
    By pinE=By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneE=By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By okContinueE=By.xpath("//div[@id='billing-buttons-container']/button[text()='Continue']");

    //shippingAddress
    By shippingAddressButtonCon=By.xpath("//div[@id='shipping-buttons-container']/button[text()='Continue']");
    //shippingMethod
    By shippingMethodE=By.xpath("//div[@id='shipping-method-buttons-container']//button");
    //payment
    By paymentE=By.xpath("//div[@id='payment-method-buttons-container']/button");
    //payment information
    By informationE=By.xpath("//div[@id='payment-info-buttons-container']/button");
    //confirmOrder
    By confirmOrderE=By.xpath("//div[@id='confirm-order-buttons-container']/button");
    //thanks message
    By thanksE=By.xpath("//h1");//Thank you
    By thanksMessageE=By.xpath("//div[@class='section order-completed']/div/strong");//Your order has been successfully processed!
    By thanksButtonE=By.xpath("//div[@class='section order-completed']/div[3]/button");

    //logout
    By logoutButtonE = By.xpath("//a[text()='Log out']");








    public BookStore(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void registerClick(){
          driver.findElement(registerE).click();
    }
    public void checkClick(){
        driver.findElement(checkBoxE).click();
    }
    public void first(String f){
        driver.findElement(fNameE).sendKeys(f);
    }
    public void last(String l){
        driver.findElement(lNameE).sendKeys(l);
    }
    public void mail(String m){
        driver.findElement(emailE).sendKeys(m);
    }
    public void password(String p){
        driver.findElement(passwordE).sendKeys(p);
    }
    public void rePassword(String re){
        driver.findElement(rePasswordE).sendKeys(re);
    }
    public void button(){
        driver.findElement(buttonE).click();
    }
    public String confirm(){
        return  driver.findElement(completedE).getText();
    }
    public void cont(){
        driver.findElement(continuE).click();
    }



    public void loginClick(){
        driver.findElement(loginE).click();
    }
    public void loginMail(String le){
        driver.findElement(loginEmailE).sendKeys(le);
    }
    public void loginPassE(String lp){
        driver.findElement(loginPasswordE).sendKeys(lp);
    }
    public void loginButton(){
        driver.findElement(loginButtonE).click();
    }
    public WebElement logout(){
        return driver.findElement(logoutE);
    }



    public void searchInput(String f){
        driver.findElement(searchE).sendKeys(f);
    }
    public void searchButton(){
        driver.findElement(searchButtonE).click();
    }
    public WebElement bookItem(){
        return driver.findElement(bookItemE);
    }
    public void addToCart(){
        driver.findElement(addToCartE).click();
    }


    public WebElement item(){
        return driver.findElement(itemE);
    }
    public void shopClick(){
        driver.findElement(shoppingAncharE).click();
    }
    public void agreeClick(){
        driver.findElement(agreeE).click();
    }
    public void checkoutClick(){
        driver.findElement(checkoutE).click();
    }


    /*public void sameClick(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(sameAddressE));
        driver.findElement(sameAddressE).click();
    }*/
    public void selectCountry(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(countryE));
        WebElement c= driver.findElement(countryE);
        Select sc = new Select(c);
        sc.selectByVisibleText("India");
    }
    public void city(String c){
        wait.until(ExpectedConditions.visibilityOfElementLocated(cityE));
        driver.findElement(cityE).sendKeys(c);
    }
    public void address(String c){
        wait.until(ExpectedConditions.visibilityOfElementLocated(addressE));
        driver.findElement(addressE).sendKeys(c);
    }
    public void pincode(String c){
        wait.until(ExpectedConditions.visibilityOfElementLocated(pinE));
        driver.findElement(pinE).sendKeys(c);
    }
    public void phone(String c){
        wait.until(ExpectedConditions.visibilityOfElementLocated(phoneE));
        driver.findElement(phoneE).sendKeys(c);
    }
    public void buttonClick(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(okContinueE));
        driver.findElement(okContinueE).click();
    }


    public void shippingButtonContinue(){
        //wait.until(ExpectedConditions.visibilityOfElementLocated(shippingAddressButtonCon));
        driver.findElement(shippingAddressButtonCon).click();
    }
    public void shippingMethod(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(shippingMethodE));
        driver.findElement(shippingMethodE).click();
    }

    public String thanks(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(thanksE));
        return driver.findElement(thanksE).getText();
    }
    public String thanks2(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(thanksMessageE));
        return driver.findElement(thanksMessageE).getText();
    }
    public void finalButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(thanksButtonE));
        driver.findElement(thanksButtonE).click();
    }
    public void logoutB(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(logoutE));
        driver.findElement(logoutE).click();
    }

    public WebElement loginB(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginE));
        return driver.findElement(loginE);
    }
}