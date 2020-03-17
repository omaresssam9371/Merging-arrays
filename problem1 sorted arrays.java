package problem.java;


import java.util.Scanner;

public class merge  {

	public static void main(String[] args)  {
		int [] array1 = {10,20,30,40,50};
		int n1 = array1.length;
		int [] array2 = {3,6,9,50,70};
		int n2 = array2.length;
		int [] merge = new int[n1+n2];
		int i=0,j=0,k=0,z;

		System.out.print("Array1: ");
		for(z=0; z<n1; z++)
			System.out.print(array1[z]+" ");
		System.out.print("\nArray2: ");
		for(z=0; z<n2; z++)
			System.out.print(array2[z]+" ");
		while (i < n1 && j < n2) {
	         if (array1[i] < array2[j])
	            merge[k++] = array1[i++];
	         else
	            merge[k++] = array2[j++];
	      }
	      while (i < n1)
	         merge[k++] = array1[i++];
	      while (j < n2)
	         merge[k++] = array2[j++];
	      System.out.print("\nArray after merge: ");
	      for (z = 0; z < n1 + n2;z++)
	         System.out.print(merge[z] + " ");
	   }
	
}
