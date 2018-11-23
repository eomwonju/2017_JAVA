class HW3_1{
	public static void main(String [] args){
		for(int i=1; i<20; i+=2){
			if(i<=9) System.out.printf("(%2d, %3d)\n", i, i*i-9*i+2);
			else  System.out.printf("(%2d, %3d)\n", i, 2*i-4);
		}
	}
}