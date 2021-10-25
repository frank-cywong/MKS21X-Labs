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
        v1 = p;
      case 2:
        v2 = p;
      case 3:
        v3 = p;
    }
  }
}
