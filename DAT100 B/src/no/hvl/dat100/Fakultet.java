package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Fakultet {

	public static void main(String[] args) {
		int n = parseInt(showInputDialog("Skriv inn heltall"));
		
		int a = n;
		int x = 1;
		
		while (n>1) {
			x *=n;
			n--;
		}
	System.out.println(a + "! = " + x);
	
	
	
	
	}

	
}

	
	



