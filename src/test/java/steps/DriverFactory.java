package steps;

public class DriverFactory {

        public void chromebrowser(){
               System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
        }
}
