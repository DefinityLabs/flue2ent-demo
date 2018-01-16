package org.definitylabs.flue2ent.demo.element;

import org.definitylabs.flue2ent.element.FindElementBy;
import org.definitylabs.flue2ent.element.WebElementWrapper;
import org.definitylabs.flue2ent.element.simple.SimpleWebElementDecorator;

public interface PageHeader extends SimpleWebElementDecorator {

    @FindElementBy(linkText = "Products")
    WebElementWrapper products();

    @FindElementBy(linkText = "About Us")
    WebElementWrapper aboutUs();

    @FindElementBy(linkText = "Contributors")
    WebElementWrapper contributors();

    @FindElementBy(linkText = "Content")
    WebElementWrapper content();

}
