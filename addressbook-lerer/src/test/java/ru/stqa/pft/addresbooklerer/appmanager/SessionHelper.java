package ru.stqa.pft.addresbooklerer.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by sadovin on 18.10.2016.
 */
public class SessionHelper extends HelperBase {

  public SessionHelper(FirefoxDriver wd) {
    super(wd);
  }
  public void login(String username, String userparol) {
    type(By.name("user"),username);
    type(By.name("pass"),userparol);
    click(By.xpath("//form[@id='LoginForm']/input[3]"));
  }

}
