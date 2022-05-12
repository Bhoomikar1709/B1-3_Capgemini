package pack_strings2;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		StringBuffer sb=new StringBuffer(s.nextLine());
		System.out.println(sb.capacity());//16
	}

}
