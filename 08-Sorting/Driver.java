import java.util.Arrays;
public class Driver{
  public static void testCase(int[] a){
    int[] b = a.clone();
    int[] c = a.clone();
    int[] d = a.clone();
    Arrays.sort(a);
    Sorts.bubbleSort(b);
    Sorts.selectionSort(c);
    Sorts.insertionSort(d);
    if(!Arrays.equals(a,b)){
      System.out.println("Error in test case for bubble sort: "+Arrays.toString(a));
    }
    if(!Arrays.equals(a,c)){
      System.out.println("Error in test case for selection sort: "+Arrays.toString(a));
    }
    if(!Arrays.equals(a,d)){
      System.out.println("Error in test case for insertion sort: "+Arrays.toString(a));
    }
  }
  public static boolean isSorted(int[] a){
    for(int i = 0; i < (a.length - 1); i++){
      if(a[i] > a[i+1]){
        return false;
      }
    }
    return true;
  }
  public static int[] randomArray(int range, int size){
    int[] temp = new int[size];
    for(int i = 0; i < size; i++){
      temp[i] = (int)(Math.random() * range)-(range / 2);
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
    int[] t11 = {3,3,3,3,3,3,3};
    int[] t12 = {3,3,3,2,4,3,3,3,4,5};
    int[] t13 = {7,5,4,2};
    int[] t14 = {5,1,12,-5,16,2,12,14};
    int[] t15 = {12,11,13,5,6};
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
    /*
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
    */
    // Using new test method
    testCase(t1);
    testCase(t2);
    testCase(t3);
    testCase(t4);
    testCase(t5);
    testCase(t6);
    testCase(t7);
    testCase(t8);
    testCase(t9);
    testCase(t10);
    testCase(t11);
    testCase(t12);
    testCase(t13);
    //Sorts.selectionSort(t13);
    testCase(t14);
    //Sorts.selectionSort(t14);
    testCase(t15);
    //Sorts.insertionSort(t15);
    System.out.println("Fixed test cases tested");
    for(int i = 0; i < 100; i++){
      tempa = randomArray(100,20);
      testCase(tempa);
    }
    for(int i = 0; i < 100; i++){
      tempa = randomArray(10,100);
      testCase(tempa);
    }
    for(int i = 0; i < 100; i++){
      tempa = randomArray((int)(Math.random()*1000),(int)(Math.random()*1000));
      testCase(tempa);
    }
    System.out.println("Randomised test cases tested");
  }
}
