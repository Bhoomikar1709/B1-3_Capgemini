package pack_lambda_expression;

interface C
{
	int add(int a,int b);
}


public class Example3 {

	public static void main(String[] args) {
		
C obj=(int a,int b)->
{
	
	return a+b;
};
System.out.println("Addition of a and b is "+obj.add(13,10));
	}

}
