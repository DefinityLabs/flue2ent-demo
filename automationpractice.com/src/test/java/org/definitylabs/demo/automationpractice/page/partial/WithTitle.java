package org.definitylabs.demo.automationpractice.page.partial;

import org.definitylabs.flue2ent.element.FindElementBy;

public interface WithTitle {

    @FindElementBy(className = "page-heading")
    String title();

}
