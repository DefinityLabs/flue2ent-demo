package org.definitylabs.flue2ent.demo.element;

import org.definitylabs.flue2ent.element.FindElementBy;
import org.definitylabs.flue2ent.element.simple.SimpleWebElementDecorator;

public interface Card extends SimpleWebElementDecorator {

    @FindElementBy(tagName = "h3")
    String title();

    @FindElementBy(tagName = "p")
    String text();

}
