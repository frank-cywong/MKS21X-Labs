public class AnimalTester{
  public static void main(String[] args){
    Animal a1 = new Animal("generic noise", 100, "generic name");
    Bird b1 = new Bird("generic noise 2", 100, "generic name 2", 412.81, "generic colour");
    a1.speak();
    b1.speak();
    Animal a2 = new Bird("generic noise 3", 101, "generic name 3", 10231.23, "generic colour 2");
    System.out.println("testing animal a2");
    a2.speak();
    //b1.test(); - Demo for hiding static methods
    //a2.test();
    // Attempt to put Animal class into a Bird var
    //Bird b2 = new Animal("g", 1240, "g2"); since Animal can't be converted into a Bird class
    //b2.speak();
  }
}
