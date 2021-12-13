public class Tester{
  /*
  public static void basicTest(WordSearch b){
    System.out.println(b); // tests toString
    System.out.println(b.addWordHorizontal("foo",1,1));
    System.out.println(b.addWordVertical("bar",1,1));
    System.out.println(b.addWordVertical("far",1,1));
    System.out.println(b.addWordDiagonal("oooo",1,3));
    System.out.println(b.addWordDiagonal("aqt",2,1));
    System.out.println(b.addWordHorizontal("zrp",3,0));
    System.out.println(b.addWordHorizontal("zrq",3,0));
    System.out.println(b);
  }
  public static void basicTest2(WordSearch b){
    System.out.println(b.addWordDiagonal("test",3,3));
    System.out.println(b.addWordDiagonal(b.reverse("test"),0,0));
    System.out.println(b.addWordHorizontal("test",3,3));
    System.out.println(b.addWordHorizontal(b.reverse("test"),3,0));
    System.out.println(b.addWordVertical("test",3,3));
    System.out.println(b.addWordVertical(b.reverse("test"),0,3));
    System.out.println(b.addWordHorizontal("testing",0,0));
    System.out.println(b.addWordVertical("inteermediate",0,4));
    System.out.println(b.addWordHorizontal("atest",6,2));
    System.out.println(b.addWordDiagonal("atest",7,0));
    for(int i = 6; i <= 11; i++){
      b.addWordHorizontal("tea",i,1);
    }
    System.out.println(b);
  }
  */
  /*
  public static void omniTest(WordSearch b){
    for(int i = -1; i <= 1; i++){
      for(int j = -1; j <= 1; j++){
        b.addWord("testing",6,6,i,j);
      }
    }
    b.addWord("gagbgcgdgegfk",0,0,1,0);
    b.addWord("gagbgcgdgegfgg",0,0,1,0);
    b.addWord("argon",15,2,-1,1);
    b.addWord("carbon",16,5,-1,0);
    for(int i = 14; i < 20; i++){
      b.addWord("aaaaaaa",i,0,0,1);
    }
    b.addWord("at",16,1,0,-1);
    b.addWord("abc",13,1,1,-1);
    System.out.println(b);
  }
  */
  public static void main(String[] args){
    //WordSearch b = new WordSearch(0,0);
    /*
    basicTest(b);
    b = new WordSearch(1,0);
    basicTest(b);
    b = new WordSearch(0,2);
    basicTest(b);
    b = new WordSearch(4,3);
    basicTest(b); // false, true, false, false, false, true, false
    b = new WordSearch(5,4);
    basicTest(b); // true, false, true, false, true, false, true
    b = new WordSearch(3,4);
    basicTest(b); // true, false, false
    b = new WordSearch(5,7);
    basicTest(b); // true, false, true, true, true, false, true
    b = new WordSearch(13,7);
    basicTest2(b);
    b = new WordSearch(4,7);
    basicTest2(b);
    b = new WordSearch(4,4);
    basicTest2(b);
    b = new WordSearch(13,5);
    basicTest2(b);
    */
    /*
    omniTest(b);
    b = new WordSearch(1,0);
    omniTest(b);
    b = new WordSearch(0,2);
    omniTest(b);
    b = new WordSearch(13,13);
    omniTest(b);
    b = new WordSearch(20,7);
    omniTest(b);
    */
    WordSearch b = new WordSearch(0,0,"test.in");
    b = new WordSearch(1,0,"test.in");
    b = new WordSearch(0,2,"test.in");
    b = new WordSearch(3,3,"test.in");
  }
}
