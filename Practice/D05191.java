class D05191{
	public static void main(String [] args){
		//�ڵ����� 10��
		//int [] arr = new int [10];
		Car [] carList = new Car [10];
		
		for(int i=0; i<carList.length; i++){
			carList[i] = new Car();
		}
		
		//10�� �ڵ����� ���� ���� ����ϱ�
		for(int i=0; i<carList.lengh; i++){
			System.out.println(i+1+"��° �ڵ��� : "+carList[i].info());
		}
	}
}

class Car{
	int year, mileage;
	//�޼ҵ� ��� : ���ľ� ��ȯ�� �޼ҵ��(�Ű�������)
	public String info(){
		return "�� �ڵ����� "+year+"����̰�, ����Ÿ��� "+mileage+"km �Դϴ�.";
		//return String.format("�� �ڵ����� %d����̰�, ����Ÿ��� %dkm �Դϴ�.", year, mileage);
	}
	
	
}