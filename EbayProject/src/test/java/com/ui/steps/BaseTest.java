package com.ui.steps;

import org.openqa.selenium.WebDriver;
import pages.CollectibleAnimationArtCharactersPage;
import pages.CollectibleJapaneseAnimeItemsPage;
import pages.CollectiblePokemonAnimeItemsPage;
import pages.HomePage;

public class BaseTest {

    protected WebDriver driver = Hooks.getDriver();
    protected HomePage homePage = new HomePage(driver);
    protected CollectibleAnimationArtCharactersPage collectibleAnimationArtCharactersPage =
            new CollectibleAnimationArtCharactersPage(driver);
    protected CollectibleJapaneseAnimeItemsPage collectibleJapaneseAnimeItemsPage =
            new CollectibleJapaneseAnimeItemsPage(driver);
    protected CollectiblePokemonAnimeItemsPage collectiblePokemonAnimeItemsPage =
            new CollectiblePokemonAnimeItemsPage(driver);
}
