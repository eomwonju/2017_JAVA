/*
���� ������
public int a ��� class���� ���� ����
protected int b  ���� package�̰ų� �ڽ� class���� ���� ����
int c ���� package ���ο����� ���� ����
private int d

Ŭ������ ���� public
*/

class Animal{
	int full;
	int age = 5;
	void printAge(){
		System.out.printf("�� ���̴� %d�� �Դϴ�.", age);
	}
}

class Dog extends Animal{
	@Override
	void printAge(){
		super.printAge();
		System.out.printf("�۸�!!\n");
	}
}

class Cat extends Animal{
	@Override
	void printAge(){
		super.printAge();
		System.out.printf("�߿�!!\n");
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

//signature�� ������ override(������), �ٸ��� overload(�ߺ�����)
//�ʵ�� �����ǰ� �Ұ��� �ϴ�