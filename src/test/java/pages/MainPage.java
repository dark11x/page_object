package pages;

import com.codeborne.selenide.Selenide;

/**
 * Главная страница сайта demowebshop.tricentis.com
 */

public class MainPage {

    public MainPage(String url){
        Selenide.open(url);
    }
}
