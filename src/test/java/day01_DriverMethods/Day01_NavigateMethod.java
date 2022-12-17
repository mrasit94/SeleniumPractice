package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_NavigateMethod {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Amazon sayfasina gidelim sonra
        driver.navigate().to("https://amazon.com");

        Thread.sleep(3000);

        //Hepsiburada sayfasina gidelim
        driver.navigate().to("https://techproeducation.com");

        Thread.sleep(3000);

        //Tekrar amazon sayfasina donelim
        driver.navigate().back();

        Thread.sleep(3000);

        //Tekrar Hepsiburada'a gidelim
        driver.navigate().forward();

        Thread.sleep(3000);

        //Son sayfada sayfayi yenileyelim
        driver.navigate().refresh();

        Thread.sleep(3000);

        //Sayfayi kapat
        driver.close();


    }
}
