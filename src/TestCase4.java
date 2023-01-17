import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;

public class TestCase4 {

    public static void main(String[] args) {


        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com/");

        if(driver.findElement(By.xpath("//p[@class='pull-left']")).isDisplayed()){
            System.out.println("copyright is VALIDATED");
        }
        else System.out.println("Copyright is NOT VALIDATED");

        Driver.quitDriver();
    }
}
