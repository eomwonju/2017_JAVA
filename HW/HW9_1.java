public class HW9_1{
	public static void main(String [] args){
		Animal animal[]={new Cat("고양이"), new Dolphin("돌고래"), new Dove("비둘기")};
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
		System.out.printf("나는 %s이고, ", this.name);
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
		System.out.println("달립니다.");
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
		System.out.println("수영합니다.");
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
		System.out.println("날아다닙니다.");
	}
	
}