import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collection;

public class Homework19 extends BaseTest {
    @Test
    public void deletePlaylist() throws InterruptedException {

        provideEmail("prachi.gupta01@testpro.io");
        providePassword("te$t$tudent1");
        clickSubmit();

            WebElement playlist = driver.findElement(By.cssSelector(".playlist:nth-child(4)"));
            playlist.click();
        Thread.sleep(2000);

            WebElement deletePlaylistBtn = driver.findElement(By.cssSelector(".btn-delete-playlist"));
            deletePlaylistBtn.click();

            WebElement okBtn = driver.findElement(By.cssSelector(".ok"));
            okBtn.click();
        Thread.sleep(2000);

            WebElement notifMsg = driver.findElement(By.cssSelector("div.success.show"));
            Assert.assertTrue(notifMsg.isDisplayed());
        Thread.sleep(2000);

    }


}
