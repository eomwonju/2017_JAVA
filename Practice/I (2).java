//��������ġ�� ���� ���̸� �ش�.
//�������� ���ٸ�(fill>10) ����ش�.
//�������� ���ٸ� ���̸� �ش�.


//������

class Dog{//Ŭ������ ���赵!! �� Ŭ������ �������� ���赵
	//�Ӽ�
	int fill;
	//�ʵ�� �ʱ�ȭ ������ ���ٸ� �ڵ����� (�ڷ����� �´�) 0���� �ʱ�ȭ�� ��.
	//�� : boolean b;//b = false;

	
	//�ൿ
	//1. �Ա�
	void eat(int feed){
		if(feed<0) System.out.println("�峭ġ�� ������.");
		else if(feed<10){fill += feed; System.out.println("�� �Ծ����ϴ�.");}
		else System.out.println("�������ڴ�.");
	}
	
	//2. ���
	void play(){
		System.out.println("����ִ�. �����մϴ�.");
	}		
}

public class I{
	public static void main(String [] args){
		Dog myDog = new Dog();//new Dog()�� �ϸ鼭 ���� ������(������ �ν��Ͻ�, ��ü)�� �������
		
		System.out.println("������ ������ : "+myDog.fill);
		
		for(int i=0; i<3; i++){
			if(myDog.fill>10) myDog.play();
			else myDog.eat(8);
		}
	}
}