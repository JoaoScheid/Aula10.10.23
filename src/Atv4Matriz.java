import java.util.Scanner;
public class Atv4Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int matriz[][]= new int[6][6];
		int num;
		System.out.println("Digite um valor: ");
		num= sc.nextInt();
			
		for(int linha=0;linha<6;linha++) {
			for(int coluna=0;coluna<6;coluna++) {
			System.out.println("Digite o valor da posição ["+linha+"]["+coluna+"]");
			matriz[linha][coluna]= sc.nextInt();
			}
		}
		for(int linha=0;linha<6;linha++) {
			for(int coluna=0;coluna<6;coluna++)
		if(matriz[linha][coluna]==num) {
			System.out.println("O valor esta na linha ["+ linha+"] e na coluna [" +coluna+"]");
		}
		else {
			System.out.println("Valor não encontrado");
		}
		}
	}
}
		
	

	
