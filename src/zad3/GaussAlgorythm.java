//package zad3;
//
//public class GaussAlgorythm {
//	public int biggestInColumn(int i)
//	{
//	
//	}
//	public void GaussHalfChoice(MyMatrix matrix,int width, Vector vector)
//	{
//		int counter, counter2, counter3;
//		double multiplier;
//		double sum;
//		double epsilon = Math.pow(10, -14);
//		boolean isSolution = false;
//		int biggestInColumn;
//		for(counter = 0 ; counter <= width - 2 ; counter++)
//		{
//			biggestInColumn=biggestInColumn(counter);	
//			swapRowesH(biggestInColumn, counter);
//			
//			for(counter2 = counter + 1 ; counter2 <= width -1 ; counter2++)
//			{
//				if(cmp(abs(wynikH[counter][counter]) , epsilon) == -1)
//					break;
//				multiplier = neg(div((wynikH[counter2][counter]),(wynikH[counter][counter])));
//				for(counter3 = counter + 1 ; counter3 <= width ; counter3++)
//				{
//					wynikH[counter2][counter3] = add(wynikH[counter2][counter3] , (mul(multiplier , wynikH[counter][counter3])));
//				}
//			}
//		}
//		for(counter = width - 1 ; counter >= 0; counter--)
//		{
//			sum = wynikH[counter][width];
//			for(counter2 = width - 1 ; counter2 >= counter + 1 ; counter2--)
//			{
//				sum = sub(sum , mul(wynikH[counter][counter2], vectorH[counter2][0]));
//			}
//			if(cmp(abs(wynikH[counter][counter]) , epsilon) == -1)
//				break;
//			vectorH[counter][0] = div(sum,wynikH[counter][counter]);
//			isSolution = true;
//		}
//	}
//}
