package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.RegisterPage;

public class RegisterTest extends BaseTest{

    private RegisterPage registerPage;
    private MainPage mainPage;
    private final static String BASE_URL = "https://demowebshop.tricentis.com/register";

    @BeforeEach
    public void initPages(){
        registerPage = new RegisterPage();
        mainPage = new MainPage(BASE_URL);
    }

    @Test
    public void successRegistration(){
        boolean isRegSuccess = registerPage.selectGender("male")
                .fillFirstName("Anton1")
                .fillLastName("Cursed6")
                .fillEmail("cur221@gmail.com")
                .fillPassword("m3VWwA1")
                .fillConfirmPassword("m3VWwA1")
                .clickRegisterButton()
                .isRegistrationCompleted();
        Assertions.assertTrue(isRegSuccess);
    }
}
