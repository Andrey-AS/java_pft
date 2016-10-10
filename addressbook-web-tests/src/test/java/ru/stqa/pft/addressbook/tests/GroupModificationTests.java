package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

/**
 * Created by sadovin on 10.10.2016.
 */
public class GroupModificationTests extends TestBase {
  @Test
  public void testGroupModificaton() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("test111", "test22222", "test3333333"));
    app.getGroupHelper().subitGroupModificatio();
    app.getGroupHelper().returnToGroupPage();
  }
}
