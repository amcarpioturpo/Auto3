package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {

    private WebDriver driver;
    private String carrouselButtonIdentifier = "s0-26-9-0-1[0]-0-0-xCarousel-next";

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void click(By element) throws Exception {
        try{
            driver.findElement(element).click();
        } catch (Exception e){
            throw new Exception("No se pudo hacer click sobre el elemento: " + element);
        }
    }

    public WebElement getElement(By element) throws Exception {
        try{
            return driver.findElement(element);
        } catch (Exception e){
            throw new Exception("No se pudo encontrar el elemento: " + element);
        }
    }

    public List<WebElement> getElements(By desiredLocator) throws Exception {
        try{
            return driver.findElements(desiredLocator);
        } catch (Exception e){
            throw new Exception("No se pudo encontrar los elementos: " + desiredLocator);
        }
    }

    public void clickOnCarrouselItem(List<WebElement> nameOfElementsOnList, String desiredString) throws Exception {
        for (int i = 0; i < nameOfElementsOnList.size(); i++){
            String test = nameOfElementsOnList.get(i).getText();
            if (desiredString.equals(test)){
                WebElement elementWeWantToClick = nameOfElementsOnList.get(i);
                while (!elementWeWantToClick.isDisplayed()){
                    driver.findElement(By.id(carrouselButtonIdentifier)).click();
                }
                elementWeWantToClick.click();
                break;
            }
        }
    }


    public WebElement findWebElementWithText(WebElement element, String textInLink) throws Exception {
        try{
            return element.findElement(By.linkText(textInLink));
        } catch (Exception e){
            throw new Exception("No se pudo encontrar el elemento: " + element + "con el texto: " + textInLink);
        }
    }

    public Actions getAction() throws Exception {
        try{
            return new Actions(driver);
        } catch (Exception e){
            throw new Exception("No se pudo insertar la Accion");
        }
    }



    public WebDriverWait getWait() throws Exception {
        try{
            return new WebDriverWait(driver,4);
        } catch (Exception e){
            throw new Exception("No se pudo insertar el Wait");
        }
    }

    public String getText(By element) throws Exception {
        try{
            return driver.findElement(element).getText();
        } catch (Exception e){
            throw new Exception("No se pudo obtener el texto del elemento: " + element);
        }
    }

    public String getTitle() throws Exception {
        try{
            return driver.getTitle();
        } catch (Exception e){
            throw new Exception("No se pudo obtener el titulo del driver");
        }
    }

}
