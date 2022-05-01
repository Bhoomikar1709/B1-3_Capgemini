package cape_strings;

import java.util.StringTokenizer;
public class example_4 {

	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("Merry@go@round","@");
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
	}

}
