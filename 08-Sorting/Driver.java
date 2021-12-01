import java.util.Arrays;
public class Driver{
  public static boolean isSorted(int[] a){
    for(int i = 0; i < (a.length - 1); i++){
      if(a[i] > a[i+1]){
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args){
    int[] t1 = {3,-1,0,1,2};
    int[] t2 = {1,2,3,4};
    int[] t3 = {-10,11,-11,10};
    int[] t4 = {5,4,3,2,1};
    int[] t5 = new int[50];
    int temp = 2021;
    for(int i = 0; i < 50; i++){ // basically collatz conjecture
      t5[i] = temp;
      temp = (temp % 2 == 0 ? temp / 2 : (temp * 3 + 1));
    }
    Sorts.bubbleSort(t1);
    System.out.println(Arrays.toString(t1)); // -1,0,1,2,3
    Sorts.bubbleSort(t2);
    System.out.println(Arrays.toString(t2)); // 1,2,3,4
    Sorts.bubbleSort(t3);
    System.out.println(Arrays.toString(t3)); // -11,-10,10,11
    Sorts.bubbleSort(t4);
    System.out.println(Arrays.toString(t4)); // 1,2,3,4,5
    //System.out.println(Arrays.toString(t5)); // used to test isSorted
    System.out.println(isSorted(t5));
    Sorts.bubbleSort(t5);
    //System.out.println(Arrays.toString(t5));
    System.out.println(isSorted(t5));
  }
}
