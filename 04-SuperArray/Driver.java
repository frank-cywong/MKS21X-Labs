public class Driver{
	public static void main(String[] args){
		SuperArray SA = new SuperArray();
		SA.add("test");
		SA.add("test2");
		System.out.println(SA);
		System.out.println(SA.toStringDebug());
		System.out.println(SA.size());
		SA.add("test3");
		System.out.println(SA);
		System.out.println(SA.toStringDebug());
		System.out.println(SA.size());
		System.out.println(SA.get(1)); // test2
		System.out.println(SA.get(-1)); // should print error, return null
		System.out.println(SA.get(3)); // should print error, return null
		System.out.println(SA.set(-1,"test4")); // should print error, return null
		System.out.println(SA.set(0,"test4")); // test
		System.out.println(SA.set(3,"test5")); // should print error, return null
		System.out.println(SA.toStringDebug()); // [test4, test2, test3, null...]
	}
}
