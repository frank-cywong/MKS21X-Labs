public class Triangle{
  private Point v1;
  private Point v2;
  private Point v3;
  public Triangle(Point p1, Point p2, Point p3){
    v1 = p1;
    v2 = p2;
    v3 = p3;
  }
  public Triangle (double v1x, double v1y, double v2x, double v2y, double v3x, double v3y){
    v1 = new Point(v1x, v1y);
    v2 = new Point(v2x, v2y);
    v3 = new Point(v3x, v3y);
  }
  public Point getVertex(int v){
    switch(v){
      case 1:
        return v1;
      case 2:
        return v2;
      case 3:
        return v3;
    }
    return new Point(0,0); // to avoid errors by returning something
  }
  public void setVertex(int v, Point p){
    switch(v){
      case 1:
        v1 = new Point(p);
        return;
      case 2:
        v2 = new Point(p);
        return;
      case 3:
        v3 = new Point(p);
        return;
    }
  }
  public String toString(){
    return("{"+v1+", "+v2+", "+v3+"}");
  }
  public double getPerimeter(){
    return (v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1));
  }
  public static boolean closeEnough(double a, double b){
	  // if a is 0.001% greater than b, a/b = 1.00001, or b/a = 0.9999900001, if b is 0.001% less than a, a/b = 0.99999, to account for floating point errors, 0.999989999 is used instead
	  // if b is 0.001% greater than a, b/a = 1.00001, or a/b = 0.9999900001, if a is 0.001% less than b, b/a = 0.99999, to account for floating point errors, 0.999989999 is used instead
	  return (a/b >= 0.999989999 && b/a >= 0.999989999);
  }
  public boolean equals(Triangle other){
	  return(v1.equals(other.v1) && v2.equals(other.v2) && v3.equals(other.v3));
  }
  public double area(){
	  double semiperimeter = getPerimeter() / 2.0;
	  return(Math.sqrt(semiperimeter*(semiperimeter-v1.distanceTo(v2))*(semiperimeter-v2.distanceTo(v3))*(semiperimeter-v3.distanceTo(v1))));
  }
}
