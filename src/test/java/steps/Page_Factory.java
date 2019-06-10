package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Page_Factory {

    WebDriver driver;

    /** initializing the page elements
     * @param driver
     */

    public Page_Factory(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver , this);
    }

    @FindBy(id = "vehicleReg")
    WebElement txtBoxEnterRegNumber;
    @FindBy(name = "btnfind")
    WebElement btnFindVehicle;

    /**returns the text box to enter registration number
     * @return txtBoxEnterRegNumber text box
     */
    public WebElement getTextBoxEnterRegNumber(){
        return txtBoxEnterRegNumber;
    }

    /** returns the find vehicle button
     * @return btnFindVehicle button
     */
    public WebElement getBtnFindVehicle(){
        return btnFindVehicle;
    }

}
