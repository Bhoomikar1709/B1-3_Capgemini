package pack2_static_capgemini;

public class Example3
{
 static int x;
static String str;
	
	static
	{
		x=10;
		str="Capgemini";
	}
	
	public static void main(String[] args) {
		System.out.println(x);
		System.out.println(str);

	}

}
