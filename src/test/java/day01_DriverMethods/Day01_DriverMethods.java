package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_DriverMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com"); // ilk olarak, gidilecek sayfa

        System.out.println("Sayfa basligi : "+ driver.getTitle());

        System.out.println("Sayfa url i : "+ driver.getCurrentUrl());

        //System.out.println("Sayfanin source kodu : "+ driver.getPageSource());

        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());//window a ait hash degerini
        //verir. bu hash degerlerini bir stringe atayip pencereler arasi gecis yapabilir.



    }
}
