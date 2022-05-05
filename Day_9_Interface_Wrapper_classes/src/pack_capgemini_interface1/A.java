package pack_capgemini_interface1;

public interface A
{
public void print();

}
 class B implements A
{
	public void print()
	{
		System.out.println("hey guys");
	}
	public static void main(String args[])
	{
		B obj=new B();
		obj.print();
	}
}
