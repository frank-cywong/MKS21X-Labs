public class SuperArray{
  private String[] data;
  private int size;
  public SuperArray(){
    data = new String[10];
    size = 0;
  }
  public SuperArray(int capacity){
    if(capacity < 0){
      throw new IllegalArgumentException("Error: Attempted to initialise SuperArray with negative size = "+capacity);
    }
    data = new String[capacity];
    size = 0;
  }
  private void resize(){
	  String[] temp = new String[data.length*2+1];
	  for(int i = 0; i < data.length; i++){
		  temp[i] = data[i];
	  }
	  data = temp;
  }
  public boolean add(String temp){
    if(size >= data.length){
      resize();
    }
    data[size] = temp;
    size++;
    return true;
  }
  public void add(int index, String s){
	  if(index < 0 || index > size){
		  throw new IndexOutOfBoundsException("Error: SuperArray.add(int index, String s) called with invalid index = "+index);
	  }
	  if(size == data.length){
		  resize();
	  }
	  for(int i = size; i > index; i--){
		  data[i] = data[i-1];
	  }
	  data[index] = s;
	  size++;
  }
  public String remove(int index){
    if(index < 0 || index >= size){
      throw new IndexOutOfBoundsException("Error: SuperArray.remove() called with invalid i = "+index);
    }
    String temp = data[index];
    for(int i = index; i < size; i++) {
      if(i == size - 1){
        data[i] = null;
        break;
      }
      data[i] = data[i+1];
    }
    size--;
    return temp;
  }
  public boolean remove(String s){
	  int index = indexOf(s);
	  if(index < 0){
		  return false;
	  }
	  String temp = remove(index);
	  return true;
  }
  public int size(){
	  return size;
  }
  public int indexOf(String s){
	  for(int i = 0; i < size; i++){
		  if(data[i].equals(s)){
			  return i;
		  }
	  }
	  return -1;
  }
  public int lastIndexOf(String s){
	  for(int i = size - 1; i >= 0; i--){
		  if(data[i].equals(s)){
			  return i;
		  }
	  }
	  return -1;
  }
  public String toString(){
	  String output = "[";
	  for(int i = 0; i < size; i++){
		  if(i != 0){
			  output += ", ";
		  }
		  output += data[i];
	  }
	  output += "]";
	  return output;
  }
  public String toStringDebug(){
	  String output = "[";
	  for(int i = 0; i < data.length; i++){
		  if(i != 0){
			  output += ", ";
		  }
		  output += data[i];
	  }
	  output += "]";
	  return output;
  }
  public String get(int i){
	  if(i < 0 || i >= size){
		  throw new IndexOutOfBoundsException("Error: SuperArray.get() called with invalid i = "+i);
	  }
	  return data[i];
  }
  public String set(int i, String val){
	  if(i < 0 || i >= size){
		  throw new IndexOutOfBoundsException("Error: SuperArray.set() called with invalid i = "+i);
	  }
	  String old = data[i];
	  data[i] = val;
	  return old;
  }
}
