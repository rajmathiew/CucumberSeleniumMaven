package pages;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;

public class UserLogin extends BrowserDriver {

    public static String userName = "Admin";
    public static String password = "admin123";
    public static String userName_xpath ="//input[@name='username']";
    public static String password_xpath ="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input";
    public static String loginBtn_xpath ="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button";

    public static void launchHomePage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    public static void enterUsername() throws InterruptedException{
        Thread.sleep(10000);
        driver.findElement(By.xpath(userName_xpath)).sendKeys(userName);
    }
    public static void enterPassword() throws InterruptedException{
        Thread.sleep(1000);
        driver.findElement(By.xpath(password_xpath)).sendKeys(password);
    }
    public static void clickLoginButton() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(loginBtn_xpath)).click();
    }
    public static void assertPageTitle() throws InterruptedException{
        Thread.sleep(5000);
        String expectedTitle = "OrangeHRM";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
        System.out.println("We are in "+ actualTitle +" page.");
    }
}



/*package pages;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static utility.BrowserDriver.*;

public class UserLogin extends BrowserDriver {

    public static String userName = "Admin";
    public static String password = "admin123";
    public static String userName_xpath ="//input[@name='username']";
    public static String password_xpath ="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input";
    public static String loginBtn_xpath ="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button";

    public static void launchHomePage() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    public static void enterUserName() throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(userName_xpath))).sendKeys(userName);
       // driver.findElement(By.xpath(userName_xpath)).sendKeys(userName);
    }
    public static void enterPassword() throws InterruptedException{
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(password_xpath))).sendKeys(password);
        //driver.findElement(By.xpath(password_xpath)).sendKeys(password);
    }
    public static void clickLoginButton(){
        driver.findElement(By.xpath(loginBtn_xpath)).click();
    }
}


ToDo
Waits -- all types -done
Assertion in @Then stepDefinition to check page title - done
implement TestNG
*/
