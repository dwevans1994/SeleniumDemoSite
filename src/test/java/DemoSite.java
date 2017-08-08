//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.PageFactory;
//
//import java.util.concurrent.TimeUnit;
//
//public class DemoSite {
//
//    private WebDriver webDriver;
//    private LoginPage loginPage;
//    private CreateUser createUser;
//
//
//    CreateUser cu;
//
//    LoginPage  lp;
//
//    @Before
//    public void before() {
//        ChromeOptions option = new ChromeOptions();
//        option.addArguments("--start-maximized");
//        webDriver = new ChromeDriver(option);
//        cu = PageFactory.initElements(webDriver,CreateUser.class);
//        lp = PageFactory.initElements(webDriver,LoginPage.class);
//    }
//
//    @Test
//    public void test() {
//
//
//
//
//
//        webDriver.navigate().to("http://thedemosite.co.uk/addauser.php");
//        try {
//            TimeUnit.SECONDS.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        cu.enterNameCreate("dylan");
//        cu.enterPasswordCreate("dylan");
//        cu.clickSubmitCreate();
//        cu.clickAway();
////
////        lp.enterName("dylan");
////        lp.enterPassword("dylan");
////        lp.clickSubmit();
////
//
//
//
//
//    }
//    @After
//    public void after(){
//        webDriver.quit();
//    }
//}
