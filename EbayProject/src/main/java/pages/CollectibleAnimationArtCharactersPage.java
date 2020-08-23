package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CollectibleAnimationArtCharactersPage extends BasePage {

    private By carrouselNames = By.xpath("//p[contains(@class,'title')]"); //id("s0-26-9-0-1[0]-0-0-xCarousel");

    public CollectibleAnimationArtCharactersPage(WebDriver driver){
        super(driver);
    }

    public void clickOnCarrouselCategory(String nameOfCategory) throws Exception {
        WebDriverWait wait = getWait();
        wait.until(ExpectedConditions.presenceOfElementLocated(carrouselNames));

        List<WebElement> elementsWithListOfNames = getElements(carrouselNames);
        clickOnCarrouselItem(elementsWithListOfNames, nameOfCategory);
    }
}
