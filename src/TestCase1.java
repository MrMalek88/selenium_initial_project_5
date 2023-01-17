import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class TestCase1 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://automationexercise.com/");

        WebElement logo = driver.findElement(By.cssSelector("img[alt='Website for automation practice']"));
        if(logo.isDisplayed()) System.out.println("Logo validation passed!");
        else System.out.println("Logo validation failed!");

    }
}
