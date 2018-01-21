package org.definitylabs.demo.automationpractice.page.partial;

import org.definitylabs.demo.automationpractice.element.Menu;
import org.definitylabs.flue2ent.element.FindElementBy;

public interface WithMenu {

    @FindElementBy(className = "sf-menu")
    Menu menu();

}
