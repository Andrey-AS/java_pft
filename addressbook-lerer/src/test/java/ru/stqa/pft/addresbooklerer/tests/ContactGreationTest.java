package ru.stqa.pft.addresbooklerer.tests;

import org.testng.annotations.Test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import ru.stqa.pft.addresbooklerer.model.ContactData;

public class ContactGreationTest extends TestBase {
    @Test
    public void ContactGreationTest() {
        app.getNavigationHelper().gotoAddNew();
        app.getContactHelper.fillContactForm(new ContactData("aaaaaa", "middddddle", "lfffast"));
        app.submitContact();
    }


}
