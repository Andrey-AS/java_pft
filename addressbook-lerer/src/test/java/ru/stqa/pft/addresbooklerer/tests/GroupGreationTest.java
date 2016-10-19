package ru.stqa.pft.addresbooklerer.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addresbooklerer.model.GroupData;

public class GroupGreationTest extends TestBase {

  @Test
  public void testGroupGreation() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupFor(new GroupData("Nammmme1", "Header 2", "group 3"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
  }

}
