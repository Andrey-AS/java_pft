package ru.stqa.pft.addresbooklerer.tests;

import org.testng.annotations.Test;

/**
 * Created by sadovin on 31.10.2016.
 */
public class ContactDeletionTest extends TestBase {
  @Test
  public void testContactDeletion() {
    app.getNavigationHelper().gotoHome();
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteSelectedContact();
    app.getContactHelper().alertDeletion();
    app.getNavigationHelper().gotoHome();
  }


}
