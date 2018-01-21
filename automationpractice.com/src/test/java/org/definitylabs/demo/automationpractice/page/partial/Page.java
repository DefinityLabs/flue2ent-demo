package org.definitylabs.demo.automationpractice.page.partial;

import org.definitylabs.demo.automationpractice.element.NavigationBar;
import org.definitylabs.flue2ent.element.FindElementBy;

public interface Page {

    @FindElementBy(tagName = "nav")
    NavigationBar navigationBar();

}
