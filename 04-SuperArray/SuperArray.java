public class SuperArray{
  private String[] data;
  private int size;
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
      //resize(); code this in later
    }
    data[size] = temp;
    size++;
  }
  public int size(){
	  return size;
  }
  public String toString(){
	  String output = "{";
	  return output;
  }
  public String toStringDebug(){
	  String output = "{";
	  for(int i = 0; i < data.length; i++){
		  if(i != 0){
			  output += ", ";
		  }
		  output += data[i];
	  }
	  output += "}";
	  return output;
  }
}
