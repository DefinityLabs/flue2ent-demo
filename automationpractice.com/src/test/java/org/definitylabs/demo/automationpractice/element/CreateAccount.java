package org.definitylabs.demo.automationpractice.element;

import org.definitylabs.flue2ent.element.FindElementBy;
import org.definitylabs.flue2ent.element.WebElementWrapper;
import org.definitylabs.flue2ent.element.simple.SimpleWebElementDecorator;

public interface CreateAccount extends SimpleWebElementDecorator {

    @FindElementBy(className = "alert")
    Alerts alerts();

    @FindElementBy(label = "Email address")
    WebElementWrapper email();

    @FindElementBy(css = ".submit button")
    WebElementWrapper createAccount();

}
