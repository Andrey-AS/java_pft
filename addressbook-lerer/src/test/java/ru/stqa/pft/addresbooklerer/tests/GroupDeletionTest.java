package ru.stqa.pft.addresbooklerer.tests;

import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {
  @Test
  public void testGroupDeletion() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
  }

}
