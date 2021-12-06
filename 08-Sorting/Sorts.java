//import java.util.Arrays;
public class Sorts{
  public static void bubbleSort(int[] data){
    int temp;
    boolean swap = false;
    for(int k = data.length - 1; k >= 0; k--){
      swap = false;
      for(int i = 0; i < k; i++){
        if(data[i] > data[i+1]){
          temp = data[i+1];
          data[i+1] = data[i];
          data[i] = temp;
          swap = true;
        }
      }
      if(!swap){
        return;
      }
    }
    return;
  }
  public static void selectionSort(int[] data){
    int tmin, tminl;
    //System.out.println(Arrays.toString(data));
    for(int i = 0; i < (data.length - 1); i++){
      tmin = data[i];
      tminl = i;
      for(int j = (i + 1); j < data.length; j++){
        if(data[j] < tmin){
          tmin = data[j];
          tminl = j;
        }
      }
      data[tminl] = data[i];
      data[i] = tmin;
      //System.out.println(Arrays.toString(data));
    }
    return;
  }
  public static void insertionSort(int[] data){
    int cur, j, temp;
    for(int i = 0; i < data.length; i++){
      cur = data[i];
      j = i;
      while(j > 0 && data[j-1] > cur){
        data[j] = data[j-1];
        j--;
      }
      data[j] = cur;
      //System.out.println(Arrays.toString(data));
    }
    return;
  }
}
