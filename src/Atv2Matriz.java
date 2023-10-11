import java.util.Scanner;
public class Atv2Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		 int matriz [][]= new int [5][5];
		 
		 for(int linha=0;linha<5;linha++) {
			 for(int coluna=0; coluna<5;coluna++) {
				 System.out.println("Digite o valor da posição: ["+ linha +"]["+coluna+"]");
			     matriz[linha][coluna]= sc.nextInt();
			 }
			
		 }
		 if(todosValoresIguais(matriz)) {
				System.out.println(" Todos os valores são iguais");
			}
			else {
				System.out.println(" Os valores são diferentes");
			}
	}
	public static boolean todosValoresIguais(int[][]matriz) {
		int primeiroValor= matriz [0][0];
		for(int linha=0; linha<matriz.length;linha++) {
			for(int coluna=0;coluna<matriz[linha].length;coluna++) {
				if(matriz[linha][coluna] != primeiroValor) {
					return false;
				}
			}
		}
		
		return true;
		
		
	}
}
	 
			
			 
	

		

	


