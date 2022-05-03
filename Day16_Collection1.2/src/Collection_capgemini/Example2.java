package Collection_capgemini;

import java.util.PriorityQueue;
import java.util.Queue;

public class Example2 {

	public static void main(String[] args) {
		
		PriorityQueue obj=new PriorityQueue();
		obj.add(1);
		obj.add(2);
		obj.add(7);
		System.out.println(obj);
		obj.poll();
		System.out.println(obj);
	}

}
