package org.definitylabs.flue2ent.demo.page;

import org.definitylabs.flue2ent.demo.page.partial.Page;
import org.definitylabs.flue2ent.demo.page.partial.WithContent;
import org.definitylabs.flue2ent.demo.page.partial.WithSidebar;
import org.definitylabs.flue2ent.demo.page.partial.WithTitle;
import org.definitylabs.flue2ent.element.FindElementBy;
import org.definitylabs.flue2ent.element.WebElementWrapper;

public interface ProductPage extends Page, WithTitle, WithSidebar, WithContent {

    static Class<ProductPage> product() {
        return ProductPage.class;
    }

    @FindElementBy(partialLinkText = "reference documentation")
    WebElementWrapper referenceGuide();

}
