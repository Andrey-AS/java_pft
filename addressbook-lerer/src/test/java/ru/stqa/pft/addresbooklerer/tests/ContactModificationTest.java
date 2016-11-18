package ru.stqa.pft.addresbooklerer.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addresbooklerer.model.ContactData;

/**
 * Created by sadovin on 31.10.2016.
 */
public class ContactModificationTest extends TestBase {
  @Test
  public void testContactModification() {
    app.getNavigationHelper().gotoHome();
    app.getContactHelper().selectContact();
    app.getContactHelper().editContact();
//    app.getContactHelper().deleteSelectedContact();
//    app.getContactHelper().alertDeletion();
    app.getContactHelper().fillContactFor(new ContactData("Серега11", "Отчество", "Фамилия", "Ник", "Название", "Компания", "адресссс", "Дом", "мобила", "рабочий", "факс", "sdfsldkfsl@mail.ru", "lsdkjklsdkl3.sdk@mail.ru", "домашняя страница", "1978", "1999", "дополнительный адрес1", "доп телефон1", "доп примечание1", null),false);
    app.getContactHelper().updateContact();
    app.getNavigationHelper().gotoHome();
  }
}
