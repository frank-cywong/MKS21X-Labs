import java.util.*;
import java.io.*;
public class WordSearch{
    private char[][]data;

    //the random seed used to produce this WordSearch
    private int seed;

    //a random Object to unify your random calls
    private Random randgen;

    //all words that were successfully added get moved into wordsAdded.
    private ArrayList<String>wordsAdded;

    /**Initialize the grid to the size specified
     *and fill all of the positions with '_'
     *@param rows is the starting height of the WordSearch
     *@param cols is the starting width of the WordSearch
     */
    public WordSearch(int rows,int cols){
      data = new char[rows][cols];
      clear();
    }

    public WordSearch(int rows, int cols, String fileName){
      this(rows, cols, fileName, (new Random()).nextInt());
    }

    public WordSearch(int rows, int cols, String fileName, int seed){
      this.seed = seed;
      randgen = new Random(seed);
      wordsAdded = new ArrayList<String>();
      addAllWords(fileName);
    }

    /**Set all values in the WordSearch to underscores'_'*/
    private void clear(){
      for(int i = 0; i < data.length; i++){
        for(int j = 0; j < data[i].length; j++){
          data[i][j] = '_';
        }
      }
    }

    /**Each row is a new line, there is a space between each letter
     *@return a String with each character separated by spaces, and rows
     *separated by newlines.
     */
    public String toString(){
      String output = "";
      for(int i = 0; i < data.length; i++){
        if(i != 0){
          output += "\n";
        }
        for(int j = 0; j < data[i].length; j++){
          if(j != 0){
            output += " ";
          }
          output += data[i][j];
        }
      }
      return output;
    }

    /**Attempts to add a given word in an arbitrary direction.
     *Direction is determined using colinc and rolinc which represent the distance between two consecutive characters. If both rowinc and colinc are 0, the word will not be inserted.
     *@param word is the word to be added to the puzzle.
     *@param row is the row to start adding the word to.
     *@param col is the column to start adding the word to.
     *@param rowinc is the horizontal increment for each character, which can be an integer between -1 and 1.
     *@param colinc is the vertical increment for each character, which can be an integer between -1 and 1.
     *@return true if the word was added successfully, false if it wasn't added successfully, or if both rowinc and colinc are 0, and the board wasn't modified.
     */
    private boolean addWord(String word, int row, int col, int rowinc, int colinc){
      if(rowinc == 0 && colinc == 0){ // invalid rowinc-colinc combination
        return false;
      }
      if(row >= data.length || col >= data[row].length){ // invalid row/col values
        return false;
      }
      if(((row + word.length() * rowinc) > data.length) || ((row + word.length() * rowinc) < -1) || ((col + word.length() * colinc) > data[row].length) || ((col + word.length() * colinc) < -1)){ // out of bounds
        return false;
      }
      for(int i = 0; i < word.length(); i++){
        if(data[row+i*rowinc][col+i*colinc] != '_' && data[row+i*rowinc][col+i*colinc] != word.charAt(i)){ //overlapping word that is invalid
          return false;
        }
      }
      for(int i = 0; i < word.length(); i++){ // actually fill in the word
        data[row+i*rowinc][col+i*colinc] = word.charAt(i);
      }
      return true;
    }

    private void addAllWords(String filename){
      try{
        File f = new File(filename);
        Scanner in = new Scanner(f);
        String temp;
        boolean tempbool;
        while(in.hasNextLine()){
          temp = in.nextLine();
          tempbool = false;
          for(int i = 0 ; i < 2000; i++){
            tempbool = addWord(temp,randgen.nextInt(data.length),randgen.nextInt(data[0].length),randgen.nextInt(3)-1,randgen.nextInt(3)-1);
            if(tempbool){
              wordsAdded.add(temp);
              break;
            }
          }
        }
      } catch (FileNotFoundException e){}
    }

    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from left to right, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     * or there are overlapping letters that do not match, then false is returned
     * and the board is NOT modified.
     */
    /*
    public boolean addWordHorizontal(String word,int row, int col){
      if(row >= data.length || col >= data[row].length){
        return false;
      }
      if(col + word.length() > data[row].length){
        return false;
      }
      for(int i = 0; i < word.length(); i++){
        if(data[row][col+i] != '_' && data[row][col+i] != word.charAt(i)){
          return false;
        }
      }
      for(int i = 0; i < word.length(); i++){
        data[row][col+i] = word.charAt(i);
      }
      return true;
    }
    */

   /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from top to bottom, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
     *and the board is NOT modified.
     */
    /*
    public boolean addWordVertical(String word,int row, int col){
      if(row >= data.length || col >= data[row].length){
        return false;
      }
      if(row + word.length() > data.length){
        return false;
      }
      for(int i = 0; i < word.length(); i++){
        if(data[row+i][col] != '_' && data[row+i][col] != word.charAt(i)){
          return false;
        }
      }
      for(int i = 0; i < word.length(); i++){
        data[row+i][col] = word.charAt(i);
      }
      return true;
    }
    */
    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from top left towards the bottom right, it must fit on the board,
     *and must have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned
     *and the board is not modified.
     */
    /*
    public boolean addWordDiagonal(String word,int row, int col){
      if(row >= data.length || col >= data[row].length){ // invalid row/col values
        return false;
      }
      if((row + word.length() > data.length) || (col + word.length() > data[row].length)){ // word too long to fit
        //System.out.println("test2");
        return false;
      }
      for(int i = 0; i < word.length(); i++){
        if(data[row+i][col+i] != '_' && data[row+i][col+i] != word.charAt(i)){ // overlapping word not fitting
          //System.out.println("test3"); - debug lines
          //System.out.println(i);
          //System.out.println(data[row+i][col+i]);
          return false;
        }
      }
      for(int i = 0; i < word.length(); i++){
        data[row+i][col+i] = word.charAt(i);
      }
      return true;
    }
    */

    /**Reverses a string character by character.
    *@param s is the input String.
    *@return a String which is the input string but with its characters' reversed.
    */
    /*
    public String reverse(String s){
      String output = "";
      for(int i = s.length() - 1; i >= 0; i--){
        output += s.charAt(i);
      }
      return output;
    }
    */
}
