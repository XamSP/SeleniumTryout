package sele1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi");
        WebDriver obj = new ChromeDriver();
        obj.get("https://www.google.com");
    }
}
