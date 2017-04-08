/**
 * Created by Алекс on 07.04.2017.
 */

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public WebDriver driver;
    private Object webDriver;
//Negative test case for login to rozetka.com.ua

    public Object getWebDriver() {

        return webDriver;
    }

        @Test
        public void RosetkaTest() {
            System.setProperty("webdriver.chrome.driver", "F:\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("http://rozetka.com.ua/");
            WebElement NameSigninCabinet;
            NameSigninCabinet = driver.findElement(By.xpath(".//*[@id='header_user_menu_parent']/a"));
            System.out.println("Open page is:" + NameSigninCabinet.getText());
            NameSigninCabinet.click();

            final WebElement LoginEnterPage = driver.findElement(By.xpath(".//*[@id='popup_signin']/div"));
        }

    @After
    public void Finish() {
        driver.quit();
    }


    }
