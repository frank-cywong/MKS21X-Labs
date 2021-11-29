import java.util.Arrays;
public class Driver{
  public static void main(String[] args){
    System.out.println(BinarySearch.binarySearch(new int[]{-1,-1,-1,-1,-1,-1,-1},-1)); // should be 3
    System.out.println(BinarySearch.binarySearch(new int[]{-1,-1,-1,-1,-1,-1,-1},0)); // should be -1
    System.out.println(BinarySearch.binarySearch(new int[]{-1,-1,-1,0,1,1,1},-1)); // should be 1
    System.out.println(BinarySearch.binarySearch(new int[]{-1,-1,-1,0,1,1,1},0)); // should be 3
    System.out.println(BinarySearch.binarySearch(new int[]{-1,-1,-1,0,1,1,1},1)); // should be 5
    System.out.println(BinarySearch.binarySearch(new int[]{-1,-1,-1,0,1,1,1},-2)); // should be -1
    int[] temp;
    int ans, size;
    for(int i = 0; i < 10; i++){
      temp = new int[i];
      for(int j = 0; j < i; j++){
        temp[j] = j;
      }
      for(int j = -1; j < 11; j++){
        ans = BinarySearch.binarySearch(temp,j);
        if(ans == -1 && (j < 0 || j >= i)){
          continue; // correct
        }
        if(ans == j && (j >= 0 && j < i)){
          continue; // correct
        }
        System.out.println("Error in case: "+Arrays.toString(temp)+", j = "+j);
      }
    }
    for(int i = 0; i < 20; i++){
      size = (int)(Math.random()*11);
      temp = new int[size];
      for(int j = 0; j < size; j++){
        temp[j] = (int)(Math.random()*21)-10;
      }
      Arrays.sort(temp);
      for(int j = -10; j <= 10; j++){
        ans = BinarySearch.binarySearch(temp,j);
        if(ans == -1 && !Arrays.asList(temp).contains(j)){
          continue; // correct
        }
        if(temp[ans] == j){
          continue; // correct
        }
        System.out.println("Error in case: "+Arrays.toString(temp)+", j = "+j);
      }
    }
  }
}
