/**
 * Created by Алекс on 07.04.2017.
 */

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class Main {
    private Object webDriver;

    public Object getWebDriver() {

        return webDriver;
    }
//Negative test case for login to rozetka.com.ua

    @After
    public void Finish() {

    }

    public class JunitTest {
        public WebDriver driver;

        @Test
        public void RosetkaTest() {
            driver.get("http://rozetka.com.ua/");
            WebElement NameSigninCabinet;
            NameSigninCabinet = driver.findElement(By.xpath(".//*[@id='header_user_menu_parent']/a"));
            System.out.println("Open page is:" + NameSigninCabinet.getText());
            NameSigninCabinet.click();

            final WebElement LoginEnterPage = driver.findElement(By.xpath(".//*[@id='popup_signin']/div"));

            class LoginEnterPage {
                public void loginEnter() {

                    rozetkaLoginEnterPage loginEnterPage = new rozetkaLoginEnterPage(getWebDriver());
                    loginEnterPage.loginEnterPageOpen();
                    loginEnterPage.loginInput("Alex");
                    loginEnterPage.passwordInput("13579");
                    LoginEnterPage.click();

                    assertTrue("User login and password are entered with incorrect login and password", loginEnterPage.loginPageEnter());
                }


            }
        }


    }

    private class rozetkaLoginEnterPage {
        public rozetkaLoginEnterPage(Object webDriver) {
        }

        public void passwordWrite(String s) {
        }

        public void passwordInput(String s) {
        }

        public void loginInput(String s) {
        }

        public void loginInput() {
        }

        public void loginEnterPageOpen() {
        }

        public boolean loginPageEnter() {
            return false;
        }
    }
}