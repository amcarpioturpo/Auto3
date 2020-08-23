package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.sleep;

public class HomePage extends BasePage{

    //private WebDriver driver;
    private By goToCart = By.id("gh-cart-n");
    private By categoryMenuLocator = By.className("hl-cat-nav__container"); // xpath: //ul[contains(@class,'hl-cat-nav')]
    private String hardCodedPageTitle = "Artículos electrónicos, autos, ropa, objetos de colección, cupones y más | eBay";

    public HomePage(WebDriver driver){
        super(driver);
    }

    public boolean checkPageTitleIsDisplayed() throws Exception {
        return this.getTitle().equals(hardCodedPageTitle);
    }

    public void hoverCategoryClickSubcategory(String categoryName, String subcategoryName) throws Exception {
        WebElement categoryMenu = getElement(categoryMenuLocator);
        Actions actions = getAction();
        actions.moveToElement(findWebElementWithText(categoryMenu, categoryName)).perform();
        // categoryMenu.findElement(By.linkText(categoryName))).perform();
        //WebElement subCategoryNameInList = categoryMenu.findElement(By.linkText(subcategoryName));

        WebDriverWait wait = getWait();
        sleep(1000);
        WebElement subCategoryNameInList = findWebElementWithText(categoryMenu, subcategoryName);
        wait.until(ExpectedConditions.visibilityOf(subCategoryNameInList)); // cambiar por explicit wait de 4 segs o algo
        actions.moveToElement(subCategoryNameInList).click().perform();
    }

}
