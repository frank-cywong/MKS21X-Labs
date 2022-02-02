public class RecursiveEvenOrOdd{
  public static boolean isEven(int a){
    if(a == 0){
      return true;
    }
    if(a == 1){
      return false;
    }
    return(a > 0 ? isEven(a-2) : isEven(a+2));
  }
  public static void main(String[] args){
    System.out.println(isEven(0));
    System.out.println(isEven(1));
    System.out.println(isEven(2));
    System.out.println(isEven(13));
    System.out.println(isEven(60));
    System.out.println(isEven(120));
    System.out.println(isEven(-120));
    System.out.println(isEven(-1));
    System.out.println(isEven(-91));
  }
}
