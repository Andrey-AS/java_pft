package ru.stqa.pft.addresbooklerer.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addresbooklerer.model.ContactData;




public class ContactHelper extends HelperBase {

  public ContactHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void fillContactFor(ContactData contactData, boolean created) {
    type(By.name("firstname"), contactData.getFirstname());
    type(By.name("middlename"), contactData.getMiddlename());
    type(By.name("lastname"), contactData.getLastname());
    type(By.name("nickname"), contactData.getNickname());
    type(By.name("title"), contactData.getTitle());
    type(By.name("company"), contactData.getCompany());
    type(By.name("address"), contactData.getAddress());
    type(By.name("home"), contactData.getHome());
    type(By.name("mobile"), contactData.getMobile());
    type(By.name("work"), contactData.getWork());
    type(By.name("fax"), contactData.getFax());
    type(By.name("email2"), contactData.getEmail2());
    type(By.name("email3"), contactData.getEmail3());
    type(By.name("homepage"), contactData.getHomepage());
    if (!isSelected(By.xpath("//div[@id='content']/form/select[1]//option[7]"))) {
      click(By.xpath("//div[@id='content']/form/select[1]//option[7]"));
    }
    if (!isSelected(By.xpath("//div[@id='content']/form/select[2]//option[4]"))) {
      click(By.xpath("//div[@id='content']/form/select[2]//option[4]"));
    }
    //type(By.name("byear"), sendKeys("1978");
    type(By.name("byear"), contactData.getByear());

    if (!isSelected(By.xpath("//div[@id='content']/form/select[3]//option[4]"))) {
      click(By.xpath("//div[@id='content']/form/select[3]//option[4]"));
    }
    if (!isSelected(By.xpath("//div[@id='content']/form/select[4]//option[5]"))) {
      click(By.xpath("//div[@id='content']/form/select[4]//option[5]"));
    }
    type(By.name("ayear"), contactData.getAyear());

//    if (!isSelected(By.xpath("//div[@id='content']/form/select[5]//option[2]"))) {
//      click(By.xpath("//div[@id='content']/form/select[5]//option[2]"));
//    }
    if (created) {
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
    } else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }

    type(By.name("address2"), contactData.getAddress2());
    type(By.name("phone2"), contactData.getPhone2());
    type(By.name("notes"), contactData.getNotes());

  }

  public void selectContact() {
    click(By.name("selected[]"));
  }

  public void deleteSelectedContact() {
    click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
  }

  public void subminModification() {
    click(By.name("submit"));
  }

  public void alertDeletion() {
    wd.switchTo().alert().accept();
  }

  public void editContact() {
    click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
  }

  public void updateContact() {
    click(By.name("update"));
  }
}