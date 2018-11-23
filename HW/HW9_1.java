public class HW9_1{
	public static void main(String [] args){
		Animal animal[]={new Cat("�����"), new Dolphin("����"), new Dove("��ѱ�")};
		for(Animal a: animal) a.move();
	}
}

class Animal{
	String name;
	
	public Animal(){
	}
	
	public Animal(String name){
		this.name = name;
	}
	
	public void move(){
		System.out.printf("���� %s�̰�, ", this.name);
	}
}
class Cat extends Animal{
	public Cat(){
	}
	
	public Cat(String name){
		super(name);
	}
	
	@Override
	public void move(){
		super.move();
		System.out.println("�޸��ϴ�.");
	}
	
}
class Dolphin extends Animal{
	public Dolphin(){
	}
	
	public Dolphin(String name){
		super(name);
	}
	
	@Override
	public void move(){
		super.move();
		System.out.println("�����մϴ�.");
	}
	
}
class Dove extends Animal{
	public Dove(){
	}
	
	public Dove(String name){
		super(name);
	}
	
	@Override
	public void move(){
		super.move();
		System.out.println("���ƴٴմϴ�.");
	}
	
}