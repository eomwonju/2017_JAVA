
public class ForTest2{
	public static void main(String [] args){
		
		for(int i=0; i<5; i++){
			for(int j=0; j<10; j++) System.out.print("*");
			System.out.println();
		}
		
		for(int i=0; i<10; i++){
			for(int j=0; j<i+1; j++) System.out.print("*");
			System.out.println();
		}
		
		for(int i=0; i<10; i++){
			for(int j=0; j<i; j++) System.out.print(" ");
			for(int k=10; k>i; k--) System.out.print("*");
			System.out.println();
		}
		
		for(int i=0; i<10; i++){
			for(int j=0; j<9-i; j++) System.out.print(" ");
			for(int k=0; k<2*i+1; k++) System.out.print("*");
			System.out.println();
		}
		
		int line = 5;
		for(int i=0; i<line; i++){
			for(int j=0; j<line-1-i; j++) System.out.print(" ");
			for(int k=0; k<2*i+1; k++) System.out.print("*");
			System.out.println();
		}
		
		for(int i=0; i<4; i++){
			for(int k=0; k<4; k++){
				for(int j=0; j<6; j++) System.out.print("*");
				System.out.print("	");
			}
			System.out.println();
		}
			
	}
	
}