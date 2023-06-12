package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

/**
 * Главная страница сайта demowebshop.tricentis.com
 */

public class MainPage {

    private final SelenideElement registrationPage = Selenide.$(By.xpath("//a[@href='/register']"));


    public MainPage(String url){
        Selenide.open(url);
    }
    public void goToRegistration(){
        registrationPage.click();
    }
}
