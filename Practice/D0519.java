class D0519{
	public static void main(Stirng [] args){
		//Ŀ�ǵ���ο��� ���ڿ��� �迭�� �Է��Ͽ� main()�� ���ڷ� �Ѱ��� ��
		//��) java D0519 123 344 342 ....
		//1. ����ڰ� �Է��� ���ڿ��� ���� ���
		if(args.length==0){
			System.out.println("Ŀ�ǵ���ο� ���ڿ��� �Է����ּ���.");
			System.out.println("Usage : java D0519 String1 String2 ......");
			return;
		}
		System.out.println("����ڰ� �Է��� ���ڿ��� ����"+args.length);
		//2. �� ���ڿ��� ���� ���
		for(String s:args) System.out.printf("%d, ",s.length());//���ڿ����� ���̸� ��� �� ��ȣ �ʿ�
		
		System.out.println(args[0]);
		
		
		
		
		
		System.out.println("\"Hello\"���� 'l'�� ���� Ƚ�� : "+countChar("Hello", 'l'));
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