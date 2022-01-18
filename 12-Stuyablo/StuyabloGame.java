import java.util.*;
public class StuyabloGame{
  private static final int WIDTH = 80;
  private static final int HEIGHT = 30;
  private static final int BORDER_COLOR = Text.BLACK;
  private static final int BACKGROUND_COLOR = Text.CYAN + Text.BACKGROUND;
  private static final String HORIZONTALCHAR = "-";
  private static final String VERTICALCHAR = "|";
  private static final String CORNERCHAR = "O";
  private static final int DEFAULT_TEXT_COLOR = Text.WHITE;

  public static void main(String[] args) {
    run();
  }
  public static void border(int w, int h){
    border(w, h, 1, 1);
  }
  public static void border(int w, int h, int topleftw, int toplefth){ // topleftw and toplefth 1 indexed
    String ws = "";
    ws += CORNERCHAR;
    for(int i = 0; i < (w - 2); i++){
      ws += HORIZONTALCHAR;
    }
    ws += CORNERCHAR;
    for(int i = 1; i <= h; i++){
      if(i == 1 || i == h){
        Text.go(i + toplefth - 1, topleftw);
        System.out.println(Text.colorize(ws, BACKGROUND_COLOR, BORDER_COLOR));
      }
      else {
        Text.go(i + toplefth - 1, topleftw);
        System.out.print(Text.colorize(VERTICALCHAR, BACKGROUND_COLOR, BORDER_COLOR));
        Text.go(i + toplefth - 1, w + topleftw - 1);
        System.out.println(Text.colorize(VERTICALCHAR, BACKGROUND_COLOR, BORDER_COLOR));
      }
    }
  }

  public static String conditionalformatting(String str, float val){
    if(val <= 0.25){
      return(Text.colorize(str, Text.RED));
    }
    if(val >= 0.75){
      return(Text.colorize(str, Text.GREEN));
    }
    return(Text.colorize(str, DEFAULT_TEXT_COLOR));
  }

  //Display a List of 1-4 adventurers on the rows row through row+3 (4 rows max)
  //Should include Name and HP on 2 separate lines. (more to be added later)
  public static void drawParty(ArrayList<Adventurer> party,int startRow){
    /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
    //YOUR CODE HERE
    /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/
    int curcol = 2;
    int inccol = (WIDTH - 2) / party.size();
    for(int i = 0; i < party.size(); i++){
      Adventurer lcl = party.get(i);
      drawText(lcl.getName(), startRow, curcol);
      int sp = lcl.getSpecial();
      int maxsp = lcl.getSpecialMax();
      drawText(lcl.getSpecialName()+":"+sp+"/"+maxsp, startRow+1, curcol, ((float)sp)/maxsp);
      int hp = lcl.getHP();
      int maxhp = lcl.getmaxHP();
      drawText("HP:"+hp+"/"+maxhp, startRow+2, curcol, ((float)hp)/maxhp);
      curcol += inccol;
    }
  }

  //Display a line of text starting at column 2 of the specified row.
  public static void drawText(String s, int startRow){
    /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
    //YOUR CODE HERE
    /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/
    drawText(s, startRow, 2);
  }

  public static void drawText(String s, int startRow, int startCol){
    drawText(s, startRow, startCol, false);
  }

  public static void drawText(String s, int startRow, int startCol, boolean wrapping){
    if(!wrapping){
      Text.go(startRow, startCol);
      System.out.print(s);
      return;
    }
    for(int rowCount = 0; rowCount < Math.ceil(((float)(s.length()))/(WIDTH-startCol)); rowCount++){
      if(rowCount != 0){
        s = s.substring(WIDTH-startCol);
      }
      Text.go(startRow+rowCount,startCol);
      System.out.print((WIDTH-startCol >= s.length() ? s : s.substring(0, WIDTH-startCol)));
    }
  }

  public static void drawText(String s, int startRow, int startCol, float formatval){
    drawText(conditionalformatting(s, formatval), startRow, startCol);
    /*
    if(format){
      try{
        int val = Integer.parseInt(s);
        s = conditionalformatting(val);
      } catch (NumberFormatException e){
        s = Text.colorize(s, DEFAULT_TEXT_COLOR);
      }
    } else {
      s = Text.colorize(s, DEFAULT_TEXT_COLOR);
    }
    Text.go(startRow,startCol);
    System.out.print(s);
    */
  }

  public static void drawTextAttackResult(String s){
    drawText(s, 10, 2, true);
  }

  public static void drawTextPrompt(String s){
    drawText(s, HEIGHT/2 + 5, 2, true);
  }

  public static void drawScreen(){
    /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
    //YOUR CODE HERE
    /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/
    Text.clear();
    Text.go(1,1);
    border(WIDTH, HEIGHT);
    border(WIDTH, HEIGHT - 8, 1, 5);
  }

  public static void run(){
    //Clear and initialize
    Text.hideCursor();
    Text.clear();
    Text.go(1,1);


    //Things to attack:
    //Make an ArrayList of Adventurers and add 1 enemy to it.
    ArrayList<Adventurer>enemies = new ArrayList<>();
    /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
    //YOUR CODE HERE
    /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/
    enemies.add(new Wizard("Generic E1"));
    //Adventurers you control:
    //Make an ArrayList of Adventurers and add 3 Adventurers to it.
    ArrayList<Adventurer> party = new ArrayList<>();
    party.add(new Wizard("Generic P1"));
    party.add(new Warrior("Generic P2"));
    party.add(new Warrior("Generic P3"));
    /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
    //YOUR CODE HERE
    /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/

    //Main loop
    boolean partyTurn = false;
    int whichPlayer = 0;
    int turn = 0;


    String input = "";
    Scanner in = new Scanner(System.in);
    while(! (input.equalsIgnoreCase("q") || input.equalsIgnoreCase("quit"))){

      //Draw the window border
      Text.hideCursor();
      drawScreen();

      //display event based on last turn's input
      if(partyTurn){
        //Process user input:
        if(input.equals("attack") || input.equals("")){
          /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
          //YOUR CODE HERE
          /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/
          drawTextAttackResult(party.get(whichPlayer).attack(enemies.get(0)));
        }
        else if(input.equals("special")){
          /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
          //YOUR CODE HERE
          /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/
          drawTextAttackResult(party.get(whichPlayer).specialAttack(enemies.get(0)));
        }
        whichPlayer++;



        if(whichPlayer < party.size()){
          drawTextPrompt("Enter command for " + party.get(whichPlayer) + ": attack/special/quit");
        }else{
          drawTextPrompt("Press enter to see monster's turn");
          partyTurn = false;
        }
      }else{
        //this block ignores user input!
        //display enemy attack except on turn 0.
        if(turn > 0){
          //Enemy action choices go here!
          /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
          //YOUR CODE HERE
          /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/
          drawTextAttackResult(enemies.get(0).attack(party.get((int)(Math.random() * party.size()))));
        }

        //after enemy goes, change back to player's turn.
        partyTurn=true;
        whichPlayer = 0;
        //display which player's turn is next and prompt for action.
        drawTextPrompt("Enter command for " + party.get(whichPlayer) + ": attack/special/quit");

        //end the turn.
        turn++;

      }

      //display current state of all Adventurers
      drawParty(party,2);
      drawParty(enemies,HEIGHT-3);

      //Draw the prompt
      Text.reset();
      Text.go(HEIGHT+1,1);
      Text.showCursor();
      System.out.print(">");
      //Read user input
      input = in.nextLine();
    }

    //After quit reset things:
    Text.reset();
    Text.showCursor();
    Text.go(32,1);
  }
}
