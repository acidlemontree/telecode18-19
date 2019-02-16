package supersticiosos;


import java.util.*;

public class Solution {

	
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();
	Integer [] numeros=new Integer[N];
	for (int i=0;i<N;i++) {
		numeros[i]=sc.nextInt();
	}
	for (int i=0;i<N;i++) {
		String inverso=new StringBuffer(numeros[i].toString()).reverse().toString();
		if(inverso.equals(numeros[i].toString()))
			System.out.println("LIMON");
		else
			System.out.println("OK");
		
	}
	
	}
	
}
