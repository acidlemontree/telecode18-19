import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Galia {

	public static char Cambio(char m,int beta) {
		char[] aux0 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
				'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ' };
		char[] aux1 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
				'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
				'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ' };
		int a = 0;
		for (int i = 0; i < aux0.length; i++) {
			if (m == aux0[i]) {
				a = i;
				break;
			}
		}

		return aux1[a + beta];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> in = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			in.add(sc.next());

		}

		for (int m = 0; m < in.size(); m++) {
			char[] aux = in.get(m).toCharArray();
			for (int j = 0; j < aux.length; j++) {
				aux[j] = Cambio(aux[j], 16);
			}
			System.out.println(new String(aux));

			sc.close();
		}
	}
}
