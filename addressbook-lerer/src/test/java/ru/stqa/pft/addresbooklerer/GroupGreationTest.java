package ru.stqa.pft.addresbooklerer;

import org.testng.annotations.Test;

public class GroupGreationTest extends TestBase {

  @Test
  public void testGroupGreation() {
    gotoGroupPage();
    initGroupCreation();
    fillGroupFor(new GroupData("Nammmme1", "Header 2", "group 3"));
    submitGroupCreation();
    returnToGroupPage();
  }

}
