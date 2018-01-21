package org.definitylabs.demo.automationpractice.element;

import org.definitylabs.flue2ent.element.FindElementBy;
import org.definitylabs.flue2ent.element.WebElementWrapper;
import org.definitylabs.flue2ent.element.simple.SimpleWebElementDecorator;

public interface NavigationBar extends SimpleWebElementDecorator {

    @FindElementBy(linkText = "Sign in")
    WebElementWrapper signIn();

    @FindElementBy(linkText = "Sign out")
    WebElementWrapper signOut();

}
