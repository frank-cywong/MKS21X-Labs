public class Point{
  private double x,y;
  public Point(double X, double Y){
    x=X;
    y=Y;
  }
  public Point(Point p){
    x= p.x;
    y= p.y;
  }
  public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }
  public static double distance(Point P1, Point P2){
	   return(Math.sqrt(Math.pow(P2.x-P1.x,2)+Math.pow(P2.y-P1.y,2)));
  }
  public double distanceTo(Point P){
	   return(Math.sqrt(Math.pow(P.x-x,2)+Math.pow(P.y-y,2)));
  }
  public String toString(){
    return "("+x+", "+y+")";
  }
  public static boolean closeEnough(double a, double b){
	  // if a is 0.001% greater than b, a/b = 1.00001, or b/a = 0.9999900001, if b is 0.001% less than a, a/b = 0.99999, to account for floating point errors, 0.999989999 is used instead
	  // if b is 0.001% greater than a, b/a = 1.00001, or a/b = 0.9999900001, if a is 0.001% less than b, b/a = 0.99999, to account for floating point errors, 0.999989999 is used instead
	  return (a/b >= 0.999989999 && b/a >= 0.999989999);
  }
  public boolean equals(Point p){
	  return((p.x != 0 && x != 0 && closeEnough(p.x,x) || p.x == x) && (p.y != 0 && y != 0 && closeEnough(p.y,y) || p.y == y));
  }
}
