//�̴ϰ��� Ŭ����...minigame(int n)���� ȣ����. ����մ��� n�� ũ�� �����ϰ� �Ϲݼմ��� �۰� �����Ͽ� �Ǹų��̵��� ������
import java.util.Scanner;//�ʵ忡 static���� �̸� �����ؾߵ�
class minigame{
	public static boolean game_WASD(int n){
		//game_WASD(int n)���� ������ ����
		Scanner s=new Scanner(System.in);
		
		String result="",input="";
		long start,end;
		boolean sell;
		
		int [] array = new int[n];
		for(int i=0;i<n;i++){
			array[i]=(int)(Math.random()*4+1);
		}
		for(int x:array){
			if(x==1) result+="W";
			else if(x==2) result+="A";
			else if(x==3) result+="S";
			else if(x==4) result+="D";
		}
		System.out.println("���� ���ڸ� 5�� �̳��� �Է��ϼ���!(��ҹ��� �������) "+result);
		start=System.currentTimeMillis();
		input=s.next();
		end=System.currentTimeMillis();
		if (end-start>5000) {
			System.out.println("Ÿ�ӿ���! �ǸŽ���..(�ҿ�ð� : "+(end-start)+"ms)");
			sell=false;
		}
		else if (input.equalsIgnoreCase(result)==true) {
			System.out.println("�Ǹż���!");
			sell=true;
		}
		else {
			System.out.println("�߸��� �Է� ! �ǸŽ����Դϴ�..(����� �Է°� : "+input+")");
			sell=false;
		}
		return sell;
	}

public static int game_RPS(int money){
		Scanner s = new Scanner(System.in);
		String input;
		int com;
		int result=0;//0���,1��,2�̱�
		boolean again=false;
		
		do{
		System.out.print("����,����,�� �߿��� �� ����? ");
		input=s.next();
		
		com=(int)(Math.random()*3);//0=����,1=����,2=��
		
		switch(input){
			case "����":
			if (com==0) {
				System.out.println("�����");
				result=0;
			}
			else if(com==1) {
				System.out.println("����");
				result=1;
			}
			else if(com==2) {
				System.out.println("�̰���");
				result=2;
			}
			break;
			
			case "����":
			if (com==0) {
				System.out.println("�̰���");
				result=2;
			}
			else if(com==1) {
				System.out.println("�����");
				result=0;
			}
			else if(com==2) {
				System.out.println("����");
				result=1;
			}
			break;
			
			case "��":
			if (com==0) {
				System.out.println("����");
				result=1;
			}
			else if(com==1) {
				System.out.println("�̰���");
				result=2;
			}
			else if(com==2) {
				System.out.println("�����");
				result=0;
			}
			break;
			
			default :
			System.out.println("�߸��Է��ߴ�..�ٽ��Է��ض�");
			again=true;
			continue;
		}
		switch(result){//�̱������ �� �������Ұ� �����ϱ�
			case 1:
			money--;
			break;
			case 2:
			money++;
			break;
		}
		
		if(result!=0) {
			System.out.println("�� �ҰŸ� \"�Ѵ�\"�� �Է��ϰ�, �ƴϸ� �ƹ��ų� �Է��ϼ�..���絷: "+money);
			input=s.next();
			switch(input){
				case "�Ѵ�":
				again=true;
				break;
				
				default:
				again=false;
				break;
			}
		}
		else again=true;
		
		
		}while(again);
		System.out.println("����� ���� : "+money+"�� �Դϴ�.");
		return money;
	}
}