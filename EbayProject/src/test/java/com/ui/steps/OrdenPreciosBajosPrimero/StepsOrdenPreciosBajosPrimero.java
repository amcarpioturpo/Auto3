package com.ui.steps.OrdenPreciosBajosPrimero;

import com.ui.steps.BaseTest;
import com.ui.steps.Hooks;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class StepsOrdenPreciosBajosPrimero extends BaseTest {

    @Given("Ingreso a la web ebay.com")
    public void ingresoALaWebEbayCom() throws Exception {
        Assert.assertTrue("El título de la página no concuerda con el registro.",
                homePage.checkPageTitleIsDisplayed());
    }

    @When("Selecciono la Categoria {string} y SubCategoria {string}")
    public void seleccionoLaCategoriaYSubCategoria(String category, String subCategory) throws Exception {
        homePage.hoverCategoryClickSubcategory(category, subCategory);
    }

    @And("Selecciono del Carrusel la categoría {string}")
    public void seleccionoDelCarruselLaCategoría(String nombreDeCategoria) throws Exception {
        collectibleAnimationArtCharactersPage.clickOnCarrouselCategory(nombreDeCategoria);
    }

    @And("Selecciono del segundo Carrusel la categoría {string}")
    public void seleccionoDelSegundoCarruselLaCategoría(String nombreDeCategoria) throws Exception {
        collectibleJapaneseAnimeItemsPage.clickOnCarrouselCategory(nombreDeCategoria);
    }


    @And("Selecciono la opción PRECIO + ENVÍO: MÁS BAJO PRIMERO")
    public void seleccionoLaOpciónPRECIOENVÍOMÁSBAJOPRIMERO() throws Exception {
        collectiblePokemonAnimeItemsPage.hoverOrderButtonBoxClickLowestFirst();

        collectiblePokemonAnimeItemsPage.getListOfPricesForAllTheProducts();
    }
}
