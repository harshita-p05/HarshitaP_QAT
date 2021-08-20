package QatTest_HarshitaP;

import java.util.ArrayList;
import java.util.Scanner;

public class listStringReverse {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<>();
		Scanner in = new Scanner(System.in); 
		System.out.print("Enter the size of string array : ");
		int n = in.nextInt();
		for(int i=0;i<n;i++) {
			arr.add(in.next());
		}
		
		System.out.println("Reversed Strings : ");
		
		for(int j=arr.size()-1;j>=0;j--) {
			System.out.println(arr.get(j));
		}

	}
	
		
}
