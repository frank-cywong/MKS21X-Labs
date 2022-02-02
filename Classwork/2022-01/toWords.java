public class toWords{
  public static int getDigitCount(long n){
    int i = 0;
    while(n != 0){
      n /= 10;
      i++;
    }
    return i;
  }
  public static long exponent(int a, int b){
    long output = 1;
    for(int i = 0; i < b; i++){
      output *= a;
    }
    return output;
  }
  public static String toWords(long n){
    int dc = getDigitCount(n);
    if(dc == 0){
      return "zero";
    }
    if(dc == 1){
      switch((int)n){
        case 1:
          return "one";
        case 2:
          return "two";
        case 3:
          return "three";
        case 4:
          return "four";
        case 5:
          return "five";
        case 6:
          return "six";
        case 7:
          return "seven";
        case 8:
          return "eight";
        case 9:
          return "nine";
      }
    }
    if(dc == 2){
      switch((int)n){
        case 10:
          return "ten";
        case 11:
          return "eleven";
        case 12:
          return "twelve";
        case 13:
          return "thirteen";
        case 15:
          return "fifteen";
        case 18:
          return "eighteen";
      }
      int a = (int)n / 10;
      int b = (int)n % 10;
      if(a == 1){
        return (toWords(b)+"teen");
      }
      String front;
      switch(a){
        case 2:
          front = "twenty";
          break;
        case 3:
          front = "thirty";
          break;
        case 5:
          front = "fifty";
          break;
        case 8:
          front = "eighty";
          break;
        default:
          front = toWords(a) + "ty";
      }
      String endpart = (b == 0 ? "" : "-" + toWords(b));
      return(front + endpart);
    }
    if(dc == 3){
      String endpart = (n % 100 == 0 ? "" : " and " + toWords(n % 100));
      return(toWords(n / 100) + " hundred" + endpart);
    }
    String[] segs = {"thousand", "million", "billion", "trillion", "quadrillion", "quintillion"};
    int counts = (dc - 1) / 3 - 1;
    int cutoffexponent = (counts + 1) * 3;
    long cutoffval = exponent(10, cutoffexponent);
    String endpart = ((n % cutoffval) == 0 ? "" : " " + toWords(n % cutoffval));
    return(toWords(n / cutoffval) + " " + segs[counts] + endpart);
  }
  public static void main(String[] args){
    for(long i = 0; i <= Long.parseLong(args[0]); i += Long.parseLong(args[1])){
      System.out.println(toWords(i));
    }
  }
}
