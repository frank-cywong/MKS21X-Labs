import java.util.Scanner;
import java.util.ArrayList;
public class UserInput{
  public static void printMessage(){
    System.out.println("Enter a non negative number. A negative number will end the program:");
  }
  public static void main(String[] args){
    ArrayList<Double> l = new ArrayList<Double>();
    Scanner s = new Scanner(System.in);
    double temp;
    double sum = 0;
    double min = 0;
    double max = 0;
    printMessage();
    while(true){
      if(s.hasNextDouble()){
        temp = s.nextDouble();
        if(temp < 0){
          break;
        }
        if(l.size() == 0){
          min = temp;
          max = temp;
        } else {
          if(temp < min){
            min = temp;
          }
          if(temp > max){
            max = temp;
          }
        }
        l.add(temp);
        sum += temp;
        printMessage();
      }
    }
    System.out.println("You entered: "+l.toString());
    if(l.size() == 0){
      System.out.println("Mean: NA");
      System.out.println("Min value: NA");
      System.out.println("Max value: NA");
      return;
    }
    System.out.println("Mean: "+(sum / l.size()));
    System.out.println("Max value: "+max);
    System.out.println("Min value: "+min);
  }
}
