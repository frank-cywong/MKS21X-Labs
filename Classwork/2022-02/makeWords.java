public class makeWords{
  public static void makeWords(int size, String ans){
    if(size == 0){
      System.out.println(ans);
      return;
    }
    for(int i = 0; i < 26; i++){
      makeWords(size - 1, ans + (char)('a' + i));
    }
  }
  public static void main(String[] args){
    makeWords(3, "");
  }
}
