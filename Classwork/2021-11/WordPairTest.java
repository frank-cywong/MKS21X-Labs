public class WordPairTest{
  public static void main(String[] args){
    System.out.println(new WordPairList(new String[]{"one", "two", "three"}));
    System.out.println(new WordPairList(new String[]{"the", "more", "the", "merrier"}));
    System.out.println((new WordPairList(new String[]{"the", "red", "fox", "the", "red"})).numMatches());
  }
}
