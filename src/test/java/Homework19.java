import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collection;

public class Homework19 extends BaseTest {
    @Test
    public void deletePlaylist() throws InterruptedException {
      // String deletePlaylistMsg = "Deleted Playlist";

       // navigateToPage();
        provideEmail("prachi.gupta01@testpro.io");
        providePassword("te$t$tudent1");
        clickSubmit();
      //  openPlaylist();
      //  clickDeletePlaylistBtn();
       // Assert.assertTrue(getDeletedPlaylistMsg().contains(deletePlaylistMsg));
      //  System.out.println("step1");

      //  public void openPlaylist()
       // {
            WebElement playlist = driver.findElement(By.cssSelector(".playlist:nth-child(4)"));
            playlist.click();
        //}

        //System.out.println("step2");

       // public void clickDeletePlaylistBtn() throws InterruptedException
       // {
            WebElement deletePlaylistBtn = driver.findElement(By.cssSelector(".btn-delete-playlist"));
            deletePlaylistBtn.click();
       // System.out.println("step3");

            WebElement okBtn = driver.findElement(By.cssSelector(".ok"));
            okBtn.click();
       // System.out.println("step4");
       // }
        //public String getDeletedPlaylistMsg() {
            WebElement notifMsg = driver.findElement(By.cssSelector("div.success.show"));
            Assert.assertTrue(notifMsg.isDisplayed());
       // Assert.assertEquals(notification.getText(), "Deleted playlist");

        //System.out.println("step5");
    }


}
