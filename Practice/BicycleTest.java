class BicycleTest{
	public static void main(String [] args){
		Bicycle b = new Bicycle();
		b.report();

		
		//������ ���������� 2�� ���� �� report()
		b.setNumOfWheel(2);
		b.report();
		
		
		//������ ���������� 200���� ���� �� report()
		b.setNumOfWheel(200);
		b.report();
		
		//���� ����Ÿ��� ����ϰ� ����
		//System.out.println(b.mileage); ���� �Ұ�
		System.out.println(b.getMileage());
		
		//���� �ӷ¸� ����ϰ� ����
		System.out.println(b.getSpeed());
	}
}