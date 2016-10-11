package ru.stqa.pft.sandbox;

/**
 * Created by sadovin on 19.09.2016.
 */
public class Point {
  public double x;
  public double y;

  public Point (double xx, double yy) {
    x = xx;
    y = yy;
  }

//  public double distance(Point p2) {
//    return Math.sqrt(Math.pow((this.x-p2.x),2)+Math.pow((this.y-p2.y),2));
//  }
  public double distanceNew(Point p1, Point p2) {
    return Math.sqrt(Math.pow((p1.x-p2.x),2)+Math.pow((p1.y-p2.y),2));
  }
}
