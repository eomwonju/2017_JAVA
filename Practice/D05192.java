class  D05192{
	public static void main(String [] args){
		//������ �� �� �����Ȳ�� ��Ÿ���� �迭
		boolean [][] seats = new boolean [10][20];
		//5����, 10��° �¼��� ���� ��Ȳ ���
		System.out.println("5����, 10���� �¼��� ���� ��Ȳ : "+seats[4][9]);
		//7������ ���Ż�Ȳ ���
		for(int i=0; i<seats[6].length; i++) System.out.println("7���� "+(i+1)+"��° ���� ���Ż�Ȳ : "+seats[6][i]);
		//20���� ���� ���Ż�Ȳ
		for(int i=0; i<seats.length; i++) System.out.println("20��° ���� "+(i+1)+"��° ������ ���Ż�Ȳ : "+seats[i][19]);
		
		//seats.length = ���� ����
		//seats[n].length = n���� �� ����
		
		int [][] arr = {{1,2,3},{4,5,6}};
		int [][] arr2 = {{1,2,3},{4,5}{7,7,7,7,7,7,7}};
		//�� ����
		System.out.println("�� ���� : "+arr2.length);
		// �� ���� �� ����
		for(int i=0; i<arr2.length; i++) System.out.println("�� ����"+arr2[i].length);
	}
}