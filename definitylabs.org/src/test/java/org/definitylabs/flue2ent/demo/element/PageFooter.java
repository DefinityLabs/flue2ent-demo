package org.definitylabs.flue2ent.demo.element;

import org.definitylabs.flue2ent.element.FindElementBy;
import org.definitylabs.flue2ent.element.WebElementWrapper;
import org.definitylabs.flue2ent.element.simple.SimpleWebElementDecorator;

public interface PageFooter extends SimpleWebElementDecorator {

    @FindElementBy(linkText = "About Us")
    WebElementWrapper aboutUs();

    @FindElementBy(linkText = "Contributors")
    WebElementWrapper contributors();

    @FindElementBy(linkText = "Content")
    WebElementWrapper content();

    @FindElementBy(className = "copyright")
    String copyright();

    @FindElementBy(className = "social")
    Social social();

    interface Social extends SimpleWebElementDecorator {

        @FindElementBy(css = "li:nth-child(1) a")
        WebElementWrapper github();

        @FindElementBy(css = "li:nth-child(2) a")
        WebElementWrapper twitter();

        @FindElementBy(css = "li:nth-child(3) a")
        WebElementWrapper medium();

    }


}
