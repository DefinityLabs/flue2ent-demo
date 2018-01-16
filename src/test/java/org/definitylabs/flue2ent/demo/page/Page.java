package org.definitylabs.flue2ent.demo.page;

import org.definitylabs.flue2ent.demo.element.PageFooter;
import org.definitylabs.flue2ent.demo.element.PageHeader;
import org.definitylabs.flue2ent.element.FindElementBy;

public interface Page {

    @FindElementBy(tagName = "nav")
    PageHeader header();

    @FindElementBy(tagName = "footer")
    PageFooter footer();

}
