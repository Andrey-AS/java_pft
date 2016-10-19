package ru.stqa.pft.addresbooklerer.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addresbooklerer.model.GroupData;

/**
 * Created by sadovin on 19.10.2016.
 */
public class GroupModificationTests extends TestBase {
  @Test
  public void testGroupModification() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupFor(new GroupData("Nammmme1", "Header 2", "group 3"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGroupPage();
  }

}
