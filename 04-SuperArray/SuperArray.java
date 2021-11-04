public class SuperArray{
  private String[] data;
  public size;
  public SuperArray(){
    data = new String[10];
    size = 0;
  }
  public SuperArray(int capacity){
    data = new String[capacity];
    size = 0;
  }
  public void add(String temp){
    if(size >= data.length){
      resize();
    }
    data[size] = temp;
    size++;
  }
}
