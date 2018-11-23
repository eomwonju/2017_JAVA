import java.io.*;//io 패키지의 모든 패키지를 import하겠다.
import java.util.Scanner;

class Fruit{
	public void print(){
		System.out.println("나는 "+this.getClass().getName());//동적바인딩}
	}
}
class Grape extends Fruit{
	/*
	@Override
	public void print(){
		super.print()+System.out.println("포도");
	}
	*/
}
class Apple extends Fruit{
	/*
	@Override
	public void print(){
		super.print()+System.out.println("사과");
	}
	*/
}

class Pear extends Fruit{
	/*
	@Override
	public void print(){
		super.print()+System.out.println("배");
	}
	*/
}

class D0602{
	public static void main(String [] args){
		//bc.txt에 fr.print() 결과를 쓰고 싶음
		
		//1. abc.txt 라는 파일을 객체로 만든다.
		
		File myFile = new File("abc.txt");//File myFile = new File(args[0]); java D0602.java 파일명.txt
		
		/*
		//사용법 알려주고 종료
		if(args.length != 1){
			System.out.println("사용법 :  java D0602 파일명")
			return;
		}
		*/
		
		//만약에 args[0] 파일이 이미 존재한다면 아래 과정 실행하지 않고 종료!! (종료하지 않을 경우 기존 파일이 삭제되기 때문)
		/*
		if(myFile.exists()){
			System.out.printf("이미 % 파일이 존재합니다. \n프로그램이 종료됩니다.", args[0]);
			return;
		}
		*/
		
		try{
		
		//2. abc.txt 라는 파일에 어떤 내용도 쓸 수 있게 준비한다.
		
		PrintWriter pw = new PrintWriter(myFile);
		
		//3. 쓰기
		
		pw.println("Hello, Java!!");
		
	
		//4. PrintWriter 닫기
		
		pw.close();
	
		}catch(Exception e){
			System.out.println("예외가 발생했으니 종료합니다.");
			return; //System.exit(1);
		}
		
		System.out.println("abc.txt 파일에 쓰기가 완료되었습니다. \n 폴더에서 abc.txt 파일을 확인하세요.");
		
		/*
		Fruit f[] = {new Grape(), new Apple(), new Pear()};
		for(Fruit fr:f) fr.print();
		*/
		
		//파일의 내용을 읽어와서 그대로 콘솔에 출력
		//1. 파일 객체 생성
		
		File readFile = new File("abc.txt");
		
		//2. 파일을 읽을 준비
		
		//Scanner s = new Scanner(System.in);
		//System.in 으로 부터 읽는 스캐너 생성
		try{
			Scaner s = new Scanner(readFile);
			//abc.txt에서 내용 읽어오는 스캐너 생성
		
		
			//3. 읽어오기
			while(s.hasNext()){
				System.out.println(s.nextLine());
			}
			
			
			//4. 닫기
	
			s.close();
		}catch(Exception e{
			System.out.println("파일 열기 및 읽기에 실패했습니다.");
			return
		}
		)
	}

}