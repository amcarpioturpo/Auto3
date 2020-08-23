package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static java.lang.Thread.sleep;

public class CollectiblePokemonAnimeItemsPage extends BasePage {

    private By orderButtonBoxLocator = By.xpath("//div[@id='s0-26_2-9-0-1[0]-0-1-6-5-35']/button");
    private By lowestFirstOptionLocator = By.xpath("//div[@id='s0-26_2-9-0-1[0]-0-1-6-5-35-7-45']//li[4]");
    private By productsInfoLocator = By.xpath("//div[contains(@class,'details clear')]");

    public CollectiblePokemonAnimeItemsPage(WebDriver driver){
        super(driver);
    }

    public void hoverOrderButtonBoxClickLowestFirst() throws Exception {
        WebDriverWait wait = getWait();
        wait.until(ExpectedConditions.presenceOfElementLocated(orderButtonBoxLocator));

        WebElement orderButtonBox = getElement(orderButtonBoxLocator);
        Actions actions = getAction();
        actions.moveToElement(orderButtonBox).perform();

        WebElement lowestFirstOption = getElement(lowestFirstOptionLocator);
        actions.moveToElement(lowestFirstOption).click().perform();
        sleep(500);
    }

    public void getListOfPricesForAllTheProducts() throws Exception {
        List<WebElement> productsInfo = getElements(productsInfoLocator);
        //crear array con suma de precio de producto con precio de envio, tamaño igual al array
        for (int i =0; i < productsInfo.size(); i++){
            WebElement product = productsInfo.get(i);
            //once the element is defined, get the values needed, then get the numeric values,
            //transform them to doubles, make addition, save the values in list created in 39

        }
        // with the array of prices ready, scan it, in order to verify its in ascending order.
        //IF its not, indicate WHERE is the problem, and print the problem




    }

}
