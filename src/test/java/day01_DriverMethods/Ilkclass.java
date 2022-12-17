package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilkclass {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        // En temel haliyle otomasyon yapmak icin Classimiza otomasyon icin gerekli olan
        // web driverin yerini gostermemiz gerekir. bunun icin java kutuphanesinden
        // System.setProperties methodunun icine ilk olarak driveri yazariz. 2. olarak
        // driverin fiziki yolunu kopylariz.
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.techproeducation.com");

    }
}
