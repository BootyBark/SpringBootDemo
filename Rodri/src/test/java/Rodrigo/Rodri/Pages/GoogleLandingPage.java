package Rodrigo.Rodri.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class GoogleLandingPage {
    @Autowired
    private WebDriver driver;

    @PostConstruct
    public void initGoogleLandingPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="hplogo")
    public WebElement googleLogo;
}
