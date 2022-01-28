import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;

public class DemoHasMap {
    static HashMap hasMap(){
        HashMap h1 = new HashMap();
        h1.put("x","agsg@ars");
        h1.put("y","sonia@sonia");
        h1.put("z","aman@joti");
        h1.put("t","Admin@admin123");
        return h1;

    }
    public static void main(String [] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SukhjeetKaur\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        String credentials = (String) hasMap().get("t");
        String arr[] = credentials.split("@");
        WebElement userName= driver.findElement(By.xpath("//input[@id=\"txtUsername\"]"));
        userName.sendKeys(arr[0]);
        WebElement password = driver.findElement(By.xpath("//input[@id=\"txtPassword\"]"));
        password.sendKeys(arr[1]);
        WebElement clickOnSubmitButton = driver.findElement(By.xpath("//input[@id=\"btnLogin\"]"));
        clickOnSubmitButton.click();
        WebElement ele=driver.findElement(By.xpath("//li[@class='current main-menu-first-level-list-item']"));
        if(ele.isDisplayed())
    {
          System.out.println("the test has been passed");
        }
        else{
            System.out.println("the test has not  been fail");
        }
//        DemoHasMap d1 = new DemoHasMap();


    }
}
