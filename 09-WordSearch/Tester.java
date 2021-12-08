public class Tester{
  public static void basicTest(WordSearch b){
    System.out.println(b); // tests toString
    System.out.println(b.addWordHorizontal("foo",1,1));
    System.out.println(b.addWordVertical("bar",1,1));
    System.out.println(b.addWordVertical("far",1,1));
    System.out.println(b);
  }
  public static void main(String[] args){
    WordSearch b = new WordSearch(0,0);
    basicTest(b);
    b = new WordSearch(1,0);
    basicTest(b);
    b = new WordSearch(0,2);
    basicTest(b);
    b = new WordSearch(4,3);
    basicTest(b); // false, true, false
    b = new WordSearch(4,4);
    basicTest(b); // true, false, true
    b = new WordSearch(3,4);
    basicTest(b); // true, false, false
  }
}
