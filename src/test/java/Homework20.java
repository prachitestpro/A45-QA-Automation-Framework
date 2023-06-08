import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework20 extends BaseTest {
    @Test
    public void deletePlaylist() throws InterruptedException {

        provideEmail("prachi.gupta01@testpro.io");
        providePassword("te$t$tudent1");
        clickSubmit();


       // WebElement playlist = driver.findElement(By.cssSelector(".playlist:nth-child(4)"));
        WebElement playlist = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".playlist:nth-child(4)")));
        ((WebElement) playlist).click();

       // WebElement deletePlaylistBtn = driver.findElement(By.cssSelector(".btn-delete-playlist"));
        WebElement deletePlaylistBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn-delete-playlist")));

        deletePlaylistBtn.click();
        // System.out.println("step3");

        //WebElement okBtn = driver.findElement(By.cssSelector(".ok"));
        WebElement okBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ok")));
        okBtn.click();
        // System.out.println("step4");

        //public String getDeletedPlaylistMsg() {
        //WebElement notifMsg = driver.findElement(By.cssSelector("div.success.show"));
        WebElement notifMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.success.show")));
        Assert.assertTrue(notifMsg.isDisplayed());
      }
    }






