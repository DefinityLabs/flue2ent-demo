package org.definitylabs.flue2ent.demo.element;

import org.definitylabs.flue2ent.element.FindElementBy;
import org.definitylabs.flue2ent.element.simple.SimpleWebElementDecorator;

import java.util.List;

public interface Content extends SimpleWebElementDecorator {

    @FindElementBy(tagName = "h2")
    String title();

    @FindElementBy(tagName = "div")
    String text();

    @FindElementBy(tagName = "pre")
    List<String> codeBlocks();

}
