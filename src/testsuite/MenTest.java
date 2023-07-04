import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilites.Utility;


public class MenTest extends Utility {
    String baseurl = "https://magento.softwaretestingboard.com/";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }


    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart() throws InterruptedException {
        //Mouse Hover on Men Menu
        mouseHoverOnElement(By.linkText("Men"));
        Thread.sleep(500);
        //Mouse Hover on Bottoms
        mouseHoverOnElement(By.linkText("Bottoms"));
        Thread.sleep(500);
        //Click on Pants
        mouseHoverAndClickOnElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[3]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]"));
        Thread.sleep(500);
        //Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size 32.
        mouseHoverOnElement(By.xpath("//a[contains(text(),'Cronus Yoga Pant')]"));
        Thread.sleep(500);
        mouseHoverAndClickOnElement(By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]"));
        Thread.sleep(500);
        //Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black.
        mouseHoverAndClickOnElement(By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']"));
        Thread.sleep(500);
        //Mouse Hover on product name ‘Cronus Yoga Pant’ and click on ‘Add To Cart’ Button.
        clickOnElement(By.xpath("//li[1]//div[1]//div[1]//div[3]//div[1]//div[1]//form[1]//button[1]//span[1]"));
        Thread.sleep(500);
        //Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’verifyAddedCartMessage();
        verifyText(By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']"),
                "You added Cronus Yoga Pant to your shopping cart.");
        Thread.sleep(500);
        //Click on ‘shopping cart’ Link into message
        clickOnElement(By.xpath("//a[normalize-space()='shopping cart']"));
        Thread.sleep(500);
        //Verify the text ‘Shopping Cart.’
        verifyText(By.xpath("//span[@class='base']"), "Shopping Cart");
        Thread.sleep(500);
        // Verify the product name ‘Cronus Yoga Pant’
        verifyText(By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']"),
                "Cronus Yoga Pant");
        Thread.sleep(500);
        //Verify the product size ‘32’
        verifyText(By.xpath("//dd[contains(text(),'32')]"), "32");
        Thread.sleep(500);
        //Verify the product colour ‘Black’
        verifyText(By.xpath("//dd[contains(text(),'Black')]"), "Black");
        Thread.sleep(500);
    }


    @After
    public void tearDown() {
        closeBrowser();
    }

}
