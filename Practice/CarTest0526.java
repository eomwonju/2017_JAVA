class Car{
	//�ʵ� : ����Ÿ�, ����
	//�޼ҵ� : info() - ��ȯŸ�� : String
	//��� : �ڵ����� ���� ��ȯ
	//�ڵ����� ���� : �� �ڵ����� ����Ÿ��� %d km�̰�, %d��� �Դϴ�.
	int mileage;
	int year;
	//���� �� �ʵ�� ��ü�� ����
	static int numOfCar;//�� �ʵ�� ��� ��ü�� �����ϵ��� �������//Ű���� : static//Ŭ������ ����
	
	/*
	static void printYear(){//�Ұ���
		System.out.println("year: "+year);//year�� ��ü�� �����Ǿ�� ���������� �� �޼ҵ�� static �޼ҵ� �̹Ƿ� ������ �ڵ���(��ü)�� ���� ���� ȣ�� ����
		//�ڵ����� ���µ�, �����̳İ� ���� �Ͱ� �����Ƿ� ��ġ�� ���� �ʾ� ������ �Ұ�.
		//static�� static ���� ���(�޼ҵ�, �ʵ�)�� ȣ�� ����
	}
	*/
	
	String info(){
		return String.format("�� �ڵ����� ����Ÿ��� %d km�̰�, %d��� �Դϴ�.", mileage, year);
	}
	
	//������ : Ư���� �޼ҵ�
	//�޼ҵ� �̸� = Ŭ���� �̸�
	//��ȯ Ÿ���� ����, void�� �ƴ�
	//��� : ��ü�� ������ �� ȣ��Ǿ�, ��ü�� �ʵ带 �ʱ�ȭ�ϴ� ����
	
	Car(){//������-����Ʈ ������ : �Ű������� ���� ������
		//������ 2017������ �ʱ�ȭ �� ��.
		this(2017);//this.year = 2017
	}
	
	Car (int y){//������ �ʱ�ȭ�ϴ� ������
		if(y>0&&y<=2017) year = y;
		else year = 2017;
		numOfCar++;//Car�� ������ �� ������ �����
	}
	
	/*
	Car (int m){
		this.mileage = mileage;
	}
	*/
	//�޼ҵ� signature�� ���� ������ �ߺ� ���� �Ұ�
	
	Car(int year, int mileage){//����Ÿ��� ������ �ʱ�ȭ�ϴ� ������
		//this.year = year;//this.year = �� Ŭ������ year
		this(year);
		this.mileage = mileage;//this.mileage = �� Ŭ������ mileage
	}
}
class CarTest0526{
		public static void main(String [] args){
			System.out.printf("�������� ������ �ڵ����� %d�� �Դϴ�.", Car.numOfCar);//static �ʵ�� ��ü�� ��������� ���� ��Ȳ������ ȣ�� ����
			
			Car myCar = new Car(2017, 50);
			//�ڵ��� ���� �ÿ� 2017���, ����Ÿ��� 50km
			System.out.println("�ڵ����� ���� : "+myCar.info());
			
			Car yourCar = new Car(2010, 500000);
			//�ڵ��� ���� �ÿ� 2010���, ����Ÿ��� 500000km
			System.out.println("�ڵ����� ���� : "+yourCar.info());
			
			Car c1 = new Car(2016);
			Car c2 = new Car(2015);
			
			System.out.printf("�������� ������ �ڵ����� %d�� �Դϴ�.", Car.numOfCar);//static Ű���尡 ���� �ʵ�� ��ü��������.�ʵ尡 �ƴ϶� Ŭ����.�ʵ�
		}
	}
	
	//static �޼ҵ��� Ư¡ 1. ��ü�� ��������� ���� ��Ȳ������ ȣ�� ����  2. ��ü���� ��� ���� ���̰� ���� ��� (Math Ŭ����)
	//main���� ȣ�� �ϴ� �޼ҵ�� static�� �ٿ�����