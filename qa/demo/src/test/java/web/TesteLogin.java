package web;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TesteLogin {

    @Test
    void testarLogin() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://example.com/login");

        driver.findElement(By.id("username")).sendKeys("usuario_teste");
        driver.findElement(By.id("password")).sendKeys("senha123");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        assertTrue(
            driver.findElement(By.id("welcome-message")).isDisplayed()
        );

        driver.quit();
    }
}
