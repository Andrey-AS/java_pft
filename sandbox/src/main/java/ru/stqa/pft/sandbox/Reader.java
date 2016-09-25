package ru.stqa.pft.sandbox;

/**
 * Created by sadovin on 18.09.2016.
 */
public class Reader {
  public double a;
  public double b;

  public Reader(double a, double b) {
    this.a = a;
    this.b = b;
  }
  public double area() {
    return this.a * this.b;
  }
}
