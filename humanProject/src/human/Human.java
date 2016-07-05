package human;

public abstract class Human{
	private String name;
	
	public Human(String _name){
		name = _name;
	}
	
	public String getName(){
		return name;
	}
	
	public abstract void say();
}
