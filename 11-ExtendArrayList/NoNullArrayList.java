import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList(){
    super();
  }
  public boolean add(T e){
    if(e == null){
      throw new IllegalArgumentException("Cannot add null to NoNullArrayList.");
    }
    return super.add(e);
  }
  public void add(int x, T e){
    if(e == null){
      throw new IllegalArgumentException("Cannot add null to NoNullArrayList");
    }
    super.add(x, e);
  }
  public T set(int x, T e){
    if(e == null){
      throw new IllegalArgumentException("Cannot set a value to null in NoNullArrayList");
    }
    return super.set(x, e);
  }
}
