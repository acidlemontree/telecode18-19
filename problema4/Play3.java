package problema4;

import java.io.*;
import java.util.*;

public class Play3 {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int a = 0;
    	int b = 0;
    	int scs = 0;
    	int scs1 = 0;
    	while (a<n) {
    		scs = sc.nextInt();
    		if((scs == Math.floor(scs1/2) || scs1 ==0 )&& b == 0) {
    			if(scs == 0) {
    				System.out.println("GANADORES");
    				a++;
    				scs1 = scs;
    				b = 0;
    			}
    			scs1 = scs;
    		}
    		else {
    			if (scs == 0 && b > 0) {
    				System.out.println("DESCALIFICADOS");
    				a++;
    				scs1 = scs;
    				b = 0;
    			}
    			else{
    				b++;
    				scs1 = scs;
    			}
    			
    		}
    	}
    	sc.close();
    }
}