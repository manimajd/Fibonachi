/*
							Fibonachi with for loop
Created by:		Mani Majd
Date:			July 14th 2017
Purpose:		Training

*/
public class Fibonachi {
// 1 1 2 3 5 8 13 21 34 55 89 144
	
	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		System.out.print(x+" "+y+" ");
		
		for(int i=0; i<=9; i++){
			int z = x+y;
			System.out.print(z+" ");
			x=y;// swap
			y=z;
		}
	}
}
