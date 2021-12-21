public class stringToInt{
  public static int valueOfDigit(char c){
    return(c - '0');
  }
  public static int stringToInt(String s){
    int o = 0;
    for(int i = 0; i < s.length(); i++){
      o *= 10;
      o += valueOfDigit(s.charAt(i));
    }
    return o;
  }
  public static void main(String[] args){
    System.out.println(stringToInt("84172301"));
  }
}
