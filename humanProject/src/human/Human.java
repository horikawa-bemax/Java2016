package human;

public abstract class Human{
	String name;
	int age;
	
	public Human(String _name, int _age){
		name = _name;
		age = _age;
	}
	
	public String getName(){
		return name;
	}
	
	public abstract void say();

	public void setName(String name){
		this.name = name;
	}

	public void setAge(int age){
		this.age = age;
	}

	public int getAge(){
		return age;
	}

}
