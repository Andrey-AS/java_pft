package ru.stqa.pft.addresbooklerer.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addresbooklerer.model.ContactData;

public class ContactGreationTest extends TestBase {
  @Test
  public void testContactGreation() {
    app.getNavigationHelper().gotoAddNew();
    app.getContactHelper().fillContactFor(new ContactData("Серега11", "Отчество", "Фамилия", "Ник", "Название", "Компания", "адресссс", "Дом", "мобила", "рабочий", "факс", "sdfsldkfsl@mail.ru", "lsdkjklsdkl3.sdk@mail.ru", "домашняя страница", "1978", "1999", "дополнительный адрес", "доп телефон", "доп примечание"));
    app.getContactHelper().subminModification();
  }

}
