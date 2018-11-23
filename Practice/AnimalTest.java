/*
접근 지시자
public int a 모든 class에서 접근 가능
protected int b  같은 package이거나 자식 class까지 접근 가능
int c 같은 package 내부에서만 접근 가능
private int d

클래스는 전부 public
*/

class Animal{
	int full;
	int age = 5;
	void printAge(){
		System.out.printf("내 나이는 %d살 입니다.", age);
	}
}

class Dog extends Animal{
	@Override
	void printAge(){
		super.printAge();
		System.out.printf("멍멍!!\n");
	}
}

class Cat extends Animal{
	@Override
	void printAge(){
		super.printAge();
		System.out.printf("야옹!!\n");
	}
}

public class AnimalTest{
	public static void main(String [] args){
		Dog d = new Dog();
		Cat c = new Cat();
		c.printAge();
		d.printAge();
	}
}

//signature가 같으면 override(재정의), 다르면 overload(중복정의)
//필드는 재정의가 불가능 하다