package org.definitylabs.flue2ent.demo.page.partial;

import org.definitylabs.flue2ent.demo.element.Summary;
import org.definitylabs.flue2ent.element.FindElementBy;

public interface WithSummary {

    @FindElementBy(className = "summary")
    Summary summary();

}
