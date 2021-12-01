import java.util.Arrays;
public class Driver{
  public static void main(String[] args){
    int[] t1 = {3,-1,0,1,2};
    int[] t2 = {1,2,3,4};
    int[] t3 = {-10,11,-11,10};
    int[] t4 = {5,4,3,2,1};
    Sorts.bubbleSort(t1);
    System.out.println(Arrays.toString(t1)); // -1,0,1,2,3
    Sorts.bubbleSort(t2);
    System.out.println(Arrays.toString(t2)); // 1,2,3,4
    Sorts.bubbleSort(t3);
    System.out.println(Arrays.toString(t3)); // -11,-10,10,11
    Sorts.bubbleSort(t4);
    System.out.println(Arrays.toString(t4)); // 1,2,3,4,5
  }
}
