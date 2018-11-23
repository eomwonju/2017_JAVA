class StringTest{
	public static void main(String [] args){
		
		//String [] args;//args는 문자열 여러개를 저장할 수 있는 배열
		//배열의 i번째 인덱스 원소에 접근 : args[i]
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		//메인의 인자 1번째 원소 + 2번째 원소
		System.out.println(args[1]+args[2]);//1번째 원소와 2번째 원소가 연결됨
		//Wrapper class : Integer, Double, Boolean ...
		//args[0]을 정수형으로 형변환 하고 싶음
		System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
		//args의 2번째 인덱스 원소를 Double로 형변환 후 출력
		System.out.println(Double.parseDouble(args[2]));
		
		
		String a1 = "Hello!";
		String a2 = "hello!";
		
		
		System.out.println(a1+a2);
		System.out.println(a1.concat(a2));
		
		
		//a1과 a2 같은가?
		System.out.println(a1==a2);//false, a1과 a2 참조값이 같은가?
		System.out.println(a1.equals(a2));//false
		System.out.println(a1.equalsIgnoreCase(a2));//true, 대소문자 무시하고 같은가?
		System.out.println(a1.compareTo(a2));//첫 번째로 다른 문자의 ASCII code 값을 뺀 값, a1-a2
		
		
		System.out.println(a1.charAt(0));//H
		System.out.println(a2.charAt(0));//h
		
		
		//a1에서 마지막!를 .으로 변경해서 저장
		//a1.charAt(5)='.';//문자열은 상수라 내용변경 불가.
		a1 = "Hello.";
		
		
		//substring()
		System.out.println(a1.substring(1,3));//el
		//toUpperCase();, toLowerCase();//모든 문자를 대문자 또는 소문자로 변경시켜줌
		System.out.println(a1.toUpperCase());
		System.out.println(a1.toLowerCase());
		
		//replace();
		System.out.println(a1.replace('l','e'));//a1 문자열에서 l을 모두 e로 변경
	}
}//class에 존재하는 method는 1개 : main method//java의 method는 항상 class안에 존재