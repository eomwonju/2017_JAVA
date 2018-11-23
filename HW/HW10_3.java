class HW10_3{
	public static void main(String [] args){
		String [] strArr1 = {"123", "234", "4567564", "백이십삼"};//정수로 변환할 수 없는 문자열 "백이십삼"을 원소로 가지는 String 배열 strArr1
		String [] strArr2 = {"123", "234", "4567564", "34.5"}; //정수로 변환할 수 없는 문자열 "34.5"을 원소로 가지는 String 배열 strArr2
		String [] strArr3 = {"123", "234", "4567564"}; //모든 원소를 정수로 변환할 수 있는 String 배열 strArr3
		//Example 1
		System.out.println("Example1: ");
		try{
			transInt(strArr1);
		}catch(NumberFormatException nfe){
			System.err.println("[예외 발생]");
			System.err.println("배열에 정수가 아닌 값이 들어있어 정수 타입으로 변환을 진행할 수 없습니다. ");
		}
		//위 코드에서 예외가 발생하더라도 예외 처리를 해줬기때문에 아래 코드도 실행 
		
		//Example 2
		System.out.println("\n\nExample2: ");
		try{
			transInt(strArr2);
		}catch(NumberFormatException nfe){
			System.err.println("[예외 발생]");
			System.err.println("배열에 정수가 아닌 값이 들어있어 정수 타입으로 변환을 진행할 수 없습니다. ");
		}
		
		//Example 3
		System.out.println("\n\nExample3: ");
		try{
			transInt(strArr3);
		}catch(NumberFormatException nfe){
			System.err.println("[예외 발생]");
			System.err.println("배열에 정수가 아닌 값이 들어있어 정수 타입으로 변환을 진행할 수 없습니다. ");
		}
		
	}
	static void transInt(String [] stringArray) throws NumberFormatException{
		for(String s: stringArray)
			System.out.println("String 타입의 정수를 int 타입의 정수로 변환했고 그 값은 "+Integer.parseInt(s)+"입니다.");
	}
}