package utilites;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility extends BaseTest {

    public void clickOnElement(By by){

        driver.findElement(by).click();
    }

    public String getTextFromElement(By by){

        return driver.findElement(by).getText();
    }

    public void sendTextToElement(By by, String text){

        driver.findElement(by).sendKeys(text);
    }

    public void selectByVisibleTextFromDropDown(By by, String text){
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByVisibleText(text);
    }

    public void selectByValueFromDropDown(By by, String value){
        new Select(driver.findElement(by)).selectByValue(value);
    }
    public void selectByIndex(By by, int num) {
        WebElement index = driver.findElement(by);
        Select select = new Select(index);
        select.selectByIndex(num);
    }

    //************************* Alert Methods *****************************************************

    /*
    This method will switch driver to any popup alert
     */
    public void switchToAlert() {

        driver.switchTo().alert();
    }

    /*
    This method will tell driver to accept any popup alert
     */
    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    /*
    This method will tell driver to dismiss any popup alert
     */
    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }

    /*
    This method will send text to any popup alert
     */
    public void sendTextToAlert(By by, String text) {

        driver.switchTo().alert().sendKeys(text);
    }

    /*
    This method will get text from any popup alert
     */
    public String getTextFromAlert(By by) {
        return driver.switchTo().alert().getText();
    }

    /*
    This method will mouse hover over any element
     */

    public void mouseHoverOnElement(By by) throws InterruptedException {
        WebElement element = driver.findElement(by);
        Thread.sleep(1000);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }

    /*
    This method will mouse hover over any element and click on it
     */
    public void mouseHoverAndClickOnElement(By by) {
        Actions actions = new Actions(driver);
        WebElement text1 = driver.findElement(by);
        actions.moveToElement(text1).click().build().perform();
    }
    /*
     * This method will element verify text
     */
    public void verifyText(By by, String expectedText) {
        String actualText = driver.findElement(by).getText();
        Assert.assertEquals("Not match text", expectedText, actualText);
    }
}





