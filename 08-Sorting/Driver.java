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
  public static int[] randomArray(){
    int[] temp = new int[20];
    for(int i = 0; i < 20; i++){
      temp[i] = (int)(Math.random() * 100);
    }
    return temp;
  }
  public static void main(String[] args){
    int[] t1 = {3,-1,0,1,2};
    int[] t2 = {1,2,3,4};
    int[] t3 = {-10,11,-11,10};
    int[] t4 = {5,4,3,2,1};
    int[] t5 = new int[50];
    int[] t6 = {};
    int[] t7 = {1};
    int[] t8 = {0,1};
    int[] t9 = {1,0};
    int[] t10 = new int[200];
    int temp = 2021;
    int temp2 = 6171;
    int[] tempa;
    for(int i = 0; i < 50; i++){ // basically collatz conjecture
      t5[i] = temp;
      temp = (temp % 2 == 0 ? temp / 2 : (temp * 3 + 1));
    }
    for(int i = 0; i < 200; i++){
      t10[i] = temp2;
      temp2 = (temp2 % 2 == 0 ? temp2 / 2 : (temp2 * 3 + 1));
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
    Sorts.bubbleSort(t6);
    System.out.println(Arrays.toString(t6)); // {}
    Sorts.bubbleSort(t7);
    System.out.println(Arrays.toString(t7)); // {1}
    Sorts.bubbleSort(t8);
    System.out.println(Arrays.toString(t8)); // {0,1}
    Sorts.bubbleSort(t9);
    System.out.println(Arrays.toString(t9)); // {1,0}
    //System.out.println(Arrays.toString(t10));
    System.out.println(isSorted(t10));
    Sorts.bubbleSort(t10);
    //System.out.println(Arrays.toString(t10));
    System.out.println(isSorted(t10));
    for(int i = 0; i < 100; i++){
      tempa = randomArray();
      Sorts.bubbleSort(tempa);
      if(!isSorted(tempa)){
        System.out.println("Error in test case for: "+Arrays.toString(tempa));
      }
    }
  }
}
