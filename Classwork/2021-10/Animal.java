public class Animal {
    private String noise;
    private int age;
    private String name;

    public Animal(String noise, int age, String name){
        //initialize the values (hint use this.varname to clarify)
        this.noise = noise;
        this.age = age;
        this.name = name;
    }

    public void speak(){
      /*print the following message replacing the ? with name/age/noise:
      My name is ?.
      I am ? years old.
      I say ?.
      */
      System.out.println("My name is "+name+".");
      System.out.println("I am "+age+" years old.");
      System.out.println("I say "+noise+".");
    }
    //public static void test(){ - static method hiding demo
    //  System.out.println("test2");
    //}
}
