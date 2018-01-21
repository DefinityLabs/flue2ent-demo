package org.definitylabs.demo.automationpractice.element;

import org.definitylabs.flue2ent.element.FindElementBy;
import org.definitylabs.flue2ent.element.simple.SimpleWebElementDecorator;

import java.util.List;

public interface Alerts extends SimpleWebElementDecorator {

    @FindElementBy(tagName = "li")
    List<String> items();

    default boolean isDisplayed() {
        return webElement().isDisplayed();
    }

}
