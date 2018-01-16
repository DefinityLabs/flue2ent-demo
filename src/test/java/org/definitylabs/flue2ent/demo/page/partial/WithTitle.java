package org.definitylabs.flue2ent.demo.page.partial;

import org.definitylabs.flue2ent.demo.element.PageTitle;
import org.definitylabs.flue2ent.element.FindElementBy;

public interface WithTitle {

    @FindElementBy(className = "title")
    PageTitle pageTitle();

}
