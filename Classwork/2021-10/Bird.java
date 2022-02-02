public class Bird extends Animal {
    private double height;
    private String color;

    public Bird(String noise, int age, String name, double height, String color){
        //construct the Bird
        super(noise,age,name);
        this.height = height;
        this.color = color;
    }


    public void speak(){
      /*WITHOUT REPEATING CODE:
      print the following message replacing the ? with name/age/noise/color/height:
      My name is ?.
      I am ? years old.
      I say ?.
      I am ?
      I am ? inches tall
      */
      //warning, you cannot access private variables, so you CAN'T duplicate the code!
      super.speak();
      System.out.println("I am "+color);
      System.out.println("I am "+height+" inches tall");
    }
    //public static void test(){ - static method hiding dmo
    //  System.out.println("test");
    //}
}
