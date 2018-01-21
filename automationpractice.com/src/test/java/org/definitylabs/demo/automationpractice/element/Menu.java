package org.definitylabs.demo.automationpractice.element;

import org.definitylabs.flue2ent.element.FindElementBy;
import org.definitylabs.flue2ent.element.WebElementWrapper;
import org.definitylabs.flue2ent.element.simple.SimpleWebElementDecorator;

import java.util.List;

public interface Menu extends SimpleWebElementDecorator {

    @FindElementBy(xpath = "./li")
    List<MenuItem> items();

    default MenuItem women() {
        return items().get(0);
    }

    default DressesMenuItem dresses() {
        return items().get(1).webElement().as(DressesMenuItem.class);
    }

    default MenuItem tShirts() {
        return items().get(2);
    }

    interface MenuItem extends SimpleWebElementDecorator {

        @FindElementBy(xpath = "./a")
        WebElementWrapper link();

        @FindElementBy(className = "submenu-container")
        SubMenu subMenu();

    }

    interface SubMenu extends Menu {

        default boolean isDisplayed() {
            return webElement().isDisplayed();
        }

    }

    interface DressesMenuItem extends MenuItem {

        default DressesMenu menu() {
            return subMenu().webElement().as(DressesMenu.class);
        }
    }

    interface DressesMenu extends SubMenu {

        default MenuItem causalDresses() {
            return items().get(0);
        }

        default MenuItem eveningDresses() {
            return items().get(1);
        }

        default MenuItem summerDresses() {
            return items().get(2);
        }

    }

}
