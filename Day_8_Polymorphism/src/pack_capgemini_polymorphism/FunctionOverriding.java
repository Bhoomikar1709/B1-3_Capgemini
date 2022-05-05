package pack_capgemini_polymorphism;

class Android
{
	void display()
	{
		System.out.println("Realme");
	}
}

class Apple extends Android
{
	void display()
	{
	System.out.println("I-phone");	
    }
}

public class FunctionOverriding {

	public static void main(String[] args) {
	Android a=new Android();
	Apple a1=new Apple();
	a.display();
	a1.display();

	}

}
