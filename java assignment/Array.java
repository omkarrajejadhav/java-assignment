package java_basic2;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		
		//int a[]= new int[5];
		
		//System.out.println("Enter Array Elements");
		int i,j,star=1,row=5,space=row-1;
		for(i=0;i<row;i++)
		{
			for(int k=0;k<space;k++)
				System.out.print(" ");
			for(j=0;j<star;j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
			star++;
			space--;
			
		}
		
	}

}
