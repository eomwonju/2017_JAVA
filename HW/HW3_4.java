import java.util.Scanner;
class HW3_4{
	public static void main(String args []){
		Scanner s = new Scanner(System.in);
		String type;
		boolean repeat=true;
		do{
			System.out.print("������ Ÿ���� �Է��ϼ���(�Ƕ�̵�, �簢��, ���̾Ƹ��): ");
			type = s.nextLine();
			int line;
			repeat=true;
			switch(type){
			case "�Ƕ�̵�":
				do{
					System.out.print("����� �� ��(10���� ���� ����): ");	
					line = s.nextInt();
				}while(line<=0||line>10);
				for(int i=0;i<line;i++){
					for(int j=line-1-i;j>0;j--){
						System.out.print(" ");
					}
					for(int j=i;j>=0;j--){
						System.out.print(j);
					}
					for(int j=1;j<=i;j++){
						System.out.print(j);
					}
					System.out.println();
				}
				repeat=false;
				break;
			case "�簢��":	
				repeat=false;
				int garo, sero, banbok;
				do{
					System.out.print("���� : ");
					garo = s.nextInt();
					System.out.print("���� : ");
					sero = s.nextInt();
					System.out.print("�ݺ�Ƚ�� : ");
					banbok = s.nextInt();
				}while(garo<0||sero<0||banbok<0);
				
				for(int i=0;i<sero;i++){
					for(int j=0;j<banbok;j++){
						for(int k=0; k<garo; k++){
							System.out.print("*");
						}
						System.out.print("\t");
					}
					System.out.println();
				}
				break;
			case "���̾Ƹ��":
				do{
					System.out.print("����� �� ��(Ȧ��): ");	
					line = s.nextInt();
				}while(line<=0||line%2==0);	
				
				for(int i=0;i<=line/2;i++){
					for(int j=line/2-i; j>0;j--){
						System.out.print(" ");
					}
					for(int j=0; j<2*i+1;j++){
						System.out.print("*");
					}
					System.out.println();
				}
				for(int i=0;i<line/2;i++){
					for(int j=0; j<=i;j++){
						System.out.print(" ");
					}
					for(int j=0; j<2*(line/2-i)-1;j++){
						System.out.print("*");
					}
					System.out.println();
				}
				repeat=false;
				break;	
			default:	
				System.out.println("���� Ÿ���� ����� �Է��ϼ���.\n");
				break;		
			}	
		}while(repeat);	
	}
}