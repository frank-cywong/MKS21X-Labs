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
    t1.setVertex(1, new Point(0,3));
    System.out.println(t1.getVertex(1));
    System.out.println(t1);
  }
}
