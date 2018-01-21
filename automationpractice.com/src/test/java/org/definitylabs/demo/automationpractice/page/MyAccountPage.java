package org.definitylabs.demo.automationpractice.page;

import org.definitylabs.demo.automationpractice.page.partial.Page;
import org.definitylabs.demo.automationpractice.page.partial.WithMenu;
import org.definitylabs.demo.automationpractice.page.partial.WithTitle;

public interface MyAccountPage extends Page, WithTitle, WithMenu {

    static Class<MyAccountPage> myAccount() {
        return MyAccountPage.class;
    }

}
