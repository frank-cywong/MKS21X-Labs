public class WordPair{
  private String s1,s2;
  public WordPair(String s1, String s2){
    this.s1 = s1;
    this.s2 = s2;
  }
  public String getFirst(){
    return s1;
  }
  public String getSecond(){
    return s2;
  }
  public String toString(){
    return("("+s1+", "+s2+")");
  }
}
