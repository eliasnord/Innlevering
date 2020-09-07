package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import java.util.*;

public class TestScore {

	public static void main(String[] args) {
		final int ANT_STUDENTER = 10;
		int sum = 0;
		for (int studentnr = 1; studentnr <= ANT_STUDENTER; studentnr++) {
		int testscore = Integer.parseInt(showInputDialog("Testscore" + studentnr)); 
		
		String melding = "Ugyldig verdi. Gyldig verdi: >=0 & <=100";
		
		char grade = 0;
		
		if (testscore >= 101) {
			showMessageDialog(null, melding);
			return;
		} else if (testscore <= -1) {
			showMessageDialog(null, melding);
			return;
		} else if (testscore >= 90) {
			grade = 'A';
		} else if (testscore >= 80) {
			grade = 'B';
		} else if (testscore >= 60) {
			grade = 'C';
		} else if (testscore >= 50) {
			grade = 'D';
		} else if (testscore >= 40) {
			grade = 'E';
		} else if (testscore >= 0) {
			grade = 'F';
		} else if (testscore <0) {
			grade = 'X';
			
		
		
		 
	
			
			
		
		}
		showMessageDialog(null, "Grade = " + grade);
	}

	}}
