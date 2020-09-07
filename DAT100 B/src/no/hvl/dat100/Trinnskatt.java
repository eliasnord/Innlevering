package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

import javax.swing.JOptionPane;

import static java.lang.Integer.*;

public class Trinnskatt {

	public static void main(String[] args) {
		
		
		int inntekt = parseInt(showInputDialog("Skriv inn bruttolønn"));
		int skatt = 0;		
		
		
		//trinn 4
		if (inntekt >= 934051) {  
		skatt += (inntekt - 934051) * 0.1452;
		inntekt = 934051;
		}
				
		//trinn 3
		if (inntekt >= 580651) {  
			skatt += (inntekt - 580651) * 0.1152;
			inntekt = 580651;
			}		
		//trinn 2
		if (inntekt >= 230951) {  
			skatt += (inntekt - 230951) * 0.0241;
			inntekt = 230951;
			}		
		//trinn 1
		if (inntekt >= 164101) {  
			skatt += (inntekt - 164101) * 0.0093;
			inntekt = 164101;
			}
				
		
		  showMessageDialog(null, "Din skatt er:" +  skatt);
	

	
		
	}

}
	
	


		
		
		

	


