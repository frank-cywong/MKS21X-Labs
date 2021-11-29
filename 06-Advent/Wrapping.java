import java.io.*;
import java.util.Scanner;
public class Wrapping{
	public static int surfacearea(int a, int b, int c){
		int sa, sb, sc;
		sa = a * b;
		sb = a * c;
		sc = b * c;
		return(Math.min(sa,Math.min(sb,sc)) + (2 * (sa + sb + sc)));
	}
	public static int ribbon(int a, int b, int c){
		return(a*b*c+2*Math.min(Math.min(a+b,b+c),a+c));
	}
	public static void main(String[] args) {
		try{
			File f = new File(args[0]);
			Scanner i = new Scanner(f);
			int output = 0;
			String[] temp;
			while(i.hasNextLine()){
				temp = i.nextLine().split("x");
				if(args[1].equals("1")){
					output += surfacearea(Integer.parseInt(temp[0]),Integer.parseInt(temp[1]),Integer.parseInt(temp[2]));
				} else if(args[1].equals("2")){
					output += ribbon(Integer.parseInt(temp[0]),Integer.parseInt(temp[1]),Integer.parseInt(temp[2]));
				}
			}
			System.out.println(output);
		} catch (FileNotFoundException e){
		}
	}
}
