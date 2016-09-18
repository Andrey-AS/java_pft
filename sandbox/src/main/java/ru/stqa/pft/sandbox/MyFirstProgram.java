package ru.stqa.pft.sandbox;

public class MyFirstProgram {
	
	public static void main(String[] args) {
    hello("it MyProgramm");
    hello("user");
    hello("Andry");

    double l = 12.14;
    System.out.println("Площадь квадрата со стороной " + l + " метров = +" + area(l));
    double a = 5;
    double b = 8;
    System.out.println("Площадь прямоугольника со сторонами " + a + "x" + b  + " равна " + area(a,b));
  }
  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

  public static double area(double arifaktr) {
    return arifaktr*arifaktr;
  }
  public static double area(double a, double b) {
    return a * b;
  }

}