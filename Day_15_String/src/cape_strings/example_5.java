package cape_strings;
import java.util.StringTokenizer;

public class example_5 {

	public static void main(String[] args) {
		StringTokenizer st= new StringTokenizer("java:code:string",":",true);
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
	}
}
