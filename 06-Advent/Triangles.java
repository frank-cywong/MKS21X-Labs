import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Triangles {
	public static boolean isTriangle(int a, int b, int c){
		int max = Math.max(a,Math.max(b,c));
		return((a+b+c)>(max*2));
	}
	public static void method1(String filename){
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
			input.close();
		} catch (FileNotFoundException e){
			System.out.println("File "+filename+" not found");
		}
	}
	public static void method2(String filename){
		int output = 0;
		int[] temp = new int[9];
		try{
			File f = new File(filename);
			Scanner input = new Scanner(f);
			while(input.hasNextInt()){
				for(int i = 0 ; i < 9; i++){
					temp[i] = input.nextInt();
				}
				for(int n = 0; n < 3; n++){
					if(isTriangle(temp[n],temp[n+3],temp[n+6])){
						output++;
					}
				}
			}
			System.out.println(output);
			input.close();
		} catch (FileNotFoundException e){
			System.out.println("File "+filename+" not found");
		}
	}
	public static void main(String[] args){
		String filename = args[0];
		if(args[1].equals("1")){
			method1(filename);
		} else if (args[1].equals("2")){
			method2(filename);
		}
	}
}
