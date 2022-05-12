package pack_multithreading2;

class Parent1 extends Thread
{
	public void run()
	{
		//Thread.sleep(1000);
		System.out.println("C2TC Program");
	}
	
}

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent1 p=new Parent1();
		p.start();
		p.interrupt();
	}

}
