import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestNgDemo {
//This Test method will be called at last , because we had specified dependsOnMethods
    @Test(priority = 1,dependsOnMethods = "displayFacebook")
    public void displayGoogle(){

        WebDriver driver=new FirefoxDriver();
        driver.get("http://www.google.com");
        driver.quit();
    }
    @Test(priority = 2,invocationCount = 2)
    public void displayFacebook(){

        WebDriver driver=new FirefoxDriver();
        driver.get("http://www.facebook.com");
        driver.quit();
    }
// if we set enable = false , the test will not work
    @Test(priority = 3)
    public void displayJwl(){
        WebDriver driver=new FirefoxDriver();
        driver.get("/get.html");
        driver.quit();
    }

}
