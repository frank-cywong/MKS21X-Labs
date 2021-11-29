public class BinarySearch{
  public static int binarySearch(int[] data, int target){
    int l = 0;
    int r = data.length - 1;
    int m;
    while(l <= r){
      m = (l + r) / 2;
      if(data[m] == target){
        return m;
      }
      if(data[m] < target){
        l = m + 1;
      } else {
        r = m - 1;
      }
    }
    return -1;
  }
}
