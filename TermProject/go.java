import java.util.*;
import java.text.*;

public class go{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.print("����� �̸���?");
		String name=s.next();
		System.out.print("����� ���̴�?");
		int age=s.nextInt();
		
		System.out.println("\n��ǥ ����� 100���� �Դϴ�.\n");
		
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat dateFormat = new SimpleDateFormat("������ yyyy�� MM�� dd�� �Դϴ�.");
		String currtime = dateFormat.format(calendar.getTime());
		System.out.println(currtime);
		
		System.out.println("100������ ���� ������ ������ ���غ���.");
		int days=1;
		
		while(I.getMyMoney()<100000){
		System.out.println("\n-"+days+"����-\n");
		
		System.out.println("���� �մ��� ����..\n");
		I.action();
		while(store.getCntTime()<=3){
		double randomNbr=Math.random()*5;
		if (randomNbr>=2)	I.sale(customer.customer1());
		else I.action();
		store.setCntTime(1);
		System.out.println("����ð� : "+store.getCntTime());
		}
		days++;
		store.getMoney();
		store.reset();
		}
		System.out.println("Ŭ����");
		owner.moneyfight();
	}
}


class I{
	static int myMoney=30000,tired=5,pay=25000;
	static Scanner s = new Scanner(System.in);
	
	public static void action(){
		
		System.out.println("�մ��� ����..\n");
		System.out.println("�ൿ�� �����ϼ���.");
		System.out.println("1.�����ϱ� 2.�����ϱ� 3.û���ϱ� 4.������ �ִ´�..(���ڸ�)");
		int n = s.nextInt();
		if (n==1) clean();
		else if(n==2) display();
		else if(n==3) clean2();
		else rest();
		store.report1();
		
	}
	
	public static void clean(){
		System.out.println("û���ϱ⸦ �����߽��ϴ�.");
		//����1��
		System.out.println("...û�����Դϴ�...");
		//����1��
		System.out.println("û�ҿϷ�");
		store.setDirty(-1);//������ -1
		setTired(1);//�Ƿε� +1
	}
	
	public static void display(){
		System.out.println("��ǰ�� �����մϴ�");
		//����1��
		System.out.println("�����Ϸ�");
		setTired(1);
	}
	
	public static void clean2(){
		System.out.println("�����ϱ⸦ �����߽��ϴ�.");
		//����1��
		System.out.println("...�������Դϴ�...");
		//����1��
		System.out.println("�����Ϸ�");
		store.setDirty(-1);//������ -1
		setTired(1);//�Ƿε� +1
	}
	
	public static void rest(){//int time�� �޾� ��ð� ������ ����..?
		System.out.println("������ �޽��� ���մϴ�...");
		//����2��
		System.out.println("�Ƿΰ� ���� ȸ���Ǿ����ϴ�.");
		setTired(-1);
	}
	
	public static void sale(int n){//�մԺ����̵�
		System.out.println("�մ��� ����û");
		minigame.game_WASD(n);//ȣ��
		if (minigame.getSell()) {
			store.setSaleMoney(5000);
			System.out.println("������ �������� : "+store.getSaleMoney());
		}
		else System.out.println("���� ��ȸ��..");
		
	}
	//��꼳��
	public static void setMyMoney(int n){
		myMoney += n;
	}
	public static int getMyMoney(){
		return myMoney;
	}
	//�Ƿε�����
	public static void setTired(int n){
		tired += n;
	}
	public static int getTired(){
		return tired;
	}
	//�ϴ缳��
	public static void setPay(int n){
		pay += n;
	}
	public static int getPay(){
		return pay;
	}
}

class store{
	static int saleMoney=5000,dirty=5,products=0,cntTime;
	
	
	public static void chargeProducts(int n){//�԰� ��ǰ ��
		System.out.println("���� ��ǰ�� �� : "+getProducts()+"��");
		System.out.println("��ǰ�� "+n+"�� �԰�Ǿ����ϴ�.");
		setProducts(n);
		System.out.println("���� ��ǰ�� �� : "+getProducts()+"��");
	}
	
	public static void setProducts(int n){
		products+=n;
	}
	public static int getProducts(){
		return products;
	}
	
	public static void setDirty(int n){
		dirty+=n;
	}
	public static int getDirty(){
		return dirty;
	}
	
	public static void setSaleMoney(int n){
		saleMoney+=n;
	}
	public static int getSaleMoney(){
		return saleMoney;
	}
	
	public static void report1(){
		System.out.println("���� ���� �Ƿε� : "+I.getTired());
		System.out.println("�������� ���� : "+getDirty());
	}
	
	public static void report2(){
		System.out.println("���� ���� ���� : "+getSaleMoney());
		System.out.println("�������� ���� : "+getDirty());
	}
	public static void setCntTime(int n){
		cntTime+=n;
	}
	public static int getCntTime(){
		return cntTime;
	}
	public static void reset(){//�Ϸ������鼭 ���� �ʱ�ȭ���ֱ�.�ð�,��������,û��,
		setCntTime(-getCntTime());
		setSaleMoney(-getSaleMoney());
		setDirty(1);//������1����;
	}
	public static void getMoney(){
		System.out.println("�Ϸ簡 �������ϴ�~! �ϴ��� �޾ҽ��ϴ�.");
		I.setMyMoney(I.getPay());
	}
	
}

class minigame{
	static String result="",input="";
	static long start,end;
	static boolean sell;
	public static void game_WASD(int n){
		Scanner s=new Scanner(System.in);
		
		
		
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
		result = "";
	}
	public static boolean getSell(){
		return sell;
	}

public static void game_RPS(){
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
			I.setPay(-5000);
			break;
			case 2:
			I.setPay(5000);
			break;
		}
		
		if(result!=0) {
			System.out.println("�� �ҰŸ� \"�Ѵ�\"�� �Է��ϰ�, �ƴϸ� �ƹ��ų� �Է��ϼ���..�����ϴ�: "+I.getPay()+"��");
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
		System.out.println("����� �ϴ��� : "+I.getPay()+"�� �Դϴ�.");
		
	}
}

class owner{
	static int mood;
	public static void checkDirty(int n){
		if (n>5) {
			System.out.println("û���� �ض�");
			I.setPay(-5000);
		}
		else System.out.println("û�һ��¾�ȣ");
	}
	
	public static void checkSaleMoney(){
		System.out.println("���� ������ : "+store.getSaleMoney()+"�� �Դϴ�");
	}
	
	public static void moneyfight(){
		System.out.println("���� �ϴ� ������ �ϰڳ�? (���� �ϴ� : "+I.getPay()+"��)");
		minigame.game_RPS();
	}
}

class customer{
	
	static int customer1(){//�Ϲݼմ�
		System.out.println("�Ϲ� �մ��Դϴ�");
		
		return 5;
	}
}