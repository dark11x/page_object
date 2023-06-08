package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

/**
 * Страница регистрации https://demowebshop.tricentis.com/register
 */

public class RegisterPage {

    private final SelenideElement genderMale = Selenide.$("#gender-male");
    private final SelenideElement genderFemale = Selenide.$("#gender-female");
    private final SelenideElement firstNameField = Selenide.$("#FirstName");
    private final SelenideElement lastNameField = Selenide.$("#LastName");
    private final SelenideElement emailField = Selenide.$("#Email");

    private final SelenideElement passwordField = Selenide.$("#Password");
    private final SelenideElement confirmPasswordField = Selenide.$("#ConfirmPassword");

    private final SelenideElement registerButton = Selenide.$("#register-button");
    private final SelenideElement registrationResult = Selenide.$(By.xpath("//div[@class='result']"));

    public RegisterPage selectGender(String gender){
        switch (gender) {
            case "male":
                genderMale.click();
                break;
            case "female":
                genderFemale.click();
                break;
            default:
                throw new IllegalArgumentException("Incorrect gender: " + gender);
        }
        return this;
    }

    public RegisterPage fillFirstName(String firstName){
        firstNameField.setValue(firstName);
        return this;
    }

    public RegisterPage fillLastName(String lastName){
        lastNameField.sendKeys(lastName);
        return this;
    }

    public RegisterPage fillEmail(String email){
        emailField.sendKeys(email);
        return this;
    }

    public RegisterPage fillPassword(String password){
        passwordField.sendKeys(password);
        return this;
    }

    public RegisterPage fillConfirmPassword(String confirmPassword){
        confirmPasswordField.sendKeys(confirmPassword);
        return this;
    }

    public RegisterPage clickRegisterButton(){
        registerButton.click();
        return this;
    }

    public boolean isRegistrationCompleted() {
        return registrationResult.getText().equals("Your registration completed");
   }
}