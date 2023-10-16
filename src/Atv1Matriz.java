import java.util.Scanner;
public class Atv1Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
	
		int matrizA[][]= new int[4][4];
		int matrizB[][]= new int[4][4];	
		int mult[][]= new int[4][4];
		int som[][]= new int[4][4];
		int sub[][]= new int[4][4];
	    int modoDeOperacao ;
		
	    System.out.println("Selecione um modo de operação(1-Somar, 2-Subtrair, 3-Multiplicar, 0-Sair): ");
		modoDeOperacao = sc.nextInt();
		if(modoDeOperacao==1 || modoDeOperacao==2 ||modoDeOperacao==3) {
			
		for(int linha=0;linha<matrizA.length;linha++) {
			for(int coluna=0;coluna<matrizA.length;coluna++) {
				System.out.println(" Insira os valores para a matriz A, linha: ["+linha+"]["+coluna+"]");
				matrizA[linha][coluna]= sc.nextInt();
				
			}
		}
		for(int linha=0;linha<matrizB.length;linha++) {
			for(int coluna=0;coluna<matrizB.length;coluna++) {
				System.out.println(" Insira os valores para a matriz B, linha: ["+linha+"]["+coluna+"]");
		matrizB[linha][coluna]= sc.nextInt();
			}
		}
		for(int linha=0; linha<4;linha++) {
			for(int coluna=0;coluna<4;coluna++) {
				mult[linha][coluna]=(matrizA[linha][coluna]*matrizB[linha][coluna]);
				som[linha][coluna]=(matrizA[linha][coluna]+matrizB[linha][coluna]);
				sub[linha][coluna]=(matrizA[linha][coluna]-matrizB[linha][coluna]);
				
			}
		}
		for(int linha=0; linha<4;linha++) {
			for(int coluna=0; coluna<4;coluna++) {
			if(modoDeOperacao==1) {
				System.out.println("A soma do vetor A e do B é "+som[linha][coluna]);
			}
			if(modoDeOperacao==2) {
				System.out.println("A subtração do vetor A e do B é "+sub[linha][coluna]);
			}
			if(modoDeOperacao==3) {
				System.out.println("A multiplicação do vetor A e do B é "+mult[linha][coluna]);
			}
			else {
				System.out.println(" Fim do programa");
			}
		}
		}
		}
	}
	}
