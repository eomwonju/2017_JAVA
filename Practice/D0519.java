class D0519{
	public static void main(Stirng [] args){
		//커맨드라인에서 문자열의 배열을 입력하여 main()의 인자로 넘겨줄 것
		//예) java D0519 123 344 342 ....
		//1. 사용자가 입력한 문자열의 개수 출력
		if(args.length==0){
			System.out.println("커맨드라인에 문자열을 입력해주세요.");
			System.out.println("Usage : java D0519 String1 String2 ......");
			return;
		}
		System.out.println("사용자가 입력한 문자열의 개수"+args.length);
		//2. 각 문자열의 길이 출력
		for(String s:args) System.out.printf("%d, ",s.length());//문자열에서 길이를 물어볼 때 괄호 필요
		
		System.out.println(args[0]);
		
		
		
		
		
		System.out.println("\"Hello\"에서 'l'의 출현 횟수 : "+countChar("Hello", 'l'));
		int [] arr = new int [10];
		for(int i=0; i<arr.length; i++) arr[i] = i+1;
		shiftRN(arr,3);
		for(int x:arr) System.out.printf("%d\t",x);
	}
	
	static int countChar(String st, char c){
		int count=0;
		for(int i=0; i<st.length(); i++){
			if(st.charAt(i)==c) count++;
		}
		return count;
	}
	
	
	void shiftRN(int [] arr, int num){
		num %= arr.length;
		//for(int i=0; i<num; i++) shift1();
		int indOfSaving = arr.length-num;
		int [] tmp = new int [num];
		for(int i=indOfSaving; i<arr.length; i++) tmp[i-(indOfSaving)] = arr[i];
		for(int i=indOfSaving-1; i>=0; i--) arr[i+num] = arr[i];
		for(int i=0; i<num; i++) arr[i]=tmp[i];
	}
}