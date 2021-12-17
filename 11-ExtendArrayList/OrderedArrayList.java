public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }
  public OrderedArrayList(int c){
    super(c);
  }
  @Override
  public boolean add(T v){
    super.add(whereToPlace(v), v);
    return true;
  }
  @Override
  public void add(int i, T v){
    add(v);
  }
  @Override
  public T set(int i, T v){
    T toreturn = remove(i);
    add(v);
    return toreturn;
  }
  private int whereToPlace(T v){
    for(int i = 0; i < super.size(); i++){
      if(v.compareTo(super.get(i)) < 0){
        return i;
      }
    }
    return super.size();
  }
}
