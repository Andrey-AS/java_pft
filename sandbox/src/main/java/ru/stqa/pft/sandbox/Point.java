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

  public double distance(Point p2) {
    return Math.sqrt(Math.pow((this.x-p2.x),2)+Math.pow((this.y-p2.y),2));
  }
}
