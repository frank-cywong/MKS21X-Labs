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
		//System.out.println(SA.get(-1)); // should print error, return null
		//System.out.println(SA.get(3)); // should print error, return null
		//System.out.println(SA.set(-1,"test4")); // should print error, return null
		System.out.println(SA.set(0,"test4")); // test
		//System.out.println(SA.set(3,"test5")); // should print error, return null
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
		SA.add("test11");
		System.out.println(SA.toStringDebug());
		SuperArray SA2 = new SuperArray(0);
		System.out.println(SA2);
		System.out.println(SA2.toStringDebug());
		for(int i = 0; i < 10; i++){
			SA2.add("test2-"+i);
			System.out.println(SA2.toStringDebug());
		}
		for(int i = 0; i < SA2.size(); i++){
			System.out.println(SA2.get(i));
		}
		for(int i = 0; i < SA2.size(); i++){
			SA2.set(i,"test3-"+i*2);
		}
		System.out.println(SA2.toStringDebug());
		System.out.println(SA2.remove(2));
		System.out.println(SA2.toStringDebug());
		while(SA2.size() > 2){
			System.out.println(SA2.remove(0));
		}
		System.out.println(SA2.toStringDebug());
		for(int i = SA2.size(); i < 8; i++){
			System.out.println(SA2.add("test4-"+i*3));
		}
		System.out.println(SA2.toStringDebug());
		//while(SA2.remove(0) != null){} - should cause error but successfully clear SuperArray
		while(SA2.size() > 0){
			SA2.remove(0);
		}
		System.out.println(SA2.toStringDebug()); // should be empty
		SA.add("looptest4");
		System.out.println(SA);
		System.out.println(SA.indexOf("looptest4")); // 3
		System.out.println(SA.indexOf("looptest3")); // 2
		System.out.println(SA.indexOf("test")); // -1
		System.out.println(SA.lastIndexOf("looptest4")); // 11
		System.out.println(SA.lastIndexOf("looptest3")); // 2
		System.out.println(SA.lastIndexOf("null")); // -1
		System.out.println(SA.remove("looptest4")); // true
		System.out.println(SA.remove("looptest4")); // true
		System.out.println(SA.remove("looptest4")); // false
		System.out.println(SA);
		//SA.add(-1,"errortest"); // should print error
		SA.add(3,"addtest4");
		System.out.println(SA.toStringDebug());
		SA.add(SA.size(),"endaddtest");
		System.out.println(SA.toStringDebug());
		SA2 = new SuperArray(0);
		System.out.println(SA2.toStringDebug());
		//SA2.add(1,"errortest2"); // should print error
		SA2.add(0,"val0");
		System.out.println(SA2.toStringDebug());
		SA2.add(1,"val1");
		System.out.println(SA2.toStringDebug());
		SA2.add(2,"val2");
		System.out.println(SA2.toStringDebug());
		SA2.add(3,"val4");
		System.out.println(SA2.toStringDebug());
		SA2.add(3,"val3");
		System.out.println(SA2.toStringDebug());
		System.out.println(SA);
		for(int i = 0; i < 10; i++){
			SA.remove("looptest"+i);
		}
		System.out.println(SA);
		for(int i = 0; i < 10; i++){
			SA.add(0,"looptest2."+i);
		}
		System.out.println(SA);
	}
}
