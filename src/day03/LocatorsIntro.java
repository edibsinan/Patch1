package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.awt.image.ImageWatched;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsIntro {
    public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("http://a.testaddressbook.com");
        driver.manage().window().maximize();

        WebElement signIn= driver.findElement(By.id("sign-in"));
        signIn.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

       WebElement email=driver.findElement(By.id("session_email"));
       WebElement password=driver.findElement(By.id("session_password"));
       WebElement signinButton=driver.findElement(By.name("commit"));

       email.sendKeys("testtechproed@gmail.com");
       password.sendKeys("Test1234!");
       signinButton.click();

       WebElement kullaniciAdi=driver.findElement(By.className("navbar-text"));

       if (kullaniciAdi.isDisplayed()){
           System.out.println("Kullanici adi testtechproed@gmail.com goruldu PASSED");
       }else{
           System.out.println("FALSE");
       }

       WebElement addressLink=driver.findElement(By.linkText("Addresses"));
       WebElement signOutLink=driver.findElement(By.linkText("Sign out"));

       if (addressLink.isDisplayed()){
           System.out.println("Addresses link goruldu PASSED");
       }else{
           System.out.println("Addresses link gorulmedi FALSE");
       }

       if (signOutLink.isDisplayed()){
           System.out.println("Sign Out link goruldu PASSED");
       }else {
           System.out.println("Sign Out link gorulmedi FALSE");
       }

        List<WebElement> linklistesi=driver.findElements(By.tagName("a"));
        System.out.println("sayfada "+linklistesi.size()+" tane link var");


        Thread.sleep(5000);
        driver.close();

    }
}
