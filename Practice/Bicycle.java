//������ Ŭ���� ����
/*
<�ʵ�>
���� ���� : int
�ӷ� : double
����Ÿ� : int

<�޼ҵ�>
���� ���� ���� : report(), ���� �ʵ� print
���� : �� m(int) ������ �������� �Ű������� �޾� ���� �� print
��ȸ�� : ��ȸ���ߴٰ� print
��ȸ�� : ��ȸ���ߴٰ� print
*/

class Bicycle{
	//�ʵ�
	private int numOfWheel = 4;//�ܺο��� ���� �Ұ�
	private double speed;
	private int mileage;
	
	//setter : private �ʵ��� �Ӽ��� ������ �� ����ϴ� �޼ҵ�, set�ʵ��
	void setNumOfWheel(int n){
		if(n>0 && n<=4)
		numOfWheel = n;
	}
	
	//getter : private �ʵ忡 ���� ������ ��ȯ�ϴ� �޼ҵ�, get�ʵ��
	int getMileage(){
		return mileage;
	}
	
	double getSpeed(){
		return speed;
	}
	
	
	
	
	//�żҵ�
	void report(){
		System.out.println("numofWheel : "+numOfWheel);
		System.out.println("speed : "+speed);
		System.out.println("mileage : "+mileage);
	}
	void goStraight(int dist){
		mileage += dist;
		System.out.println(dist+"m ����");
	}
	void turnRight(){
		System.out.println("��ȸ�� �մϴ�.");
	}
	void turnLeft(){
		System.out.println("��ȸ�� �մϴ�.");
	}
}