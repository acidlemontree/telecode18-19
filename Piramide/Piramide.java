import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Piramide {

	private static void Imprime(int n) {
		int m = n;
		int aux = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(" ");
			}
			m--;
			for (int j = 0; j < aux; j++) {
				System.out.print("*");
			}
			aux = aux + 2;
			System.out.println();
		}
	}
	private static int Ladrillos(int n) {
		int m= 0;
		int aux = 1;
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < aux; j++) {
				m++;
			}
			aux = aux + 2;
		}
		return m;
	}

	public static void main(String[] args) {

				
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] alturas = new int[n];
		
		for (int i=0; i<n;i++) {
			alturas[i]= sc.nextInt();
		}
		int suma=0;
		int[] ladrillos = new int[n];
		
		for (int i=0;i<n;i++) {
			int beta=Ladrillos(alturas[i]);
			System.out.println(beta);
			ladrillos[i]= beta;
			suma =suma + beta;
		}
//		System.out.println(suma);
		String[] aux = new String[n];
		for (int i=0;i<n;i++) {
			aux[i]= Integer.toString(ladrillos[i]);
		}
		
		int p=0;
		for (int i=0;i<aux.length;i++) {
			if(aux[i].toCharArray().length>p){
				p=aux[i].toCharArray().length;
			}	
		}
		System.out.println(p);
		char[][] alpha = new char[n][p];

		for (int i=0; i<n;i++) {
			char[] gamma= aux[i].toCharArray();
			int j;
			for(j=0;j<aux[i].toCharArray().length;j++) {
				alpha[i][j]=gamma[j];
			}
			for(int m=j;m<p;m++) {

				alpha[i][m]='0';

			}
		}
		
		for (int j=0;j<alpha.length;j++) {
			for(int i=0;i<p;i++) {
				System.out.print(alpha[j][i]+ " ");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
