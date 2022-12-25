package day03_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Xpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        // 2- Add Element butonuna basin
        Thread.sleep(3000);

        //WebElement addButton = driver.findElement(By.xpath("//*[@onclick='addElement()']"));

        WebElement addButtonT = driver.findElement(By.xpath("//*[text()='Add Element']"));
                                //<button onclick="addElement()">Add Element</button>
        //Xpath kullaniminda locate edecegimiz webelement texte sahipse yukaridaki sekilde kullanabiliriz.
        //addButton.click();
        addButtonT.click();

        //3Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButton = driver.findElement(By.xpath("//*[@onclick='deleteElement()']"));
        if(deleteButton.isDisplayed()) {
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }
        //4Delete tusuna basin
        Thread.sleep(3000);
        deleteButton.click();

        //5“Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveYazisi = driver.findElement(By.xpath("//h3"));
        if(addRemoveYazisi.isDisplayed()) {
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }
    }
}
