

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;


//import static jdk.nashorn.internal.runtime.PropertyHashMap.findElement;



public class CreateUser {

    private WebDriver webDriver;
    LoginPage l = new LoginPage();


    @Before
    public void bTest() {
        System.out.println("Before");
        //System.setProperty("C:\\Users\\Administrator\\IdeaProjects\\Testing\\chromedriver.exe");
        webDriver = new ChromeDriver();

        l = PageFactory.initElements(webDriver, LoginPage.class);


    }

    @After
    public void aTest() {
        System.out.println("After");
        webDriver.quit();

    }

    @Test
    public void CreateAcc_Login() throws InterruptedException {

        System.out.println("Begin Test");
        webDriver.navigate().to("http://thedemosite.co.uk/login.php");

        l.goRegistration();
        l.sleep(2);
        l.enterCredentials("dylan", "brudda");

        l.submitClick();
        l.sleep(2);
        l.goLogin();

        l.enterCredentials("dylan", "brudda");
        l.sleep(2);
        l.submitClick();
        assertEquals("**Successful Login**", l.getStatus());


        TimeUnit.SECONDS.sleep(5);
        webDriver.quit();

    }



}