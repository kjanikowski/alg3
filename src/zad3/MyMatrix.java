package zad3;

public class MyMatrix {
	
	
	
	int a;
	int k;

	public MyMatrix(int a) {
		this.a = a;
	}
	
	public double[][] Matrix() {
		
		k = ((a+1)*(a+2))/2;
		double[][] tab = new double[k][k+1];

		for(int i = 0; i < k; i++) {
			for(int j = 0; j < k+1; j++) {
			
				
				tab[i][j] = 0;
				
			}
			
			
		}
		
		for(int i = 0; i < k; i++) {
			// znajdz y i n dla aktualnego P
			int y,n;

			
			// case1
			int y1 = y, n1 = n;
			// znajdz nr kolumn dla 4 P od ktorych to P zalezy
			int j1 = rowNumber(y1, n1);
			// sprawdzic czy ma sens, (czy x + y <= a)
			if(ma sens)
				tab[i, j1] = // wzor
				else
					tab[] = 0;
				
				1=
			
			
		}
		
		
		
		
		
		
		
		return tab;
	}
	
	public int rowNumber(int y, int n) {
		
		for(int i = 0; )
		
		
		return y;
		
	}
}
