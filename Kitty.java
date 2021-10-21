public class Kitty{
	private String _name = "Mittens";
	private int _age = 2;
	public Kitty(String name, int age){
		if(age >= 0){
			_age = age;
		}
		if(!name.equals(" ")){
			_name = name;
		}
	}
	public Kitty(){
	}
	public String getName(){
		return _name;
	}
	public int getAge(){
		return _age;
	}
}