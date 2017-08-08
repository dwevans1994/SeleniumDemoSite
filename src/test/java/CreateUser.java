

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;


//import static jdk.nashorn.internal.runtime.PropertyHashMap.findElement;



public class CreateUser {

    private ExtentReports report;
    private ExtentTest test;
    private String reportFilePath = "report.html";

    private WebDriver webDriver;
    LoginPage l = new LoginPage();
    SnapShot snap = new SnapShot();

    @BeforeClass
    public static void init(){

    }

    @Before
    public void bTest() {
        System.out.println("Before");
        //System.setProperty("C:\\Users\\Administrator\\IdeaProjects\\Testing\\chromedriver.exe");
        webDriver = new ChromeDriver();

        l = PageFactory.initElements(webDriver, LoginPage.class);

        report = new ExtentReports();
        ExtentHtmlReporter extentHtmlReporter = new ExtentHtmlReporter(reportFilePath);
        extentHtmlReporter.config().setReportName("ReportName");
        extentHtmlReporter.config().setDocumentTitle("DocumentTitle");
        report.attachReporter(extentHtmlReporter);
        test = report.createTest("TestName");
    }



    @After
    public void aTest() {

        System.out.println("After");
        webDriver.quit();

        webDriver.quit();
        report.flush();

        }




    @Test
    public void CreateAcc_Login() throws InterruptedException {

        System.out.println("Begin Test");
        webDriver.navigate().to("http://thedemosite.co.uk/login.php");


        try {
            snap.take(webDriver, "image1");
        } catch (IOException e) {
            e.printStackTrace();
        }
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

        test.log(Status.INFO,"Info level");
        test.fail("Failed");
    }



}