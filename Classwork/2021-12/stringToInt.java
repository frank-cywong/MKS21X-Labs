public class stringToInt{
  public static int valueOfDigit(char c){
    return(c - '0');
  }
  public static int stringToInt(String s){
    int o = 0;
    boolean sign = false; // - or +
    if(s.charAt(0) == '-'){
      sign = true;
      s = s.substring(1);
    }
    for(int i = 0; i < s.length(); i++){
      o *= 10;
      if(sign){
        o -= valueOfDigit(s.charAt(i));
      } else {
        o += valueOfDigit(s.charAt(i));
      }
    }
    return o;
  }
  public static void main(String[] args){
    System.out.println(stringToInt("84172301"));
    System.out.println(stringToInt("-1294318"));
  }
}
