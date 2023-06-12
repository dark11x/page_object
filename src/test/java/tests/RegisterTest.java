package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.RegisterPage;

public class RegisterTest extends BaseTest{

    private RegisterPage registerPage;
    private final static String BASE_URL = "https://demowebshop.tricentis.com";

    @BeforeEach
    public void initPages(){
        registerPage = new RegisterPage();
        MainPage mainPage = new MainPage(BASE_URL);
        mainPage.goToRegistration();
    }

    @Test
    public void successRegistration(){
        boolean isRegSuccess = registerPage.selectGender("male")
                .fillFirstName("Anton1")
                .fillLastName("Cursed6")
                .fillEmail("cu1r1219@gmail.com")
                .fillPassword("m3VWwA1")
                .fillConfirmPassword("m3VWwA1")
                .clickRegisterButton()
                .isRegistrationCompleted();
        Assertions.assertTrue(isRegSuccess, "Registration failed");
    }

    @Test
    public void unsuccessfulRegistration(){
        boolean isRegSuccess = registerPage.selectGender("female")
                .fillFirstName("Anton1")
                .fillLastName("Cursed6")
                .fillEmail("cur221@gmail.com")
                .fillPassword("m3")
                .fillConfirmPassword("m3")
                .clickRegisterButton()
                .isRegistrationCompleted();
        Assertions.assertFalse(isRegSuccess, "Registration success");
    }
}
