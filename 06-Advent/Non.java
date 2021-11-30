import java.util.*;
import java.io.*;
public class Non{
  public static boolean isVowel(char c){
		return(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
	}
	public static boolean isProhibited(String s){
		return(s.equals("ab") || s.equals("cd") || s.equals("pq") || s.equals("xy"));
	}
	public static boolean isNice(String s){
		int vowelcount = 0;
		boolean charrepeated = false;
		char lastchar = 0;
		for(int i = 0; i < s.length(); i++){
			if(isVowel(s.charAt(i))){
				vowelcount++;
			}
			if(lastchar == s.charAt(i)){
				charrepeated = true;
			}
			lastchar = s.charAt(i);
			if(i < (s.length() - 1)){
				if(isProhibited(s.substring(i,i+2))){
					return false;
				}
			}
		}
		if(vowelcount >= 3 && charrepeated){
			return true;
		}
		return false;
	}
	public static boolean isNiceTwo(String s){
		Set<String> repeated = new HashSet<String>();
		boolean overlap = false;
		boolean letterbetween = false;
		String lastpair = "";
		for(int i = 0; i < s.length(); i++){
			if(!overlap && (i < s.length() - 1)){
				if(repeated.contains(s.substring(i, i+2))){
					overlap = true;
				} else {
				  repeated.add(lastpair);
				  lastpair = s.substring(i,i+2);
				}
			}
			if(!letterbetween && (i < s.length() - 2) && (s.charAt(i) == s.charAt(i+2))){
				letterbetween = true;
			}
			if(overlap && letterbetween){
				return true;
			}
		}
		return false;
	}
  public static void main(String[] args){
    try{
      File f = new File(args[0]);
      Scanner in = new Scanner(f);
      String temp;
      int mode = Integer.parseInt(args[1]);
      int total = 0;
      while(in.hasNextLine()){
        temp = in.nextLine();
        if(mode == 1){
          if(isNice(temp)){
            total++;
          }
        }
        if(mode == 2){
          if(isNiceTwo(temp)){
            total++;
          }
        }
      }
      System.out.println(total);
    } catch (FileNotFoundException e){
    }
  }
}
