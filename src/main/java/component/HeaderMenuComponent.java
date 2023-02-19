package component;

import data.menu.HeaderMenuItemData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderMenuComponent extends AbsBaseComponent{

    public HeaderMenuComponent(WebDriver driver) {
        super(driver);
    }

    public HeaderMenuComponent moveCursorToHeaderItem(HeaderMenuItemData headerMenuItemData) {

        String selector = String.format("[data-name='%s'].header3__nav-item", headerMenuItemData.getName());
        actions
                .moveToElement($(By.cssSelector(selector)))
                .build()
                .perform();
        return this;
    }
}

