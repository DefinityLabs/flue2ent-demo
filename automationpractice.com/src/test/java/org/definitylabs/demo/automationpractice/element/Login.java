package org.definitylabs.demo.automationpractice.element;

import org.definitylabs.flue2ent.element.FindElementBy;
import org.definitylabs.flue2ent.element.WebElementWrapper;
import org.definitylabs.flue2ent.element.simple.SimpleWebElementDecorator;

public interface Login extends SimpleWebElementDecorator {

    @FindElementBy(id = "email")
    WebElementWrapper email();

    @FindElementBy(label = "Password")
    WebElementWrapper password();

    @FindElementBy(css = ".submit button")
    WebElementWrapper signIn();

}
