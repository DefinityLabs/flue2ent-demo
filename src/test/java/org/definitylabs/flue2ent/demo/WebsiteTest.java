package org.definitylabs.flue2ent.demo;

import org.junit.Test;

import static org.definitylabs.flue2ent.demo.page.HomePage.homePage;
import static org.definitylabs.flue2ent.demo.page.ProductPage.product;
import static org.definitylabs.flue2ent.demo.page.ProductsPage.products;
import static org.definitylabs.flue2ent.demo.page.ReferenceGuidePage.referenceGuide;

public class WebsiteTest extends AbstractWebsiteTest {

    @Test
    public void test() {
        website.at(homePage()).header().products().click();
        website.at(products()).product("aux4").title().click();
        website.at(product()).sidebar().item("User Guide").click();
        website.at(product()).referenceGuide().click();
        website.at(referenceGuide()).summary().item("Variables").click();
        website.at(referenceGuide()).summary().item("Help").click();
        website.at(referenceGuide()).content("Help").title();
    }

}
