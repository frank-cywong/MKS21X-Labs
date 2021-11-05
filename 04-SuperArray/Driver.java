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
		for(int i = 0; i < 7; i++){
			SA.add("q");
		}
		System.out.println(SA);
		System.out.println(SA.toStringDebug());
		for(int i = 0; i < 10; i++){
			SA.set(i,"looptest"+i);
		}
		System.out.println(SA.toStringDebug());
		for(int i = 0; i < 10; i++){
			System.out.println(SA.get(i));
		}
		for(int i = 0; i < SA.size(); i++){
			if(i == SA.size() - 1){
				SA.set(i, "NOPE!");
				break;
			}
			SA.set(i, SA.get(i+1));
		}
		System.out.println(SA.toStringDebug());
	}
}
