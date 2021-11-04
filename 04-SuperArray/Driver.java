public class Driver{
	public static void main(String[] args){
		SuperArray SA = new SuperArray();
		SA.add("test");
		SA.add("test2");
		System.out.println(SA);
		System.out.println(SA.toStringDebug());
	}
}
