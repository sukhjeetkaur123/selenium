import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SyncroniseTestMethod {
    public static WebDriver driver;
    public static WebDriverWait wait;

    public static void initBrowser(String testUrl)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SukhjeetKaur\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(testUrl);
    }

        public static void enterValue(WebDriver driver, WebElement ele,int timeout,String value){
        wait = new WebDriverWait(driver,timeout);
//       wait.until(ExpectedCondition.)
            ele.sendKeys(value);

    }
    public static void clickEvent(WebDriver driver,WebElement ele,int timeout){
        wait = new WebDriverWait(driver,timeout);
        ele.click();

    }
}
