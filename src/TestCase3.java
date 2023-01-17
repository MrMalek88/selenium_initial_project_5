import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;

public class TestCase3 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://automationexercise.com/");

        if(driver.findElement(By.cssSelector("div[class='single-widget'] > h2")).isDisplayed()) System.out.println("1st Validation PASSED!");
        else System.out.println("Validation FAILED!");

        if(driver.findElement(By.cssSelector("input[placeholder]")).isDisplayed()) System.out.println("2nd Validation PASSED!");
        else System.out.println("2nd Validation FAILED!");

        if(driver.findElement(By.id("subscribe")).isDisplayed()) System.out.println("Subscribe button Validation PASSED!");
        else System.out.println("3rd Validation FAILED!");

        if(driver.findElement(By.cssSelector("form[class='searchform'] > p"))
                .getText().equals("Get the most recent updates from\n" + "our site and be updated your self...")) System.out.println("Last Validation passed");
        else System.out.println("Last validation failed");

        driver.quit();



    }
}
