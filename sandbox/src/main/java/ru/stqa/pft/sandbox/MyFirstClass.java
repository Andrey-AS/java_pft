package ru.stqa.pft.sandbox;

/**
 * Created by sadovin on 10.10.2016.
 */
public class MyFirstClass {
  public static void main(String[] args) {
    Point p1 = new Point(5,-9);
    Point p2 = new Point(8,-5);
    System.out.println("Расстояние между двумя точками с координатами (" + p1.x + "," + p1.y + ") и ("  + p2.x + "," + p2.y + ") равно " + p1.distanceNew(p1, p2));
  }
}
