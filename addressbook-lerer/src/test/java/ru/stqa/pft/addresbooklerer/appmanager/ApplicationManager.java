package ru.stqa.pft.addresbooklerer.appmanager;

import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addresbooklerer.model.ContactData;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
  private final ContactHelper contactHelper = new ContactHelper();
  private SessionHelper sessionHelper;
  private NavigationHelper navigationHelper;
  private GroupHelper groupHelper;

  public void init() {
    contactHelper.wd = new FirefoxDriver();
    contactHelper.wd.manage().timeouts().implicitlyWait(60L, TimeUnit.SECONDS);
    contactHelper.wd.get("http://localhost/addressbook/");
    groupHelper = new GroupHelper(contactHelper.wd);
    navigationHelper = new NavigationHelper(contactHelper.wd);
    sessionHelper = new SessionHelper(contactHelper.wd);
    sessionHelper.login("admin", "secret");
  }

  public void stop() {
    contactHelper.wd.quit();
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }

  public ContactHelper getContactHelper() {
    return contactHelper;
  }

  protected void fillContactForm(ContactData contactData) {
    contactHelper.fillContactForm(contactData);
  }

  protected void submitContact() {
    contactHelper.submitContact();
  }
}