package org.definitylabs.flue2ent.demo.element;

import org.definitylabs.flue2ent.element.FindElementBy;
import org.definitylabs.flue2ent.element.WebElementWrapper;
import org.definitylabs.flue2ent.element.simple.SimpleWebElementDecorator;

public interface Product extends SimpleWebElementDecorator {

    @FindElementBy(css = "h2 a")
    WebElementWrapper title();

    @FindElementBy(tagName = "p")
    String description();

    default void click() {
        title().click();
    }

}
