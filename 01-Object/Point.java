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
}
