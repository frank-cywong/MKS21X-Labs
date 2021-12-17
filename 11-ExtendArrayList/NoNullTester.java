public class NoNullTester{
  public static void main(String[] args){
    NoNullArrayList<String> n = new NoNullArrayList<String>(1);
    n.add("test");
    n.add(0,"value0");
    n.set(1,"value1");
    System.out.println(n);
    try{
      n.add(null);
      System.out.println("SHOULD NOT OCCUR: NO ERROR CALLED ON ADDING NULL");
    } catch (IllegalArgumentException e){
      System.out.println("Successfully failed to add null");
    }
    try{
      n.add(1,null);
      System.out.println("SHOULD NOT OCCUR: NO ERROR CALLED ON ADDING NULL");
    } catch (IllegalArgumentException e){
      System.out.println("Successfully failed to add null");
    }
    try{
      n.set(1,null);
      System.out.println("SHOULD NOT OCCUR: NO ERROR CALLED ON ADDING NULL");
    } catch (IllegalArgumentException e){
      System.out.println("Successfully failed to add null");
    }
    System.out.println(n);
    OrderedArrayList<String> o = new OrderedArrayList<String>();
    o.add("test1");
    o.add("test2");
    o.set(1,"test0");
    System.out.println(o);
  }
}
