class HW6{
	public static void main(String [] args){
		int [] iArr = new int[50];
		int [] hist = new int[10];
		
		for(int i=0; i<iArr.length; i++){
			iArr[i] = (int)(Math.random()*101);
			if(iArr[i]==100) hist[9]++;
			else	hist[iArr[i]/10]++;
		}
		
		for(int i=0; i<hist.length; i++){
			System.out.printf("%2d :", 10*i+5);
			for(int j=0; j<hist[i]; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}