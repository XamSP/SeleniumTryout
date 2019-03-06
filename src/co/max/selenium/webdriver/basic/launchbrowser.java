package co.max.selenium.webdriver.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class launchbrowser {

    public static WebDriver driver = null;

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver1.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //open the web app
        driver.navigate().to("https://www.amazon.com/");
        driver.manage().window().maximize();
        String title = driver.getTitle();

        if (title.equalsIgnoreCase("Amazon.com")){
            System.out.println("Title matches!");
        } else {
            System.out.println(title);
        }

        WebElement serachTab = driver.findElement(By.id("twotabsearchtextbox"));

        serachTab.sendKeys("Air Pods");

        driver.findElement(By.className("nav-input")).click();


    }
}
