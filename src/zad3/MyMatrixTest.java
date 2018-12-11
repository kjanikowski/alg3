package zad3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMatrixTest {

	@Test
	void test() {
		MyMatrix test = new MyMatrix(3);
		int actual = test.rowNumber(0, 3);
		int expected= 3;
		assertSame(expected, actual);
		
	}
	
	@Test
	void test2() {
		MyMatrix test = new MyMatrix(3);
		int actual = test.rowNumber(1, 2);
		int expected= 6;
		assertSame(expected, actual);
		
	}
	@Test
	void test3() {
		MyMatrix test = new MyMatrix(4);
		int actual = test.rowNumber(2, 1);
		int expected= 11;
		assertSame(expected, actual);
		
	}
	
	
	

}
