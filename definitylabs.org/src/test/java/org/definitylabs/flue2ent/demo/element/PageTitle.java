package org.definitylabs.flue2ent.demo.element;

import org.definitylabs.flue2ent.element.FindElementBy;
import org.definitylabs.flue2ent.element.simple.SimpleWebElementDecorator;

public interface PageTitle extends SimpleWebElementDecorator {

    @FindElementBy(tagName = "h1")
    String getTitle();

    default String title() {
        return getTitle().replace(subTitle(), "").trim();
    }

    @FindElementBy(css = "h1 small")
    String subTitle();

}
