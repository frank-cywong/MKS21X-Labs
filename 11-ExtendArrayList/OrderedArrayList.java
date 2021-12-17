public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }
  public OrderedArrayList(int c){
    super(c);
  }
  @Override
  public boolean add(T v){
    return super.add(whereToPlace(v), v);
  }
  @Override
  public void add(int i, T v){
    add(v);
  }
  @Override
  public T set(int i, T v){
    T toreturn = remove(i);
    add(v);
  }
}
