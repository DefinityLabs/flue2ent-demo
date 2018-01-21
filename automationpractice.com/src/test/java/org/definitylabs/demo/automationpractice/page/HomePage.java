package org.definitylabs.demo.automationpractice.page;

import org.definitylabs.demo.automationpractice.page.partial.Page;

public interface HomePage extends Page {

    static Class<HomePage> home() {
        return HomePage.class;
    }

}
