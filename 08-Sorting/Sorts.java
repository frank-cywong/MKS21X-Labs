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
}
