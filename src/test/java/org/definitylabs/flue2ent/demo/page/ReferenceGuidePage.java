package org.definitylabs.flue2ent.demo.page;

import org.definitylabs.flue2ent.demo.page.partial.WithContent;
import org.definitylabs.flue2ent.demo.page.partial.WithSummary;
import org.definitylabs.flue2ent.demo.page.partial.WithTitle;

public interface ReferenceGuidePage extends Page, WithTitle, WithSummary, WithContent {

    static Class<ReferenceGuidePage> referenceGuide() {
        return ReferenceGuidePage.class;
    }

}
