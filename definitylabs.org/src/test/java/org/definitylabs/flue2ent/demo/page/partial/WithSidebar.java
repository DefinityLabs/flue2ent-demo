package org.definitylabs.flue2ent.demo.page.partial;

import org.definitylabs.flue2ent.demo.element.Sidebar;
import org.definitylabs.flue2ent.element.FindElementBy;

public interface WithSidebar {

    @FindElementBy(className = "sidebar")
    Sidebar sidebar();

}
