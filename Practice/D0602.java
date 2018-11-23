import java.io.*;//io ��Ű���� ��� ��Ű���� import�ϰڴ�.
import java.util.Scanner;

class Fruit{
	public void print(){
		System.out.println("���� "+this.getClass().getName());//�������ε�}
	}
}
class Grape extends Fruit{
	/*
	@Override
	public void print(){
		super.print()+System.out.println("����");
	}
	*/
}
class Apple extends Fruit{
	/*
	@Override
	public void print(){
		super.print()+System.out.println("���");
	}
	*/
}

class Pear extends Fruit{
	/*
	@Override
	public void print(){
		super.print()+System.out.println("��");
	}
	*/
}

class D0602{
	public static void main(String [] args){
		//bc.txt�� fr.print() ����� ���� ����
		
		//1. abc.txt ��� ������ ��ü�� �����.
		
		File myFile = new File("abc.txt");//File myFile = new File(args[0]); java D0602.java ���ϸ�.txt
		
		/*
		//���� �˷��ְ� ����
		if(args.length != 1){
			System.out.println("���� :  java D0602 ���ϸ�")
			return;
		}
		*/
		
		//���࿡ args[0] ������ �̹� �����Ѵٸ� �Ʒ� ���� �������� �ʰ� ����!! (�������� ���� ��� ���� ������ �����Ǳ� ����)
		/*
		if(myFile.exists()){
			System.out.printf("�̹� % ������ �����մϴ�. \n���α׷��� ����˴ϴ�.", args[0]);
			return;
		}
		*/
		
		try{
		
		//2. abc.txt ��� ���Ͽ� � ���뵵 �� �� �ְ� �غ��Ѵ�.
		
		PrintWriter pw = new PrintWriter(myFile);
		
		//3. ����
		
		pw.println("Hello, Java!!");
		
	
		//4. PrintWriter �ݱ�
		
		pw.close();
	
		}catch(Exception e){
			System.out.println("���ܰ� �߻������� �����մϴ�.");
			return; //System.exit(1);
		}
		
		System.out.println("abc.txt ���Ͽ� ���Ⱑ �Ϸ�Ǿ����ϴ�. \n �������� abc.txt ������ Ȯ���ϼ���.");
		
		/*
		Fruit f[] = {new Grape(), new Apple(), new Pear()};
		for(Fruit fr:f) fr.print();
		*/
		
		//������ ������ �о�ͼ� �״�� �ֿܼ� ���
		//1. ���� ��ü ����
		
		File readFile = new File("abc.txt");
		
		//2. ������ ���� �غ�
		
		//Scanner s = new Scanner(System.in);
		//System.in ���� ���� �д� ��ĳ�� ����
		try{
			Scaner s = new Scanner(readFile);
			//abc.txt���� ���� �о���� ��ĳ�� ����
		
		
			//3. �о����
			while(s.hasNext()){
				System.out.println(s.nextLine());
			}
			
			
			//4. �ݱ�
	
			s.close();
		}catch(Exception e{
			System.out.println("���� ���� �� �б⿡ �����߽��ϴ�.");
			return
		}
		)
	}

}