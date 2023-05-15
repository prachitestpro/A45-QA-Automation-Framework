import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework18 extends BaseTest {
    @Test
    public void playSongTest() throws InterruptedException {
        navigateToPage();
        provideEmail("prachi.gupta01@testpro.io");
        providePassword("te$t$tudent1");
        System.out.println("playSongTest: check 0");
        clickSubmit();
        System.out.println("playSongTest: check 1");
        playSong();
        System.out.println("playSongTest: check 2");
        Assert.assertTrue(isSongPlaying());
        System.out.println("playSongTest: check 3");
    }

public void playSong() {

    WebElement playBtn = driver.findElement(By.cssSelector("[data-testid='play-btn']"));

    WebElement playNextSongBtn = driver.findElement(By.cssSelector("[data-testid='play-next-btn']"));

    playNextSongBtn.click();

    playBtn.click();

}

    public boolean isSongPlaying() {

    WebElement soundBarPlay = driver.findElement(By.cssSelector("[data-testid='toggle-visualizer-btn']"));
        Assert.assertTrue(soundBarPlay.isDisplayed());
return soundBarPlay.isDisplayed();
    }
}
