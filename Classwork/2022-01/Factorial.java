public class Factorial{
    public static int factorial(int a){
      return (a == 0 ? 1 : a * factorial(a-1));
    }
    public static void main(String[] args){
      System.out.println(factorial(0));
      System.out.println(factorial(5));
      System.out.println(factorial(10));
      //System.out.println(factorial(30000));
    }
}
