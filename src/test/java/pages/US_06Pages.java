package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_06Pages {
    public US_06Pages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[text()='Automation Exercise']")
    public WebElement automationExerciesTitle;

    @FindBy(xpath = "//*[text()=' Contact us']")
    public WebElement contactUsbutton;

    @FindBy(xpath = "(//h2[@class='title text-center'])[2]")
    public WebElement getInTouchTitle;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameBox;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@name='subject']")
    public WebElement subjectBox;

    @FindBy(xpath = "//textarea[@name='message']")
    public WebElement messageBox;

    @FindBy(xpath = "//input[@type='file']")
    public WebElement uploadFileButton;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//*[text()='Success! Your details have been submitted successfully.']")
    public WebElement successMessage;

    @FindBy(xpath = "(//*[text()=' Home'])[2]")
    public WebElement homeButton;
}
