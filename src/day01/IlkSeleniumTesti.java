package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IlkSeleniumTesti {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        driver.navigate().refresh();

        driver.get("https://www.google.com/");

//        driver.navigate().to("https://www.google.com/");
//        driver.navigate().back();




        Thread.sleep(5000);
//        driver.close();
        driver.quit();

    }
}

