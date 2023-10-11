import java.util.Scanner;
public class aula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int matriz [][]= new int [4][4];
      Scanner sc= new Scanner(System.in);
      
      for(int linha=0;linha <4;linha++ ) {
    	  for(int coluna=0;coluna<4;coluna++) {
    		  System.out.println("Digite um valor: ");
    		  matriz[linha][coluna]=sc.nextInt();
    	  }
      }
	}

}
