public class Driver{
  public static void main(String[] args){
    Point p1 = new Point(1.0, -4.12);
    System.out.println(p1);
    Triangle t1 = new Triangle(new Point(4,0), new Point(0,0), new Point(4,3));
    Triangle t2 = new Triangle(0,1,5,1,5,13);
    System.out.println(t1.getVertex(1));
    System.out.println(t1.getVertex(2));
    System.out.println(t1.getVertex(3));
    System.out.println(t2.getVertex(1));
    System.out.println(t2.getVertex(2));
    System.out.println(t2.getVertex(3));
    System.out.println(t1);
    System.out.println(t2);
    System.out.println(t1.getPerimeter()); // should be 12 (3,4,5)
    System.out.println(t2.getPerimeter()); // should be 30 (5,12,13)
    t1.setVertex(1, new Point(0,3));
    t2.setVertex(2, new Point(14,1));
    System.out.println(t1.getVertex(1));
    System.out.println(t1);
    System.out.println(t2);
    System.out.println(t1.getPerimeter()); // should be 12
    System.out.println(t2.getPerimeter()); // should be 42 (13,14,15)
    Triangle t3 = new Triangle(2,2,2,2,2,2);
    t3.setVertex(1, new Point(0,0));
    t3.setVertex(2, new Point(1,0));
    t3.setVertex(3, new Point(1,1));
    System.out.println(t3.getPerimeter()); // should be 2 + sqrt(2) ~= 3.414
	Triangle t4 = new Triangle(0,0,2,0,1,Math.sqrt(3));
	System.out.println(t4.getPerimeter()); // should be 6 (2,2,2)
	Triangle t5 = new Triangle(0,0,1,0,0.5,2);
	System.out.println(t5.getPerimeter()); // should be 1 + sqrt(17) ~= 5.sth (1,sqrt(17)/2,sqrt(17)/2)
	System.out.println(Point.closeEnough(100,101)); // should be false
	System.out.println(Point.closeEnough(100,99)); // should be false
	System.out.println(Point.closeEnough(100,99.9999)); // should be true
	System.out.println(Point.closeEnough(99.9999,100)); // should be true
	System.out.println(Point.closeEnough(0.00001,0.0000099999)); // should be true
	System.out.println(Point.closeEnough(0.00002,0.0000099999)); // should be false
	System.out.println((0.1 + 0.2) == 0.3); // should be false (floating point)
	System.out.println(Point.closeEnough(0.1+0.2, 0.3)); // should be true
	Point p2 = new Point(100,0);
	System.out.println(p2.equals(new Point(100.0001,0))); // should be true
	System.out.println(p2.equals(new Point(100,0.000000001))); // should be false
	System.out.println(t2.equals(new Triangle(0,1.000001,14,1,5,13))); // should be true
	System.out.println(t1.area()); // should be 6 (3,4,5)
	System.out.println(t2.area()); // should be 84 (13,14,15)
	System.out.println(t3.area()); // should be 0.5 (1,1,sqrt(2))
	System.out.println(t4.area()); // should be sqrt(3) ~= 1.7 (2,2,2)
	System.out.println(t5.area()); // should be 1 (1,sqrt(17)/2,sqrt(17)/2)
	System.out.println(t1.classify()); // should be scalene
	System.out.println(t2.classify()); // should be scalene
	System.out.println(t3.classify()); // should be isosceles
	System.out.println(t4.classify()); // should be equilateral
	System.out.println(t5.classify()); // should be isosceles
  }
}
