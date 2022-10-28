package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Practice_TC07_Page {

    public Practice_TC07_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "(//*[.=' Test Cases'])[2]")
    public WebElement testCaseLink;

    @FindBy (xpath = "(//h2)[1]")
    public WebElement testCaseTitle;


}
