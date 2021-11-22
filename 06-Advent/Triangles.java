import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Triangles {
	public static boolean isTriangle(int a, int b, int c){
		int max = Math.max(a,Math.max(b,c));
		return((a+b+c)>(max*2));
	}
	public static void main(String[] args){
		String filename = "Triangle.in";
		if(args.length > 0){ // for testing purposes
			filename = args[0];
		}
		int output = 0;
		int temp1, temp2, temp3;
		try{
			File f = new File(filename);
			Scanner input = new Scanner(f);
			while(input.hasNextInt()){
				temp1 = input.nextInt(); // we can do this since we are assured the data is valid
				temp2 = input.nextInt();
				temp3 = input.nextInt();
				if(isTriangle(temp1,temp2,temp3)){
					output++;
				}
			}
			System.out.println(output);
		} catch (FileNotFoundException e){
			System.out.println("File "+filename+" not found");
		}
	}
}
