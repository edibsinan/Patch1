package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitleAndURL {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://google.com");
        driver.manage().window().maximize();

        String actualResult=driver.getTitle();
        String expectedResult="google";

        if (actualResult.equals(expectedResult)){
            System.out.println("Page Title Testi PASS");
        }else {
            System.out.println("Page Title Testi FAILED");
            System.out.println("Actuel Page Title : " +actualResult);
        }

        driver.navigate().to("https://www.youtube.com/");

        String actuelURL=driver.getCurrentUrl();

        String expected="https://www.youtube.com/";



        if (actuelURL.equals(expected)){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Test FAILED");
            System.out.println("Actuel Page Title : "+actuelURL);
        }




        Thread.sleep(5000);
        driver.close();
    }
}
