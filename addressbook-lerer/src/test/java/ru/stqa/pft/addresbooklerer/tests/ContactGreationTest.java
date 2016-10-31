package ru.stqa.pft.addresbooklerer.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import ru.stqa.pft.addresbooklerer.model.ContactData;

public class ContactGreationTest extends TestBase {
  FirefoxDriver wd;

  @Test
  public void testContactGreation() {
        /*app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupFor(new GroupData("Nammmme1", "Header 2", "group 3"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage(); */
    app.getNavigationHelper().gotoAddNew();
    //wd.findElement(By.linkText("add new")).click();
    // данные по контактной форме
    app.getGroupHelper().fillContactFor(new ContactData("Серж", "Отчество", "Фамилия", "Ник", "Название", "Компания", "адресссс", "Дом", "мобила", "рабочий", "факс", "sdfsldkfsl@mail.ru", "lsdkjklsdkl3.sdk@mail.ru", "домашняя страница", "1978", "1999", "дополнительный адрес", "доп телефон", "доп примечание"));
    app.getGroupHelper().subminModification();
  }

}
