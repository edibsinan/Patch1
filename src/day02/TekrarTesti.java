package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TekrarTesti {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://youtube.com");

        String actualResult=driver.getCurrentUrl();
        String expectedResult="youtube";

        if (actualResult.contains(expectedResult)){
            System.out.println("youtube PASS");
        }else{
            System.out.println("youtube FAIL");
            System.out.println("Actuel URL : "+actualResult);
        }

        driver.navigate().to("https://www.amazon.com/");

        driver.navigate().back();

        driver.navigate().refresh();

        driver.navigate().forward();

        driver.manage().window().maximize();

        String actualTitle=driver.getTitle();
        String expectedTitle="Amazon";

        if (actualTitle.contains(expectedTitle)){
            System.out.println("amazon PASS");
        }else{
            System.out.println("amazon FAIL");
            System.out.println("Actuel Title : "+actualTitle);
        };

        String actuelAmazonURL=driver.getCurrentUrl();
        String expectedAmazonURL="https://www.amazon.com/";

        if (actuelAmazonURL.equals(expectedAmazonURL)){
            System.out.println("Amazonurl PASS");
        }else{
            System.out.println("Amazonurl Fail");
            System.out.println("Actuel Amazon URL : "+actuelAmazonURL+" icermiyor");
        }

        driver.close();

    }
}
