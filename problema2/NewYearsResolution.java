package problema2;

import java.io.*;
import java.util.*;
import java.text.*;

public class NewYearsResolution {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	long n = sc.nextInt();
    	for (int i= 0; i<n; i++) {
    		double scs = 25.4*(Double.parseDouble(sc.next()));
    		double scs_ = Double.parseDouble(sc.next());
    		double scs__ = Double.parseDouble(sc.next());
    		double int3 = Math.sqrt(Math.pow(scs_,2)+ Math.pow(scs__, 2)); 
    		double int1 = scs_*scs/int3;
    		int1 = (int) int1;
    		String int11 = removeZero(int1);
    		double int2 = scs__*scs/int3;
    		int2 = (int) int2;
    		String int22 = removeZero(int2);
    		System.out.println(int11 + " " + int22);
    	}
    	sc.close();
    	
    }
    public static String removeZero(double number) {
        DecimalFormat format = new DecimalFormat("#.###########");
        return format.format(number);
    }
   }