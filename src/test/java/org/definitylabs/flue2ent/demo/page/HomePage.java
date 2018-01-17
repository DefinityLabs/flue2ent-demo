package org.definitylabs.flue2ent.demo.page;

import org.definitylabs.flue2ent.demo.element.Card;
import org.definitylabs.flue2ent.demo.page.partial.Page;
import org.definitylabs.flue2ent.element.FindElementBy;

import java.util.List;

public interface HomePage extends Page {

    static Class<HomePage> home() {
        return HomePage.class;
    }

    @FindElementBy(className = "card")
    List<Card> cards();

}
