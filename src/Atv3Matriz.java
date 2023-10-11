import java.util.Scanner;

public class Atv3Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		int matriz[][]= new int[4][4];
		
		for(int linha=0;linha<4;linha++) {
			for(int coluna=0;coluna<4;coluna++) {
				System.out.println(" Digite o valor da posição["+linha+"]["+coluna+"]");
				matriz[linha][coluna]= sc.nextInt();
				
				if(matriz[linha][coluna]<0) {
				  matriz[linha][coluna]=0;
				}
			}
		}
		for(int linha=0;linha<4;linha++) {
			System.out.println();
			for(int coluna=0;coluna<4;coluna++) {
				System.out.print(matriz[coluna][linha] + " ");
			}
		}

	}

}
