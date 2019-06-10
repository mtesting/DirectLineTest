package steps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DirectLineTest {

    WebDriver driver;
    Page_Factory myWebelements = new Page_Factory(driver);

    public DirectLineTest(){
        DriverFactory chrome = new DriverFactory();
        chrome.chromebrowser();
    }

    /** launch the Portal*/
    public void launchPortal(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://covercheck.vwfsinsuranceportal.co.uk/");
    }

    /**Enter the vehicle number
     * @param regNum
     */
    public void enterRegNmber(String regNum){
        myWebelements.txtBoxEnterRegNumber.sendKeys(regNum);
    }

    public void findVehicle(){
        myWebelements.btnFindVehicle.click();
    }
}
