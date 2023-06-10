import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework21 extends BaseTest {
    String newPlaylistName = "Gupta1";
    @Test
    public void renamePlaylist(){
        provideEmail("prachi.gupta01@testpro.io");
        providePassword("te$t$tudent1");
        clickSubmit();
        doubleClickPlaylist();
        enterNewPlaylistName();
        Assert.assertTrue(doesPlaylistExists());
    }
    public void doubleClickPlaylist(){
        WebElement playlistElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".playlist:nth-child(3)")));
        actions.doubleClick(playlistElement).perform();
    }
    public void enterNewPlaylistName(){
        WebElement playlistInputFiled =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name='name']")));
        playlistInputFiled.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.BACK_SPACE));
        playlistInputFiled.sendKeys(newPlaylistName);
        playlistInputFiled.sendKeys(Keys.ENTER);
    }
    public Boolean doesPlaylistExists() {
        WebElement playlistElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text() = '"+newPlaylistName+"']")));
        return playlistElement.isDisplayed();
    }
}
