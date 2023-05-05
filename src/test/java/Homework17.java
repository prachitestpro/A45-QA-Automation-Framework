import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework17 extends BaseTest {

    @Test
    public void addSongToPlaylist() throws InterruptedException {

       // String newSongAddedNotificationText = "Added 1 Song into";

        navigateToPage();
        provideEmail("demo@class.com");
        providePassword("te$t$tudent");
        clickSubmit();
        Thread.sleep(2000);
       // System.out.println("abc1");
       // searchSong(songTitleKeyword:"Pluto");
       // clickViewAllBtn();
       // selectFirstSongResult();
       // clickAddToBtn();
       // choosePlaylist();
        //Assert.assertTrue(getNotificationText().contains(newSongAddedNotificationText));
       // System.out.println("abc2");

       WebElement search = driver.findElement(By.cssSelector("[type = 'search']"));
       search.sendKeys("Pluto");
        Thread.sleep(2000);
       // System.out.println("abc3");
       WebElement viewAll = driver.findElement(By.cssSelector("div.results h1 > button"));
       viewAll.click();
       Thread.sleep(2000);
       




    }

}




