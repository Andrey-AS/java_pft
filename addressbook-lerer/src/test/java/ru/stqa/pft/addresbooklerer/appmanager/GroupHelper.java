package ru.stqa.pft.addresbooklerer.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addresbooklerer.model.ContactData;
import ru.stqa.pft.addresbooklerer.model.GroupData;

/**
 * Created by sadovin on 18.10.2016.
 */
public class GroupHelper extends HelperBase {

  public GroupHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void returnToGroupPage() {
    click(By.linkText("group page"));
  }

  public void submitGroupCreation() {
    click(By.name("submit"));
  }

  public void fillGroupFor(GroupData groupData) {
    type(By.name("group_name"), groupData.getGroupname());
    type(By.name("group_header"), groupData.getHeader());
    type(By.name("group_footer"), groupData.getFooter());
  }

  public void initGroupCreation() {
    click(By.name("new"));
  }

  public void deleteSelectedGroups() {
    click(By.name("delete"));
  }

  public void selectGroup() {
    click(By.name("selected[]"));
  }

  public void initGroupModification() {
    click(By.name("edit"));
  }

  public void submitGroupModification() {
    click(By.name("update"));
  }

  public void fillContactFor(ContactData contactData) {
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
    
    if (!isSelected(By.xpath("//div[@id='content']/form/select[5]//option[2]"))) {
      click(By.xpath("//div[@id='content']/form/select[5]//option[2]"));
    }

    type(By.name("address2"), contactData.getAddress2());
    type(By.name("phone2"), contactData.getPhone2());
    type(By.name("notes"), contactData.getNotes());

  }

  public void subminModification() {
    click(By.name("submit"));
  }
}
