import java.util.ArrayList;
public class ArrayListPractice{
	public static ArrayList<String> replaceEmpty(ArrayList<String> data){
		ArrayList<String> output = new ArrayList<String>(data.size());
		for(int i = 0; i < data.size(); i++){
			if(data.get(i).equals("")){
				output.add("Empty");
			} else {
				output.add(data.get(i));
			}
		}
		return output;
	}
	public static ArrayList<String> makeReversedList(ArrayList<String> data){
		ArrayList<String> output = new ArrayList<String>(data.size());
		for(int i = data.size() - 1; i >= 0; i--){
			output.add(data.get(i));
		}
		return output;
	}
	public static ArrayList<String> mixLists(ArrayList<String> a, ArrayList<String> b){
		ArrayList<String> output = new ArrayList<String>(a.size() + b.size());
		ArrayList<String> larger;
		int sharedsize;
		if(a.size() > b.size()){
			larger = a;
			sharedsize = b.size();
		} else {
			larger = b;
			sharedsize = a.size();
		}
		for(int i = 0; i < sharedsize; i++){
			output.add(a.get(i));
			output.add(b.get(i));
		}
		for(int i = sharedsize; i < larger.size(); i++){
			output.add(larger.get(i));
		}
		return output;
	}
	public static void main(String[] args){
		ArrayList<String> t = new ArrayList<String>();
		ArrayList<String> t2 = new ArrayList<String>();
		ArrayList<String> t3 = new ArrayList<String>();
		for(int i = 0; i < 3; i++){
			t2.add(""+Math.random());
		}
		for(int i = 0; i < 5; i++){
			if(Math.random() < 0.5){
				t3.add(""+Math.random());
			} else {
				t3.add("");
			}
		}
		System.out.println(t);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(replaceEmpty(t3));
		/* these test cases are automated
		System.out.println(replaceEmpty(t));
		System.out.println(replaceEmpty(t2));
		System.out.println(makeReversedList(t));
		System.out.println(mixLists(t,t2));
		System.out.println(mixLists(t,t3));
		System.out.println(mixLists(t2,t));
		System.out.println(mixLists(t3,t));
		*/
		System.out.println(mixLists(t2,t3));
		System.out.println(mixLists(t3,t2));
		System.out.println(makeReversedList(t2));
		System.out.println(makeReversedList(t3));
		if(!replaceEmpty(t).equals(t)){
			System.out.println("Error 1");
		}
		if(!replaceEmpty(t2).equals(t2)){
			System.out.println("Error 2");
		}
		if(!makeReversedList(t).equals(t)){
			System.out.println("Error 3");
		}
		if(!mixLists(t,t2).equals(t2)){
			System.out.println("Error 4");
		}
		if(!mixLists(t,t3).equals(t3)){
			System.out.println("Error 5");
		}
		if(!mixLists(t2,t).equals(t2)){
			System.out.println("Error 6");
		}
		if(!mixLists(t3,t).equals(t3)){
			System.out.println("Error 7");
		}
	}
}
