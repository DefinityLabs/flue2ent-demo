package org.definitylabs.flue2ent.demo.page.partial;

import org.definitylabs.flue2ent.demo.element.Content;
import org.definitylabs.flue2ent.element.FindElementBy;

import java.util.List;

public interface WithContent {

    @FindElementBy(className = "page-content")
    List<Content> contents();

    default Content content(String text) {
        return contents().stream()
                .filter(content -> content.title().contains(text))
                .findFirst().orElse(null);
    }

}
