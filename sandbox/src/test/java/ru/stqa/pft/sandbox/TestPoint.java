package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by sadovin on 10.10.2016.
 */
public class TestPoint {
  @Test
  public void testPoint1() {
    Point p1 = new Point(1,1);
    Point p2 = new Point(5,4);
    assert p1.distanceNew(p1, p2) == 5;

    Point p3 = new Point(0,1);
    Point p4 = new Point(0,0);
    assert p1.distanceNew(p3, p4) == 1;
  }
  @Test
  public void testPoint3() {
    Point p1 = new Point(0,1);
    Point p2 = new Point(0,0);
    Assert.assertEquals(p1.distanceNew(p1, p2),1.0);
  }
  @Test
  public void testPoint4() {
    Point p1 = new Point(0,1);
    Point p2 = new Point(0,0);
    Assert.assertEquals(p1.distanceNew(p1, p2),1.0);
  }
}
