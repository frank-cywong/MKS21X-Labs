public class Demo{
  /* more methods can go here*/
	public static double distance(Point a, Point b){
		return(Math.sqrt(Math.pow(b.getX()-a.getX(),2)+Math.pow(b.getY()-a.getY(),2)));
	}
  public static void main(String[]args){
	Point P1 = new Point(1,1);
    Point P2 = new Point(2,2);
	Point P3 = new Point(4,5);
	Point P4 = new Point(9,17);
	
	// more test cases
	System.out.println(  distance(P1,P3)); // should be 5
    System.out.println(  Point.distance(P1,P3)); 
    System.out.println(  P1.distanceTo(P3));
	System.out.println(  distance(P3,P4)); // should be 13
    System.out.println(  Point.distance(P3,P4)); 
    System.out.println(  P3.distanceTo(P4));
	
    System.out.println(  distance(P1,P2)); //call1
    System.out.println(  Point.distance(P1,P2)); //call 2
    System.out.println(  P1.distanceTo(P2)); //call 3
    //This one is IMPLIED strongly. You cannot tell by the calling style alone,
    //but you can make an educated guess.
	
	/*
	Answers: 
	Call 1 is static and in class Demo,
	Call 2 is static and in class Point,
	Call 3 is non-static and in class Point
	*/
  }
 }