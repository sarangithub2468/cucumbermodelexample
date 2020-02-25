package practice;

import java.util.Scanner;

//2) How to create a pyramid of numbers in java?


public class Createpyramidofnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner ew = new Scanner(System.in);
		
		 
        //Taking noOfRows value from the user
 
        System.out.println("How Many Rows You Want In Your Pyramid?");
 
        int noOfRows = ew.nextInt();
 
        //Initializing rowCount with 1
 
        int rowCount = 1;
 
        System.out.println("Here Is Your Pyramid");
 
        //Implementing the logic
 
        for (int i = noOfRows; i > 0; i--)
        {
            //Printing i spaces at the beginning of each row
 
            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }
 
            //Printing 'rowCount' value 'rowCount' times at the end of each row
 
            for (int j = 1; j <= rowCount; j++)
            {
                System.out.print(rowCount+" ");
            }
 
            System.out.println();
 
            //Incrementing the rowCount
 
            rowCount++;
        }
    }
}
