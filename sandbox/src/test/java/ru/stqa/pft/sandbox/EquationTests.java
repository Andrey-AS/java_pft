package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by sadovin on 02.11.2016.
 */
public class EquationTests {

  @Test
  public void test0() {
    Equation e = new Equation(1,1,1);
    Assert.assertEquals(e.rootNomber(),0);
  }
  @Test
  public void test1() {
    Equation e = new Equation(1,2,1);
    Assert.assertEquals(e.rootNomber(),1);
  }
  @Test
  public void test2() {
    Equation e = new Equation(1,5,1);
    Assert.assertEquals(e.rootNomber(),2);
    //if (e.rootNomber() == 2) System.out.println("Уравнение имеет 2 решения!");

  }
  @Test
  public void testLines() {
    Equation e = new Equation(0,2,1);
    Assert.assertEquals(e.rootNomber(),1);
  }
  @Test
  public void testConst() {
    Equation e = new Equation(0,0,1);
    Assert.assertEquals(e.rootNomber(),0);
  }
  @Test
  public void testInfinite() {
    Equation e = new Equation(0,0,0);
    Assert.assertEquals(e.rootNomber(),-1);
  }

}
