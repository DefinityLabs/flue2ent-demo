package org.definitylabs.demo.automationpractice;

import org.definitylabs.demo.automationpractice.element.CreateAccount;
import org.definitylabs.demo.automationpractice.element.Login;
import org.definitylabs.demo.automationpractice.page.AuthenticationPage;
import org.definitylabs.demo.automationpractice.page.MyAccountPage;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;
import static org.definitylabs.demo.automationpractice.page.AuthenticationPage.authentication;
import static org.definitylabs.demo.automationpractice.page.HomePage.home;
import static org.definitylabs.demo.automationpractice.page.MyAccountPage.myAccount;

public class WebsiteTest extends AbstractWebsiteTest {

    @Test
    public void createAccount() {
        website.at(home()).navigationBar().signIn().click();

        AuthenticationPage authenticationPage = website.at(authentication());

        assertThat(authenticationPage.title()).isEqualTo("AUTHENTICATION");

        CreateAccount createAccount = authenticationPage.createAccount();
        createAccount.email().enter("david.sobreira.gouvea@gmail.com");
        createAccount.createAccount().click();
        website.justWait().upTo(2, TimeUnit.SECONDS).until(() -> createAccount.alerts().isDisplayed());
        assertThat(createAccount.alerts().items()).hasSize(1);
        assertThat(createAccount.alerts().items().get(0)).contains("has already been registered");

        Login login = authenticationPage.login();
        login.email().enter("david.sobreira.gouvea@gmail.com");
        login.password().enter("test123");
        login.signIn().click();

        MyAccountPage myAccountPage = website.at(myAccount());
        assertThat(myAccountPage.title()).isEqualTo("MY ACCOUNT");

        website.at(home()).navigationBar().signOut().click();

        assertThat(authenticationPage.title()).isEqualTo("AUTHENTICATION");

        website.mouse().moveTo(authenticationPage.menu().dresses().link());
        website.justWait().until(() -> myAccountPage.menu().dresses().menu().isDisplayed());

        myAccountPage.menu().dresses().menu().eveningDresses().link().click();
    }

}
