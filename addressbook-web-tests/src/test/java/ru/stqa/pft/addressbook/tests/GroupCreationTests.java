package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {
    /*public static void hello() {
        System.out.println("Проверка вывода");
    }*/

  @Test
  public void testGroupCreation() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().subminGroupCreation();
    app.getGroupHelper().returnToGroupPage();
  }

}
