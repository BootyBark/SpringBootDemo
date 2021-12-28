package Rodrigo.Rodri.Tests;

import Rodrigo.Rodri.Pages.GoogleLandingPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class InitialTests extends BaseTest {
    @Autowired
    private GoogleLandingPage googleLandingPage;

    @Test
    void contextLoads() {
        Assertions.assertTrue(googleLandingPage.googleLogo.isDisplayed());
    }

    @Test
    void contextLoads2() {
        Assertions.assertTrue(googleLandingPage.googleLogo.isDisplayed());
    }

    @Test
    void contextLoads4() {
        Assertions.assertTrue(googleLandingPage.googleLogo.isDisplayed());
    }

    @Test
    void contextLoads3() {
        Assertions.assertTrue(googleLandingPage.googleLogo.isDisplayed());
    }

}
