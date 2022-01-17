import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestDriver extends SyncroniseTestMethod{
    public static void main(String[] aew){
        initBrowser("https://www.orangehrm.com/");
        WebElement clickFreeTrial= driver.findElement(By.xpath("//a[@class=\"btn-orange contact-ohrm \"]"));
      WebElement fillEmailField = driver.findElement(By.xpath("//input[@class=\"labeledtext\"]"));
      enterValue(driver,fillEmailField,3,"abd@yahoo.com");
      clickEvent(driver,clickFreeTrial,2);
    }
}
