package org.definitylabs.flue2ent.demo.element;

import org.definitylabs.flue2ent.element.FindElementBy;
import org.definitylabs.flue2ent.element.Param;
import org.definitylabs.flue2ent.element.WebElementWrapper;
import org.definitylabs.flue2ent.element.simple.SimpleWebElementDecorator;

import java.util.List;

public interface Sidebar extends SimpleWebElementDecorator {

    @FindElementBy(css = "li a")
    List<WebElementWrapper> items();

    @FindElementBy(partialLinkText = "{text}")
    WebElementWrapper item(@Param("text") String text);

}
