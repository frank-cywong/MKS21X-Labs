import java.util.ArrayList;
public class WordPairList{
  private ArrayList<WordPair> allPairs;
  public WordPairList(String[] words){
    allPairs = new ArrayList<WordPair>((words.length*(words.length - 1)/2));
    for(int i = 0; i < words.length; i++){
      for(int j = i + 1; j < words.length; j++){
        allPairs.add(new WordPair(words[i], words[j]));
      }
    }
  }
  public int numMatches(){
    int output = 0;
    WordPair temp;
    for(int i = 0; i < allPairs.size(); i++){
      temp = allPairs.get(i);
      if(temp.getFirst().equals(temp.getSecond())){
        output++;
      }
    }
    return output;
  }
  public String toString(){
    return allPairs.toString();
  }
}
