package ru.stqa.pft.addresbooklerer.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by sadovin on 18.10.2016.
 */
public class NavigationHelper extends HelperBase {

  public NavigationHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void gotoGroupPage() {
    click(By.linkText("groups"));
    //wd.findElement(By.linkText("groups")).click();
  }
  public void gotoAddNew() {
    click(By.linkText("add new"));
  }

  public void gotoHome() {
    click(By.linkText("home"));
  }
}
