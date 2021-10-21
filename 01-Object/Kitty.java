public class Kitty{
	private String _name = "Mittens";
	private int _age = 2;
	public Kitty(String name, int age){
		_age = age;
		_name = name;
	}
	public Kitty(){
	}
	public String getName(){
		return _name;
	}
	public int getAge(){
		return _age;
	}
	public void changeName(String name){
		_name = name;
	}
	public void makeOlder(){
		_age++;
	}
	public String toString(){
		return("The amazing "+_name);
	}
}
