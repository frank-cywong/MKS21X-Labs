public class Driver{
  public static void main(String[] args){
    System.out.println(BinarySearch.binarySearch(new int[]{-1,-1,-1,-1,-1,-1,-1},-1)); // should be 3
    System.out.println(BinarySearch.binarySearch(new int[]{-1,-1,-1,-1,-1,-1,-1},0)); // should be -1
    System.out.println(BinarySearch.binarySearch(new int[]{-1,-1,-1,0,1,1,1},-1)); // should be 1
    System.out.println(BinarySearch.binarySearch(new int[]{-1,-1,-1,0,1,1,1},0)); // should be 3
    System.out.println(BinarySearch.binarySearch(new int[]{-1,-1,-1,0,1,1,1},1)); // should be 5
    System.out.println(BinarySearch.binarySearch(new int[]{-1,-1,-1,0,1,1,1},-2)); // should be -1
  }
}
