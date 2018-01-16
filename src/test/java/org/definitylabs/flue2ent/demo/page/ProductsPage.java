package org.definitylabs.flue2ent.demo.page;

import org.definitylabs.flue2ent.demo.element.Product;
import org.definitylabs.flue2ent.demo.page.partial.WithTitle;
import org.definitylabs.flue2ent.element.FindElementBy;

import java.util.List;

public interface ProductsPage extends Page, WithTitle {

    static Class<ProductsPage> products() {
        return ProductsPage.class;
    }

    @FindElementBy(css = ".card")
    List<Product> list();

    default Product product(String title) {
        return list().stream()
                .filter(product -> product.title().text().equals(title))
                .findFirst().orElse(null);
    }

}
