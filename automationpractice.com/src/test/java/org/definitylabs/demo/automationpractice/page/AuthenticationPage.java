package org.definitylabs.demo.automationpractice.page;

import org.definitylabs.demo.automationpractice.element.CreateAccount;
import org.definitylabs.demo.automationpractice.element.Login;
import org.definitylabs.demo.automationpractice.page.partial.Page;
import org.definitylabs.demo.automationpractice.page.partial.WithMenu;
import org.definitylabs.demo.automationpractice.page.partial.WithTitle;
import org.definitylabs.flue2ent.element.FindElementBy;

public interface AuthenticationPage extends Page, WithTitle, WithMenu {

    static Class<AuthenticationPage> authentication() {
        return AuthenticationPage.class;
    }

    @FindElementBy(css = "#center_column .row > div:nth-child(1)")
    CreateAccount createAccount();

    @FindElementBy(css = "#center_column .row > div:nth-child(2)")
    Login login();

}
