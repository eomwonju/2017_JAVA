import java.util.Random;

class RNG{
	public static void main(String [] args){
		
		
		//Math 클래스 난수 생성
		//java.lang.Math //java.lang 패키지 -> import가 필요 없음 
		
		System.out.println(Math.random());//0이상 1미만의 실수형 난수 생성
		System.out.println((int)(10*Math.random()));//1이상 10미만의 정수형 난수 생성
		System.put.println((int)(25*(Math.random()+23));//23이상 47이하의 정수형 난수 생성
		System.put.println((int)(23*(Math.random()+103));//103이상 125이하의 정수형 난수 생성
		
		//Random 클래스 난수 생성
		//java.util.Random //java.util 패키지 -> import가 필요함
		
		Random r = new Random();
		
		System.out.println(r.nextInt());//int형 난수 생성
		System.out.println(r.nextInt(5));//0부터 5미만의 정수 생성
		
		
		
		//패키지 : 클래스들을 모아 놓은 폴더
	}
}