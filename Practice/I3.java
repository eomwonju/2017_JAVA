class Car{//�ڵ����� ���α׷��� = �ڵ��� Ŭ������ ����
	//�ʵ�
	String brand;
	int age;
	int mileage;//����Ÿ�, �ʵ�� 0���� �ڵ� �ʱ�ȭ ��
	
	//�޼ҵ�
	void goStraight(int dist){//�����ϴ� �޼ҵ�
		System.out.println(dist+"m �����մϴ�.");	
		mileage += dist;
	}

	void turnRight (){//��ȸ���ϴ� �޼ҵ�
		System.out.println("��ȸ���մϴ�.");		
	}
	
	void turnLeft (){//��ȸ���ϴ� �޼ҵ�
		System.out.println("��ȸ���մϴ�.");		
	}
	
	void goBack (int dist){//�����ϴ� �޼ҵ�
		System.out.println(dist+"m �����մϴ�.");
		mileage += dist;
	}
}

class I{
	public static void main (String [] args){
		Car myCar1 = new Car();//�ڵ����� �� �� �������
		System.out.println("�� ���� ����Ÿ� : "+myCar1.mileage);
		myCar1.goStraight(100);
		System.out.println("�� ���� ����Ÿ� : "+myCar1.mileage);
		myCar1.goBack(100);
		System.out.println("�� ���� ����Ÿ� : "+myCar1.mileage);
		myCar1.turnLeft();
		myCar1.turnRight();
		System.out.println("�� ���� ����Ÿ� : "+myCar1.mileage);
		
		Car myCar2 = new Car();
		myCar2.goStraight(100);
		
	}
}