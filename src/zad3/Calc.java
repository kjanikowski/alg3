package zad3;

import java.util.Random;

public class Calc {
	
	int agents[];
	double equations[][];
	double answ[]; 
	int size;
	
	
	public void equations() {
		Random rand = new Random();
		agents = new int[size];

		for(int i = 0; size > i; i++) {
			agents[i] = rand.nextInt(3)-1;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
