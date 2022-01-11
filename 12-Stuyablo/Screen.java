public class Screen{
  public static void border(int w, int h){
    String ws = "";
    String borderchar = " ";
    for(int i = 0; i < w; i++){
      ws += borderchar;
    }
    for(int i = 1; i <= h; i++){
      if(i == 1 || i == h){
        System.out.println(Text.colorize(ws, Text.BACKGROUND + Text.CYAN));
      }
      else {
        System.out.print(Text.colorize(borderchar, Text.BACKGROUND + Text.CYAN));
        Text.go(i, w);
        System.out.println(Text.colorize(borderchar, Text.BACKGROUND + Text.CYAN));
      }
    }
  }
  public static void main(String[] args){
    Text.clear();
    Text.go(1,1);
    border(80,30);
    int[] temp = new int[4];
    for(int i = 0; i < temp.length; i++){
      temp[i] = (int)(Math.random() * 100);
    }
    int sc = 2;
    int inc = 78 / 4;
    for(int i = 0; i < temp.length; i++){
      int val = temp[i];
      Text.go(2, sc);
      if(val < 25){
        System.out.print(Text.colorize(""+val, Text.RED));
      } else if(val > 75){
        System.out.print(Text.colorize(""+val, Text.GREEN));
      } else {
        System.out.print(Text.colorize(""+val, Text.WHITE));
      }
      sc += inc;
    }
    Text.go(31,1);
  }
}
