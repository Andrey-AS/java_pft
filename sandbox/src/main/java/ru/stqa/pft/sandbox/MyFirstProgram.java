package ru.stqa.pft.sandbox;

import java.awt.*;

public class MyFirstProgram {
	
	public static void main(String[] args) {
    hello("it MyProgramm");
    hello("user");
    hello("Andry");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " метров = " + s.area());

    Reader ss = new Reader(8,98);
    System.out.println("Площадь прямоугольника со сторонами " + ss.a + "x" + ss.b  + " равна " + ss.area());

    Sum z = new Sum(251,406);
    System.out.println("Сумма двух чисел " + z.a + " + " + z.b + " = " + z.sum());


    Point p1 = new Point(5,0);
    Point p2 = new Point(0,0);

    System.out.println("Расстояние между двумя точками с координатами (" + p1.x + "," + p1.y + ") и ("  + p2.x + "," + p2.y + ") равна " + p1.distance(p2));
  }
  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

}