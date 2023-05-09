
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebElement;
        import org.testng.Assert;
        import org.testng.annotations.Test;

public class Homework17 extends BaseTest {

    @Test
    public void addSongToPlaylist() throws InterruptedException {

        String playlistName = "Gupta";

        navigateToPage();
        provideEmail("prachi.gupta01@testpro.io");
        providePassword("te$t$tudent1");
        clickSubmit();
        Thread.sleep(2000);

        WebElement search = driver.findElement(By.cssSelector("[type = 'search']"));
        //search.sendKeys(new CharSequence[]{"Pluto"});//just the "Pluto" should do
        search.sendKeys("Pluto");
        Thread.sleep(2000);//removed extra 'L' character in thread.sleep value

        WebElement viewAll = driver.findElement(By.cssSelector("div.results h1 > button"));
        viewAll.click();
        Thread.sleep(2000);

        WebElement firstSong = driver.findElement(By.cssSelector("section#songResultsWrapper td.title"));
        firstSong.click();

        WebElement addToButton = driver.findElement(By.cssSelector(".btn-add-to"));
        addToButton.click();
        Thread.sleep(2000);

        WebElement playlist = driver.findElement(By.xpath("//section[@id='songResultsWrapper']//li[contains(text(),'Gupta')]"));
        System.out.println("check result 1" + playlist);
        playlist.click();
        System.out.println("check result 2" + playlist);

        WebElement notif = driver.findElement(By.cssSelector("div.success.show"));
        Assert.assertEquals(notif.getText(), "Added 1 song into \"Gupta.\"");
        System.out.println("check result 3" + playlist);

    }
}