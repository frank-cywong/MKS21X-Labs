public class Screen{
  public static void border(int w, int h){
    String ws = "";
    String borderchar = " ";
    for(int i = 0; i < w; i++){
      ws += borderchar;
    }
    for(int i = 0; i < h; i++){
      if(i == 0 || i == (h-1)){
        System.out.println(Text.colorize(ws, Text.BACKGROUND + Text.CYAN));
      }
      else {
        System.out.print(Text.colorize(borderchar, Text.BACKGROUND + Text.CYAN));
        Text.go(i + 1, w);
        System.out.println(Text.colorize(borderchar, Text.BACKGROUND + Text.CYAN));
      }
    }
  }
  public static void main(String[] args){
    Text.clear();
    Text.go(1,1);
    border(80,30);
  }
}
