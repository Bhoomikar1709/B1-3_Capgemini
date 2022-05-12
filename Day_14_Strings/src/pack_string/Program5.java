package pack_string;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Dhoni";
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		if(str.equals(str1))
		{
			System.out.println("Matching");
		}
		else
		{
			System.out.println("Not Matching");
		}
	}
}
