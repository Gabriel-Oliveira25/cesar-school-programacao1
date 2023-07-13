package operadoresBasicos;

import java.util.ArrayList;
import java.util.Collections;

public class Comparacao {
	public static void main(String[] args) {
		int x = 1;
		int y = 5;
		int z = 3;
		ArrayList<Integer> listaNum = new ArrayList<Integer>();
		listaNum.add(x);
		listaNum.add(y);
		listaNum.add(z);
		Collections.sort(listaNum);
		System.out.println(listaNum);
		
		compare();
	}
	
	
	public static void compare() {	
	    int x = 1;
	    int y = 5;
	    int z = 3;
	    
	    if (x <= y && x <= z) {
	        System.out.print(x + " ");
	        if (y <= z) {
	            System.out.print(y + " " + z);
	        } else {
	            System.out.print(z + " " + y);
	        }
	        
	    }	else if (y <= x && y <= z) {
	        System.out.print(y + " ");
	        if (x <= z) {
	            System.out.print(x + " " + z);
	        } else {
	            System.out.print(z + " " + x);
	        }
	        
	    }	else {
	        System.out.print(z + " ");
	        if (x <= y) {
	            System.out.print(x + " " + y);
	        } else {
	            System.out.print(y + " " + x);
	        }
	    }
	}
		
}

